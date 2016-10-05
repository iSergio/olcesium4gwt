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
package org.ol3cesium.client.olx.layer;

import com.google.gwt.core.client.JsArrayString;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class HeatmapLayerOptions extends LayerOptions {
    protected HeatmapLayerOptions() {
        //
    }
    
    public static native HeatmapLayerOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * The color gradient of the heatmap, specified as an array of CSS color strings. 
     * Default is ['#00f', '#0ff', '#0f0', '#ff0', '#f00'].
     * @param gradient Gradient.
     */
    public final native void setGradient(JsArrayString gradient) /*-{
        this.gradient = gradient;
    }-*/;

    /**
     * Radius size in pixels. Default is 8.
     * @param radius Radius.
     */
    public final native void setRadius(int radius) /*-{
        this.radius = radius;
    }-*/;

    /**
     * Blur size in pixels. Default is 15.
     * @param blur Blur.
     */
    public final native void setBlur(int blur) /*-{
        this.blur = blur;
    }-*/;

    /**
     * Shadow size in pixels. Default is 250.
     * @param shadow Shadow.
     */
    public final native void setShadow(int shadow) /*-{
        this.shadow = shadow;
    }-*/;

    /**
     * The feature attribute to use for the weight or a function that returns a 
     * weight from a feature. Weight values should range from 0 to 1 
     * (and values outside will be clamped to that range). 
     * Default is weight. Required.
     * @param weight Weight.
     */
    public final native void setWeight(String weight) /*-{
        this.weight = weight;
    }-*/;
}
