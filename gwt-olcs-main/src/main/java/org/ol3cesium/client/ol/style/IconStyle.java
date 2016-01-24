/*
 * Copyright 2016 Serge Silaev aka iSergio <s.serge.b@gmail.com>.
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

import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.user.client.ui.Image;
import org.ol3cesium.client.ol.Size;
import org.ol3cesium.client.olx.style.IconStyleOptions;

/**
 * Set icon style for vector features.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class IconStyle extends ImageStyle {
    protected IconStyle() {
        //
    }
    
    public static final native IconStyle create() /*-{
        return new ol.style.Icon();
    }-*/;
    
    public static final native IconStyle create(IconStyleOptions options) /*-{
        return new ol.style.Icon(options);
    }-*/;
    
    /**
     * Get the anchor point. The anchor determines the center point for the symbolizer. 
     * Its units are determined by anchorXUnits and anchorYUnits.
     * @return Anchor as array.
     */
    public final native JsArrayNumber getAnchor() /*-{
        return this.getAnchor();
    }-*/;
    
    /**
     * Get the image icon.
     * @param pixelRatio Pixel ratio.
     * @return Image or Canvas element.
     */
    public final native Image getImage(Number pixelRatio) /*-{
        return this.getImage(pixelRatio);
    }-*/;
    
    /**
     * Get the origin of the symbolizer.
     * @return Origin.
     */
    public final native JsArrayNumber getOrigin() /*-{
        return thi.getOrigin();
    }-*/;
    
    /**
     * Get the size of the symbolizer (in pixels).
     * @return Size.
     */
    public final native Size getSize() /*-{
        return this.getSize();
    }-*/;
    
    /**
     * Load not yet loaded URI. When rendering a feature with an icon style, 
     * the vector renderer will automatically call this method. However, 
     * you might want to call this method yourself for preloading or other purposes.
     */
    public final native void load() /*-{
        this.load();
    }-*/;
}
