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
package org.ol3cesium.client.ol.style;

import org.ol3cesium.client.olx.style.TextStyleOptions;
import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TextStyle extends JavaScriptObject {
    protected TextStyle() {
        //
    }
    
    public static final native TextStyle create() /*-{
        return new ol.style.Text();
    }-*/;
    
    public static final native TextStyle create(TextStyleOptions options) /*-{
        return new ol.style.Text(options);
    }-*/;
    
    /**
     * Get the fill style for the text.
     * @return Fill style.
     */
    public final native FillStyle getFill() /*-{
        return this.getFill();
    }-*/;

    /**
     * Get the font name.
     * @return Font. 
     */
    public final native String getFont() /*-{
        return this.getFont();
    }-*/;

    /**
     * Get the x-offset for the text.
     * @return Horizontal text offset. 
     */
    public final native int getOffsetX() /*-{
        return this.getOffsetX();
    }-*/;

    /**
     * Get the y-offset for the text.
     * @return Vertical text offset.
     */
    public final native int getOffsetY() /*-{
        return this.getOffsetY();
    }-*/;

    /**
     * Get the text rotation.
     * @return Rotation.
     */
    public final native double getRotation() /*-{
        return this.getRotation();
    }-*/;

    /**
     * Get the text scale.
     * @return Scale.
     */
    public final native double getScale() /*-{
        return this.getScele();
    }-*/;

    /**
     * Get the stroke style for the text.
     * @return Stroke style.
     */
    public final native StrokeStyle getStroke() /*-{
        return this.getStroke();
    }-*/;
    
    /**
     * Get the text to be rendered.
     * @return Text.
     */
    public final native String getText() /*-{
        return this.getText();
    }-*/;

    /**
     * Get the text alignment.
     * @return Text align.
     */
    public final native String getTextAlign() /*-{
        return this.getTextAlign();
    }-*/;

    /**
     * Get the text baseline.
     * @return Text baseline.
     */
    public final native String getTextBaseline() /*-{
        return this.getTextBaseline();
    }-*/;
    
    /**
     * Set the fill.
     * @param fill Fill style.
     */
    public final native void setFill(FillStyle fill) /*-{
        this.setFill(fill);
    }-*/;

    /**
     * Set the font.
     * @param font Font.
     */
    public final native void setFont(String font) /*-{
        this.setFont(font);
    }-*/;

    /**
     * Set the x offset.
     * @param offsetX Horizontal text offset.
     */
    public final native void setOffsetX(int offsetX) /*-{
        this.setOffsetX(offsetX);
    }-*/;

    /**
     * Set the y offset.
     * @param offsetY Vertical text offset.
     */
    public final native void setOffsetY(int offsetY) /*-{
        this.setOffsetY(offsetY);
    }-*/;

    /**
     * Set the rotation.
     * @param rotation Rotation.
     */
    public final native void setRotation(double rotation) /*-{
        this.setRotation(rotation);
    }-*/;

    /**
     * Set the scale.
     * @param scale Scale.
     */
    public final native void setScale(double scale) /*-{
        this.setScale(scale);
    }-*/;

    /**
     * Set the stroke.
     * @param stroke Stroke style.
     */
    public final native void setStroke(StrokeStyle stroke) /*-{
        this.setStroke(stroke);
    }-*/;
    
    /**
     * Set the text.
     * @param text Text.
     */
    public final native void setText(String text) /*-{
        this.setText(text);
    }-*/;

    /**
     * Set the text alignment.
     * @param textAlign Text align.
     */
    public final native void setTextAlign(String textAlign) /*-{
        this.setTextAlign(textAlign);
    }-*/;

    /**
     * Set the text baseline.
     * @param textBaseline Text baseline.
     */
    public final native void setTextBaseline(String textBaseline) /*-{
        this.setTextBaseline(textBaseline);
    }-*/;
}
