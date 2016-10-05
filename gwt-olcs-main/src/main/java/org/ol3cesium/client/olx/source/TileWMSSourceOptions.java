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
import org.ol3cesium.client.ol.source.WMSServerType;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileWMSSourceOptions extends TileImageSourceOptions {
    protected TileWMSSourceOptions() {
        //
    }
    
    public static native TileWMSSourceOptions create() /*-{
        return {};
    }-*/;
    
    public final native void setParams(JavaScriptObject params) /*-{
        this.params = params;
    }-*/;
    
    /**
     * The crossOrigin attribute for loaded images. Note that you must provide a 
     * crossOrigin value if you are using the WebGL renderer or if you want to 
     * access pixel data with the Canvas renderer. 
     * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
     * @param crossOrigin 
     */
    public final native void setCrossOrigin(String crossOrigin) /*-{
        this.crossOrigin = crossOrigin;
    }-*/;
    
    /**
     * The size in pixels of the gutter around image tiles to ignore. By setting 
     * this property to a non-zero value, images will be requested that are wider 
     * and taller than the tile size by a value of 2 x gutter. Defaults to zero.
     * Using a non-zero value allows artifacts of rendering at tile edges to be ignored. 
     * If you control the WMS service it is recommended to address "artifacts at tile 
     * edges" issues by properly configuring the WMS service. For example, MapServer 
     * has a tile_map_edge_buffer configuration parameter for this. See http://mapserver.org/output/tile_mode.html.
     * @param gutter 
     */
    public final native void setGutter(int gutter) /*-{
        this.gutter = gutter;
    }-*/;

    /**
     * Use the ol.Map#pixelRatio value when requesting the image from the remote server. 
     * Default is true.
     * @param hidpi 
     */
    public final native void setHidpi(boolean hidpi) /*-{
        this.hidpi = hidpi;
    }-*/;

    /**
     * Maximum zoom.
     * @param maxZoom 
     */
    public final native void setMaxZoom(int maxZoom) /*-{
        this.maxZoom = maxZoom;
    }-*/;

    /**
     * Maximum allowed reprojection error (in pixels). Default is 0.5. 
     * Higher values can increase reprojection performance, but decrease precision.
     * @param reprojectionErrorThreshold 
     */
    public final native void setReprojectionErrorThreshold(double reprojectionErrorThreshold) /*-{
        this.reprojectionErrorThreshold = reprojectionErrorThreshold;
    }-*/;
    
    /**
     * The type of the remote WMS server. Currently only used when hidpi is true. Default is undefined.
     * @param serverType {@link WMSServerType}
     */
    public final native void setServerType(WMSServerType serverType) /*-{
        this.serverType = serverType.toString();
    }-*/;
}
