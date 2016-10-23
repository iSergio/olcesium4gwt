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
package org.ol3cesium.ol.source;

import org.ol3cesium.ol.proj.Projection;
import org.ol3cesium.ol.tilegrid.TileGrid;
import org.ol3cesium.olx.source.TileImageSourceOptions;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileImageSource extends UrlTileSource {
    protected TileImageSource() {
        //
    }
    
    public static native TileImageSource create() /*-{
        return new ol.source.TileImage();
    }-*/;
    
    public static native TileImageSource create(TileImageSourceOptions options) /*-{
        return new ol.source.TileImage(options);
    }-*/;
    
    public final native void setRenderReprojectionEdges(boolean render) /*-{
        this.setRenderReprojectionEdges(render);
    }-*/;
    
    /**
     * Sets the tile grid to use when reprojecting the tiles to the given 
     * projection instead of the default tile grid for the projection.
     * 
     * This can be useful when the default tile grid cannot be created 
     * (e.g. projection has no extent defined) or for optimization reasons 
     * (custom tile size, resolutions, ...).
     * @param projection Projection.
     * @param tileGrid Tile grid to use for the projection.
     */
    public final native void setTileGridForProjection(Projection projection, TileGrid tileGrid) /*-{
        this.setTileGridForProjection(projection, tileGrid);
    }-*/;
    
    /**
     * Sets the tile grid to use when reprojecting the tiles to the given 
     * projection instead of the default tile grid for the projection.
     * 
     * This can be useful when the default tile grid cannot be created 
     * (e.g. projection has no extent defined) or for optimization reasons 
     * (custom tile size, resolutions, ...).
     * @param projection Projection.
     * @param tileGrid Tile grid to use for the projection.
     */
    public final native void setTileGridForProjection(String projection, TileGrid tileGrid) /*-{
        this.setTileGridForProjection(projection, tileGrid);
    }-*/;
}
