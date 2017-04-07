package org.cleanlogic.showcase.client.examples;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.ui.*;
import org.cesiumjs.cs.collections.LabelCollection;
import org.cesiumjs.cs.core.Cartesian3;
import org.cesiumjs.cs.core.providers.CesiumTerrainProvider;
import org.cesiumjs.cs.core.providers.options.CesiumTerrainProviderOptions;
import org.cesiumjs.cs.scene.Scene;
import org.cesiumjs.cs.scene.options.LabelOptions;
import org.cleanlogic.showcase.client.basic.AbstractExample;
import org.cleanlogic.showcase.client.components.store.ShowcaseExampleStore;
import org.ol3cesium.olcs.OLCesiumPanel;
import org.ol3cesium.olcs.options.OLCesiumOptions;
import org.openlayers.ol.*;
import org.openlayers.ol.format.GeoJSONFormat;
import org.openlayers.ol.geom.*;
import org.openlayers.ol.layer.BaseLayer;
import org.openlayers.ol.layer.ImageLayer;
import org.openlayers.ol.layer.TileLayer;
import org.openlayers.ol.layer.VectorLayer;
import org.openlayers.ol.layer.options.TileLayerOptions;
import org.openlayers.ol.layer.options.VectorLayerOptions;
import org.openlayers.ol.options.MapOptions;
import org.openlayers.ol.options.ViewOptions;
import org.openlayers.ol.source.ImageVectorSource;
import org.openlayers.ol.source.OSMSource;
import org.openlayers.ol.source.VectorSource;
import org.openlayers.ol.source.options.VectorSourceOptions;
import org.openlayers.ol.style.*;
import org.openlayers.ol.style.options.*;

