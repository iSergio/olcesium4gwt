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
package org.ol3cesium.client.olx.source;

import org.ol3cesium.client.ol.Extent;
import org.ol3cesium.client.ol.tilegrid.TileGrid;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileSourceOptions extends SourceOptions {
    protected TileSourceOptions() {
        //
    }
    
    public final native void setCacheSize(int cacheSize) /*-{
        this.cacheSize = cacheSize;
    }-*/;
    
    public final native void setExtent(Extent extent) /*-{
        this.extent = extent;
    }-*/;
    
    public final native void setOpaque(boolean opaque) /*-{
        this.opaque = opaque;
    }-*/;
    
    /**
     * The pixel ratio used by the tile service. 
     * For example, if the tile service advertizes 256px by 256px tiles but 
     * actually sends 512px by 512px images (for retina/hidpi devices) then 
     * tilePixelRatio should be set to 2. Default is 1.
     * @param tilePixelRatio 
     */
    public final native void setTilePixelRatio(double tilePixelRatio) /*-{
        this.tilePixelRatio = tilePixelRatio;
    }-*/;
    
    /**
     * 
     * @param tileGrid Tile grid.
     */
    public final native void setTileGrid(TileGrid tileGrid) /*-{
        this.tileGrid = tileGrid;
    }-*/;
}
