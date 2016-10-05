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
import org.ol3cesium.client.ol.Extent;

/**
 * Linestring geometry.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class LineString extends SimpleGeometry {
    protected LineString() {
        //
    }
    
    public static final native LineString create(JsArray<Coordinate> coordinates) /*-{
        return new ol.geom.LineString(coordinates);
    }-*/;
    
    public static final native LineString create(JsArray<Coordinate> coordinates, GeometryLayout layout) /*-{
        return new ol.geom.LineString(coordinates, layout);
    }-*/;
    
    /**
     * Append the passed coordinate to the coordinates of the linestring.
     * @param coordinate Coordinate.
     */
    public final native void appendCoordinate(Coordinate coordinate) /*-{
        this.appendCoordinate(coordinate);
    }-*/;
    
    /**
     * Make a complete copy of the geometry.
     * @return Clone.
     */
    public final native LineString clone() /*-{
        return this.clone();
    }-*/;
    
    /**
     * Return the coordinate at the provided fraction along the linestring. 
     * The fraction is a number between 0 and 1, where 0 is the start of the 
     * linestring and 1 is the end.
     * @param fraction Fraction.
     * @return Coordinate of the interpolated point.
     */
    public final native Coordinate getCoordinateAt(double fraction) /*-{
        return this.getCoordinateAt(fraction);
    }-*/;
    
    /**
     * Return the coordinate at the provided fraction along the linestring. 
     * The fraction is a number between 0 and 1, where 0 is the start of the 
     * linestring and 1 is the end.
     * @param fraction Fraction.
     * @param dest Optional coordinate whose values will be modified. 
     * If not provided, a new coordinate will be returned.
     * @return Coordinate of the interpolated point.
     */
    public final native Coordinate getCoordinateAt(double fraction, Coordinate dest) /*-{
        return this.getCoordinateAt(fraction, dest);
    }-*/;
    
    /**
     * Returns the coordinate at m using linear interpolation, or null if no such coordinate exists.
     * 
     * opt_extrapolate controls extrapolation beyond the range of Ms in the MultiLineString. 
     * If opt_extrapolate is true then Ms less than the first M will return the first 
     * coordinate and Ms greater than the last M will return the last coordinate.
     * @param m
     * @param extrapolate
     * @return 
     */
    public final native Coordinate getCoordinateAtM(double m, boolean extrapolate) /*-{
        return this.getCoordinateAtM(m, extrapolate);
    }-*/;
    
    /**
     * Return the coordinates of the linestring.
     * @return Coordinates.
     */
    public final native JsArray<Coordinate> getCoordinates() /*-{
        return this.getCoordinates();
    }-*/;
    
    /**
     * Return the length of the linestring on projected plane.
     * @return Length (on projected plane).
     */
    public final native double getLength() /*-{
        return this.getLength();
    }-*/;
    
    /**
     * Test if the geometry and the passed extent intersect.
     * @param extent Extent.
     * @return true if the geometry and the extent intersect.
     */
    public final native boolean intersectsExtent(Extent extent) /*-{
        return this.intersectsExtent(extent);
    }-*/;
    
    /**
     * Set the coordinate of the linestring.
     * @param coordinates Coordinates.
     */
    public final native void setCoordinates(JsArray<Coordinate> coordinates) /*-{
        this.setCoordinates(coordinates);
    }-*/;
    
    /**
     * Set the coordinate of the linestring.
     * @param coordinates Coordinates.
     * @param layout Layout.
     */
    public final native void setCoordinates(JsArray<Coordinate> coordinates, GeometryLayout layout) /*-{
        this.setCoordinates(coordinates, layout);
    }-*/;
}
