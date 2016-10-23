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
package org.ol3cesium.demo.client.examples.ol3cesium;

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.gwt.user.client.ui.Widget;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.cesiumjs.cesium.Cesium;
import org.cesiumjs.cesium.Color;
import org.cesiumjs.cesium.Ellipsoid;
import org.cesiumjs.cesium.SkyBox;
import org.cesiumjs.cesium.Sun;
import org.cesiumjs.cesium.TerrainProvider;
import org.cesiumjs.cesium.providers.EllipsoidTerrainProvider;
import org.ol3cesium.Configuration;
import org.ol3cesium.Initializer;
import org.ol3cesium.demo.client.basic.AbstractExample;
import org.ol3cesium.demo.client.components.store.ShowcaseExampleStore;
import org.ol3cesium.ol.Coordinate;
import org.ol3cesium.ol.Map;
import org.ol3cesium.ol.MapPanelAbstract;
import org.ol3cesium.ol.View;
import org.ol3cesium.ol.control.ZoomSliderControl;
import org.ol3cesium.ol.layer.TileLayer;
import org.ol3cesium.ol.source.OSMSource;
import org.ol3cesium.olcs.OLCesium;
import org.ol3cesium.olcs.OLCesiumOptions;
import org.ol3cesium.olx.MapOptions;
import org.ol3cesium.olx.ViewOptions;
import org.ol3cesium.olx.layer.TileLayerOptions;

/**
 *
 * @author iserge
 */
public class Ol3CesiumExample extends AbstractExample {
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
                styles.add(GWT.getModuleBaseURL() + "JavaScript/ol3/ol.css");
                olConfiguration.setStyles(styles);
                
                /**
                 * Construct OpenLayers 3 map
                 */
                _mapPanel = new MapPanelAbstract(olConfiguration) {
                    @Override
                    public Map create(Element element) {
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
                        view.setZoom(3);
                        mapOptions.setView(view);

                        Map olMap = Map.create(mapOptions);

                        OSMSource osmSource = OSMSource.create();
                        TileLayerOptions tileLayerOptions = TileLayerOptions.create();
                        tileLayerOptions.setSource(osmSource);
                        TileLayer tileLayer = TileLayer.create(tileLayerOptions);
                        tileLayer.setVisible(true);
                        olMap.addLayer(tileLayer);

                        olMap.addControl(ZoomSliderControl.create());

                        return olMap;
                    }
                };
            }
            return _mapPanel;
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
                            olCesiumOptions.setMap(_mapPanel.get());
                            _olCesium = OLCesium.create(olCesiumOptions);

                            TerrainProvider ellipsoidTerrainProvider = EllipsoidTerrainProvider.create(Ellipsoid.WGS84).cast();

                            String px = GWT.getModuleBaseURL() + "JavaScript/Cesium/Assets/Textures/SkyBox/tycho2t3_80_px.jpg";
                            String nx = GWT.getModuleBaseURL() + "JavaScript/Cesium/Assets/Textures/SkyBox/tycho2t3_80_mx.jpg";
                            String py = GWT.getModuleBaseURL() + "JavaScript/Cesium/Assets/Textures/SkyBox/tycho2t3_80_py.jpg";
                            String ny = GWT.getModuleBaseURL() + "JavaScript/Cesium/Assets/Textures/SkyBox/tycho2t3_80_my.jpg";
                            String pz = GWT.getModuleBaseURL() + "JavaScript/Cesium/Assets/Textures/SkyBox/tycho2t3_80_pz.jpg";
                            String nz = GWT.getModuleBaseURL() + "JavaScript/Cesium/Assets/Textures/SkyBox/tycho2t3_80_mz.jpg";
                            SkyBox skyBox = SkyBox.create(px, nx, py, ny, pz, nz);
                            skyBox.show(true);
                            _olCesium.getCesiumScene().setSkyBox(skyBox);

                            Sun sun = Sun.create();
                            sun.show(true);
                            _olCesium.getCesiumScene().setSun(sun);

                            _olCesium.getCesiumScene().getGlobe().setTerrainProvider(ellipsoidTerrainProvider);
                            _olCesium.getCesiumScene().getGlobe().setBaseColor(Color.create(1, 1, 1, 1));
                            _olCesium.getCesiumScene().getGlobe().setEnableLighting(true);

                            _olCesium.getCesiumScene().getGlobe().setDepthTestAgainstTerrain(false);

                            _olCesium.setEnabled(enable);
                            _olCesium.enableAutoRenderLoop();
                        }
                    });
                } else {
                    _olCesium.setEnabled(enable);
                }
            }
        }
    }
    
    @Inject
    public Ol3CesiumExample(ShowcaseExampleStore store) {
        super("Basic ol3cesium example", "Show ol3cesium.", new String[]{"openstreetmap", "ol3cesium", "cesium", "3d"}, store);
    }

    @Override
    public void buildPanel() {
        final MapWidget mapWidget = new MapWidget();
        mapWidget.asWidget().setHeight("400px");
        
        ToggleButton enable3dTbtn = new ToggleButton();
        enable3dTbtn.setText("Enable/Disable 3D");
        enable3dTbtn.setSize("110px", "20px");
        enable3dTbtn.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
            @Override
            public void onValueChange(ValueChangeEvent<Boolean> event) {
                mapWidget.set3D(event.getValue());
            }
        });
        
        contentPanel.add(new HTML("<p>This example shows how integrate cesium-gwt and gwt-olcs</p>"));
        contentPanel.add(mapWidget);
        contentPanel.add(enable3dTbtn);

        initWidget(contentPanel);
    }
    
    @Override
    public String[] getSourceCodeURLs() {
        String[] sourceCodeURLs = new String[1];
        sourceCodeURLs[0] = GWT.getModuleBaseURL() + "examples/ol3cesium/" + "Ol3CesiumExample.txt";
        return sourceCodeURLs;
    }
}
