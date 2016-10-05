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
package org.ol3cesium.client.ol.geom;

import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.Coordinate;

/**
 * Linear ring geometry. Only used as part of polygon; cannot be rendered on its own.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class LinearRing extends SimpleGeometry {
    protected LinearRing() {
        //
    }
    
    public static final native LinearRing create(JsArray<Coordinate> coordinates) /*-{
        return new ol.geom.LinearRing(coordinates);
    }-*/;
    
    public static final native LinearRing create(JsArray<Coordinate> coordinates, GeometryLayout layout) /*-{
        return new ol.geom.LinearRing(coordinates, layout);
    }-*/;
    
    /**
     * Return the area of the linear ring on projected plane.
     * @return Area (on projected plane).
     */
    public final native double getArea() /*-{
        return this.getArea();
    }-*/;
    
    /**
     * Return the coordinates of the linear ring.
     * @return Coordinates.
     */
    public final native JsArray<Coordinate> getCoordinates() /*-{
        return this.getCoordinates();
    }-*/;
    
//    /**
//     * Get the type of this geometry.
//     * @return GeometryType
//     */
//    @Override
//    public final native String getType();
    
    /**
     * Set the coordinates of the linear ring.
     * @param coordinates Coordinates
     */
    public final native void setCoordinates(JsArray<Coordinate> coordinates) /*-{
        this.setCoordinates(coordinates);
    }-*/;
    
    /**
     * Set the coordinates of the linear ring.
     * @param coordinates Coordinates
     * @param layout Layout.
     */
    public final native void setCoordinates(JsArray<Coordinate> coordinates, GeometryLayout layout) /*-{
        this.setCoordinates(coordinates, layout);
    }-*/;
}
