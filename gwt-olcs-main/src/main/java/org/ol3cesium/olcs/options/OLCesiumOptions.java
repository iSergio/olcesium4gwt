package org.ol3cesium.olcs.options;

import com.google.gwt.dom.client.Element;
import jsinterop.annotations.*;
import org.cesiumjs.cs.scene.Scene;
import org.cesiumjs.cs.scene.options.SceneOptions;
import org.ol3cesium.olcs.AbstractSynchronizer;
import org.openlayers.ol.Map;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class OLCesiumOptions {
    /**
     * The OpenLayers map we want to show on a Cesium scene.
     */
    @JsProperty
    public Map map;
    /**
     * Control the current time used by Cesium.
     */
    @JsProperty
    public Time time;
    /**
     * Allows the passing of property value to the Cesium.Scene.
     */
    @JsProperty
    public SceneOptions sceneOptions;
    /**
     * Target element for the Cesium scene.
     */
    @JsProperty
    public Element target;
    /**
     * Target element for the Cesium scene.
     */
    @JsProperty(name = "target")
    public String targetId;
    /**
     * Callback function which will be called by the olcs.OLCesium constructor to create custom synchronizers.
     * Receives an ol.Map and a Cesium.Scene as arguments, and needs to return an array of olcs.AbstractSynchronizer.
     */
    @JsProperty
    public CreateSynchronizers createSynchronizers;

    @JsConstructor
    public OLCesiumOptions() {}

    @JsFunction
    public interface Time {
        void function();
    }

    @JsFunction
    public interface CreateSynchronizers {
        AbstractSynchronizer[] function(Map map, Scene scene);
    }
}
