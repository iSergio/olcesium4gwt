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
import org.cesiumjs.cs.scene.Scene;
import org.ol3cesium.ol.Coordinate;
import org.ol3cesium.ol.Map;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Camera extends JavaScriptObject {
    protected Camera() {
        //
    }
    
    /**
     * This object takes care of additional 3d-specific properties of the view 
     * and ensures proper synchronization with the underlying raw Cesium.
     * @param scene Cesium scene (Cesium.Scene).
     * @param map OpenLayers 3 map (ol.Map).
     * @return Camera object.
     */
    public static native Camera create(Scene scene, Map map) /*-{
        return new olcs.Camera(scene, map);
    }-*/;
    
    /**
     * 
     * @return Altitude in meters.
     */
    public final native double getAltitude() /*-{
        return this.getAltitude();
    }-*/;
    
    /**
     * Shortcut for ol.View.getCenter().
     * @return Same projection as the ol.View.
     */
    public final native Coordinate getCenter() /*-{
        return this.getCenter();
    }-*/;
    
    /**
     * Distance in meters.
     * @return distance in meters.
     */
    public final native double getDistance() /*-{
        return this.getDistance();
    }-*/;
    
    /**
     * 
     * @return Heading in radians.
     */
    public final native float getHeading() /*-{
        return this.getHeading();
    }-*/;
    
    /**
     * Calculates position under the camera.
     * @return Same projection as the ol.View.
     */
    public final native Coordinate getPosition() /*-{
        return this.getPosition();
    }-*/;
    
    /**
     * 
     * @return Tilt in radians.
     */
    public final native float getTilt() /*-{
        return this.getTilt();
    }-*/;
    
    /**
     * Rotates the camera to point at the specified target.
     * @param position Same projection as the ol.View.
     */
    public final native void lookAt(Coordinate position) /*-{
        this.lookAt(position);
    }-*/;
    
    /**
     * Calculates the values of the properties from the current ol.View state.
     */
    public final native void readFromView() /*-{
        this.readFromView();
    }-*/;
    
    /**
     * 
     * @param altitude In meters.
     */
    public final native void setAltitude(double altitude) /*-{
        this.setAltitude(altitude);
    }-*/;
    
    /**
     * Shortcut for ol.View.setCenter().
     * @param center Same projection as the ol.View.
     */
    public final native void setCenter(Coordinate center) /*-{
        this.setCenter(center);
    }-*/;
    
    /**
     * 
     * @param distance In meters.
     */
    public final native void setDistance(double distance) /*-{
        this.setDistance(distance);
    }-*/;
    
    /**
     * 
     * @param heading In radians.
     */
    public final native void setHeading(float heading) /*-{
        this.setHeading(heading);
    }-*/;
    
    /**
     * Sets the position of the camera.
     * @param position Same projection as the ol.View.
     */
    public final native void setPosition(Coordinate position) /*-{
        this.setPosition(position);
    }-*/;
    
    /**
     * 
     * @param tilt In radians.
     */
    public final native void setTilt(float tilt) /*-{
        this.setTilt(tilt);
    }-*/;

    /**
     * Calculates the values of the properties from the current 
     * Cesium.Camera state. Modifies the center, 
     * resolution and rotation properties of the view.
     */
    public final native void updateView() /*-{
        this.updateView();
    }-*/;
}
