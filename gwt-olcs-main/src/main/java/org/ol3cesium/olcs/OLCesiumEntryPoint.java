package org.ol3cesium.olcs;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import org.openlayers.ol.OpenLayers;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OLCesiumEntryPoint implements EntryPoint {
    @Override
    public void onModuleLoad() {
        GWT.log("OpenLayers Cesium GTW module loaded");
        if (!OLCesium.isInitialized()) {
            String message = "The Core of OpenLayers Cesium (olcesium.js) JavaScript libraryes not loaded.\n" +
                    "If you inherit OpenLayers Cesium from NoScript gwt.xml, \nyou need include <script src='..../olcesium.js'> " +
                    "to load OpenLayers Cesium, \nalso you need include necessary css (Example: <link type=\"text/css\" href=\".../ol.css\">.\n" +
                    "By default OpenLayers Cesium path is [GWT App Name]/js/OLCesium";
            GWT.log(message);
        }
    }
}
