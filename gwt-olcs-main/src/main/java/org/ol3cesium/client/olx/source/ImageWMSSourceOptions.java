/* 
 * Copyright 2016 iserge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
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
import com.google.gwt.core.client.JsArrayNumber;
import org.ol3cesium.client.ol.Attribution;
import org.ol3cesium.client.ol.proj.Projection;
import org.ol3cesium.client.ol.source.WMSServerType;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ImageWMSSourceOptions extends JavaScriptObject {
    protected ImageWMSSourceOptions() {
        //
    }
    
    public static final native ImageWMSSourceOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Sets attributions.
     * @param attributions Attributions.
     */
    public final native void setAttributions(JsArray<Attribution> attributions)	/*-{
        this.attributions = attributions;
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
     * Use the ol.Map#pixelRatio value when requesting the image from the remote server. 
     * Default is true.
     * @param hidpi 
     */
    public final native void setHidpi(boolean hidpi) /*-{
        this.hidpi = hidpi;
    }-*/;
    
    /**
     * The type of the remote WMS server. Currently only used when hidpi is true. Default is undefined.
     * @param serverType {@link ServerTypeWMSSource}
     */
    public final native void setServerType(WMSServerType serverType) /*-{
        this.serverType = serverType.toString();
    }-*/;
    
//    imageLoadFunction	ol.ImageLoadFunctionType | undefined	experimental
//Optional function to load an image given a URL.
    
    /**
     * 
     * @param logo Logo.
     */
    public final native void setLogo(String logo) /*-{
        this.logo = logo;
    }-*/;
    
    /**
     * Additional parameters.
     * @param params Additional parameters.
     */
    public final native void setParams(JavaScriptObject params) /*-{
        this.params = params;
    }-*/;

    /**
     * Projection.
     * @param projection Projection.
     */
    public final native void setProjection(Projection projection) /*-{
        this.projection = projection;
    }-*/;
    
    /**
     * Projection.
     * @param projection Projection.
     */
    public final native void setProjection(String projection) /*-{
        this.projection = projection;
    }-*/;
    
    /**
     * Ratio. 1 means image requests are the size of the map viewport, 2 means 
     * twice the width and height of the map viewport, and so on. 
     * Must be 1 or higher. Default is 1.5.
     * @param ratio 
     */
    public final native void setRatio(double ratio) /*-{
        this.ratio = ratio;
    }-*/;

    /**
     * Resolutions. If specified, new canvases will be created for these resolutions only.
     * @param resolutions 
     */
    public final native void setResolutions(JsArrayNumber resolutions) /*-{
        this.resolutions = resolutions;
    }-*/;
    
    /**
     * WMS service URL.
     * @param url 
     */
    public final native void setUrl(String url) /*-{
        this.url = url;
    }-*/;
}
