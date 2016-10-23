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
package org.ol3cesium.olx.format;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class MVTFormatOptions extends JavaScriptObject {
    protected MVTFormatOptions() {
        //
    }
    
    public static native MVTFormatOptions create() /*-{
        return {};
    }-*/;
    
//    featureClass	undefined | function | function	<optional>
//    Class for features returned by ol.format.MVT#readFeatures. Set to ol.Feature to get full editing and geometry support at the cost of decreased rendering performance. The default is ol.render.Feature, which is optimized for rendering and hit detection.

    /**
     * 
     * @param geometryName Geometry name to use when creating features. Default is 'geometry'.
     */
    public final native void setGeometryName(String geometryName) /*-{
        this.geometryName = geometryName;
    }-*/;
    
    /**
     * 
     * @param layerName Name of the feature attribute that holds the layer name. Default is 'layer'.
     */
    public final native void setLayerName(String layerName) /*-{
        this.layerName = layerName;
    }-*/;
    
    /**
     * 
     * @param layers Layers to read features from. If not provided, features will be read from all layers.
     */
    public final native void setLayers(JsArrayString layers) /*-{
        this.layers = layers;
    }-*/;
}
