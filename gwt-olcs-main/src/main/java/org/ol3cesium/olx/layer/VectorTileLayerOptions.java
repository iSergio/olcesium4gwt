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

import org.ol3cesium.ol.layer.VectorTileLayerRenderType;
import org.ol3cesium.ol.source.VectorTileSource;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class VectorTileLayerOptions extends VectorLayerOptions {
    protected VectorTileLayerOptions() {
        //
    }
    
    public static native VectorTileLayerOptions create() /*-{
        return {};
    }-*/;

    /**
     * Render mode for vector tiles:
     * 'image': Vector tiles are rendered as images. Great performance, but point 
     * symbols and texts are always rotated with the view and pixels are scaled 
     * during zoom animations.
     * 'hybrid': Polygon and line elements are rendered as images, so pixels are 
     * scaled during zoom animations. Point symbols and texts are accurately 
     * rendered as vectors and can stay upright on rotated views.
     * 'vector': Vector tiles are rendered as vectors. Most accurate rendering 
     * even during animations, but slower performance than the other options. 
     * The default is 'hybrid'.
     * @param renderMode Render mode
     */
    public final native void setRenderMode(VectorTileLayerRenderType renderMode) /*-{
        this.renderMode = renderMode.toString();
    }-*/;
    
    /**
     * Render mode for vector tiles:
     * 'image': Vector tiles are rendered as images. Great performance, but point 
     * symbols and texts are always rotated with the view and pixels are scaled 
     * during zoom animations.
     * 'hybrid': Polygon and line elements are rendered as images, so pixels are 
     * scaled during zoom animations. Point symbols and texts are accurately 
     * rendered as vectors and can stay upright on rotated views.
     * 'vector': Vector tiles are rendered as vectors. Most accurate rendering 
     * even during animations, but slower performance than the other options. 
     * The default is 'hybrid'.
     * @param renderMode Render mode
     */
    public final native void setRenderMode(String renderMode) /*-{
        this.renderMode = renderMode;
    }-*/;
    
//    public final native void setRenderOrder	function	experimental
//    Render order. Function to be used when sorting features before rendering. By default features are drawn in the order that they are created. Required.

    /**
     * Source.
     * @param source Source.
     */
    public final native void setSource(VectorTileSource source) /*-{
        this.source = source;
    }-*/;
}
