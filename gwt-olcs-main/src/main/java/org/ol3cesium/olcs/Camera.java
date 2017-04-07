/*
 * Copyright 2016 iserge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ol3cesium.olcs;

import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.cesiumjs.cs.scene.Scene;
import org.openlayers.ol.Coordinate;
import org.openlayers.ol.Map;
import org.openlayers.ol.View;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "olcs", name = "Camera")
public class Camera {
    /**
     * This object takes care of additional 3d-specific properties of the view
     * and ensures proper synchronization with the underlying raw Cesium.
     * @param scene Cesium scene (Cesium.Scene).
     * @param map OpenLayers 3 map (ol.Map).
     */
    @JsConstructor
    public Camera(Scene scene, Map map) {}
    
    /**
     * 
     * @return Altitude in meters.
     */
    @JsMethod
    public native double getAltitude();
    
    /**
     * Shortcut for {@link View#getCenter()}.
     * @return Same projection as the {@link View}.
     */
    @JsMethod
    public native Coordinate getCenter();
    
    /**
     * Distance in meters.
     * @return distance in meters.
     */
    @JsMethod
    public native double getDistance();
    
    /**
     * 
     * @return Heading in radians.
     */
    @JsMethod
    public native float getHeading();
    
    /**
     * Calculates position under the camera.
     * @return Same projection as the ol.View.
     */
    @JsMethod
    public native Coordinate getPosition();
    
    /**
     * 
     * @return Tilt in radians.
     */
    @JsMethod
    public native float getTilt();
    
    /**
     * Rotates the camera to point at the specified target.
     * @param position Same projection as the ol.View.
     */
    @JsMethod
    public native void lookAt(Coordinate position);
    
    /**
     * Calculates the values of the properties from the current ol.View state.
     */
    @JsMethod
    public native void readFromView();
    
    /**
     * 
     * @param altitude In meters.
     */
    @JsMethod
    public native void setAltitude(double altitude);
    
    /**
     * Shortcut for ol.View.setCenter().
     * @param center Same projection as the ol.View.
     */
    @JsMethod
    public native void setCenter(Coordinate center);
    
    /**
     * 
     * @param distance In meters.
     */
    @JsMethod
    public native void setDistance(double distance);

    /**
     * 
     * @param heading In radians.
     */
    @JsMethod
    public native void setHeading(float heading);
    
    /**
     * Sets the position of the camera.
     * @param position Same projection as the ol.View.
     */
    @JsMethod
    public native void setPosition(Coordinate position);
    
    /**
     * 
     * @param tilt In radians.
     */
    @JsMethod
    public native void setTilt(float tilt);

    /**
     * Calculates the values of the properties from the current 
     * Cesium.Camera state. Modifies the center, 
     * resolution and rotation properties of the view.
     */
    @JsMethod
    public native void updateView();
}
