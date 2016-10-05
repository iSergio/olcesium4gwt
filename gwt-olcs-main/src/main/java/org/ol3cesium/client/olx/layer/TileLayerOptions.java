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
package org.ol3cesium.client.olx.layer;

import org.ol3cesium.client.ol.Map;
import org.ol3cesium.client.ol.source.TileSource;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileLayerOptions extends LayerOptions {
    protected TileLayerOptions() {
        //
    }
    
    public static final native TileLayerOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Preload. Load low-resolution tiles up to preload levels. 
     * By default preload is 0, which means no preloading.
     * @param preload 
     */
    public final native void setPreload(int preload) /*-{
        this.preload = preload;
    }-*/;

    /**
     * Source for this layer. Required.
     * @param source Source.
     */
    public final native void setSource(TileSource source) /*-{
        this.source = source;
    }-*/;

    /**
     * Sets the layer as overlay on a map. The map will not manage this layer 
     * in its layers collection, and the layer will be rendered on top. 
     * This is useful for temporary layers. The standard way to add a layer to 
     * a map and have it managed by the map is to use ol.Map#addLayer.
     * @param map Map.
     */
    public final native void setMap(Map map) /*-{
        this.map = map;
    }-*/;
    
    /**
     * Use interim tiles on error. Default is true.
     * @param useInterimTilesOnError 
     */
    public final native void setUseInterimTilesOnError(boolean useInterimTilesOnError) /*-{
        this.useInterimTilesOnError = useInterimTilesOnError;
    }-*/;
}
