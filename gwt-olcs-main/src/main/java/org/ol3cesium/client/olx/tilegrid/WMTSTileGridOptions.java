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
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayString;
import org.ol3cesium.client.ol.Coordinate;
import org.ol3cesium.client.ol.Extent;
import org.ol3cesium.client.ol.Size;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class WMTSTileGridOptions extends JavaScriptObject {
    protected WMTSTileGridOptions() {
        //
    }
    
    public static native WMTSTileGridOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param extent Extent for the tile grid. No tiles outside this extent will 
     * be requested by ol.source.Tile sources. When no origin or origins are configured, 
     * the origin will be set to the top-left corner of the extent.
     */
    public final native void setExtent(Extent extent) /*-{
        this.extent = extent;
    }-*/;
        
    /**
     * 
     * @param origin The tile grid origin, i.e. where the x and y axes meet ([z, 0, 0]). 
     * Tile coordinates increase left to right and upwards. 
     * If not specified, extent or origins must be provided.
     */
    public final native void setOrigin(Coordinate origin) /*-{
        this.origin = origin;
    }-*/;
    
    /**
     * 
     * @param origins Tile grid origins, i.e. where the x and y axes meet ([z, 0, 0]), 
     * for each zoom level. If given, the array length should match the length of the resolutions array, i.e. each resolution can have a different origin. Tile coordinates increase left to right and upwards. If not specified, extent or origin must be provided.
     */
    public final native void setOrigins(JsArray<Coordinate> origins) /*-{
        this.origins = origins;
    }-*/;
    
    /**
     * 
     * @param resolutions Resolutions. The array index of each resolution needs 
     * to match the zoom level. This means that even if a minZoom is configured, 
     * the resolutions array will have a length of maxZoom + 1 Required.
     */
    public final native void setResolutions(JsArrayNumber resolutions) /*-{
        this.resolutions = resolutions;
    }-*/;
        
    /**
     * 
     * @param matrixIds matrix IDs. The length of this array needs to match the 
     * length of the resolutions array. Required.
     */
    public final native void setMatrixIds(JsArrayString matrixIds) /*-{
        this.matrixIds = matrixIds;
    }-*/;
        
    /**
     * 
     * @param sizes Number of tile rows and columns of the grid for each zoom level. 
     * The values here are the TileMatrixWidth and TileMatrixHeight advertised 
     * in the GetCapabilities response of the WMTS, and define the grid's extent 
     * together with the origin. An extent can be configured in addition, and 
     * will further limit the extent for which tile requests are made by sources. 
     * Note that when the top-left corner of the extent is used as origin or origins, 
     * then the y value must be negative because OpenLayers tile coordinates increase upwards.
     */
    public final native void setSizes(JsArray<Size> sizes) /*-{
        this.sizes = sizes;
    }-*/;

    /**
     * 
     * @param tileSize Tile size.
     */
    public final native void setTileSize(int tileSize) /*-{
        this.tileSize = tileSize;
    }-*/;
    
    /**
     * 
     * @param tileSize Tile size.
     */
    public final native void setTileSize(Size tileSize) /*-{
        this.tileSize = tileSize;
    }-*/;

    /**
     * 
     * @param sizes Tile sizes. The length of this array needs to match the 
     * length of the resolutions array.
     */
    public final native void setTileSizes(JsArrayNumber sizes) /*-{
        this.sizes = sizes;
    }-*/;
    
    /**
     * 
     * @param sizes Tile sizes. The length of this array needs to match the 
     * length of the resolutions array.
     */
    public final native void setTileSizes(JsArray<Size> sizes) /*-{
        this.sizes = sizes;
    }-*/;
    
    /**
     * Number of tile columns that cover the grid's extent for each zoom level. 
     * Only required when used with a source that has wrapX set to true, and only 
     * when the grid's origin differs from the one of the projection's extent. 
     * The array length has to match the length of the resolutions array, i.e. each 
     * resolution will have a matching entry here.
     * @param widths 
     */
    public final native void setWidths(JsArrayNumber widths) /*-{
        this.widths = widths;
    }-*/;
}
