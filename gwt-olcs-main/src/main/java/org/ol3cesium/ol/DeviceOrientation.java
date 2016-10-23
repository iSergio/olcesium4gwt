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
package org.ol3cesium.ol;

import org.ol3cesium.olx.DeviceOrientationOptions;

/**
 * The ol.DeviceOrientation class provides access to information from 
 * DeviceOrientation events. See the HTML 5 DeviceOrientation Specification 
 * for more details.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class DeviceOrientation extends Object {
    protected DeviceOrientation() {
        //
    }
    
    public static native DeviceOrientation create() /*-{
        return new ol.DeviceOrientation();
    }-*/;
    
    public static native DeviceOrientation create(DeviceOrientationOptions options) /*-{
        return new ol.DeviceOrientation(options);
    }-*/;
    
    /**
     * Rotation around the device z-axis (in radians).
     * @return The euler angle in radians of the device from the standard Z axis.
     */
    public final native double getAlpha() /*-{
        return this.getAlpha();
    }-*/;
    
    /**
     * Rotation around the device x-axis (in radians).
     * @return The euler angle in radians of the device from the planar X axis.
     */
    public final native double getBeta() /*-{
        return this.getBeta();
    }-*/;
    
    /**
     * Rotation around the device y-axis (in radians).
     * @return The euler angle in radians of the device from the planar Y axis.
     */
    public final native double getGamma() /*-{
        return this.getGamma();
    }-*/;
    
    /**
     * The heading of the device relative to north (in radians).
     * @return The heading of the device relative to north, in radians, 
     * normalizing for different browser behavior.
     */
    public final native double getHeading() /*-{
        return this.getHeading();
    }-*/;
    
    /**
     * Determine if orientation is being tracked.
     * @return Changes in device orientation are being tracked.
     */
    public final native boolean getTracking() /*-{
        return this.getTracking();
    }-*/;
    
    /**
     * Enable or disable tracking of device orientation events.
     * @param tracking The status of tracking changes to alpha, beta and gamma. 
     * If true, changes are tracked and reported immediately.
     */
    public final native void setTracking(boolean tracking) /*-{
        this.setTracking(tracking);
    }-*/;
}
