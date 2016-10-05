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
import org.ol3cesium.client.ol.proj.Projection;
import org.ol3cesium.client.ol.tilegrid.TileGrid;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileArcGISRestSourceOptions extends JavaScriptObject {
    protected TileArcGISRestSourceOptions() {
        //
    }
    
    public static native TileArcGISRestSourceOptions create() /*-{
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
     * ArcGIS Rest parameters. This field is optional. Service defaults will be 
     * used for any fields not specified. FORMAT is PNG32 by default. 
     * F is IMAGE by default. TRANSPARENT is true by default. BBOX,SIZE,BBOXSR, 
     * andIMAGESRwill be set dynamically. SetLAYERS` to override the default 
     * service layer visibility. See http://resources.arcgis.com/en/help/arcgis-rest-api/index.html#/Export_Map/02r3000000v7000000/ 
     * for further reference.
     * @param params 
     */
    public final native void setParams(JavaScriptObject params) /*-{
        this.params = params;
    }-*/;
    
    /**
     * 
     * @param logo Logo.
     */
    public final native void setLogo(String logo) /*-{
        this.logo = logo;
    }-*/;
    
    /**
     * Tile grid. Base this on the resolutions, tilesize and extent supported 
     * by the server. If this is not defined, a default grid will be used: 
     * if there is a projection extent, the grid will be based on that; 
     * if not, a grid based on a global extent with origin at 0,0 will be used.
     * @param tileGrid 
     */
    public final native void setTileGrid(TileGrid tileGrid) /*-{
        this.tileGrid = tileGrid;
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
     * ArcGIS Rest service URL for a Map Service or Image Service. The url should include /MapServer or /ImageServer.
     * @param url 
     */
    public final native void setUrl(String url) /*-{
        this.url = url;
    }-*/;
    
    /**
     * Whether to wrap the world horizontally. Default is true.
     * @param wrapX 
     */
    public final native void setWrapX(boolean wrapX) /*-{
        this.wrapX = wrapX;
    }-*/;
    
    /**
     * ArcGIS Rest service urls. Use this instead of url when the ArcGIS Service supports multiple urls for export requests.
     * @param urls 
     */
    public final native void setUrls(JsArrayString urls) /*-{
        this.urls = urls;
    }-*/;
}
