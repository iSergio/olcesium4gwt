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
package org.ol3cesium.client.ol.layer;

import org.ol3cesium.client.olx.layer.VectorLayerOptions;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.style.Style;

/**
 * Vector data that is rendered client-side. Note that any property set in the 
 * options is set as a ol.Object property on the layer object; for example, 
 * setting title: 'My Title' in the options means that title is observable, 
 * and has get/set accessors.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class VectorLayer extends Layer {
    protected VectorLayer() {
        //
    }
    
    public static native VectorLayer create() /*-{
        var vector = new ol.layer.Vector();
        vector.set('className', @org.ol3cesium.client.ol.layer.BaseLayer::VECTOR_LAYER_CLASS_NAME);
        return vector;
    }-*/;
    
    public static final native VectorLayer create(VectorLayerOptions options) /*-{
        var vector = new ol.layer.Vector(options);
        vector.set('className', @org.ol3cesium.client.ol.layer.BaseLayer::VECTOR_LAYER_CLASS_NAME);
        return vector;
    }-*/;
    
//    /**
//     * Return the associated vectorsource of the layer.
//     * @return Source.
//     */
//    public final native VectorSource getSource() /*-{
//        return this.getSource();
//    }-*/;
    
    /**
     * Get the style for features. This returns whatever was passed to the 
     * style option at construction or to the setStyle method.
     * @return Layer style.
     */
    public final native JsArray<Style> getStyle() /*-{
        return this.getStyle();
    }-*/;
    
    /**
     * Set the style for features. This can be a single style object, an array of 
     * styles, or a function that takes a feature and resolution and returns an 
     * array of styles. If it is undefined the default style is used. 
     * If it is null the layer has no style (a null style), so only features that 
     * have their own styles will be rendered in the layer. See ol.style for 
     * information on the default style.
     * @param style Layer style.
     */
    public final native void setStyle(Style style) /*-{
        this.setStyle(style);
    }-*/;
    
    /**
     * Set the style for features. This can be a single style object, an array of 
     * styles, or a function that takes a feature and resolution and returns an 
     * array of styles. If it is undefined the default style is used. 
     * If it is null the layer has no style (a null style), so only features that 
     * have their own styles will be rendered in the layer. See ol.style for 
     * information on the default style.
     * @param style Layer style.
     */
    public final native void setStyle(JsArray<Style> style) /*-{
        this.setStyle(style);
    }-*/;
}
