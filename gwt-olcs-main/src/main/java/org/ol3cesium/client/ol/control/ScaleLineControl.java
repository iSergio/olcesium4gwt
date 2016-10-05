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
package org.ol3cesium.client.ol.control;

import org.ol3cesium.client.olx.control.ScaleLineOptions;

/**
 * A control displaying rough x-axis distances, calculated for the center of the 
 * viewport. No scale line will be shown when the x-axis distance cannot be 
 * calculated in the view projection (e.g. at or beyond the poles in EPSG:4326). 
 * By default the scale line will show in the bottom left portion of the map, 
 * but this can be changed by using the css selector .ol-scale-line.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ScaleLineControl extends Control {
    protected ScaleLineControl() {
        //
    }
    
    public static native ScaleLineControl create() /*-{
        return new ol.control.ScaleLine();
    }-*/;
    
    public static native ScaleLineControl create(ScaleLineOptions options) /*-{
        return new ol.control.ScaleLine(options);
    }-*/;
    
    /**
     * Return the units to use in the scale line.
     * @return The units to use in the scale line.
     */
    public final ScaleLineUnits getUnits() {
        return ScaleLineUnits.fromString(getUnitsNative());
    }
    
    /**
     * Return the units to use in the scale line.
     * @return The units to use in the scale line.
     */
    public final native String getUnitsNative() /*-{
        return this.getUnits();
    }-*/;
    
    /**
     * Set the units to use in the scale line.
     * @param units The units to use in the scale line.
     */
    public final native void setUnits(String units) /*-{
        this.setUnits(units);
    }-*/;
}
