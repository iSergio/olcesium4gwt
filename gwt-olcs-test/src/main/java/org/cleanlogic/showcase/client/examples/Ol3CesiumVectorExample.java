/*
 * Copyright 2016 Serge Silaev aka iSergio <s.serge.b@gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cleanlogic.showcase.client.examples;

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayUtils;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;

import org.cesiumjs.cs.Cesium;
import org.cesiumjs.cs.core.Cartesian3;
import org.cesiumjs.cs.core.Color;
import org.cesiumjs.cs.core.SkyBox;
import org.cesiumjs.cs.core.SkyBoxSources;
import org.cesiumjs.cs.core.options.SkyBoxOptions;
import org.cesiumjs.cs.core.providers.EllipsoidTerrainProvider;
import org.cesiumjs.cs.core.providers.TerrainProvider;
import org.cesiumjs.cs.scene.Label;
import org.cesiumjs.cs.scene.LabelCollection;
import org.cesiumjs.cs.scene.Sun;
import org.cesiumjs.cs.scene.options.LabelOptions;
import org.cleanlogic.showcase.client.components.store.ShowcaseExampleStore;
import org.ol3cesium.ol.Coordinate;
import org.ol3cesium.ol.Feature;
import org.ol3cesium.ol.Map;
import org.ol3cesium.ol.MapPanelAbstract;
import org.ol3cesium.Configuration;
import org.ol3cesium.Initializer;
import org.ol3cesium.ol.Pixel;
import org.ol3cesium.ol.View;
import org.ol3cesium.ol.control.ZoomSliderControl;
import org.ol3cesium.ol.format.GeoJSONFormat;
import org.ol3cesium.ol.geom.Circle;
import org.ol3cesium.ol.geom.Geometry;
import org.ol3cesium.ol.geom.MultiPolygon;
import org.ol3cesium.ol.geom.Point;
import org.ol3cesium.ol.geom.Polygon;
import org.ol3cesium.ol.layer.ImageLayer;
import org.ol3cesium.ol.layer.TileLayer;
import org.ol3cesium.ol.layer.VectorLayer;
import org.ol3cesium.ol.source.ImageVectorSource;
import org.ol3cesium.ol.source.OSMSource;
import org.ol3cesium.ol.source.VectorSource;
import org.ol3cesium.ol.style.CircleStyle;
import org.ol3cesium.ol.style.FillStyle;
import org.ol3cesium.ol.style.IconStyle;
import org.ol3cesium.ol.style.StrokeStyle;
import org.ol3cesium.ol.style.Style;
import org.ol3cesium.ol.style.TextStyle;
import org.ol3cesium.olcs.OLCesium;
import org.ol3cesium.olcs.OLCesiumOptions;
import org.ol3cesium.olx.MapOptions;
import org.ol3cesium.olx.ViewOptions;
import org.ol3cesium.olx.layer.ImageLayerOptions;
import org.ol3cesium.olx.layer.TileLayerOptions;
import org.ol3cesium.olx.layer.VectorLayerOptions;
import org.ol3cesium.olx.source.ImageVectorSourceOptions;
import org.ol3cesium.olx.source.VectorSourceOptions;
import org.ol3cesium.olx.style.CircleStyleOptions;
import org.ol3cesium.olx.style.IconStyleOptions;
import org.ol3cesium.olx.style.StrokeStyleOptions;
import org.ol3cesium.olx.style.StyleOptions;
import org.ol3cesium.olx.style.TextStyleOptions;
import org.cleanlogic.showcase.client.basic.AbstractExample;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Ol3CesiumVectorExample extends AbstractExample {
    boolean _hasTheVectorLayer = true;
    
    private java.util.Map<String, Style> _styles;
    
    private VectorLayer _vectorLayer1;
    private VectorSource _vectorSource;
    private ImageLayer  _vectorLayer2;
    
    private Feature _iconFeature;
    private Feature _textFeature;
    private Feature _cervinFeature;
    private Feature _theCircle;
    private Feature _cartographicRectangle;
    private Feature _cartographicRectangle2;
    
    private Style _oldStyle;
    
    public class MapWidget implements IsWidget {
        private MapPanelAbstract _mapPanel;
        private OLCesium _olCesium;
        
        public MapWidget() {
            super();
            asWidget();
        }
        
        @Override
        public final Widget asWidget() {
            if (_mapPanel == null) {
                Configuration olConfiguration = new Configuration();
                olConfiguration.setPath(GWT.getModuleBaseURL() + "JavaScript/");
                olConfiguration.setName("ol3cesium-debug.js");
                List<String> styles = new ArrayList<String>();
                styles.add(GWT.getModuleBaseURL() + "JavaScript/ol.css");
                olConfiguration.setStyles(styles);
                
                /**
                 * Construct OpenLayers 3 map
                 */
                _mapPanel = new MapPanelAbstract(olConfiguration) {
                    @Override
                    public Map createMap(Element element) {
                        MapOptions mapOptions = MapOptions.create();
                        mapOptions.setLogo(false);
                        mapOptions.setLoadTilesWhileAnimating(true);
                        mapOptions.setLoadTilesWhileInteracting(true);
                        mapOptions.setTarget(element);

                        ViewOptions viewOptions = ViewOptions.create();
                        viewOptions.setProjection("EPSG:3857");
                        viewOptions.setMinZoom(1);
                        viewOptions.setMaxZoom(25);

                        View view = View.create(viewOptions);
                        view.setCenter(Coordinate.create(0, 0));
                        view.setZoom(2);
                        mapOptions.setView(view);

                        Map olMap = Map.create(mapOptions);
                        
                        _styles = createStyles();

                        OSMSource osmSource = OSMSource.create();
                        TileLayerOptions tileLayerOptions = TileLayerOptions.create();
                        tileLayerOptions.setSource(osmSource);
                        TileLayer tileLayer = TileLayer.create(tileLayerOptions);
                        tileLayer.setVisible(true);
                        olMap.addLayer(tileLayer);
                        
                        VectorSourceOptions vectorSourceOptions = VectorSourceOptions.create();
                        vectorSourceOptions.setFormat(GeoJSONFormat.create());
                        vectorSourceOptions.setUrl(GWT.getModuleBaseURL() + "data/geojson/vector_data.geojson");
                        VectorSource vectorSource = VectorSource.create(vectorSourceOptions);
                        VectorLayerOptions vectorLayerOptions = VectorLayerOptions.create();
                        vectorLayerOptions.setSource(vectorSource);
                        vectorLayerOptions.setStyle(styleFunction());
                        _vectorLayer1 = VectorLayer.create(vectorLayerOptions);
                        olMap.addLayer(_vectorLayer1);

                        olMap.addControl(ZoomSliderControl.create());
                        
                        _iconFeature = Feature.create();
                        Point geometry = Point.create(Coordinate.create(700000, 200000, 100000));
                        _iconFeature.setGeometry(geometry);
                        
                        _textFeature = Feature.create();
                        geometry = Point.create(Coordinate.create(1000000, 3000000, 50000));
                        _textFeature.setGeometry(geometry);
                        
                        _cervinFeature = Feature.create();
                        geometry = Point.create(Coordinate.create(852541, 5776649));
                        geometry.set("altitudeMode", "clampToGround");
                        _cervinFeature.setGeometry(geometry);
                        
                        _theCircle = Feature.create();
                        _theCircle.setGeometry(Circle.create(Coordinate.create(5e6, 7e6, 5e5), 1e6));
                        ((VectorSource)_vectorLayer1.getSource()).addFeature(_theCircle);
                        
                        JsArray<Coordinate> coordinates = JsArray.createArray().cast();
                        coordinates.push(Coordinate.create(-5e6, 11e6));
                        coordinates.push(Coordinate.create(4e6, 11e6));
                        coordinates.push(Coordinate.create(4e6, 10.5e6));
                        coordinates.push(Coordinate.create(-5e6, 10.5e6));
                        coordinates.push(Coordinate.create(-5e6, 11e6));
                        JsArray<JsArray<Coordinate>> polygonCoordinates = JsArray.createArray().cast();
                        polygonCoordinates.push(coordinates);
                        Geometry cartographicRectangleGeometry = Polygon.create(polygonCoordinates);
                        cartographicRectangleGeometry.set("olcs.polygon_kind", "rectangle");
                        _cartographicRectangle = Feature.create();
                        _cartographicRectangle.setGeometry(cartographicRectangleGeometry);
                        
                        JsArray<Coordinate> coordinates2 = JsArray.createArray().cast();
                        coordinates2.push(Coordinate.create(-5e6, 12e6, 0));
                        coordinates2.push(Coordinate.create(4e6, 12e6, 0));
                        coordinates2.push(Coordinate.create(4e6, 11.5e6, 0));
                        coordinates2.push(Coordinate.create(-5e6, 11.5e6, 0));
                        coordinates2.push(Coordinate.create(-5e6, 12e6, 0));
                        JsArray<JsArray<Coordinate>> polygonCoordinates2 = JsArray.createArray().cast();
                        polygonCoordinates2.push(coordinates2);
                        
                        JsArray<Coordinate> coordinates3 = JsArray.createArray().cast();
                        coordinates3.push(Coordinate.create(-5e6, 11.5e6, 1e6));
                        coordinates3.push(Coordinate.create(4e6, 11.5e6, 1e6));
                        coordinates3.push(Coordinate.create(4e6, 11e6, 1e6));
                        coordinates3.push(Coordinate.create(-5e6, 11e6, 1e6));
                        coordinates3.push(Coordinate.create(-5e6, 11.5e6, 1e6));
                        JsArray<JsArray<Coordinate>> polygonCoordinates3 = JsArray.createArray().cast();
                        polygonCoordinates3.push(coordinates3);
                        
                        JsArray<JsArray<JsArray<Coordinate>>> multiPolygonCoordinates = JsArray.createArray().cast();
                        multiPolygonCoordinates.push(polygonCoordinates2);
                        multiPolygonCoordinates.push(polygonCoordinates3);
                        
                        Geometry cartographicRectangleGeometry2 = MultiPolygon.create(multiPolygonCoordinates);
                        cartographicRectangleGeometry2.set("olcs.polygon_kind", "rectangle");
                        _cartographicRectangle2 = Feature.create();
                        _cartographicRectangle2.setGeometry(cartographicRectangleGeometry2);
                        
                        IconStyleOptions iconStyleOptions = IconStyleOptions.create();
                        iconStyleOptions.setAnchor(Pixel.create(0.5, 46));
                        iconStyleOptions.setAnchorXUnits(IconStyleOptions.IconAnchorUnits.FRACTION);
                        iconStyleOptions.setAnchorYUnits(IconStyleOptions.IconAnchorUnits.PIXELS);
                        iconStyleOptions.setOpacity(0.75);
                        iconStyleOptions.setSrc(GWT.getModuleBaseURL() + "data/icon.png");
                        IconStyle iconStyle = IconStyle.create(iconStyleOptions);
                        
                        StrokeStyleOptions strokeStyleOptions = StrokeStyleOptions.create();
                        strokeStyleOptions.setColor("magenta");
                        strokeStyleOptions.setWidth(3);
                        StrokeStyle strokeStyle = StrokeStyle.create(strokeStyleOptions);
                        
                        FillStyle fillStyle = FillStyle.create(org.ol3cesium.ol.Color.create(0, 0, 155, 0.3f));
                        
                        TextStyleOptions textStyleOptions = TextStyleOptions.create();
                        textStyleOptions.setText("Some text");
                        textStyleOptions.setTextAlign(TextStyleOptions.TextAlign.CENTER);
                        textStyleOptions.setTextBaseline(TextStyleOptions.TextBaseline.MIDDLE);
                        textStyleOptions.setStroke(strokeStyle);
                        textStyleOptions.setFill(fillStyle);
                        TextStyle textStyle = TextStyle.create(textStyleOptions);
                        
                        StyleOptions styleOptions = StyleOptions.create();
                        styleOptions.setImage(iconStyle);
                        styleOptions.setText(textStyle);
                        Style iconStyleMain = Style.create(styleOptions);
                        
                        strokeStyleOptions = StrokeStyleOptions.create();
                        strokeStyleOptions.setColor("red");
                        strokeStyleOptions.setWidth(3);
                        strokeStyle = StrokeStyle.create(strokeStyleOptions);
                        
                        fillStyle = FillStyle.create(org.ol3cesium.ol.Color.create(0, 0, 155, 0.3f));//"rgba(0, 0, 155, 0.3)");
                        
                        textStyleOptions = TextStyleOptions.create();
                        textStyleOptions.setText("Only text");
                        textStyleOptions.setTextAlign(TextStyleOptions.TextAlign.CENTER);
                        textStyleOptions.setTextBaseline(TextStyleOptions.TextBaseline.MIDDLE);
                        textStyleOptions.setStroke(strokeStyle);
                        textStyleOptions.setFill(fillStyle);
                        textStyle = TextStyle.create(textStyleOptions);
                        
                        styleOptions = StyleOptions.create();
                        styleOptions.setText(textStyle);
                        Style textStyleMain = Style.create(styleOptions);
                        
                        strokeStyleOptions = StrokeStyleOptions.create();
                        strokeStyleOptions.setColor(org.ol3cesium.ol.Color.create(255, 69, 0, 0.9f));
                        strokeStyleOptions.setWidth(1);
                        strokeStyle = StrokeStyle.create(strokeStyleOptions);
                        
                        fillStyle = FillStyle.create(org.ol3cesium.ol.Color.create(255, 69, 0, 0.7f));
                        
                        styleOptions = StyleOptions.create();
                        styleOptions.setFill(fillStyle);
                        styleOptions.setStroke(strokeStyle);
                        Style cartographicRectangleStyle = Style.create(styleOptions);
                        
                        _iconFeature.setStyle(iconStyleMain);
                        _textFeature.setStyle(textStyleMain);
                        _cervinFeature.setStyle(iconStyleMain);
                        _cartographicRectangle.setStyle(cartographicRectangleStyle);
                        _cartographicRectangle2.setStyle(cartographicRectangleStyle);
                        
                        JsArray<Feature> features = JsArray.createArray().cast();
                        features.push(_iconFeature);
                        features.push(_textFeature);
                        features.push(_cervinFeature);
                        features.push(_cartographicRectangle);
                        features.push(_cartographicRectangle2);
                        
                        vectorSourceOptions = VectorSourceOptions.create();
                        vectorSourceOptions.setFeatures(features);
                        _vectorSource = VectorSource.create(vectorSourceOptions);
                        ImageVectorSourceOptions imageVectorSourceOptions = ImageVectorSourceOptions.create();
                        imageVectorSourceOptions.setSource(_vectorSource);
                        ImageVectorSource imageVectorSource = ImageVectorSource.create(imageVectorSourceOptions);
                        ImageLayerOptions imageLayerOptions = ImageLayerOptions.create();
                        imageLayerOptions.setSource(imageVectorSource);
                        _vectorLayer2 = ImageLayer.create(imageLayerOptions);
                        olMap.addLayer(_vectorLayer2);
                        
                        strokeStyleOptions = StrokeStyleOptions.create();
                        strokeStyleOptions.setColor("blue");
                        strokeStyleOptions.setWidth(2);
                        strokeStyle = StrokeStyle.create(strokeStyleOptions);
                        fillStyle = FillStyle.create("green");
                        styleOptions = StyleOptions.create();
                        styleOptions.setStroke(strokeStyle);
                        styleOptions.setFill(fillStyle);
                        _oldStyle = Style.create(styleOptions);
                        
                        return olMap;
                    }
                };
            }
            return _mapPanel;
        }
        
        public java.util.Map<String, Style> createStyles() {
            java.util.Map<String, Style> styles = new HashMap<String, Style>();
            
            StrokeStyleOptions strokeStyleOptions = StrokeStyleOptions.create();
            strokeStyleOptions.setWidth(1);
            strokeStyleOptions.setColor("red");
            StrokeStyle strokeStyle = StrokeStyle.create(strokeStyleOptions);
            CircleStyleOptions circleStyleOptions = CircleStyleOptions.create();
            circleStyleOptions.setRadius(5);
            circleStyleOptions.setStroke(strokeStyle);
            circleStyleOptions.setFill(null);
            CircleStyle image = CircleStyle.create(circleStyleOptions);
            
            StyleOptions styleOptions = StyleOptions.create();
            styleOptions.setImage(image);
            Style style = Style.create(styleOptions);
            styles.put("Point", style);
            
            strokeStyleOptions = StrokeStyleOptions.create();
            strokeStyleOptions.setColor("green");
            strokeStyleOptions.setLineDash((JsArrayNumber)JsArrayUtils.readOnlyJsArray(new int[]{4}).cast());
            strokeStyleOptions.setWidth(1);
            strokeStyle = StrokeStyle.create(strokeStyleOptions);
            styleOptions = StyleOptions.create();
            styleOptions.setStroke(strokeStyle);
            style = Style.create(styleOptions);
            styles.put("LineString", style);
            
            strokeStyleOptions =StrokeStyleOptions.create();
            strokeStyleOptions.setColor("green");
            strokeStyleOptions.setWidth(1);
            strokeStyle = StrokeStyle.create(strokeStyleOptions);
            styleOptions = StyleOptions.create();
            styleOptions.setStroke(strokeStyle);
            style = Style.create(styleOptions);
            styles.put("MultiLineString", style);
            
            strokeStyle = StrokeStyle.create("purple");
            TextStyleOptions textStyleOptions = TextStyleOptions.create();
            textStyleOptions.setText("MP");
            textStyleOptions.setStroke(strokeStyle);
            TextStyle textStyle = TextStyle.create(textStyleOptions);
            styleOptions = StyleOptions.create();
            styleOptions.setImage(image);
            styleOptions.setText(textStyle);
            style = Style.create(styleOptions);
            styles.put("MultiPoint", style);
            
            strokeStyleOptions =StrokeStyleOptions.create();
            strokeStyleOptions.setColor("yellow");
            strokeStyleOptions.setWidth(1);
            strokeStyle = StrokeStyle.create(strokeStyleOptions);
            FillStyle fillStyle = FillStyle.create(org.ol3cesium.ol.Color.create(255, 255, 0, 0.1f));//"rgba(255, 255, 0, 0.1");
            styleOptions = StyleOptions.create();
            styleOptions.setFill(fillStyle);
            styleOptions.setStroke(strokeStyle);
            style = Style.create(styleOptions);
            styles.put("MultiPolygon", style);
            
            strokeStyleOptions =StrokeStyleOptions.create();
            strokeStyleOptions.setColor("blue");
            strokeStyleOptions.setWidth(3);
            strokeStyleOptions.setLineDash((JsArrayNumber)JsArrayUtils.readOnlyJsArray(new int[]{4}).cast());
            strokeStyle = StrokeStyle.create(strokeStyleOptions);
            fillStyle = FillStyle.create(org.ol3cesium.ol.Color.create(0, 0, 255, 0.1f));//"rgba(0, 0, 255, 0.1");
            styleOptions = StyleOptions.create();
            styleOptions.setFill(fillStyle);
            styleOptions.setStroke(strokeStyle);
            style = Style.create(styleOptions);
            styles.put("Polygon", style);
            
            strokeStyleOptions =StrokeStyleOptions.create();
            strokeStyleOptions.setColor("magenta");
            strokeStyleOptions.setWidth(2);
            strokeStyle = StrokeStyle.create(strokeStyleOptions);
            fillStyle = FillStyle.create("magenta");
            circleStyleOptions = CircleStyleOptions.create();
            circleStyleOptions.setRadius(10);
            circleStyleOptions.setStroke(StrokeStyle.create("magenta"));
            CircleStyle circleStyle = CircleStyle.create(circleStyleOptions);
            styleOptions = StyleOptions.create();
            styleOptions.setFill(fillStyle);
            styleOptions.setStroke(strokeStyle);
            styleOptions.setImage(circleStyle);
            style = Style.create(styleOptions);
            styles.put("GeometryCollection", style);
            
            strokeStyleOptions =StrokeStyleOptions.create();
            strokeStyleOptions.setColor("red");
            strokeStyleOptions.setWidth(2);
            strokeStyle = StrokeStyle.create(strokeStyleOptions);
            fillStyle = FillStyle.create(org.ol3cesium.ol.Color.create(255, 0, 0, 0.2f));//"rgba(255, 0, 0, 0.2");
            styleOptions = StyleOptions.create();
            styleOptions.setFill(fillStyle);
            styleOptions.setStroke(strokeStyle);
            style = Style.create(styleOptions);
            styles.put("Circle", style);
            
            return styles;
        }
        
        public Style getStyle(String geometryType) {
            return _styles.containsKey(geometryType) ? _styles.get(geometryType) : _styles.get("Point");
        }
        
        public final native JavaScriptObject styleFunction() /*-{
            var that = this;
            return function(feature, resolution) {
                var geo = feature.getGeometry();
                if (geo == null) return null;
                var type = geo.getType();
                return that.@org.cleanlogic.showcase.ol3cesium.Ol3CesiumVectorExample.MapWidget::getStyle(Ljava/lang/String;)(type);
            };
        }-*/;
        
        public Map getMap() {
            return _mapPanel.getMap();
        }
        
        public OLCesium getOLCesium() {
            return _olCesium;
        }
        
        /**
         * Enable/Disable 3D throught Cesium
         * @param enable 
         */
        public void set3D(final boolean enable) {
            if (!Initializer.olcsDefined()) {
                Window.alert("OpenLayers3 Cesium plugin not initialized");
            } else {
                if (_olCesium == null) {
                    Cesium.initialize(GWT.getModuleBaseURL() + "JavaScript/Cesium/", getElement().getOwnerDocument(), new Callback<Void, Exception>() {
                        @Override
                        public void onFailure(Exception reason) {
                            Window.alert("Failed initialize Cesium:" + reason.getLocalizedMessage());
                        }

                        @Override
                        public void onSuccess(Void result) {
                            OLCesiumOptions olCesiumOptions = OLCesiumOptions.create();
                            olCesiumOptions.setMap(_mapPanel.getMap());
                            _olCesium = OLCesium.create(olCesiumOptions);

                            TerrainProvider ellipsoidTerrainProvider = new EllipsoidTerrainProvider();

                            String px = GWT.getModuleBaseURL() + "JavaScript/Cesium/Assets/Textures/SkyBox/tycho2t3_80_px.jpg";
                            String nx = GWT.getModuleBaseURL() + "JavaScript/Cesium/Assets/Textures/SkyBox/tycho2t3_80_mx.jpg";
                            String py = GWT.getModuleBaseURL() + "JavaScript/Cesium/Assets/Textures/SkyBox/tycho2t3_80_py.jpg";
                            String ny = GWT.getModuleBaseURL() + "JavaScript/Cesium/Assets/Textures/SkyBox/tycho2t3_80_my.jpg";
                            String pz = GWT.getModuleBaseURL() + "JavaScript/Cesium/Assets/Textures/SkyBox/tycho2t3_80_pz.jpg";
                            String nz = GWT.getModuleBaseURL() + "JavaScript/Cesium/Assets/Textures/SkyBox/tycho2t3_80_mz.jpg";
                            SkyBoxSources<String> skyBoxSources = new SkyBoxSources<>();
                            skyBoxSources.positiveX = px;
                            skyBoxSources.negativeX = nx;
                            skyBoxSources.positiveY = py;
                            skyBoxSources.negativeY = ny;
                            skyBoxSources.positiveZ = pz;
                            skyBoxSources.negativeZ = nz;
                            SkyBoxOptions skyBoxOptions = new SkyBoxOptions();
                            skyBoxOptions.sources = skyBoxSources;

                            _olCesium.getCesiumScene().skyBox = new SkyBox(skyBoxOptions);
                            _olCesium.getCesiumScene().sun = new Sun();

                            _olCesium.getCesiumScene().globe.terrainProvider = ellipsoidTerrainProvider;
                            _olCesium.getCesiumScene().globe.baseColor = new Color(1, 1, 1, 1);
                            _olCesium.getCesiumScene().globe.enableLighting = true;

//                            _olCesium.getCesiumScene().globe.depthTestAgainstTerrain = false;

                            _olCesium.setEnabled(enable);
                            _olCesium.enableAutoRenderLoop();

                            LabelCollection csLabels = new LabelCollection();
                            LabelOptions labelOptions = new LabelOptions();
                            labelOptions.position = Cartesian3.fromRadians(20, 20, 0);
                            labelOptions.text = "Pre-existing primitive";
                            csLabels.add(labelOptions);
                            _olCesium.getCesiumScene().primitives().add(csLabels);
                        }
                    });
                } else {
                    _olCesium.setEnabled(enable);
                    _olCesium.enableAutoRenderLoop();
                }
            }
        }
        
        public boolean get3D() {
            if (_olCesium == null) {
                return false;
            }
            return _olCesium.getEnabled();
        }
    }
    
    @Inject
    public Ol3CesiumVectorExample(ShowcaseExampleStore store) {
        super("Vector examples", "Vectors are synchronized from the ol3 map to the Cesium scene.", new String[]{"openstreetmap", "examples", "cesium", "3d", "Vector"}, store);
    }

    @Override
    public void buildPanel() {
        final MapWidget mapWidget = new MapWidget();
        mapWidget.asWidget().setHeight("400px");
        
        Button enable3dTbtn = new Button();
        enable3dTbtn.setText("Enable/Disable 3D");
        enable3dTbtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                mapWidget.set3D(!mapWidget.get3D());
            }
        });
        
        Button depthTestTbtn = new Button();
        depthTestTbtn.setText("Toggle depth test");
        depthTestTbtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                OLCesium olCesium = mapWidget.getOLCesium();
                if (olCesium == null) {
                    return;
                }
                boolean depthTestAgainstTerrain = olCesium.getCesiumScene().globe.depthTestAgainstTerrain;
                olCesium.getCesiumScene().globe.depthTestAgainstTerrain = !depthTestAgainstTerrain;
                olCesium.getAutoRenderLoop().restartRenderLoop();
            }
        });
        
        Button circleStyleTbtn = new Button();
        circleStyleTbtn.setText("Toggle circle style");
        circleStyleTbtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                Style swap = _theCircle.getStyle();
                _theCircle.setStyle(_oldStyle);
                _oldStyle = swap;
            }
        });
        
        Button addRemoveVectorLayerTbtn = new Button();
        addRemoveVectorLayerTbtn.setText("Add/remove one vector layer");
        addRemoveVectorLayerTbtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                if (_hasTheVectorLayer) {
                    mapWidget.getMap().getLayers().remove(_vectorLayer1);
                } else {
                    mapWidget.getMap().getLayers().insertAt(1, _vectorLayer1);
                }
                _hasTheVectorLayer = !_hasTheVectorLayer;
            }
        });
        
        Button addRemoveFeatureTbtn = new Button();
        addRemoveFeatureTbtn.setText("Add/remove one feature");
        addRemoveFeatureTbtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                boolean found = false;
                for (int i = 0; i < _vectorSource.getFeatures().length(); i++) {
                    Feature feature = _vectorSource.getFeatures().get(i);
                    if (feature.equals(_iconFeature)) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    _vectorSource.removeFeature(_iconFeature);
                } else {
                    _vectorSource.addFeature(_iconFeature);
                }
            }
        });
        
        Button clampToGroundTbtn = new Button();
        clampToGroundTbtn.setText("Toggle clampToGround mode");
        clampToGroundTbtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                String altitideMode = "";
                if (_vectorLayer1.get("altitudeMode") == null) {
                    altitideMode = "clampToGround";
                }
                _vectorLayer1.set("altitudeMode", altitideMode);
                _vectorLayer2.set("altitudeMode", altitideMode);
                
                mapWidget.getMap().removeLayer(_vectorLayer1);
                mapWidget.getMap().removeLayer(_vectorLayer2);
                mapWidget.getMap().addLayer(_vectorLayer1);
                mapWidget.getMap().addLayer(_vectorLayer2);
            }
        });
        
        contentPanel.add(new HTML("<p>This example shows how work synchronization vectro layers between ol and Cesium</p>"));
        contentPanel.add(mapWidget);
        
        HorizontalPanel horizontalPanel1 = new HorizontalPanel();
        horizontalPanel1.add(enable3dTbtn);
        horizontalPanel1.add(depthTestTbtn);
        horizontalPanel1.add(circleStyleTbtn);
        HorizontalPanel horizontalPanel2 = new HorizontalPanel();
        horizontalPanel2.add(addRemoveVectorLayerTbtn);
        horizontalPanel2.add(addRemoveFeatureTbtn);
        horizontalPanel2.add(clampToGroundTbtn);
        
        contentPanel.add(horizontalPanel1);
        contentPanel.add(horizontalPanel2);

        initWidget(contentPanel);
    }
    
    @Override
    public String[] getSourceCodeURLs() {
        String[] sourceCodeURLs = new String[1];
        sourceCodeURLs[0] = GWT.getModuleBaseURL() + "examples/examples/" + "Ol3CesiumVectorExample.txt";
        return sourceCodeURLs;
    }
}
