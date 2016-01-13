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
package org.ol3cesium.client.ol.tilegrid;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import org.ol3cesium.client.ol.Extent;
import org.ol3cesium.client.olx.tilegrid.WMTSTileGridOptions;

/**
 * Set the grid pattern for sources accessing WMTS tiled-image servers.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class WMTSTileGrid extends TileGrid {
    protected WMTSTileGrid() {
        //
    }
    
    public static final native WMTSTileGrid create(WMTSTileGridOptions options) /*-{
        return new ol.tilegrid.WMTS(options);
    }-*/;
    
    /**
     * Create a tile grid from a WMTS capabilities matrix set.
     * @param matrixSet An object representing a matrixSet in the capabilities document.
     * @param extent An optional extent to restrict the tile ranges the server provides.
     * @return WMTS tileGrid instance.
     */
    public static final native WMTSTileGrid createFromCapabilitiesMatrixSet(JavaScriptObject matrixSet, Extent extent) /*-{
        return ol.tilegrid.WMTS.createFromCapabilitiesMatrixSet(matrixSet, extent);
    }-*/;

    /**
     * Get the list of matrix identifiers.
     * @return MatrixIds.
     */
    public final native JsArrayString getMatrixIds() /*-{
        return this.getMatrixIds();
    }-*/;
}
