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

import org.ol3cesium.client.olx.style.StyleOptions;
import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.client.ol.geom.Geometry;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Style extends JavaScriptObject {
    protected Style() {
        //
    }
    
    public static final native Style create() /*-{
        return new ol.style.Style();
    }-*/;
    
    public static final native Style create(StyleOptions options) /*-{
        return new ol.style.Style(options);
    }-*/;
    
    /**
     * Get the fill style.
     * @return Fill style.
     */
    public final native FillStyle getFill() /*-{
        return this.getFill();
    }-*/;

    /**
     * Get the geometry to be rendered.
     * @return Feature  geometry that returns the geometry that will be rendered with this style. 
     */
    public final native Geometry getGeometry() /*-{
        return this.getGeometry();
    }-*/;
    
    /**
     * Get the image style.
     * @return Image style.
     */
    public final native ImageStyle getImage() /*-{
        return this.getImage();
    }-*/;

    /**
     * Get the stroke style.
     * @return Stroke style. 
     */
    public final native StrokeStyle getStroke() /*-{
        return this,getStroke();
    }-*/;

    /**
     * Get the text style.
     * @return Text style.
     */
    public final native TextStyle getText() /*-{
        return this.getText();
    }-*/;

    /**
     * Get the z-index for the style.
     * @return ZIndex. 
     */
    public final native int getZIndex() /*-{
        return this.getZIndex();
    }-*/;

    /**
     * Set a geometry that is rendered instead of the feature's geometry.
     * @param geometry Feature geometry returning a geometry to render for this style.
     */
    public final native void setGeometry(Geometry geometry) /*-{
        this.setGeometry(geometry);
    }-*/;

    /**
     * Set the z-index.
     * @param zIndex Z index.
     */
    public final native void setZIndex(int zIndex) /*-{
        this.setZIndex(zIndex);
    }-*/;
}