import javax.inject.Inject;
import java.util.HashMap;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Vectors extends AbstractExample {
    private static Feature iconFeature = new Feature(new Point(Coordinate.create(700_000, 200_000, 100_000)));
    private static Feature textFeature = new Feature(new Point(Coordinate.create(1_000_000, 3_000_000, 50_000)));
    private static Feature cervinFeature = new Feature(new Point(Coordinate.create(852_541, 5_776_649)));
    static {
        cervinFeature.getGeometry().set("altitudeMode", "clampToGround");
    }
    java.util.Map<String, Style> styles = createStyles();

    private VectorLayer vectorLayer;
    private ImageLayer  vectorLayer2;
    private VectorSource vectorSource2;

    private Style oldStyle;

    @Inject
    public Vectors(ShowcaseExampleStore store) {
        super("Openlayers Cesium Vector Example",
                "Vectors are synchronized from the OpenLayers map to the Cesium scene. " +
                        "3D positioning and some styling is supported. The render loop is automatically stopped when idle.",
                new String[]{"Map", "OLCesium", "Style", "Vector", "clampToGround"}, store);
    }

    @Override
    public void buildPanel() {
        Style iconStyle = createIconStyle();
        Style textStyle = createTextStyle();
        iconFeature.setStyle(iconStyle);
        textFeature.setStyle(textStyle);
        cervinFeature.setStyle(iconStyle);

        StyleOptions styleOptions = new StyleOptions();
        styleOptions.stroke = StrokeStyle.create("blue", 2);
        styleOptions.fill = FillStyle.craete("green");
        oldStyle = new Style(styleOptions);

        final Feature theCircle = new Feature(new Circle(Coordinate.create(5e6, 7e6, 5e5), 1e6));

        styleOptions = new StyleOptions();
        styleOptions.fill = FillStyle.craete(Color.create(255, 69, 0, 0.7));
        styleOptions.stroke = StrokeStyle.create(Color.create(255, 69, 0, 0.9), 1);
        Style cartographicRectangleStyle = new Style(styleOptions);

        Polygon cartographicRectangleGeometry = new Polygon(new Coordinate[][]
                {{
                        Coordinate.create(-5e6, 11e6),
                        Coordinate.create(4e6, 11e6),
                        Coordinate.create(4e6, 10.5e6),
                        Coordinate.create(-5e6, 10.5e6),
                        Coordinate.create(-5e6, 11e6)
                }});
        cartographicRectangleGeometry.set("olcs.polygon_kind", "rectangle");
        Feature cartographicRectangle = new Feature(cartographicRectangleGeometry);
        cartographicRectangle.setStyle(cartographicRectangleStyle);

        MultiPolygon cartographicRectangleGeometry2 = new MultiPolygon(new Coordinate[][][]
                {
                        {{
                                Coordinate.create(-5e6, 12e6, 0),
                                Coordinate.create(4e6, 12e6, 0),
                                Coordinate.create(4e6, 11.5e6, 0),
                                Coordinate.create(-5e6, 11.5e6, 0),
                                Coordinate.create(-5e6, 12e6, 0)
                        }}, {{
                        Coordinate.create(-5e6, 11.5e6, 1e6),
                        Coordinate.create(4e6, 11.5e6, 1e6),
                        Coordinate.create(4e6, 11e6, 1e6),
                        Coordinate.create(-5e6, 11e6, 1e6),
                        Coordinate.create(-5e6, 11.5e6, 1e6)
                        }}
                });
        cartographicRectangleGeometry2.set("olcs.polygon_kind", "rectangle");
        Feature cartographicRectangle2 = new Feature(cartographicRectangleGeometry2);
        cartographicRectangle2.setStyle(cartographicRectangleStyle);

        TileLayerOptions tileLayerOptions = new TileLayerOptions();
        tileLayerOptions.source = new OSMSource();
        TileLayer tileLayer = new TileLayer(tileLayerOptions);

        VectorSourceOptions vectorSourceOptions = new VectorSourceOptions();
        vectorSourceOptions.format = new GeoJSONFormat();
        vectorSourceOptions.url = GWT.getModuleBaseURL() + "data/geojson/vector_data.geojson";
        VectorLayerOptions vectorLayerOptions = new VectorLayerOptions();
        vectorLayerOptions.source = new VectorSource(vectorSourceOptions);
        vectorLayerOptions.styleFunction = new MStyleFunction();
        vectorLayer = new VectorLayer(vectorLayerOptions);

        VectorSourceOptions vectorSourceOptions2 = new VectorSourceOptions();
        vectorSourceOptions2.features = new Collection<>(new Feature[] {iconFeature, textFeature, cervinFeature, cartographicRectangle, cartographicRectangle2});
        vectorSource2 = new VectorSource(vectorSourceOptions2);
        ImageVectorSource imageVectorSource = ImageVectorSource.create(vectorSource2);
        vectorLayer2 = ImageLayer.create(imageVectorSource);

        ViewOptions viewOptions = new ViewOptions();
        viewOptions.center = Coordinate.create(0, 0);
        viewOptions.zoom = 2;

        MapOptions mapOptions = new MapOptions();
        mapOptions.layers = new Collection<>(new BaseLayer[] {tileLayer, vectorLayer, vectorLayer2});
        mapOptions.view = new View(viewOptions);
        final MapPanel map2dPanel = new MapPanel(mapOptions);
        map2dPanel.setSize("600px", "300px");

        OLCesiumOptions olCesiumOptions = new OLCesiumOptions();
        olCesiumOptions.map = map2dPanel.getMap();
        final OLCesiumPanel map3dPanel = new OLCesiumPanel(olCesiumOptions);
        Scene scene = map3dPanel.getOlCesium().getCesiumScene();
        CesiumTerrainProviderOptions cesiumTerrainProviderOptions = new CesiumTerrainProviderOptions();
        cesiumTerrainProviderOptions.url = "//assets.agi.com/stk-terrain/world";
        cesiumTerrainProviderOptions.requestVertexNormals = true;
        CesiumTerrainProvider cesiumTerrainProvider = new CesiumTerrainProvider(cesiumTerrainProviderOptions);
        scene.terrainProvider = cesiumTerrainProvider;
        scene.globe.enableLighting = true;
        map3dPanel.setSize("600px", "300px");
        map3dPanel.getOlCesium().setEnabled(true);

        LabelCollection labelCollection = new LabelCollection();
        LabelOptions labelOptions = new LabelOptions();
        labelOptions.position = Cartesian3.fromRadians(20, 20, 0);
        labelOptions.text = "Pre-existing primitive";
        labelCollection.add(labelOptions);
        scene.primitives().add(labelCollection);

        vectorLayer.getSource().addFeature(theCircle);

        ToggleButton olCesiumEnableTBtn = new ToggleButton();
        olCesiumEnableTBtn.setText("Enable/disable Cesium");
        olCesiumEnableTBtn.setValue(true, false);
        olCesiumEnableTBtn.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
            @Override
            public void onValueChange(ValueChangeEvent<Boolean> valueChangeEvent) {
                map3dPanel.getOlCesium().setEnabled(valueChangeEvent.getValue());
                map3dPanel.getOlCesium().enableAutoRenderLoop();
            }
        });

        ToggleButton toggleDepthTestTBtn = new ToggleButton();
        toggleDepthTestTBtn.setText("Toggle depth test");
        toggleDepthTestTBtn.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
            @Override
            public void onValueChange(ValueChangeEvent<Boolean> valueChangeEvent) {
                map3dPanel.getOlCesium().getCesiumScene().globe.depthTestAgainstTerrain = !map3dPanel.getOlCesium().getCesiumScene().globe.depthTestAgainstTerrain;
                map3dPanel.getOlCesium().getAutoRenderLoop().restartRenderLoop();
            }
        });

        ToggleButton toggleCircleStyleTBtn = new ToggleButton();
        toggleCircleStyleTBtn.setText("Toggle circle style");
        toggleCircleStyleTBtn.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
            @Override
            public void onValueChange(ValueChangeEvent<Boolean> valueChangeEvent) {
                Style style = theCircle.getStyle();
                theCircle.setStyle(oldStyle);
                oldStyle = style;
            }
        });

        PushButton addRemoveVectorLayerPBtn = new PushButton();
        addRemoveVectorLayerPBtn.setText("Add/remove one vector layer");
        addRemoveVectorLayerPBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                boolean finded = false;
                for (int i = 0; i < map2dPanel.getMap().getLayers().getLength(); i++) {
                    BaseLayer layer = map2dPanel.getMap().getLayers().item(i);
                    if (layer.equals(vectorLayer)) {
                        finded = true;
                        break;
                    }
                }
                if (finded) {
                    map2dPanel.getMap().getLayers().remove(vectorLayer);
                } else {
                    map2dPanel.getMap().getLayers().insertAt(1, vectorLayer);
                }
            }
        });

        PushButton addRemoveOneFeaturePBtn = new PushButton();
        addRemoveOneFeaturePBtn = new PushButton();
        addRemoveOneFeaturePBtn.setText("Add/remove one feature");
        addRemoveOneFeaturePBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                int found = -1;
                for (int i = 0; i < vectorSource2.getFeatures().length; i++) {
                    if (vectorSource2.getFeatures()[i].equals(iconFeature)) {
                        found = i;
                        break;
                    }
                }
                if (found >= 0) {
                    vectorSource2.removeFeature(iconFeature);
                } else {
                    vectorSource2.addFeature(iconFeature);
                }
            }
        });

        ToggleButton toggleClampToGroundModeTBtn = new ToggleButton();
        toggleClampToGroundModeTBtn.setText("Toggle clampToGround mode");
        toggleClampToGroundModeTBtn.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
            @Override
            public void onValueChange(ValueChangeEvent<Boolean> valueChangeEvent) {
                String altitudeMode = "";
                if (vectorLayer.get("altitudeMode") == null) {
                    altitudeMode = "clampToGround";
                    vectorLayer.set("altitudeMode", altitudeMode);
                    vectorLayer2.set("altitudeMode", altitudeMode);
                } else {
                    vectorLayer.unset("altitudeMode");
                    vectorLayer2.unset("altitudeMode");
                }

                map2dPanel.getMap().removeLayer(vectorLayer);
                map2dPanel.getMap().removeLayer(vectorLayer2);
                map2dPanel.getMap().addLayer(vectorLayer);
                map2dPanel.getMap().addLayer(vectorLayer2);

                map3dPanel.getOlCesium().getAutoRenderLoop().restartRenderLoop();
            }
        });

        HorizontalPanel hPanel = new HorizontalPanel();

        VerticalPanel vPanel = new VerticalPanel();
        vPanel.add(map2dPanel);
        vPanel.add(map3dPanel);

        VerticalPanel btnVPanel = new VerticalPanel();
        btnVPanel.add(olCesiumEnableTBtn);
        btnVPanel.add(toggleDepthTestTBtn);
        btnVPanel.add(toggleCircleStyleTBtn);
        btnVPanel.add(addRemoveVectorLayerPBtn);
        btnVPanel.add(addRemoveOneFeaturePBtn);
        btnVPanel.add(toggleClampToGroundModeTBtn);

        hPanel.add(vPanel);
        hPanel.add(btnVPanel);


        String description = "<p></p>";
        contentPanel.add(new HTML(description));
        contentPanel.add(hPanel);

        map3dPanel.getOlCesium().enableAutoRenderLoop();

        initWidget(contentPanel);
    }

    private Style createIconStyle() {
        IconStyleOptions iconStyleOptions = new IconStyleOptions();
        iconStyleOptions.anchor = new double[] {0.5, 46};
        iconStyleOptions.anchorXUnits = IconAnchorUnits.FRACTION.toString();
        iconStyleOptions.anchorYUnits = IconAnchorUnits.PIXELS.toString();
        iconStyleOptions.opacity = 0.75;
        iconStyleOptions.src = GWT.getModuleBaseURL() + "data/icon.png";

        TextStyleOptions textStyleOptions = new TextStyleOptions();
        textStyleOptions.text = "Some text";
        textStyleOptions.textAlign = TextAlign.CENTER.toString();
        textStyleOptions.textBaseline = TextBaseLine.MIDDLE.toString();
        textStyleOptions.stroke = StrokeStyle.create("magenta", 3);
        textStyleOptions.fill = FillStyle.craete(Color.create(0, 0, 155, 0.3));

        StyleOptions styleOptions = new StyleOptions();
        styleOptions.image = new IconStyle(iconStyleOptions);
        styleOptions.text = new TextStyle(textStyleOptions);

        return new Style(styleOptions);
    }

    private Style createTextStyle() {
        TextStyleOptions textStyleOptions = new TextStyleOptions();
        textStyleOptions.text = "Only text";
        textStyleOptions.textAlign = TextAlign.CENTER.toString();
        textStyleOptions.textBaseline = TextBaseLine.MIDDLE.toString();
        textStyleOptions.stroke = StrokeStyle.create("red", 3);
        textStyleOptions.fill = FillStyle.craete(Color.create(0, 0, 155, 0.3));

        StyleOptions styleOptions = new StyleOptions();
        styleOptions.text = new TextStyle(textStyleOptions);

        return new Style(styleOptions);
    }

    private CircleStyle createImageStyle() {
        CircleStyleOptions circleStyleOptions = new CircleStyleOptions();
        circleStyleOptions.radius = 5;
//        circleStyleOptions.fill = null;
        circleStyleOptions.stroke = StrokeStyle.create("red", 1);
        return new CircleStyle(circleStyleOptions);
    }

    private java.util.Map<String, Style> createStyles() {
        CircleStyle image = createImageStyle();

        java.util.Map<String, Style> styles = new HashMap<>();

        StyleOptions styleOptions = new StyleOptions();
        styleOptions.image = image;
        styles.put("Point", new Style(styleOptions));

        StrokeStyleOptions strokeStyleOptions = new StrokeStyleOptions();
        strokeStyleOptions.colorStr = "green";
        strokeStyleOptions.lineDash = new double[] {0};
        strokeStyleOptions.width = 10;
        styleOptions = new StyleOptions();
        styleOptions.stroke = new StrokeStyle(strokeStyleOptions);
        styles.put("LineString", new Style(styleOptions));

        styleOptions = new StyleOptions();
        styleOptions.stroke = StrokeStyle.create("green", 10);
        styles.put("MultiLineString", new Style(styleOptions));

        TextStyleOptions textStyleOptions = new TextStyleOptions();
        textStyleOptions.text = "MP";
        textStyleOptions.stroke = StrokeStyle.create("purple");
        styleOptions = new StyleOptions();
        styleOptions.image = image;
        styleOptions.text = new TextStyle(textStyleOptions);
        styles.put("MultiPoint", new Style(styleOptions));

        styleOptions = new StyleOptions();
        styleOptions.stroke = StrokeStyle.create("yellow", 1);
        styleOptions.fill = FillStyle.craete(Color.create(255, 255, 0, 0.1));
        styles.put("MultiPolygon", new Style(styleOptions));

        strokeStyleOptions = new StrokeStyleOptions();
        strokeStyleOptions.colorStr = "blue";
        strokeStyleOptions.lineDash = new double[] {4};
        strokeStyleOptions.width = 3;
        styleOptions = new StyleOptions();
        styleOptions.stroke = new StrokeStyle(strokeStyleOptions);
        styleOptions.fill = FillStyle.craete(Color.create(0, 0, 255, 0.1));
        styles.put("Polygon", new Style(styleOptions));

        CircleStyleOptions circleStyleOptions = new CircleStyleOptions();
        circleStyleOptions.radius = 10;
        circleStyleOptions.fill = null;
        circleStyleOptions.stroke = StrokeStyle.create("magenta");
        styleOptions = new StyleOptions();
        styleOptions.stroke = StrokeStyle.create("magenta", 2);
        styleOptions.fill = FillStyle.craete("magenta");
        styleOptions.image = new CircleStyle(circleStyleOptions);
        styles.put("GeometryCollection", new Style(styleOptions));

        styleOptions = new StyleOptions();
        styleOptions.stroke = StrokeStyle.create("red", 2);
        styleOptions.fill = FillStyle.craete(Color.create(255, 0, 0, 0.2));
        styles.put("Circle", new Style(styleOptions));

        return styles;
    }

    private final class MStyleFunction implements StyleFunction {
        @Override
        public Style[] function(Feature feature, double resolution) {
            Geometry geometry = feature.getGeometry();
            return new Style[] {(geometry != null) ? styles.get(geometry.getType()) : styles.get("Point")};
        }
    }

    @Override
    public String[] getSourceCodeURLs() {
        String[] sourceCodeURLs = new String[1];
        sourceCodeURLs[0] = GWT.getModuleBaseURL() + "examples/" + "Vectors.txt";
        return sourceCodeURLs;
    }
}