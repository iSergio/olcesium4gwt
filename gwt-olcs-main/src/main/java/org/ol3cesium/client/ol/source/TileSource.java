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
package org.ol3cesium.client.ol.source;

import org.ol3cesium.client.olx.source.TileSourceOptions;
import org.ol3cesium.client.ol.tilegrid.TileGrid;

/**
 * Abstract base class; normally only used for creating subclasses and not 
 * instantiated in apps. Base class for sources providing images divided into a tile grid.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileSource extends Source {
    protected TileSource() {
        //
    }
    
    public static native TileSource create(TileSourceOptions options) /*-{
        return new ol.source.Tile(options);
    }-*/;

    /**
     * Return the tile grid of the tile source.
     * @return Tile grid.
     */
    public final native TileGrid getTileGrid() /*-{
        return this.getTileGrid();
    }-*/;
}
