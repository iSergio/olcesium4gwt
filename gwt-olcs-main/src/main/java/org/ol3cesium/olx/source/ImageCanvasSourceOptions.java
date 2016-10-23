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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;
import org.ol3cesium.ol.Attribution;
import org.ol3cesium.ol.proj.Projection;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ImageCanvasSourceOptions extends JavaScriptObject {
    protected ImageCanvasSourceOptions() {
        //
    }
    
    public static native ImageCanvasSourceOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Sets attributions.
     * @param attributions Attributions.
     */
    public final native void setAttributions(JsArray<Attribution> attributions)	/*-{
        this.attributions = attributions;
    }-*/;
    
//canvasFunction	ol.CanvasFunctionType	experimental
//Canvas function. The function returning the canvas element used by the source as an image. The arguments passed to the function are: {ol.Extent} the image extent, {number} the image resolution, {number} the device pixel ratio, {ol.Size} the image size, and {ol.proj.Projection} the image projection. The canvas returned by this function is cached by the source. If the value returned by the function is later changed then dispatchChangeEvent should be called on the source for the source to invalidate the current cached image. Required.

    /**
     * 
     * @param logo Logo.
     */
    public final native void setLogo(String logo) /*-{
        this.logo = logo;
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
     * Ratio. 1 means canvases are the size of the map viewport, 2 means twice 
     * the width and height of the map viewport, and so on. 
     * Must be 1 or higher. Default is 1.5.
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

    /**
     * Source state.
     * @param state Source state.
     */
    public final native void setState(String state) /*-{
        this.state = state;
    }-*/;
}
