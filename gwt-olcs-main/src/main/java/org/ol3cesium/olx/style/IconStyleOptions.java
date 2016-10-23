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
package org.ol3cesium.olx.style;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.user.client.ui.Image;
import org.ol3cesium.ol.Color;
import org.ol3cesium.ol.Pixel;
import org.ol3cesium.ol.Size;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class IconStyleOptions extends JavaScriptObject {
    /**
     * Icon anchor units.
     */
    public enum IconAnchorUnits {
        FRACTION("fraction"), PIXELS("pixels"), UNKNOWN("unknown");
        
        private final String _value;
        
        IconAnchorUnits(String value) {
            _value = value;
        }
        
        public static IconAnchorUnits formString(String string) {
            if (FRACTION.toString().equalsIgnoreCase(string)) {
                return FRACTION;
            }
            else if (PIXELS.toString().equalsIgnoreCase(string)) {
                return PIXELS;
            } else {
                return UNKNOWN;
            }
        }
        
        @Override
        public String toString() {
            return _value;
        }
    }

    /**
     * Icon origin.
     */
    public enum IconOrigin {
        BOTTOM_LEFT("bottom-left"), BOTTOM_RIGHT("bottom-right"), 
        TOP_LEFT("top-left"), TOP_RIGHT("top-right"), UNKNOWN("unknown");
        
        private final String _value;
        
        IconOrigin(String value) {
            _value = value;
        }
        
        public static IconOrigin fromString(String string) {
            if (BOTTOM_LEFT.toString().equalsIgnoreCase(string)) {
                return BOTTOM_LEFT;
            }
            else if (BOTTOM_RIGHT.toString().equalsIgnoreCase(string)) {
                return BOTTOM_RIGHT;
            }
            else if (TOP_LEFT.toString().equalsIgnoreCase(string)) {
                return TOP_LEFT;
            }
            else if (TOP_RIGHT.toString().equalsIgnoreCase(string)) {
                return TOP_RIGHT;
            } else {
                return UNKNOWN;
            }
        }
        
        @Override
        public String toString() {
            return _value;
        }
        
    }
    
    protected IconStyleOptions() {
        //
    }
    
    public static native IconStyleOptions create() /*-{
        return {};
    }-*/;

    /**
     * 
     * @param anchor Anchor. Default value is [0.5, 0.5] (icon center).
     */
    public final native void setAnchor(JsArrayNumber anchor) /*-{
        this.anchor = anchor;
    }-*/;
    
    /**
     * 
     * @param pixel Anchor. Default value is [0.5, 0.5] (icon center).
     */
    public final native void setAnchor(Pixel pixel) /*-{
        this.anchor = pixel;
    }-*/;

    /**
     * 
     * @param anchorOrigin Origin of the anchor: bottom-left, bottom-right, 
     * top-left or top-right. Default is top-left.
     */
    public final native void setAnchorOrigin(IconOrigin anchorOrigin) /*-{
        this.anchorOrigin = anchorOrigin.toString();
    }-*/;

    /**
     * 
     * @param anchorXUnits Units in which the anchor x value is specified. 
     * A value of 'fraction' indicates the x value is a fraction of the icon.
     * A value of 'pixels' indicates the x value in pixels. Default is 'fraction'.
     */
    public final native void setAnchorXUnits(IconAnchorUnits anchorXUnits) /*-{
        this.anchorXUnits = anchorXUnits.toString();
    }-*/;

    /**
     * 
     * @param anchorYUnits Units in which the anchor y value is specified. 
     * A value of 'fraction' indicates the y value is a fraction of the icon. 
     * A value of 'pixels' indicates the y value in pixels. Default is 'fraction'.
     */
    public final native void setAnchorYUnits(IconAnchorUnits anchorYUnits) /*-{
        this.anchorYUnits = anchorYUnits.toString();
    }-*/;
    
    /**
     * 
     * @param color Color to tint the icon. If not specified, the icon will be left as is.
     */
    public final native void setColor(Color color) /*-{
        this.color = color;
    }-*/;
    
    /**
     * 
     * @param color Color to tint the icon. If not specified, the icon will be left as is.
     */
    public final native void setColor(String color) /*-{
        this.color = color;
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
     * Image object for the icon. If the src option is not provided then the 
     * provided image must already be loaded. And in that case, 
     * it is required to provide the size of the image, with the imgSize option.
     * @param img Image object for the icon.
     */
    public final native void setImg(Image img) /*-{
        this.img = img;
    }-*/;
    
    /**
     * 
     * @param offset Offset, which, together with the size and the offset origin, 
     * define the sub-rectangle to use from the original icon image. Default value is [0, 0].
     */
    public final native void setOffset(JsArrayNumber offset) /*-{
        this.offset = offset;
    }-*/;
    
    /**
     * 
     * @param offset Offset, which, together with the size and the offset origin, 
     * define the sub-rectangle to use from the original icon image. Default value is [0, 0].
     */
    public final native void setOffset(Pixel offset) /*-{
        this.offset = offset;
    }-*/;
    
    /**
     * 
     * @param offsetOrigin Origin of the offset: bottom-left, bottom-right, 
     * top-left or top-right. Default is top-left.
     */
    public final native void setOffsetOrigin(IconOrigin offsetOrigin) /*-{
        this.offsetOrigin = offsetOrigin.toString();
    }-*/;
    
    /**
     * 
     * @param opacity Opacity of the icon. Default is 1.
     */
    public final native void setOpacity(Number opacity) /*-{
        this.opacity = opacity;
    }-*/;
    
    /**
     * 
     * @param scale Scale.
     */
    public final native void setScale(Number scale) /*-{
        this.scale = scale;
    }-*/;
    
    /**
     * 
     * @param snapToPixel If true integral numbers of pixels are used as the X and 
     * Y pixel coordinate when drawing the icon in the output canvas. 
     * If false fractional numbers may be used. Using true allows for "sharp"
     * rendering (no blur), while using false allows for "accurate" rendering. 
     * Note that accuracy is important if the icon's position is animated. Without it, 
     * the icon may jitter noticeably. Default value is true.
     */
    public final native void setSnapToPixel(boolean snapToPixel) /*-{
        this.snapToPixel = snapToPixel;
    }-*/;
    
    /**
     * 
     * @param rotateWithView Whether to rotate the icon with the view. Default is false.
     */
    public final native void setRotateWithView(boolean rotateWithView) /*-{
        this.rotateWithView = rotateWithView;
    }-*/;
    
    /**
     * 
     * @param rotation Rotation in radians (positive rotation clockwise). Default is 0.
     */
    public final native void setRotation(Number rotation) /*-{
        this.rotation = rotation;
    }-*/;
    
    /**
     * 
     * @param size Icon size in pixel. Can be used together with offset to define 
     * the sub-rectangle to use from the origin (sprite) icon image.
     */
    public final native void setSize(Size size) /*-{
        this.size = size;
    }-*/;
    
    /**
     * 
     * @param imgSize Image size in pixel. Only required if img is set and src is not.
     */
    public final native void setImgSize(Size imgSize) /*-{
        this.imgSize = imgSize;
    }-*/;
    
    /**
     * 
     * @param src Image source URI. Required.
     */
    public final native void setSrc(String src) /*-{
        this.src = src;
    }-*/;
}
