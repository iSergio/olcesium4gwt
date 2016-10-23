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
package org.ol3cesium.ol.geom;

import com.google.gwt.core.client.JsArray;
import org.ol3cesium.ol.Coordinate;
import org.ol3cesium.ol.Extent;
import org.ol3cesium.ol.Sphere;

/**
 * Polygon geometry.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Polygon extends SimpleGeometry {
    protected Polygon() {
        //
    }
    
    public static native Polygon create(JsArray<JsArray<Coordinate>> coordinates) /*-{
        return new ol.geom.Polygon(coordinates);
    }-*/;
    
    public static native Polygon create(JsArray<JsArray<Coordinate>> coordinates, GeometryLayout layout) /*-{
        return new ol.geom.Polygon(coordinates, layout);
    }-*/;

    /**
     * Create an approximation of a circle on the surface of a sphere.
     * @param sphere The sphere.
     * @param center Center ([lon, lat] in degrees).
     * @param radius The great-circle distance from the center to the polygon vertices.
     * @return The "circular" polygon.
     */
    public static native Polygon circular(Sphere sphere, Coordinate center, double radius) /*-{
        return new ol.geom.Polygon.circular(sphere, center, radius);
    }-*/;
    
    /**
     * Create an approximation of a circle on the surface of a sphere.
     * @param sphere The sphere.
     * @param center Center ([lon, lat] in degrees).
     * @param radius The great-circle distance from the center to the polygon vertices.
     * @param n Optional number of vertices for the resulting polygon. Default is 32.
     * @return The "circular" polygon.
     */
    public static native Polygon circular(Sphere sphere, Coordinate center, double radius, int n) /*-{
        return new ol.geom.Polygon.circular(sphere, center, radius, n);
    }-*/;

    /**
     * Create a regular polygon from a circle.
     * @param circle Circle geometry.
     * @param sides Number of sides of the polygon. Default is 32.
     * @param angle Start angle for the first vertex of the polygon in radians. Default is 0.
     * @return 
     */
    public static native Polygon fromCircle(Circle circle, int sides, double angle) /*-{
        return new ol.geom.Polygon.fromCircle(circle, sides, angle);
    }-*/;
    
    /**
     * Create a polygon from an extent. The layout used is XY.
     * @param extent The extent
     * @return The polygon.
     */
    public static native Polygon fromExtent(Extent extent) /*-{
        return new ol.geom.Polygon.fromExtent(extent);
    }-*/;

    /**
     * Append the passed linear ring to this polygon.
     * @param linearRing Linear ring.
     */
    public final native void appendLinearRing(LinearRing linearRing) /*-{
        this.appendLinearRing(linearRing);
    }-*/;
    
    /**
     * Make a complete copy of the geometry.
     * @return Clone.
     */
    public final native Polygon clone() /*-{
        return this.clone();
    }-*/;
    
    /**
     * Return the area of the polygon on projected plane.
     * @return Area (on projected plane).
     */
    public final native double getArea() /*-{
        return this.getArea();
    }-*/;
    
    /**
     * Get the coordinate array for this geometry. This array has the structure of a GeoJSON coordinate array for polygons.
     * @return Coordinates.
     */
    public final native JsArray<JsArray<Coordinate>> getCoordinates() /*-{
        return this.getCoordinates();
    }-*/;
    
    /**
     * Get the coordinate array for this geometry. This array has the structure of a GeoJSON coordinate array for polygons.
     * @param right Orient coordinates according to the right-hand rule 
     * (counter-clockwise for exterior and clockwise for interior rings). 
     * If false, coordinates will be oriented according to the left-hand rule 
     * (clockwise for exterior and counter-clockwise for interior rings). By default, 
     * coordinate orientation will depend on how the geometry was constructed.
     * @return Coordinates.
     */
    public final native JsArray<JsArray<Coordinate>> getCoordinates(boolean right) /*-{
        return this.getCoordinates(right);
    }-*/;
    
    /**
     * Return an interior point of the polygon.
     * @return Interior point.
     */
    public final native Point getInteriorPoint() /*-{
        return this.getInteriorPoint();
    }-*/;
    
    /**
     * Return the Nth linear ring of the polygon geometry. Return null 
     * if the given index is out of range. The exterior linear ring is available 
     * at index 0 and the interior rings at index 1 and beyond.
     * @param index Index.
     * @return Linear ring.
     */
    public final native LinearRing getLinearRing(int index) /*-{
        return this.getLinearRing(index);
    }-*/;
    
    /**
     * Return the number of rings of the polygon, this includes the exterior ring and any interior rings.
     * @return Number of rings.
     */
    public final native int getLinearRingCount() /*-{
        return this.getLinearRingCount();
    }-*/;
    
    /**
     * Return the linear rings of the polygon.
     * @return Linear rings.
     */
    public final native JsArray<LinearRing> getLinearRings() /*-{
        return this.getLinearRings();
    }-*/;
    
//    /**
//     * Get the type of this geometry.
//     * @return Geometry type.
//     */
//    @Override
//    public final native String getType() /*-{
//        return this.getType();
//    }-*/;
    
    /**
     * Test if the geometry and the passed extent intersect.
     * @param extent Extent.
     * @return true if the geometry and the extent intersect.
     */
    public final native boolean intersectsExtent(Extent extent) /*-{
        return this.intersectsExtent(extent);
    }-*/;
    
    /**
     * Set the coordinates of the polygon.
     * @param coordinates Coordinates.
     * @param layout Layout.
     */
    public final native void setCoordinates(JsArray<JsArray<Coordinate>> coordinates, GeometryLayout layout) /*-{
        this.setCoordinates(coordinates, layout);
    }-*/;
}
