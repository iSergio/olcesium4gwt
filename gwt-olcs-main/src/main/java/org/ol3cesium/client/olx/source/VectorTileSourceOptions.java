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
import org.ol3cesium.client.ol.Feature;
import org.ol3cesium.client.ol.proj.Projection;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class VectorTileSourceOptions extends JavaScriptObject {
    protected VectorTileSourceOptions() {
        //
    }
    
    public static final native VectorTileSourceOptions create() /*-{
        return {};
    }-*/;

    /**
     * Attributions.
     * @param attributions Attributions.
     */
    public final native void setAttributions(JsArray<Attribution> attributions) /*-{
        this.attributions = attributions;
    }-*/;
    
    /**
     * Feature format for tiles. Used and required by the default tileLoadFunction.
     * @param format 
     */
    public final native void setFormat(Feature format) /*-{
        this.format = format;
    }-*/;
    
    /**
     * Logo.
     * @param logo Logo.
     */
    public final native void setLogo(String logo) /*-{
        this.logo = logo;
    }*/;
    
    /**
     * This source may have overlapping geometries. Default is true. 
     * Setting this to false (e.g. for sources with polygons that represent 
     * administrative boundaries or TopoJSON sources) allows the renderer to 
     * optimise fill and stroke operations.
     * @param overlaps 
     */
    public final native void setOverlaps(boolean overlaps) /*-{
        this.overlaps = overlaps;
    }-*/;

    /**
     * Whether the layer is opaque.
     * @param opaque Opaque.
     * @Deprecated This option is no longer needed, so it was removed from the API.
     */
    public final native void setOpaque(boolean opaque) /*-{
        this.opaque = opaque;
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
     * Source state.
     * @param source Source state.
     */
    public final native void setState(String source) /*-{
        this.source = source;
    }-*/;
    
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
     * Whether to wrap the world horizontally. When set to false, only one world 
     * will be rendered. When set to true, tiles will be wrapped horizontally 
     * to render multiple worlds. Default is true.
     * @param wrapX 
     */
    public final native void setWrapX(boolean wrapX) /*-{
        this.wrapX = wrapX;
    }-*/;
}
