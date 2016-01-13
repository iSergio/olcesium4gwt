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
package org.ol3cesium.client.olx.source;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import org.ol3cesium.client.ol.Attribution;
import org.ol3cesium.client.ol.proj.Projection;
import org.ol3cesium.client.ol.source.WMTSSource;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class WMTSSourceOptions extends JavaScriptObject {
    protected WMTSSourceOptions() {
        //
    }
    
    public static final native WMTSSourceOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param attributions Attributions.
     */
    public final native void setAttributions(JsArray<Attribution> attributions) /*-{
        this.attributions = attributions;
    }-*/;
    
    /**
     * The crossOrigin attribute for loaded images. Note that you must provide 
     * a crossOrigin value if you are using the WebGL renderer or if you want to 
     * access pixel data with the Canvas renderer. See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
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
     * 
     * @param tileGrid Tile grid. Required.
     */
    public final native void setTileGrid(WMTSSource tileGrid) /*-{
        this.tileGrid = tileGrid;
    }-*/;
    
    /**
     * 
     * @param projection Projection.
     */
    public final native void setProjection(Projection projection) /*-{
        this.projection = projection;
    }-*/;
    
    /**
     * 
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
     * 
     * @param requestEncoding Request encoding. Default is KVP.
     */
    public final native void setRequestEncoding(String requestEncoding) /*-{
        this.requestEncoding = requestEncoding;
    }-*/;

    /**
     * 
     * @param layer Layer name as advertised in the WMTS capabilities. Required.
     */
    public final native void setLayer(String layer) /*-{
        this.layer = layer;
    }-*/;

    /**
     * 
     * @param style Style name as advertised in the WMTS capabilities. Required.
     */
    public final native void setStyle(String style) /*-{
        this.style = style;
    }-*/;

//tileClass	function | undefined	experimental
//Class used to instantiate image tiles. Default is ol.ImageTile.
    
    /**
     * The pixel ratio used by the tile service. For example, 
     * if the tile service advertizes 256px by 256px tiles but actually 
     * sends 512px by 512px images (for retina/hidpi devices) 
     * then tilePixelRatio should be set to 2. Default is 1.
     * @param tilePixelRatio 
     */
    public final native void setTilePixelRatio(double tilePixelRatio) /*-{
        this.tilePixelRatio = tilePixelRatio;
    }-*/;

    /**
     * 
     * @param version WMTS version. Default is 1.0.0.
     */
    public final native void setVersion(String version) /*-{
        this.version = version;
    }-*/;

    /**
     * 
     * @param format Image format. Default is image/jpeg.
     */
    public final native void setFormat(String format) /*-{
        this.format = format;
    }-*/;
    
    /**
     * 
     * @param matrixSet Matrix set. Required.
     */
    public final native void setMatrixSet(String matrixSet) /*-{
        this.matrixSet = matrixSet;
    }-*/;

    /**
     * 
     * @param dimensions Additional "dimensions" for tile requests. 
     * This is an object with properties named like the advertised WMTS dimensions.
     */
    public final native void setDimensions(JavaScriptObject dimensions) /*-{
        this.dimensions = dimensions;
    }-*/;

    /**
     * 
     * @param url A URL for the service. For the RESTful request encoding, 
     * this is a URL template. For KVP encoding, it is normal URL. A {?-?} 
     * template pattern, for example subdomain{a-f}.domain.com, may be used 
     * instead of defining each one separately in the urls option.
     */
    public final native void setUrl(String url) /*-{
        this.url = url;
    }-*/;

    /**
     * 
     * @param maxZoom Maximum zoom.
     */
    public final native void setMaxZoom(int maxZoom) /*-{
        this.maxZoom = maxZoom;
    }-*/;

//tileLoadFunction	ol.TileLoadFunctionType | undefined	experimental
//Optional function to load a tile given a URL.
    
    /**
     * 
     * @param urls An array of URLs. Requests will be distributed among the URLs in this array.
     */
    public final native void setUrls(JsArrayString urls) /*-{
        this.urls = urls;
    }-*/;

    /**
     * 
     * @param wrapX Whether to wrap the world horizontally. Default is false.
     */
    public final native void setWrapX(boolean wrapX) /*-{
        this.wrapX = wrapX;
    }-*/;
}
