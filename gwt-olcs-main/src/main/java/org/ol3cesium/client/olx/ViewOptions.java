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
package org.ol3cesium.client.olx;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import org.ol3cesium.client.ol.Coordinate;
import org.ol3cesium.client.ol.Extent;
import org.ol3cesium.client.ol.proj.Projection;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ViewOptions extends JavaScriptObject {
    protected ViewOptions() {
        //
    }
    
    public static native ViewOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * The initial center for the view. The coordinate system for the center is 
     * specified with the projection option. 
     * Default is undefined, and layer sources will not be fetched if this is not set.
     * @param center 
     */
    public final native void setCenter(Coordinate center) /*-{
        this.center = center;
    }-*/;

    /**
     * Rotation constraint. false means no constraint. true means no constraint, 
     * but snap to zero near zero. A number constrains the rotation to that 
     * number of values. For example, 4 will constrain the rotation to 0, 90, 
     * 180, and 270 degrees. The default is true.
     * @param constrainRotation 
     */
    public final native void setConstrainRotation(boolean constrainRotation) /*-{
        this.constrainRotation = constrainRotation;
    }-*/;
    
    /**
     * Rotation constraint. false means no constraint. true means no constraint, 
     * but snap to zero near zero. A number constrains the rotation to that 
     * number of values. For example, 4 will constrain the rotation to 0, 90, 
     * 180, and 270 degrees. The default is true.
     * @param constrainRotation 
     */
    public final native void setConstrainRotation(double constrainRotation) /*-{
        this.constrainRotation = constrainRotation;
    }-*/;

    /**
     * Enable rotation. Default is true. If false a rotation constraint that 
     * always sets the rotation to zero is used. The constrainRotation option 
     * has no effect if enableRotation is false.
     * @param enableRotation 
     */
    public final native void setEnableRotation(boolean enableRotation) /*-{
        this.enableRotation = enableRotation;
    }-*/;

    /**
     * The extent that constrains the center, in other words, center cannot be 
     * set outside this extent. Default is undefined.
     * @param extent 
     */
    public final native void setExtent(Extent extent) /*-{
        this.extent = extent;
    }-*/;
    
    /**
     * The maximum resolution used to determine the resolution constraint. 
     * It is used together with minResolution (or maxZoom) and zoomFactor. 
     * If unspecified it is calculated in such a way that the projection's 
     * validity extent fits in a 256x256 px tile. If the projection is 
     * Spherical Mercator (the default) then maxResolution defaults to 
     * 40075016.68557849 / 256 = 156543.03392804097.
     * @param maxResolution 
     */
    public final native void setMaxResolution(double maxResolution) /*-{
        this.maxResolution = maxResolution;
    }-*/;

    /**
     * The minimum resolution used to determine the resolution constraint. 
     * It is used together with maxResolution (or minZoom) and zoomFactor. 
     * If unspecified it is calculated assuming 29 zoom levels (with a factor of 2). 
     * If the projection is Spherical Mercator (the default) then minResolution 
     * defaults to 40075016.68557849 / 256 / Math.pow(2, 28) = 0.0005831682455839253.
     * @param minResolution 
     */
    public final native void setMinResolution(double minResolution) /*-{
        this.minResolution = minResolution;
    }-*/;
    
    /**
     * The maximum zoom level used to determine the resolution constraint. 
     * It is used together with minZoom (or maxResolution) and zoomFactor. 
     * Default is 28. Note that if minResolution is also provided, it is given 
     * precedence over maxZoom.
     * @param maxZoom 
     */
    public final native void setMaxZoom(int maxZoom) /*-{
        this.maxZoom = maxZoom;
    }-*/;
    
    /**
     * The minimum zoom level used to determine the resolution constraint. 
     * It is used together with maxZoom (or minResolution) and zoomFactor. 
     * Default is 0. Note that if maxResolution is also provided, 
     * it is given precedence over minZoom.
     * @param minZoom 
     */
    public final native void setMinZoom(int minZoom) /*-{
        this.minZoom = minZoom;
    }-*/;
    
    /**
     * The projection. Default is EPSG:3857 (Spherical Mercator).
     * @param projection 
     */
    public final native void setProjection(Projection projection) /*-{
        this.projection = projection;
    }-*/;
    
    /**
     * The projection. Default is EPSG:3857 (Spherical Mercator).
     * @param projection 
     */
    public final native void setProjection(String projection) /*-{
        this.projection = projection;
    }-*/;
    
    /**
     * The initial resolution for the view. The units are projection units per 
     * pixel (e.g. meters per pixel). An alternative to setting this is to set zoom. 
     * Default is undefined, and layer sources will not be fetched if neither 
     * this nor zoom are defined.
     * @param resolution 
     */
    public final native void setResolution(double resolution) /*-{
        this.resolution = resolution;
    }-*/;
    
    /**
     * Resolutions to determine the resolution constraint. 
     * If set the maxResolution, minResolution, minZoom, maxZoom, and 
     * zoomFactor options are ignored.
     * @param resolutions 
     */
    public final native void setResolutions(JsArrayNumber resolutions) /*-{
        this.resolutions = resolutions;
    }-*/;

    /**
     * The initial rotation for the view in radians (positive rotation clockwise). 
     * Default is 0.
     * @param rotation 
     */
    public final native void setRotation(float rotation) /*-{
        this.rotation = rotation;
    }-*/;

    /**
     * Only used if resolution is not defined. Zoom level used to calculate the 
     * initial resolution for the view. 
     * The initial resolution is determined using the ol.View#constrainResolution method.
     * @param zoom 
     */
    public final native void setZoom(int zoom) /*-{
        this.zoom = zoom;
    }-*/;

    /**
     * The zoom factor used to determine the resolution constraint. Default is 2.
     * @param zoomFactor 
     */
    public final native void setZoomFactor(float zoomFactor) /*-{
        this.zoomFactor = zoomFactor;
    }-*/;
}
