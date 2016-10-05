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
package org.ol3cesium.client.olx.style;

import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.client.ol.style.FillStyle;
import org.ol3cesium.client.ol.style.StrokeStyle;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class CircleStyleOptions extends JavaScriptObject {
    protected CircleStyleOptions() {
        //
    }
    
    public static final native CircleStyleOptions create() /*-{
        return {};
    }-*/;

    /**
     * Fill style.
     * @param fill 
     */
    public final native void setFill(FillStyle fill) /*-{
        this.fill = fill;
    }-*/;
    
    /**
     * 
     * @param radius Circle radius. Required.
     */
    public final native void setRadius(int radius) /*-{
        this.radius = radius;
    }-*/;

    /**
     * If true integral numbers of pixels are used as the X and Y pixel 
     * coordinate when drawing the circle in the output canvas. 
     * If false fractional numbers may be used. Using true allows for 
     * "sharp" rendering (no blur), while using false allows for "accurate" 
     * rendering. Note that accuracy is important if the circle's position is 
     * animated. Without it, the circle may jitter noticeably. Default value is true.
     * @param snapToPixel 
     */
    public final native void setSnapToPixel(boolean snapToPixel) /*-{
        this.snapToPixel = snapToPixel;
    }-*/;
    
    /**
     * Stroke style.
     * @param stroke 
     */
    public final native void setStroke(StrokeStyle stroke) /*-{
        this.stroke = stroke;
    }-*/;
}
