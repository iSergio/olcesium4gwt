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
package org.ol3cesium.client.ol.style;

import org.ol3cesium.client.olx.style.ImageStyleOptions;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * A base class used for creating subclasses and not instantiated in apps. 
 * Base class for ol.style.Icon, ol.style.Circle and ol.style.RegularShape.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ImageStyle extends JavaScriptObject {
    protected ImageStyle() {
        //
    }
    
    public static final native ImageStyle create(ImageStyleOptions options) /*-{
        return new ol.style.Image(options);
    }-*/;
    
    /**
     * Get the symbolizer opacity.
     * @return Opacity.
     */
    public final native float getOpacity() /*-{
        return this.getOpcity();
    }-*/;

    /**
     * Determine whether the symbolizer rotates with the map.
     * @return Rotate with map.
     */
    public final native boolean getRotateWithView() /*-{
        return this.getRotateWithView();
    }-*/;
    
    /**
     * Get the symoblizer rotation.
     * @return Rotation.
     */
    public final native double getRotation() /*-{
        return this.getRotation();
    }-*/;
    
    /**
     * Get the symbolizer scale.
     * @return Scale.
     */
    public final native double getScale() /*-{
        return this.getScale();
    }-*/;

    /**
     * Determine whether the symbolizer should be snapped to a pixel.
     * @return The symbolizer should snap to a pixel.
     */
    public final native boolean getSnapToPixel() /*-{
        return this.getSnapToPixel();
    }-*/;

    /**
     * Set the opacity.
     * @param opacity Opacity.
     */
    public final native void setOpacity(float opacity) /*-{
        this.setOpacity(opacity);
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
}
