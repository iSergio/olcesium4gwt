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
package org.ol3cesium.client.olx.source;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class BingMapsSourceOptions extends JavaScriptObject {
    protected BingMapsSourceOptions() {
        //
    }
    
    public static native BingMapsSourceOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Culture code. Default is en-us.
     * @param culture Culture code.
     */
    public final native void setCulture(String culture) /*-{
        this.culture = culture;
    }-*/;

    /**
     * Bing Maps API key. Get yours at http://bingmapsportal.com/. Required.
     * @param key Bing Maps API key.
     */
    public final native void setKey(String key) /*-{
        this.key = key;
    }-*/;

    /**
     * Type of imagery. Required.
     * @param imagerySet Type of imagery. Required.
     */
    public final native void setImagerySet(String imagerySet) /*-{
        this.imagerySet = imagerySet;
    }-*/;

    /**
     * Max zoom. Default is what's advertized by the BingMaps service (21 currently).
     * @param maxZoom Max zoom.
     */
    public final native void setMaxZoom(int maxZoom) /*-{
        this.maxZoom = maxZoom;
    }-*/;

    /**
     * Maximum allowed reprojection error (in pixels). Default is 0.5. 
     * Higher values can increase reprojection performance, but decrease precision.
     * @param reprojectionErrorThreshold Maximum allowed reprojection error (in pixels).
     */
    public final native void setReprojectionErrorThreshold(double reprojectionErrorThreshold) /*-{
        this.reprojectionErrorThreshold = reprojectionErrorThreshold;
    }-*/;

//tileLoadFunction	ol.TileLoadFunctionType | undefined	experimental
//Optional function to load a tile given a URL.
    
    /**
     * Whether to wrap the world horizontally. Default is true.
     * @param wrapX Whether to wrap the world horizontally.
     */
    public final native void setWrapX(boolean wrapX) /*-{
            this.wrapX = wrapX;
    }-*/;
}
