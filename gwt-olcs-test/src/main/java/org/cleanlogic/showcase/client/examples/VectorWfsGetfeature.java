/*
 * Copyright 2016 iserge.
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

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.dom.client.Element;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.RequestException;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.xml.client.Document;
import com.google.gwt.xml.client.XMLParser;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import org.ol3cesium.ol.Color;
import org.ol3cesium.ol.Feature;
import org.ol3cesium.ol.Map;
import org.ol3cesium.ol.MapPanelAbstract;
import org.ol3cesium.Configuration;
import org.ol3cesium.ol.View;
import org.ol3cesium.ol.control.ZoomSliderControl;
import org.ol3cesium.ol.format.GeoJSONFormat;
import org.ol3cesium.ol.format.WFSFormat;
import org.ol3cesium.ol.format.filter.OGCAndFilter;
import org.ol3cesium.ol.format.filter.OGCEqualToFilter;
import org.ol3cesium.ol.format.filter.OGCFilter;
import org.ol3cesium.ol.format.filter.OGCIsLikeFilter;
import org.ol3cesium.ol.layer.BaseLayer;
import org.ol3cesium.ol.layer.TileLayer;
import org.ol3cesium.ol.layer.VectorLayer;
import org.ol3cesium.ol.source.BingMapsSource;
import org.ol3cesium.ol.source.VectorSource;
import org.ol3cesium.ol.style.StrokeStyle;
import org.ol3cesium.ol.style.Style;
import org.ol3cesium.olx.MapOptions;
import org.ol3cesium.olx.ViewOptions;
import org.ol3cesium.olx.format.WFSWriteGetFeatureFormatOptions;
import org.ol3cesium.olx.layer.TileLayerOptions;
import org.ol3cesium.olx.layer.VectorLayerOptions;
import org.ol3cesium.olx.source.BingMapsSourceOptions;
import org.ol3cesium.olx.source.VectorSourceOptions;
import org.ol3cesium.olx.style.StrokeStyleOptions;
import org.ol3cesium.olx.style.StyleOptions;
import org.cleanlogic.showcase.client.basic.AbstractExample;
import org.cleanlogic.showcase.client.components.store.ShowcaseExampleStore;

/**
 *
 * @author iserge
 */
public class VectorWfsGetfeature extends AbstractExample {
    static final Logger _logger = Logger.getLogger(VectorWfsGetfeature.class.getName());
    public class MapWidget implements IsWidget {
        private MapPanelAbstract _mapPanel;
        private VectorLayer _vectorLayer;
        
        public MapWidget() {
            super();
            asWidget();
        }
        
