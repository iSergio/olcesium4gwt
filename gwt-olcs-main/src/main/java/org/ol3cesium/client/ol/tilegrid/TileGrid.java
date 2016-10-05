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
package org.ol3cesium.client.ol.tilegrid;

import org.ol3cesium.client.olx.tilegrid.TileGridOptions;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import org.ol3cesium.client.ol.Coordinate;
import org.ol3cesium.client.ol.Extent;
import org.ol3cesium.client.ol.Size;
import org.ol3cesium.client.ol.TileCoord;

/**
 * Base class for setting the grid pattern for sources accessing tiled-image servers.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileGrid extends JavaScriptObject {
    protected TileGrid() {
        //
    }
    
    public static native TileGrid create(TileGridOptions options) /*-{
        return new ol.tilegrid.TileGrid(options);
    }-*/;
    
    /**
     * Get the maximum zoom level for the grid.
     * @return Max zoom.
     */
    public final native int getMaxZoom() /*-{
        return this.getMaxZoom();
    }-*/;
    
    /**
     * Get the minimum zoom level for the grid.
     * @return Min zoom.
     */
    public final native int getMinZoom() /*-{
        return this.getMinZoom();
    }-*/;
    
    /**
     * Get the origin for the grid at the given zoom level.
     * @param z Z.
     * @return Origin.
     */
    public final native Coordinate getOrigin(int z) /*-{
        return this.getOrigin(z);
    }-*/;
    
    /**
     * Get the resolution for the given zoom level.
     * @param z Z.
     * @return Resolution.
     */
    public final native double getResolution(int z) /*-{
        return this.getResolution(z);
    }-*/;
    
    /**
     * Get the list of resolutions for the tile grid.
     * @return Resolutions.
     */
    public final native JsArrayNumber getResolutions() /*-{
        return this.getResolutions();
    }-*/;
    
    /**
     * Get the extent of a tile coordinate.
     * @param tileCoord Tile coordinate.
     * @return 
     */
    public final native Extent getTileCoordExtent(TileCoord tileCoord) /*-{
        return this.getTileCoordExtent(tileCoord);
    }-*/;
    
    /**
     * Get the extent of a tile coordinate.
     * @param tileCoord Tile coordinate.
     * @param extent Temporary extent object.
     * @return Extent.
     */
    public final native Extent getTileCoordExtent(TileCoord tileCoord, Extent extent) /*-{
        return this.getTileCoordExtent(tileCoord, extent);
    }-*/;
    
    /**
     * Get the tile coordinate for the given map coordinate and resolution. 
     * This method considers that coordinates that intersect tile boundaries 
     * should be assigned the higher tile coordinate.
     * @param coordinate Coordinate.
     * @param resolution Resolution.
     * @return Tile coordinate.
     */
    public final native TileCoord getTileCoordForCoordAndResolution(Coordinate coordinate, double resolution) /*-{
        return this.getTileCoordForCoordAndResolution(coordinate, resolution);
    }-*/;
    
    /**
     * Get the tile coordinate for the given map coordinate and resolution. 
     * This method considers that coordinates that intersect 
     * tile boundaries should be assigned the higher tile coordinate.
     * @param coordinate Coordinate.
     * @param resolution Resolution.
     * @param tileCoord Destination ol.TileCoord object.
     * @return Tile coordinate.
     */
    public final native TileCoord getTileCoordForCoordAndResolution(Coordinate coordinate, double resolution, TileCoord tileCoord) /*-{
        return this.getTileCoordForCoordAndResolution(coordinate, resolution, tileCoord);
    }-*/;
    
    /**
     * Get a tile coordinate given a map coordinate and zoom level.
     * @param coordinate Coordinate.
     * @param zoom Zoom level.
     * @return Tile coordinate.
     */
    public final native TileCoord getTileCoordForCoordAndZ(Coordinate coordinate, int zoom) /*-{
        return this.getTileCoordForCoordAndZ(coordinate, zoom);
    }-*/;
    
    /**
     * Get a tile coordinate given a map coordinate and zoom level.
     * @param coordinate Coordinate.
     * @param zoom Zoom level.
     * @param tileCoord Destination ol.TileCoord object.
     * @return Tile coordinate.
     */
    public final native TileCoord getTileCoordForCoordAndZ(Coordinate coordinate, int zoom, TileCoord tileCoord) /*-{
        return this.getTileCoordForCoordAndZ(coordinate, zoom, tileCoord);
    }-*/;
    
    /**
     * Get the tile size for a zoom level. The type of the return value matches 
     * the tileSize or tileSizes that the tile grid was configured with. 
     * To always get an ol.Size, run the result through ol.size.toSize().
     * @param zoom Zoom
     * @return Tile size.
     */
    public final native Size getTileSize(int zoom) /*-{
        return this.getTileSize(zoom);
    }-*/;
}
