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
package org.ol3cesium.client.ol;

import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.client.ol.geom.Geometry;
import org.ol3cesium.client.ol.proj.Projection;
import org.ol3cesium.client.olx.GeolocationOptions;

/**
 * Helper class for providing HTML5 Geolocation capabilities. 
 * The Geolocation API is used to locate a user's position.
 * 
 * To get notified of position changes, register a listener for the generic 
 * change event on your instance of ol.Geolocation.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Geolocation extends Object {
    protected Geolocation() {
        //
    }
    
    public static final native Geolocation create() /*-{
        return new ol.Geolocation();
    }-*/;
    
    public static final native Geolocation create(GeolocationOptions options) /*-{
        return new ol.Geolocation(options);
    }-*/;
    
    /**
     * Get the accuracy of the position in meters.
     * @return The accuracy of the position measurement in meters.
     */
    public final native double getAccuracy() /*-{
        return this.getAccuracy();
    }-*/;
    
    /**
     * Get a geometry of the position accuracy.
     * @return A geometry of the position accuracy.
     */
    public final native Geometry getAccuracyGeometry() /*-{
        return this.getAccuracyGeometry();
    }-*/;
    
    /**
     * Get the altitude associated with the position.
     * @return The altitude of the position in meters above mean sea level.
     */
    public final native double getAltitude() /*-{
        return this.getAltitude();
    }-*/;
    
    /**
     * Get the altitude accuracy of the position.
     * @return The accuracy of the altitude measurement in meters.
     */
    public final native double getAltitudeAccuracy() /*-{
        return this.getAltitudeAccuracy();
    }-*/;
    
    /**
     * Get the heading as radians clockwise from North.
     * @return The heading of the device in radians from north.
     */
    public final native double getHeading() /*-{
        return this.getHeading();
    }-*/;
    
    /**
     * Get the position of the device.
     * @return The current position of the device reported in the current projection.
     */
    public final native Coordinate getPosition() /*-{
        return this.getPosition();
    }-*/;
    
    /**
     * Get the projection associated with the position.
     * @return The projection the position is reported in.
     */
    public final native Projection getProjection() /*-{
        return this.getProjection();
    }-*/;
    
    /**
     * Get the speed in meters per second.
     * @return The instantaneous speed of the device in meters per second.
     */
    public final native double getSpeed() /*-{
        return this.getSpped();
    }-*/;
    
    /**
     * Determine if the device location is being tracked.
     * @return The device location is being tracked.
     */
    public final native boolean getTracking() /*-{
        return this.getTracking();
    }-*/;
    
    /**
     * Get the tracking options.
     * See: http://www.w3.org/TR/geolocation-API/#position-options
     * @return PositionOptions as defined by the HTML5 Geolocation spec .
     */
    public final native JavaScriptObject/*GeolocationPositionOptions*/ getTrackingOptions() /*-{
        return this.getTrackingOptions();
    }-*/;
    
    /**
     * Set the projection to use for transforming the coordinates.
     * @param projection The projection the position is reported in.
     */
    public final native void setProjection(Projection projection) /*-{
        this.setProjection(projection);
    }-*/;
    
    /**
     * Enable or disable tracking.
     * @param tracking Enable tracking.
     */
    public final native void setTracking(boolean tracking) /*-{
        this.setTracking(tracking);
    }-*/;
    
    /**
     * Set the tracking options.
     * @param geolocationPositionOptions PositionOptions as defined by the HTML5 Geolocation spec .
     * See: http://www.w3.org/TR/geolocation-API/#position-options
     */
    public final native void setTrackingOptions(JavaScriptObject/*GeolocationPositionOptions*/ geolocationPositionOptions) /*-{
        this.setTrackingOptions(geolocationPositionOptions);
    }-*/;
}
