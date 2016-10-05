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
public class TextStyleOptions extends JavaScriptObject {
    public enum TextAlign {
        LEFT("left"), RIGHT("right"), CENTER("center"), END("end"), START("start"), UNKNOWN("unknown");
        
        private final String _value;
        
        private TextAlign(String value) {
            _value = value;
        }
        
        public static TextAlign fromString(String string) {
            if (LEFT.toString().equalsIgnoreCase(string)) {
                return LEFT;
            }
            else if (RIGHT.toString().equalsIgnoreCase(string)) {
                return RIGHT;
            }
            else if (CENTER.toString().equalsIgnoreCase(string)) {
                return CENTER;
            }
            else if (END.toString().equalsIgnoreCase(string)) {
                return END;
            }
            else if (START.toString().equalsIgnoreCase(string)) {
                return START;
            } else {
                return UNKNOWN;
            }
        }
        
        @Override
        public String toString() {
            return _value;
        }
    }
    
    public enum TextBaseline {
        BOTTOM("bottom"), TOP("top"), MIDDLE("middle"), ALPHABETIC("alphabetic"), HANGING("hanging"), IDEOGRAPHIC("ideographic"), UNKNOWN("unknown");
        
        private final String _value;
        
        private TextBaseline(String value) {
            _value = value;
        }
        
        public static TextBaseline fromString(String string) {
            if (BOTTOM.toString().equalsIgnoreCase(string)) {
                return BOTTOM;
            }
            else if (TOP.toString().equalsIgnoreCase(string)) {
                return TOP;
            }
            else if (MIDDLE.toString().equalsIgnoreCase(string)) {
                return MIDDLE;
            }
            else if (ALPHABETIC.toString().equalsIgnoreCase(string)) {
                return ALPHABETIC;
            }
            else if (HANGING.toString().equalsIgnoreCase(string)) {
                return HANGING;
            }
            else if (IDEOGRAPHIC.toString().equalsIgnoreCase(string)) {
                return IDEOGRAPHIC;
            } else {
                return UNKNOWN;
            }
        }
        
        @Override
        public String toString() {
            return _value;
        }
    }

    protected TextStyleOptions() {
        //
    }
    
    public static final native TextStyleOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Font style as CSS 'font' value, see: 
     * https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/font. 
     * Default is '10px sans-serif'
     * @param font 
     */
    public final native void setFont(String font) /*-{
        this.font = font;
    }-*/;

    /**
     * Horizontal text offset in pixels. A positive will shift the text right. 
     * Default is 0.
     * @param offsetX 
     */
    public final native void setOffsetX(int offsetX) /*-{
        this.offsetX = offsetX;
    }-*/;

    /**
     * Vertical text offset in pixels. A positive will shift the text down. 
     * Default is 0.
     * @param offsetY 
     */
    public final native void setOffsetY(int offsetY) /*-{
        this.offsetY = offsetY;
    }-*/;

    /**
     * 
     * @param scale Scale.
     */
    public final native void setScale(double scale) /*-{
        this.scale = scale;
    }-*/;
    
    /**
     * Whether to rotate the text with the view. Default is `false`.
     * @param rotateWithView Set rotate with view.
     */
    public final native void setRotateWithView(boolean rotateWithView) /*-{
        this.rotateWithView = rotateWithView;
    }-*/;

    /**
     * Rotation in radians (positive rotation clockwise). Default is 0.
     * @param rotation 
     */
    public final native void setRotation(double rotation) /*-{
        this.rotation = rotation;
    }-*/;

    /**
     * Text content.
     * @param text 
     */
    public final native void setText(String text) /*-{
        this.text = text;
    }-*/;

    /**
     * Text alignment. Possible values: 'left', 'right', 'center', 'end' or 'start'. Default is 'start'.
     * @param textAlign 
     */
    public final native void setTextAlign(TextAlign textAlign) /*-{
        this.textAlign = textAlign.toString();
    }-*/;

    /**
     * Text base line. Possible values: 'bottom', 'top', 'middle', 'alphabetic', 
     * 'hanging', 'ideographic'. Default is 'alphabetic'.
     * @param textBaseline 
     */
    public final native void setTextBaseline(TextBaseline textBaseline) /*-{
        this.textBaseline = textBaseline.toString();
    }-*/;

    /**
     * Fill style. If none is provided, we'll use a dark fill-style (#333).
     * @param fill 
     */
    public final native void setFill(FillStyle fill) /*-{
        this.fill = fill;
    }-*/;

    /**
     * Stroke style.
     * @param stroke 
     */
    public final native void setStroke(StrokeStyle stroke) /*-{
        this.stroke = stroke;
    }-*/;
}
