package org.cleanlogic.olcesium4gwt.showcase.examples;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.*;
import org.cesiumjs.cs.core.providers.CesiumTerrainProvider;
import org.cesiumjs.cs.core.providers.options.CesiumTerrainProviderOptions;
import org.cleanlogic.olcesium4gwt.showcase.basic.AbstractExample;
import org.cleanlogic.olcesium4gwt.showcase.components.store.ShowcaseExampleStore;
import org.olcesium.olcs.Camera;
import org.olcesium.olcs.OLCesium;
import org.openlayers.ol.Collection;
import org.openlayers.ol.Coordinate;
import org.openlayers.ol.MapPanel;
import org.openlayers.ol.View;
import org.openlayers.ol.layer.BaseLayer;
import org.openlayers.ol.layer.TileLayer;
import org.openlayers.ol.options.MapOptions;
import org.openlayers.ol.options.ViewOptions;
import org.openlayers.ol.proj.ProjectionUtils;
import org.openlayers.ol.source.OSMSource;

import javax.inject.Inject;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Exports extends AbstractExample {
    @Inject
    public Exports(ShowcaseExampleStore store) {
        super("Exports","olcesium exported methods example", new String[]{"Exports"}, store);
    }

    @Override
    public void buildPanel() {
        TileLayer tileLayer = TileLayer.create(new OSMSource());
        ViewOptions viewOptions = new ViewOptions();
        viewOptions.center = ProjectionUtils.transform(Coordinate.create(25, 20), "EPSG:4326", "EPSG:3857");
        viewOptions.zoom = 3;
        MapOptions mapOptions = new MapOptions();
        mapOptions.layers = new Collection<>(new BaseLayer[] {tileLayer});
        mapOptions.view = new View(viewOptions);
        MapPanel mapPanel = new MapPanel(mapOptions);

        final OLCesium ol3d = OLCesium.create(mapPanel);
        CesiumTerrainProviderOptions cesiumTerrainProviderOptions = new CesiumTerrainProviderOptions();
        cesiumTerrainProviderOptions.url = "//assets.agi.com/stk-terrain/world";
        ol3d.getCesiumScene().terrainProvider = new CesiumTerrainProvider(cesiumTerrainProviderOptions);
        ol3d.setEnabled(true);

        final HTML infoLabel = new HTML();
        infoLabel.setWidth("300px");
        Timer timer = new Timer() {
            @Override
            public void run() {
                Camera camera = ol3d.getCamera();
                StringBuffer sb = new StringBuffer();
                sb.append("Center:");
                sb.append(camera.getCenter());
                sb.append("<br />Distance:");
                sb.append(camera.getDistance());
                sb.append("<br />Heading:");
                sb.append(camera.getHeading());
                sb.append("<br />Tilt:");
                sb.append(camera.getTilt());
                sb.append("<br />Position:");
                sb.append(camera.getPosition());
                sb.append("<br />Altitude:");
                sb.append(camera.getAltitude());
                infoLabel.setHTML(sb.toString());
            }
        };
        timer.scheduleRepeating(100);

        ToggleButton enableDiasableOLCesiumTBtn = new ToggleButton();
        enableDiasableOLCesiumTBtn.setText("Enable/disable");
        enableDiasableOLCesiumTBtn.setValue(true, false);
        enableDiasableOLCesiumTBtn.addValueChangeHandler(new ValueChangeHandler<Boolean>() {
            @Override
            public void onValueChange(ValueChangeEvent<Boolean> valueChangeEvent) {
                ol3d.setEnabled(!ol3d.getEnabled());
            }
        });

        PushButton headingPBtn = new PushButton();
        headingPBtn.setText("setHeading(Math.PI / 6)");
        headingPBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                ol3d.getCamera().setHeading((float) Math.PI / 6);
            }
        });

        PushButton tiltPBtn = new PushButton();
        tiltPBtn.setText("setTilt(Math.PI / 8");
        tiltPBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                ol3d.getCamera().setTilt((float) Math.PI / 8);
            }
        });

        PushButton distancePBtn = new PushButton();
        distancePBtn.setText("setDistance(10 000 000)");
        distancePBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                ol3d.getCamera().setDistance(10_000_000);
            }
        });

        PushButton altitudePBtn = new PushButton();
        altitudePBtn.setText("setAltitude(10 000 000)");
        altitudePBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                ol3d.getCamera().setAltitude(10_000_000);
            }
        });

        PushButton lookAtPBtn = new PushButton();
        lookAtPBtn.setText("lookAt([35,40])");
        lookAtPBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                ol3d.getCamera().lookAt(Coordinate.create(35, 40));
            }
        });

        PushButton centerPBtn = new PushButton();
        centerPBtn.setText("setCenter([40,45])");
        centerPBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                ol3d.getCamera().setCenter(Coordinate.create(40, 45));
            }
        });

        PushButton positionPBtn = new PushButton();
        positionPBtn.setText("setPosition([45,50])");
        positionPBtn.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                ol3d.getCamera().setPosition(Coordinate.create(45, 50));
            }
        });

        VerticalPanel vPanel = new VerticalPanel();
        vPanel.add(infoLabel);
        vPanel.add(enableDiasableOLCesiumTBtn);
        vPanel.add(headingPBtn);
        vPanel.add(tiltPBtn);
        vPanel.add(distancePBtn);
        vPanel.add(altitudePBtn);
        vPanel.add(lookAtPBtn);
        vPanel.add(centerPBtn);
        vPanel.add(positionPBtn);

        HorizontalPanel hPanel = new HorizontalPanel();
        hPanel.add(mapPanel);
        hPanel.add(vPanel);


        String description = "<p></p>";
        contentPanel.add(new HTML(description));
        contentPanel.add(hPanel);

        initWidget(contentPanel);
    }

    @Override
    public String[] getSourceCodeURLs() {
        String[] sourceCodeURLs = new String[1];
        sourceCodeURLs[0] = GWT.getModuleBaseURL() + "examples/" + "Exports.txt";
        return sourceCodeURLs;
    }
}
