/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.olx.source;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;
import org.ol3cesium.client.ol.Attribution;
import org.ol3cesium.client.ol.proj.Projection;

/**
 * Image ArcGIS Rest Options.
 * @author iserge
 */
public class ImageArcGISRestSourceOptions extends JavaScriptObject {
    protected ImageArcGISRestSourceOptions() {
        //
    }
    
    public static final native ImageArcGISRestSourceOptions create() /*-{
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
     * The crossOrigin attribute for loaded images. Note that you must provide 
     * a crossOrigin value if you are using the WebGL renderer 
     * or if you want to access pixel data with the Canvas renderer. 
     * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image 
     * for more detail.
     * @param crossOrigin The crossOrigin attribute for loaded images.
     */
    public final native void setCrossOrigin(String crossOrigin) /*-{
        this.crossOrigin = crossOrigin;
    }-*/;

    /**
     * Logo
     * @param logo Logo
     */
    public final native void setLogo(String logo) /*-{
        this.logo = logo;
    }-*/;
    
//    /**
//     * Logo
//     * @param logo Logo
//     */
//    public final native void setLogo(LogoOptions logo) /*-{
//        this.logo = logo;
//    }-*/;
    
//    public final native void setImageLoadFunction	ol.ImageLoadFunctionType | undefined	experimental
//Optional function to load an image given a URL.
    
    /**
     * ArcGIS Rest parameters. This field is optional. Service defaults will be 
     * used for any fields not specified. FORMAT is PNG32 by default. 
     * F is IMAGE by default. TRANSPARENT is true by default. BBOX,SIZE,BBOXSR, 
     * andIMAGESRwill be set dynamically. SetLAYERS` to override the default 
     * service layer visibility. 
     * See http://resources.arcgis.com/en/help/arcgis-rest-api/index.html#/Export_Map/02r3000000v7000000/ 
     * for further reference.
     * @param params ArcGIS Rest parameters
     */
    public final native void setParams(JavaScriptObject params) /*-{
        this.params = params;
    }-*/;

    /**
     * Projection.
     * @param projection Projection.
     */
    public final native void setProjection(String projection) /*-{
        this.projection = projection;
    }-*/;
    
    /**
     * Projection.
     * @param projection Projection.
     */
    public final native void setProjection(Projection projection) /*-{
        this.projection = projection;
    }-*/;

    /**
     * Ratio. 1 means image requests are the size of the map viewport, 
     * 2 means twice the size of the map viewport, and so on. Default is 1.5.
     * @param ratio Ratio
     */
    public final native void setRatio(double ratio) /*-{
        this.ratio = ratio;
    }-*/;

    /**
     * Resolutions. If specified, requests will be made for these resolutions only.
     * @param resolutions Resolutions
     */
    public final native void setResolutions(JsArrayNumber resolutions) /*-{
        this.resolutions = resolutions;
    }-*/;

    /**
     * ArcGIS Rest service URL for a Map Service or Image Service. 
     * The url should include /MapServer or /ImageServer.
     * @param url ArcGIS Rest service URL for a Map Service or Image Service
     */
    public final native void setUrl(String url) /*-{
        this.url = url;
    }-*/;
}
