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
import com.google.gwt.core.client.JsArrayNumber;
import org.ol3cesium.client.ol.Color;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class StrokeStyleOptions extends JavaScriptObject {
    public static enum LineCapStyle {
        BUTT("butt"), ROUND("round"), SQUARE("square"), UNKNOWN("unknown");
        
        private final String _value;
        
        private LineCapStyle(String value) {
            _value = value;
        }
        
        public static LineCapStyle fromString(String string) {
            if (LineCapStyle.BUTT.toString().equalsIgnoreCase(string)) {
                return LineCapStyle.BUTT;
            } 
            else if (LineCapStyle.ROUND.toString().equalsIgnoreCase(string)) {
                return LineCapStyle.ROUND;
            }
            else if (LineCapStyle.SQUARE.toString().equalsIgnoreCase(string)) {
                return LineCapStyle.SQUARE;
            } else {
                return LineCapStyle.UNKNOWN;
            }
        }
        
        @Override
        public String toString() {
            return _value;
        }
    };
    public static enum LineJoinStyle {
        BEVEL("bevel"), ROUND("round"), MITER("miter"), UNKNOWN("unknown");
        
        private final String _value;
        
        private LineJoinStyle(String value) {
            _value = value;
        }
        
        public static LineJoinStyle fromString(String string) {
            if (LineJoinStyle.BEVEL.toString().equalsIgnoreCase(string)) {
                return LineJoinStyle.BEVEL;
            }
            else if (LineJoinStyle.ROUND.toString().equalsIgnoreCase(string)) {
                return LineJoinStyle.ROUND;
            }
            else if (LineJoinStyle.MITER.toString().equalsIgnoreCase(string)) {
                return LineJoinStyle.MITER;
            } else {
                return LineJoinStyle.UNKNOWN;
            }
        }
        
        @Override
        public String toString() {
            return _value;
        }
    };
    
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
        this.capStyle = capStyle.toString();
    }-*/;

    /**
     * 
     * @param lineJoin Line join style: bevel, round, or miter. Default is round.
     */
    public final native void setLineJoin(LineJoinStyle lineJoin) /*-{
        this.lineJoin = lineJoin.toString();
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
