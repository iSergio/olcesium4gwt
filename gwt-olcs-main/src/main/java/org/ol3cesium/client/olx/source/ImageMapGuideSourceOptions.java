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
import com.google.gwt.core.client.JsArrayNumber;
import org.ol3cesium.client.ol.proj.Projection;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ImageMapGuideSourceOptions extends JavaScriptObject {
    protected ImageMapGuideSourceOptions() {
        //
    }
    
    public static final native ImageMapGuideSourceOptions create() /*-{
        return {};
    }-*/;

    /**
     * The mapagent url.
     * @param url 
     */
    public final native void setUrl(String url) /*-{
        this.url = url;
    }-*/;

    /**
     * 
     * @param displayDpi The display resolution. Default is 96.
     */
    public final native void setDisplayDpi(int displayDpi) /*-{
        this.displayDpi = displayDpi;
    }-*/;

    /**
     * 
     * @param metersPerUnit The meters-per-unit value. Default is 1.
     */
    public final native void setMetersPerUnit(double metersPerUnit) /*-{
        this.metersPerUnit = metersPerUnit;
    }-*/;
    
    /**
     * 
     * @param hidpi Use the ol.Map#pixelRatio value when requesting the image from the remote server. Default is true.
     */
    public final native void setHidpi(boolean hidpi) /*-{
            this.hidpi = hidpi;
    }-*/;

    /**
     * If true, will use GETDYNAMICMAPOVERLAYIMAGE.
     * @param useOverlay 
     */
    public final native void setUseOverlay(boolean useOverlay) /*-{
        this.useOverlay = useOverlay;
    }-*/;

    /**
     * 
     * @param projection Projection.
     */
    public final native void setProjection(Projection projection) /*-{
        this.projection = projection;
    }-*/;
    
    /**
     * 
     * @param projection Projection.
     */
    public final native void setProjection(String projection) /*-{
        this.projection = projection;
    }-*/;

    /**
     * Ratio. 1 means image requests are the size of the map viewport, 2 means 
     * twice the width and height of the map viewport, and so on. 
     * Must be 1 or higher. Default is 1.
     * @param ratio 
     */
    public final native void setRatio(int ratio) /*-{
        this.ratio = ratio;
    }-*/;

    /**
     * Resolutions. If specified, new canvases will be created for these resolutions only.
     * @param resolutions 
     */
    public final native void setResolutions(JsArrayNumber resolutions) /*-{
        this.resolutions = resolutions;
    }-*/;
    
//imageLoadFunction	ol.TileLoadFunctionType | undefined	experimental
//Optional function to load an image given a URL.

    /**
     * Additional parameters.
     * @param params Additional parameters.
     */
    public final native void setParams(JavaScriptObject params) /*-{
        this.params = params;
    }-*/;
}
