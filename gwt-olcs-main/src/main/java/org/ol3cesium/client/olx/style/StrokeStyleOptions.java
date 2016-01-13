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
package org.ol3cesium.client.olx.style;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import org.ol3cesium.client.ol.Color;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class StrokeStyleOptions extends JavaScriptObject {
    public static enum LineCapStyle {BUTT, ROUND, SQUARE};
    public static enum LineJoinStyle {BEVEL, ROUND, MITER};
    
    protected StrokeStyleOptions() {
        //
    }
    
    public static final native StrokeStyleOptions create() /*-{
        return {}
    }-*/;
    
    /**
     * 
     * @param color Color. See ol.color for possible formats. 
     * Default null; if null, the Canvas/renderer default black will be used.
     */
    public final native void setColor(Color color) /*-{
        this.color = color;
    }-*/;
    
    /**
     * 
     * @param color Color. See ol.color for possible formats. 
     * Default null; if null, the Canvas/renderer default black will be used.
     */
    public final native void setColor(String color) /*-{
        this.color = color;
    }-*/;

    /**
     * 
     * @param capStyle Line cap style: butt, round, or square. Default is round.
     */
    public final native void setLineCap(LineCapStyle capStyle) /*-{
        this.capStyle = capStyle;
    }-*/;

    /**
     * 
     * @param lineJoin Line join style: bevel, round, or miter. Default is round.
     */
    public final native void setLineJoin(LineJoinStyle lineJoin) /*-{
        this.lineJoin = lineJoin;
    }-*/;

    /**
     * 
     * @param lineDash Line dash pattern. Default is undefined (no dash).
     */
    public final native void setLineDash(JsArrayNumber lineDash) /*-{
        this.lineDash = lineDash;
    }-*/;

    /**
     * 
     * @param miterLimit Miter limit. Default is 10.
     */
    public final native void setMiterLimit(double miterLimit) /*-{
        this.miterLimit = miterLimit;
    }-*/;

    /**
     * 
     * @param width Width.
     */
    public final native void setWidth(int width) /*-{
        this.width = width;
    }-*/;

}
