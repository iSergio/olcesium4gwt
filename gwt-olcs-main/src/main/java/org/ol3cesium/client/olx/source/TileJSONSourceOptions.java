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
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.Attribution;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileJSONSourceOptions extends JavaScriptObject {
    protected TileJSONSourceOptions() {
        //
    }
    
    public static native TileJSONSourceOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Optional attributions for the source. If provided, these will be used 
     * instead of any attribution data advertised by the server. If not provided, 
     * any attributions advertised by the server will be used.
     * @param attributions 
     */
    public final native void setAttributions(JsArray<Attribution> attributions) /*-{
        this.attributions = attributions;
    }-*/;

    /**
     * The crossOrigin attribute for loaded images. Note that you must provide a 
     * crossOrigin value if you are using the WebGL renderer or if you want to 
     * access pixel data with the Canvas renderer. See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
     * @param crossOrigin 
     */
    public final native void setCrossOrigin(String crossOrigin) /*-{
        this.crossOrigin = crossOrigin;
    }-*/;

    /**
     * Maximum allowed reprojection error (in pixels). Default is 0.5. 
     * Higher values can increase reprojection performance, but decrease precision.
     * @param reprojectionErrorThreshold 
     */
    public final native void setReprojectionErrorThreshold(double reprojectionErrorThreshold) /*-{
        this.reprojectionErrorThreshold = reprojectionErrorThreshold;
    }-*/;

//public final native void settileLoadFunction	ol.TileLoadFunctionType | undefined	experimental
//Optional function to load a tile given a URL.

    /**
     * URL to the TileJSON file. Required.
     * @param url URL to the TileJSON file. Required.
     */
    public final native void setUrl(String url) /*-{
        this.url = url;
    }-*/;

    /**
     * Whether to wrap the world horizontally. Default is true.
     * @param wrapX Whether to wrap the world horizontally. Default is true.
     */
    public final native void setWrapX(boolean wrapX) /*-{
        this.wrapX = wrapX;
    }-*/;
}
