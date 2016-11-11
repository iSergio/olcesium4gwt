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

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.cleanlogic.showcase.client.basic.AbstractExample;
import org.cleanlogic.showcase.client.components.store.ShowcaseExampleStore;
import org.ol3cesium.Configuration;
import org.ol3cesium.ol.Coordinate;
import org.ol3cesium.ol.Map;
import org.ol3cesium.ol.MapPanelAbstract;
import org.ol3cesium.ol.View;
import org.ol3cesium.ol.control.ZoomSliderControl;
import org.ol3cesium.ol.layer.BaseLayer;
import org.ol3cesium.ol.layer.ImageLayer;
import org.ol3cesium.ol.layer.TileLayer;
import org.ol3cesium.ol.source.ImageArcGISRestSource;
import org.ol3cesium.ol.source.OSMSource;
import org.ol3cesium.olx.MapOptions;
import org.ol3cesium.olx.ViewOptions;
import org.ol3cesium.olx.layer.TileLayerOptions;
import org.ol3cesium.olx.source.ImageArcGISRestSourceOptions;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ImageArcGISMapServer extends AbstractExample {
    public class MapWidget implements IsWidget {
        private MapPanelAbstract _mapPanel;
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
                        TileLayerOptions tileLayerOptions = TileLayerOptions.create();
                        tileLayerOptions.setSource(OSMSource.create());
                        TileLayer tileLayer = TileLayer.create(tileLayerOptions);
          
                        String url = "http://sampleserver1.arcgisonline.com/ArcGIS/rest/services/" +
                                     "Specialty/ESRI_StateCityHighway_USA/MapServer";
                        ImageArcGISRestSourceOptions imageArcGISRestSourceOptions = ImageArcGISRestSourceOptions.create();
                        imageArcGISRestSourceOptions.setParams(JavaScriptObject.createObject());
                        imageArcGISRestSourceOptions.setUrl(url);
                        ImageArcGISRestSource imageArcGISRestSource = ImageArcGISRestSource.create(imageArcGISRestSourceOptions);
                        ImageLayer imageLayer = ImageLayer.create(imageArcGISRestSource);
                        
                        JsArray<BaseLayer> layers = JsArray.createArray().cast();
                        layers.push(tileLayer);
                        layers.push(imageLayer);

                        MapOptions mapOptions = MapOptions.create();
                        mapOptions.setLogo(false);
                        mapOptions.setLoadTilesWhileAnimating(true);
                        mapOptions.setLoadTilesWhileInteracting(true);
                        mapOptions.setTarget(element);
                        mapOptions.setLayers(layers);

                        ViewOptions viewOptions = ViewOptions.create();
                        viewOptions.setCenter(Coordinate.create(-10997148, 4569099));
                        viewOptions.setZoom(4);

                        View view = View.create(viewOptions);
                        mapOptions.setView(view);

                        Map olMap = Map.create(mapOptions);

                        olMap.addControl(ZoomSliderControl.create());

                        return olMap;
                    }
                };
            }
            return _mapPanel;
        }
    }
    
    @Inject
    public ImageArcGISMapServer(ShowcaseExampleStore store) {
        super("Image ArcGIS MapServer", "Example of an image ArcGIS layer.", new String[]{"Map", "View", "Tile", "Image", "ImageArcGISRest"}, store);
    }

    @Override
    public void buildPanel() {
        final ImageArcGISMapServer.MapWidget mapWidget = new ImageArcGISMapServer.MapWidget();
        mapWidget.asWidget().setHeight("400px");
        
        contentPanel.add(new HTML("<p>This example shows how to use a dynamic ArcGIS REST MapService. This source type supports Map and Image Services. For dyamic ArcGIS services.</p>"));
        contentPanel.add(mapWidget);

        initWidget(contentPanel);
    }
    
    @Override
    public String[] getSourceCodeURLs() {
        String[] sourceCodeURLs = new String[1];
        sourceCodeURLs[0] = GWT.getModuleBaseURL() + "examples/" + "ImageArcGISMapServer.txt";
        return sourceCodeURLs;
    }
}
