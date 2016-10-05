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
package org.ol3cesium.client.olx.tilegrid;

import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.client.ol.Extent;
import org.ol3cesium.client.ol.Size;
import org.ol3cesium.client.ol.tilegrid.TileGrid;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileGridUtils {
    /**
     * Creates a tile grid with a standard XYZ tiling scheme.
     * @return 
     */
    public static native TileGrid createXYZ() /*-{
        return ol.tilegrid.createXYZ();
    }-*/;
    
    public static native TileGrid createXYZ(CreateXYZOptions options) /*-{
        return ol.tilegrid.createXYZ(options);
    }-*/;
    
    public static class CreateXYZOptions extends JavaScriptObject {
        protected CreateXYZOptions() {
            //
        }
        
        public static native CreateXYZOptions create() /*-{
            return {};
        }-*/;
        
        /**
         * 
         * @param extent Extent for the tile grid. The origin for an XYZ tile 
         * grid is the top-left corner of the extent. The zero level of the grid 
         * is defined by the resolution at which one tile fits in the provided extent. 
         * If not provided, the extent of the EPSG:3857 projection is used.
         */
        public final native void setExtent(Extent extent) /*-{
            this.extent = extent;
        }-*/;

        /**
         * 
         * @param maxZoom Maximum zoom. The default is ol.DEFAULT_MAX_ZOOM. 
         * This determines the number of levels in the grid set. 
         * For example, a maxZoom of 21 means there are 22 levels in the grid set.
         */
        public final native void setMaxZoom(int maxZoom) /*-{
            this.maxZoom = maxZoom;
        }-*/;

        /**
         * 
         * @param minZoom Minimum zoom. Default is 0.
         */
        public final native void setMinZoom(int minZoom) /*-{
            this.minZoom = minZoom;
        }-*/;
        
        /**
         * 
         * @param tileSize Tile size in pixels. Default is [256, 256].
         */
        public final native void setTileSize(int tileSize) /*-{
            this.tileSize = tileSize;
        }-*/;
        
        /**
         * 
         * @param tileSize Tile size in pixels. Default is [256, 256].
         */
        public final native void setTileSize(Size tileSize) /*-{
            this.tileSize = tileSize;
        }-*/;
    }
}
