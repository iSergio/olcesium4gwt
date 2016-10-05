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
import org.ol3cesium.client.ol.geom.Geometry;
import org.ol3cesium.client.ol.style.FillStyle;
import org.ol3cesium.client.ol.style.ImageStyle;
import org.ol3cesium.client.ol.style.StrokeStyle;
import org.ol3cesium.client.ol.style.TextStyle;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class StyleOptions extends JavaScriptObject {
    protected StyleOptions() {
        //
    }
    
    public static final native StyleOptions create() /*-{
        return new ol.style.Style();
    }-*/;
    
    /**
     * Feature property or geometry or function returning a geometry to render for this style.
     * @param geometry 
     */
    public final native void setGeometry(String geometry) /*-{
        this.geometry = geometry;
    }-*/;
    
    /**
     * Feature property or geometry or function returning a geometry to render for this style.
     * @param geometry 
     */
    public final native void setGeometry(Geometry geometry) /*-{
        this.geometry = geometry;
    }-*/;
    
    /**
     * Feature property or geometry or function returning a geometry to render for this style.
     * @param geometry 
     */
    public final native void setGeometry(JavaScriptObject geometry) /*-{
        this.geometry = geometry;
    }-*/;
    
    /**
     * Fill style.
     * @param fill 
     */
    public final native void setFill(FillStyle fill) /*-{
        this.fill = fill;
    }-*/;
    
    /**
     * Image style.
     * @param image 
     */
    public final native void setImage(ImageStyle image) /*-{
        this.image = image;
    }-*/;
       
    /**
     * Stroke style.
     * @param stroke 
     */
    public final native void setStroke(StrokeStyle stroke) /*-{
        this.stroke = stroke;
    }-*/;
    
    /**
     * Text style.
     * @param text 
     */
    public final native void setText(TextStyle text) /*-{
        this.text = text;
    }-*/;
    
    /**
     * Z index.
     * @param zIndex 
     */
    public final native void setZIndex(int zIndex) /*-{
        this.zIndex = zIndex;
    }-*/;
}
