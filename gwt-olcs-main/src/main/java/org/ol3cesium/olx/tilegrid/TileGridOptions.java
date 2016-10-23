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
package org.ol3cesium.olx.tilegrid;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayInteger;
import com.google.gwt.core.client.JsArrayNumber;
import org.ol3cesium.ol.Coordinate;
import org.ol3cesium.ol.Extent;
import org.ol3cesium.ol.Size;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileGridOptions extends JavaScriptObject {
    protected TileGridOptions() {
        //
    }
    
    public static native TileGridOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Extent for the tile grid. 
     * No tiles outside this extent will be requested by ol.source.Tile sources. 
     * When no origin or origins are configured, the origin will be set to the top-left corner of the extent.
     * @param extent Extent for the tile grid.
     */
    public final native void setExtent(Extent extent) /*-{
        this.extent = extent;
    }-*/;
    
    /**
     * 
     * @param minZoom Minimum zoom. Default is 0.
     */
    public final native void setMinZoom(int minZoom) /*-{
        this.minZoom = minZoom;
    }-*/;

    /**
     * The tile grid origin, i.e. where the x and y axes meet ([z, 0, 0]). 
     * Tile coordinates increase left to right and upwards. 
     * If not specified, extent or origins must be provided.
     * @param origin The tile grid origin
     */
    public final native void setOrigin(Coordinate origin) /*-{
        this.origin = origin;
    }-*/;

    /**
     * Tile grid origins, i.e. where the x and y axes meet ([z, 0, 0]), 
     * for each zoom level. If given, the array length should match the length 
     * of the resolutions array, i.e. each resolution can have a different origin. 
     * Tile coordinates increase left to right and upwards. 
     * If not specified, extent or origin must be provided.
     * @param origins Tile grid origins, i.e. where the x and y axes meet ([z, 0, 0])
     */
    public final native void setOrigins(JsArray<Coordinate> origins) /*-{
        this.origins = origins;
    }-*/;

    /**
     * Resolutions. The array index of each resolution needs to match the zoom level. 
     * This means that even if a minZoom is configured, 
     * the resolutions array will have a length of maxZoom + 1. Required.
     * @param resolutions Resolutions.
     */
    public final native void setResolutions(JsArrayNumber resolutions) /*-{
        this.resolutions = resolutions;
    }-*/;
    
    /**
     * Tile size. Default is [256, 256].
     * @param tileSize Tile size. Default is [256, 256].
     */
    public final native void setTileSize(int tileSize) /*-{
        this.tileSize = tileSize;
    }-*/;
    
    /**
     * Tile size. Default is [256, 256].
     * @param tileSize Tile size. Default is [256, 256].
     */
    public final native void setTileSize(Size tileSize) /*-{
        this.tileSize = tileSize;
    }-*/;
    
    /**
     * Tile sizes. If given, the array length should match the length of 
     * the resolutions array, i.e. each resolution can have a different tile size.
     * @param tileSizes Tile sizes.
     */
    public final native void setTileSizes(JsArrayInteger tileSizes) /*-{
        this.tileSizes = tileSizes;
    }-*/;
    
    /**
     * Tile sizes. If given, the array length should match the length of 
     * the resolutions array, i.e. each resolution can have a different tile size.
     * @param tileSizes Tile sizes.
     */
    public final native void setTileSizes(JsArray<Size> tileSizes) /*-{
        this.tileSizes = tileSizes;
    }-*/;
}
