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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import org.ol3cesium.client.ol.Attribution;
import org.ol3cesium.client.ol.Size;
import org.ol3cesium.client.ol.proj.Projection;
import org.ol3cesium.client.ol.tilegrid.TileGrid;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class XYZSourceOptions extends JavaScriptObject {
    protected XYZSourceOptions() {
        //
    }
    
    public static final native XYZSourceOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Sets attributions.
     * @param attributions Attributions.
     */
    public final native void setAttributions(JsArray<Attribution> attributions)	/*-{
        this.attributions = attributions;
    }-*/;
    
    /**
     * The crossOrigin attribute for loaded images. Note that you must provide a 
     * crossOrigin value if you are using the WebGL renderer or if you want to 
     * access pixel data with the Canvas renderer. 
     * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
     * @param crossOrigin 
     */
    public final native void setCrossOrigin(String crossOrigin) /*-{
        this.crossOrigin = crossOrigin;
    }-*/;
    
    /**
     * 
     * @param logo Logo.
     */
    public final native void setLogo(String logo) /*-{
        this.logo = logo;
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
     * Maximum allowed reprojection error (in pixels). Default is 0.5. 
     * Higher values can increase reprojection performance, but decrease precision.
     * @param reprojectionErrorThreshold 
     */
    public final native void setReprojectionErrorThreshold(double reprojectionErrorThreshold) /*-{
        this.reprojectionErrorThreshold = reprojectionErrorThreshold;
    }-*/;

    /**
     * Optional max zoom level. Default is 18.
     * @param maxZoom 
     */
    public final native void setMaxZoom(int maxZoom) /*-{
        this.maxZoom = maxZoom;
    }-*/;

    /**
     * Unsupported (TODO: remove this).
     * @param minZoom 
     */
    public final native void setMinZoom(int minZoom) /*-{
        this.minZoom = minZoom;
    }-*/;
    
    /**
     * Tile grid. Base this on the resolutions, tilesize and extent supported by the server. 
     * If this is not defined, a default grid will be used: if there is a projection extent, 
     * the grid will be based on that; if not, a grid based on a global extent with origin at 0,0 will be used.
     * @param tileGrid 
     */
    public final native void setTileGrid(TileGrid tileGrid) /*-{
        this.tileGrid = tileGrid;
    }-*/;
    
//    tileLoadFunction	ol.TileLoadFunctionType | undefined	experimental
//    Optional function to load a tile given a URL.
    
    /**
     * The pixel ratio used by the tile service. 
     * For example, if the tile service advertizes 256px by 256px tiles but actually 
     * sends 512px by 512px tiles (for retina/hidpi devices) then tilePixelRatio 
     * should be set to 2. Default is 1.
     * @param tilePixelRatio 
     */
    public final native void setTilePixelRatio(int tilePixelRatio) /*-{
        this.tilePixelRatio = tilePixelRatio;
    }-*/;

    /**
     * The tile size used by the tile service. Default is [256, 256] pixels.
     * @param tileSize 
     */
    public final native void setTileSize(Size tileSize) /*-{
        this.tileSize = tileSize;
    }-*/;

    /**
     * The tile size used by the tile service. Default is [256, 256] pixels.
     * @param tileSize 
     */
    public final native void setTileSize(int tileSize) /*-{
        this.tileSize = tileSize;
    }-*/;
    
//    tileUrlFunction	ol.TileUrlFunctionType | undefined	experimental
//    Optional function to get tile URL given a tile coordinate and the projection. Required if url or urls are not provided.
    
    /**
     * URL template. Must include {x}, {y} or {-y}, and {z} placeholders. 
     * A {?-?} template pattern, for example subdomain{a-f}.domain.com, 
     * may be used instead of defining each one separately in the urls option.
     * @param url 
     */
    public final native void setUrl(String url) /*-{
        this.url = url;
    }-*/;
    
    /**
     * An array of URL templates.
     * @param urls 
     */
    public final native void setUrls(JsArrayString urls) /*-{
        this.urls = urls;
    }-*/;
    
    /**
     * Whether to wrap the world horizontally. Default is true.
     * @param wrapX 
     */
    public final native void setWrapX(boolean wrapX) /*-{
        this.wrapX = wrapX;
    }-*/;
}
