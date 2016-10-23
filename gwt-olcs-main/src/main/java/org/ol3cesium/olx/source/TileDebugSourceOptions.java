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
package org.ol3cesium.olx.source;

import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.ol.proj.Projection;
import org.ol3cesium.ol.tilegrid.TileGrid;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileDebugSourceOptions extends JavaScriptObject {
    protected TileDebugSourceOptions() {
        //
    }
    
    public static native TileDebugSourceOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Projection.
     * @param projection Projection.
     */
    public final native void setProjection(Projection projection) /*-{
        this.projection = projection;
    }-*/;
    
    /**
     * Projection.
     * @param projection Projection.
     */
    public final native void setProjection(String projection) /*-{
        this.projection = projection;
    }-*/;

    /**
     * Set tile grid.
     * @param tileGrid Tile grid.
     */
    public final native void setTileGrid(TileGrid tileGrid) /*-{
        this.tileGrid = tileGrid;
    }-*/;

    /**
     * Whether to wrap the world horizontally. Default is true.
     * @param wrapX 
     */
    public final native void setWrapX(boolean wrapX) /*-{
        this.wrapX = wrapX;
    }-*/;
}
