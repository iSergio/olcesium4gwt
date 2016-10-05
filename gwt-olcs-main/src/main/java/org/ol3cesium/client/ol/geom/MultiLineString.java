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
 * Multi-linestring geometry.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class MultiLineString extends SimpleGeometry {
    protected MultiLineString() {
        //
    }
    
    public static native MultiLineString create(JsArray<JsArray<Coordinate>> coordinates) /*-{
        return new ol.geom.MultiLineString(coordinates);
    }-*/;
    
    public static native MultiLineString create(JsArray<JsArray<Coordinate>> coordinates, GeometryLayout layout) /*-{
        return new ol.geom.MultiLineString(coordinates, layout);
    }-*/;
    
    /**
     * Append the passed linestring to the multilinestring.
     * @param lineString LineString.
     */
    public final native void appendLineString(LineString lineString) /*-{
        this.appendLineString(lineString);
    }-*/;
    
    /**
     * Make a complete copy of the geometry.
     * @return Clone.
     */
    public final native MultiLineString clone() /*-{
        return this.clone();
    }-*/;
    
    /**
     * Returns the coordinate at m using linear interpolation, or null if no such coordinate exists.
     * 
     * opt_extrapolate controls extrapolation beyond the range of Ms in the MultiLineString. 
     * If opt_extrapolate is true then Ms less than the first M will return 
     * the first coordinate and Ms greater than the last M will return the 
     * last coordinate.
     * 
     * opt_interpolate controls interpolation between consecutive LineStrings 
     * within the MultiLineString. If opt_interpolate is true the coordinates 
     * will be linearly interpolated between the last coordinate of one LineString 
     * and the first coordinate of the next LineString. If opt_interpolate is false then 
     * the function will return null for Ms falling between LineStrings.
     * @param m M
     * @return Coordinate
     */
    public final native Coordinate getCoordinateAtM(double m) /*-{
        return this.getCoordinateAtM(m);
    }-*/;
    
    /**
     * Returns the coordinate at m using linear interpolation, or null if no such coordinate exists.
     * 
     * opt_extrapolate controls extrapolation beyond the range of Ms in the MultiLineString. 
     * If opt_extrapolate is true then Ms less than the first M will return 
     * the first coordinate and Ms greater than the last M will return the 
     * last coordinate.
     * 
     * opt_interpolate controls interpolation between consecutive LineStrings 
     * within the MultiLineString. If opt_interpolate is true the coordinates 
     * will be linearly interpolated between the last coordinate of one LineString 
     * and the first coordinate of the next LineString. If opt_interpolate is false then 
     * the function will return null for Ms falling between LineStrings.
     * @param m M
     * @param extrapolate Extrapolate. Default is false.
     * @param interpolate Interpolate. Default is false.
     * @return Coordinate
     */
    public final native Coordinate getCoordinateAtM(double m, boolean extrapolate, boolean interpolate) /*-{
        return this.getCoordinateAtM(m, extrapolate, interpolate);
    }-*/;
    
    /**
     * Return the coordinates of the multilinestring.
     * @return Coordinates.
     */
    public final native JsArray<JsArray<Coordinate>> getCoordinates() /*-{
        return this.getCoordinates();
    }-*/;
    
    /**
     * Return the linestring at the specified index.
     * @param index Index.
     * @return LineString
     */
    public final native LineString getLineString(int index) /*-{
        return this.getLineString(index);
    }-*/;
    
    /**
     * Return the linestrings of this multilinestring.
     * @return LineStrings.
     */
    public final native JsArray<LineString> getLineStrings() /*-{
        return this.getLineStrings();
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
     * Set the coordinate of the multilinestring.
     * @param coordinates Coordinates.
     */
    public final native void setCoordinates(JsArray<JsArray<Coordinate>> coordinates) /*-{
        this.setCoordinates(coordinates);
    }-*/;
    
    /**
     * Set the coordinate of the multilinestring.
     * @param coordinates Coordinates.
     * @param layout Layout.
     */
    public final native void setCoordinates(JsArray<JsArray<Coordinate>> coordinates, GeometryLayout layout) /*-{
        this.setCoordinates(coordinates, layout);
    }-*/;
}