        @Override
        public final Widget asWidget() {
            if (_mapPanel == null) {
                Configuration olConfiguration = new Configuration();
                olConfiguration.setPath(GWT.getModuleBaseURL() + "JavaScript/ol3/");
                olConfiguration.setName("ol-debug.js");
                List<String> styles = new ArrayList<String>();
                styles.add(GWT.getModuleBaseURL() + "JavaScript/ol3/ol.css");
                olConfiguration.setStyles(styles);
                
                /**
                 * Construct OpenLayers 3 map
                 */
                _mapPanel = new MapPanelAbstract(olConfiguration) {
                    @Override
                    public Map createMap(Element element) {
                        BingMapsSourceOptions bingMapsSourceOptions = BingMapsSourceOptions.create();
                        bingMapsSourceOptions.setImagerySet("Aerial");
                        bingMapsSourceOptions.setKey("AkGbxXx6tDWf1swIhPJyoAVp06H0s0gDTYslNWWHZ6RoPqMpB9ld5FY1WutX8UoF");
                        
                        BingMapsSource bingMapSource = BingMapsSource.create(bingMapsSourceOptions);
                        
                        TileLayerOptions tileLayerOptions = TileLayerOptions.create();
                        tileLayerOptions.setSource(bingMapSource);
                        TileLayer tileLayer = TileLayer.create(tileLayerOptions);
                        
                        StrokeStyleOptions strokeStyleOptions = StrokeStyleOptions.create();
                        strokeStyleOptions.setColor(Color.create(0, 0, 255, 1.0f));
                        strokeStyleOptions.setWidth(2);
                        StrokeStyle strokeStyle = StrokeStyle.create(strokeStyleOptions);
                        
                        StyleOptions styleOptions = StyleOptions.create();
                        styleOptions.setStroke(strokeStyle);
                        Style style = Style.create(styleOptions);
                        
                        VectorSourceOptions vectorSourceOptions = VectorSourceOptions.create();
                        VectorSource vectorSource = VectorSource.create(vectorSourceOptions);
                        VectorLayerOptions vectorLayerOptions = VectorLayerOptions.create();
                        vectorLayerOptions.setSource(vectorSource);
                        vectorLayerOptions.setStyle(style);
                        
                        _vectorLayer = VectorLayer.create(vectorLayerOptions);
                        
                        JsArray<BaseLayer> layers = JsArray.createArray().cast();
                        layers.push(tileLayer);
                        layers.push(_vectorLayer);

                        MapOptions mapOptions = MapOptions.create();
                        mapOptions.setLogo(false);
                        mapOptions.setLoadTilesWhileAnimating(true);
                        mapOptions.setLoadTilesWhileInteracting(true);
                        mapOptions.setTarget(element);
                        mapOptions.setLayers(layers);

                        ViewOptions viewOptions = ViewOptions.create();
                        viewOptions.setProjection("EPSG:3857");
                        viewOptions.setMinZoom(1);
                        viewOptions.setMaxZoom(25);

                        View view = View.create(viewOptions);
                        mapOptions.setView(view);

                        final Map olMap = Map.create(mapOptions);

                        olMap.addControl(ZoomSliderControl.create());
                        
                        OGCIsLikeFilter ogcLikeFilter = OGCFilter.like("name", "Mississippi*");
                        OGCEqualToFilter ogcEqualToFilter = OGCFilter.equalTo("waterway", "riverbank");
                        OGCAndFilter ogcAndFilter = OGCFilter.and(ogcLikeFilter, ogcEqualToFilter);
                        
                        WFSWriteGetFeatureFormatOptions wfsWriteGetFeatureFormatOptions = WFSWriteGetFeatureFormatOptions.create();
                        wfsWriteGetFeatureFormatOptions.setSrsName("EPSG:3857");
                        wfsWriteGetFeatureFormatOptions.setFeatureNS("http://openstreemap.org");
                        wfsWriteGetFeatureFormatOptions.setFeaturePrefix("osm");
                        wfsWriteGetFeatureFormatOptions.setOutputFormat("application/json");
                        JsArrayString featureTypes = JsArrayString.createArray().cast();
                        featureTypes.push("water_areas");
                        wfsWriteGetFeatureFormatOptions.setFeatureTypes(featureTypes);
                        wfsWriteGetFeatureFormatOptions.setFilter(ogcAndFilter);
                        
                        WFSFormat wfsFormat = WFSFormat.create();
                        String node = wfsFormat.writeGetFeature(wfsWriteGetFeatureFormatOptions);
                        Document document = XMLParser.parse(node);
                        
                        RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.POST, "http://demo.boundlessgeo.com/geoserver/wfs");
                        requestBuilder.setRequestData(document.toString());
                        requestBuilder.setCallback(new RequestCallback() {
                            @Override
                            public void onResponseReceived(Request request, Response response) {
                                GeoJSONFormat geoJSONFormat = GeoJSONFormat.create();
                                JsArray<Feature> features = geoJSONFormat.readFeatures(response.getText());
                                ((VectorSource)_vectorLayer.getSource()).addFeatures(features);
                                olMap.getView().fit(((VectorSource)_vectorLayer.getSource()).getExtent(), olMap.getSize());
                            }

                            @Override
                            public void onError(Request request, Throwable exception) {
                                _logger.info(exception.toString());
                            }
                        });
                        try {
                            requestBuilder.send();
                        } catch (RequestException ex) {
                            Logger.getLogger(VectorWfsGetfeature.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        return olMap;
                    }
                };
            }
            return _mapPanel;
        }
    }
    
    @Inject
    public VectorWfsGetfeature(ShowcaseExampleStore store) {
        super("WFS - GetFeature", "Example of making a WFS GetFeature request with a filter.", new String[]{"Bing", "Vector", "WFS", "OGC Filter"}, store);
    }

    @Override
    public void buildPanel() {
        final VectorWfsGetfeature.MapWidget mapWidget = new VectorWfsGetfeature.MapWidget();
        mapWidget.asWidget().setHeight("400px");
        
        contentPanel.add(new HTML("<p>This example generates a GetFeature request which uses a PropertyIsEqualTo and a PropertyIsLike filter, and then posts the request to load the features that match the query.</p>"));
        contentPanel.add(mapWidget);

        initWidget(contentPanel);
    }
    
    @Override
    public String[] getSourceCodeURLs() {
        String[] sourceCodeURLs = new String[1];
        sourceCodeURLs[0] = GWT.getModuleBaseURL() + "examples/" + "VectorWfsGetfeature.txt";
        return sourceCodeURLs;
    }
}
