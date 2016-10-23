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
package org.ol3cesium.ol.style;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import org.ol3cesium.ol.Color;
import org.ol3cesium.olx.style.StrokeStyleOptions;
import org.ol3cesium.olx.style.StrokeStyleOptions.LineCapStyle;
import org.ol3cesium.olx.style.StrokeStyleOptions.LineJoinStyle;

/**
 * Set stroke style for vector features. Note that the defaults given are the 
 * Canvas defaults, which will be used if option is not defined. 
 * The get functions return whatever was entered in the options; 
 * they will not return the default.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class StrokeStyle extends JavaScriptObject {
    protected StrokeStyle() {
        //
    }
    
    public static native StrokeStyle create() /*-{
        return new ol.style.Stroke();
    }-*/;
    
    public static native StrokeStyle create(Color color) /*-{
        return new ol.style.Stroke({color: color});
    }-*/;
    
    public static native StrokeStyle create(String color) /*-{
        return new ol.style.Stroke({color: color});
    }-*/;
    
    public static native StrokeStyle create(StrokeStyleOptions options) /*-{
        return new ol.style.Stroke(options);
    }-*/;
    
    /**
     * Get the stroke color.
     * @return Color.
     */
    public final native Color getColor() /*-{
        return this.getColor();
    }-*/;
    
    public final LineCapStyle getLineCap() {
        return LineCapStyle.fromString(getLineCapNative());
    }

    /**
     * Get the line cap type for the stroke.
     * @return Line cap.
     */
    public final native String getLineCapNative() /*-{
        return this.getLineCap();
    }-*/;
    
    /**
     * Get the line dash style for the stroke.
     * @return Line dash.
     */
    public final native JsArrayNumber getLineDash() /*-{
        return this.getLineDash();
    }-*/;

    public final LineJoinStyle getLineJoin() {
        return LineJoinStyle.fromString(getLineJoinNative());
    }
    /**
     * Get the line join type for the stroke.
     * @return Line join.
     */
    public final native String getLineJoinNative() /*-{
        return this.getLineJoin();
    }-*/;

    /**
     * Get the miter limit for the stroke.
     * @return Miter limit.
     */
    public final native double getMiterLimit() /*-{
        return this.getMiterLimit();
    }-*/;

    /**
     * Get the stroke width.
     * @return Width.
     */
    public final native int getWidth() /*-{
        return this.getWidth();
    }-*/;

    /**
     * Set the color.
     * @param color Color.
     */
    public final native void setColor(Color color) /*-{
        this.setColor(color);
    }-*/;
    
    /**
     * Set the color.
     * @param color Color.
     */
    public final native void setColor(String color) /*-{
        this.setColor(color);
    }-*/;

    /**
     * Set the line cap.
     * @param lineCap Line cap.
     */
    public final native void setLineCap(LineCapStyle lineCap) /*-{
        this.setLineCap(lineCap);
    }-*/;

    /**
     * Set the line dash.
     * @param lineDash Line dash.
     */
    public final native void setLineDash(JsArrayNumber lineDash) /*-{
        this.setLineDash(lineDash)
    }-*/;

    /**
     * Set the line join.
     * @param lineJoin Line join.
     */
    public final native void setLineJoin(LineJoinStyle lineJoin) /*-{
        this.setLineJoin(lineJoin)
    }-*/;	

    /**
     * Set the miter limit.
     * @param miterLimit Miter limit.
     */
    public final native void setMiterLimit(double miterLimit) /*-{
        this.setMiterLimit(miterLimit)
    }-*/;	

    /**
     * Set the width.
     * @param width Width.
     */
    public final native void setWidth(int width) /*-{
        this.setWidth(width);
    }-*/;
}
