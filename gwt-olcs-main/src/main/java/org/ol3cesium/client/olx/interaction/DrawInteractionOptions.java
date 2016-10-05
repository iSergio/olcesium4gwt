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
package org.ol3cesium.client.olx.interaction;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.Collection;
import org.ol3cesium.client.ol.Feature;
import org.ol3cesium.client.ol.geom.GeometryType;
import org.ol3cesium.client.ol.source.VectorSource;
import org.ol3cesium.client.ol.style.Style;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class DrawInteractionOptions extends JavaScriptObject {
    protected DrawInteractionOptions() {
        //
    }
    
    public static final native DrawInteractionOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * The maximum distance in pixels between "down" and "up" for a "up" event 
     * to be considered a "click" event and actually add a point/vertex to the 
     * geometry being drawn. Default is 6 pixels. That value was chosen for the 
     * draw interaction to behave correctly on mouse as well as on touch devices.
     * @param clickTolerance 
     */
    public final native void setClickTolerance(int clickTolerance) /*-{
        this.clickTolerance = clickTolerance;
    }-*/;

    /**
     * Destination collection for the drawn features.
     * @param features 
     */
    public final native void setFeatures(Collection<Feature> features) /*-{
        this.features = features;
    }-*/;

    /**
     * Destination source for the drawn features.
     * @param source 
     */
    public final native void setSource(VectorSource source) /*-{
        this.source = source;
    }-*/;

    /**
     * Pixel distance for snapping to the drawing finish. Default is 12.
     * @param snapTolerance 
     */
    public final native void setSnapTolerance(int snapTolerance) /*-{
        this.snapTolerance = snapTolerance;
    }-*/;

    /**
     * Drawing type ('Point', 'LineString', 'Polygon', 'MultiPoint', 'MultiLineString', 
     * 'MultiPolygon' or 'Circle'). Required.
     * @param type 
     */
    public final native void setType(GeometryType type) /*-{
        this.type = type.toString();
    }-*/;

    /**
     * The number of points that can be drawn before a polygon ring or 
     * line string is finished. The default is no restriction.
     * @param maxPoints 
     */
    public final native void setMaxPoints(int maxPoints) /*-{
        this.maxPoints = maxPoints;
    }-*/;

    /**
     * The number of points that must be drawn before a polygon ring or line 
     * string can be finished. Default is 3 for polygon rings and 2 for line strings.
     * @param minPoints 
     */
    public final native void setMinPoints(int minPoints) /*-{
        this.minPoints = minPoints;
    }-*/;

    /**
     * Style for sketch features.
     * @param style 
     */
    public final native void setStyle(Style style) /*-{
        this.style = style;
    }-*/;
    
    public final native void setGeometryFunction(JavaScriptObject geometryFunction) /*-{
        this.geometryFunction = geometryFunction;
    }-*/;
    
    /**
     * Style for sketch features.
     * @param style 
     */
    public final native void setStyle(JsArray<Style> style) /*-{
        this.style = style;
    }-*/;
    
    /**
     * Geometry name to use for features created by the draw interaction.
     * @param geometryName 
     */
    public final native void setGeometryName(String geometryName) /*-{
        this.geometryName = geometryName;
    }-*/;

    /**
     * Wrap the world horizontally on the sketch overlay. Default is false.
     * @param wrapX 
     */
    public final native void setWrapX(boolean wrapX) /*-{
        this.wrapX = wrapX;
    }-*/;
}
