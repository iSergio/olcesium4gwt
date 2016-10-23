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
package org.ol3cesium.olx.source;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class StamenSourceOptions extends JavaScriptObject {
    protected StamenSourceOptions() {
        //
    }
    
    public static native StamenSourceOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Layer. Required.
     * @param layer Layer. Required.
     */
    public final native void setLayer(String layer) /*-{
            this.layer = layer;
    }-*/;

    /**
     * 
     * @param minZoom Minimum zoom.
     */
    public final native void setMinZoom(int minZoom) /*-{
        this.minZoom = minZoom;
    }-*/;

    /**
     * 
     * @param maxZoom Maximum zoom.
     */
    public final native void setMaxZoom(int maxZoom) /*-{
        this.maxZoom = maxZoom;
    }-*/;

    /**
     * 
     * @param opaque Whether the layer is opaque.
     */
    public final native void setOpaque(boolean opaque) /*-{
        this.opaque = opaque;
    }-*/;

    /**
     * Maximum allowed reprojection error (in pixels). Default is 0.5. 
     * Higher values can increase reprojection performance, but decrease precision.
     * @param reprojectionErrorThreshold 
     */
    public final native void setReprojectionErrorThreshold(double reprojectionErrorThreshold) /*-{
        this.reprojectionErrorThreshold = reprojectionErrorThreshold;
    }-*/;

//tileLoadFunction	ol.TileLoadFunctionType | undefined	experimental
//Optional function to load a tile given a URL.
    
    /**
     * 
     * @param url URL template. Must include {x}, {y} or {-y}, and {z} placeholders.
     */
    public final native void setUrl(String url) /*-{
        this.url = url;
    }-*/;
}
