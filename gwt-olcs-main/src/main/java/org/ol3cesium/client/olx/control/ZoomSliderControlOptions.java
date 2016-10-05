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
package org.ol3cesium.client.olx.control;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ZoomSliderControlOptions extends JavaScriptObject {
    protected ZoomSliderControlOptions() {
        //
    }
    
    public static native ZoomSliderControlOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param className CSS class name. Default is ol-attribution.
     */
    public final native void setClassName(String className) /*-{
        this.className = className;
    }-*/;
    
    /**
     * 
     * @param duration Animation duration in milliseconds. Default is 250.
     */
    public final native void setDuration(int duration) /*-{
        this.duration = duration;
    }-*/;
    
    /**
     * 
     * @param maxResolution Maximum resolution.
     */
    public final native void setMaxResolution(double maxResolution) /*-{
        this.maxResolution = maxResolution;
    }-*/;
    
    /**
     * 
     * @param minResolution Minimum resolution.
     */
    public final native void setMinResolution(double minResolution) /*-{
            this.minResolution = minResolution;
    }-*/;
}
