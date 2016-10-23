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
package org.ol3cesium.olx.layer;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.ol.Map;
import org.ol3cesium.ol.source.VectorSource;
import org.ol3cesium.ol.style.Style;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class VectorLayerOptions extends LayerOptions {
    protected VectorLayerOptions() {
        //
    }
    
    public static native VectorLayerOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Sets the layer as overlay on a map. The map will not manage this layer in its layers collection, 
     * and the layer will be rendered on top. This is useful for temporary layers. 
     * The standard way to add a layer to a map and have it managed by the map is to use ol.Map#addLayer.
     * @param map Map.
     */
    public final native void setMap(Map map) /*-{
        this.map = map;
    }-*/;
    
    /**
     * The buffer around the viewport extent used by the renderer when getting 
     * features from the vector source for the rendering or hit-detection. 
     * Recommended value: the size of the largest symbol, line width or label. 
     * Default is 100 pixels.
     * @param renderBuffer render buffer.
     */
    public final native void setRenderBuffer(int renderBuffer) /*-{
        this.renderBuffer = renderBuffer;
    }-*/;

    /**
     * Source. Required.
     * @param source Source.
     */
    public final native void setSource(VectorSource source) /*-{
        this.source = source;
    }-*/;
    
//	ol.style.Style | Array.<ol.style.Style> | ol.style.StyleFunction | undefined	
    /**
     * Layer style. See ol.style for default style which will be used if this is not defined.
     * @param style Style.
     */
    public final native void setStyle(Style style) /*-{
        this.style = style;
    }-*/;
    
    /**
     * Layer style. See ol.style for default style which will be used if this is not defined.
     * @param style Style.
     */
    public final native void setStyle(JsArray<Style> style) /*-{
        this.style = style;
    }-*/;
    
    /**
     * Layer style. See ol.style for default style which will be used if this is not defined.
     * @param styleFunction style function
     */
    public final native void setStyle(JavaScriptObject styleFunction) /*-{
        this.style = styleFunction;
    }-*/;

    /**
     * When set to true, feature batches will be recreated during animations. 
     * This means that no vectors will be shown clipped, but the setting will have a 
     * performance impact for large amounts of vector data. When set to false, 
     * batches will be recreated when no animation is active. Default is false.
     * @param updateWhileAnimating 
     */
    public final native void setUpdateWhileAnimating(boolean updateWhileAnimating) /*-{
        this.updateWhileAnimating = updateWhileAnimating;
    }-*/;
    
    /**
     * When set to true, feature batches will be recreated during interactions. 
     * See also updateWhileAnimating. Default is false.
     * @param updateWhileInteracting 
     */
    public final native void setUpdateWhileInteracting(boolean updateWhileInteracting) /*-{
        this.updateWhileInteracting = updateWhileInteracting;
    }-*/;
}
