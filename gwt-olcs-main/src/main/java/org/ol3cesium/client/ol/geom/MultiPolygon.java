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
 * Multi-polygon geometry.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class MultiPolygon extends SimpleGeometry {
    protected MultiPolygon() {
        //
    }
    
    public static native MultiPolygon create(JsArray<JsArray<JsArray<Coordinate>>> coordinates) /*-{
        return new ol.geom.MultiPolygon(coordinates);
    }-*/;
    
    public static native MultiPolygon create(JsArray<JsArray<JsArray<Coordinate>>> coordinates, GeometryLayout layout) /*-{
        return new ol.geom.MultiPolygon(coordinates, layout);
    }-*/;
    
    /**
     * Append the passed polygon to this multipolygon.
     * @param polygon Polygon.
     */
    public final native void appendPolygon(Polygon polygon) /*-{
        this.appendPolygon(polygon);
    }-*/;
    
    /**
     * Make a complete copy of the geometry.
     * @return Clone.
     */
    public final native MultiPolygon clone() /*-{
        return this.clone();
    }-*/;
    
    /**
     * Return the area of the multipolygon on projected plane.
     * @return Area (on projected plane).
     */
    public final native double getArea() /*-{
        return this.getArea();
    }-*/;
    
    /**
     * Get the coordinate array for this geometry. This array has the structure of a GeoJSON coordinate array for multi-polygons.
     * @return Coordinates.
     */
    public final native JsArray<JsArray<JsArray<Coordinate>>> getCoordinates() /*-{
        return this.getCoordinates();
    }-*/;
    
    /**
     * Get the coordinate array for this geometry. This array has the structure 
     * of a GeoJSON coordinate array for multi-polygons.
     * @param right Orient coordinates according to the right-hand rule 
     * (counter-clockwise for exterior and clockwise for interior rings). 
     * If false, coordinates will be oriented according to the left-hand rule 
     * (clockwise for exterior and counter-clockwise for interior rings). 
     * By default, coordinate orientation will depend on how the geometry was constructed.
     * @return Coordinates.
     */
    public final native JsArray<JsArray<JsArray<Coordinate>>> getCoordinates(boolean right) /*-{
        return this.getCoordinates(right);
    }-*/;
    
    /**
     * Return the interior points as multipoint.
     * @return Interior points
     */
    public final native MultiPoint getInteriorPoints() /*-{
        return this.getInteriorPoints();
    }-*/;
    
    /**
     * Return the polygon at the specified index.
     * @param index Index.
     * @return Polygon
     */
    public final native Polygon getPolygon(int index) /*-{
        return this.getPolygon(index);
    }-*/;
    
    /**
     * Return the polygons of this multipolygon.
     * @return Polygons.
     */
    public final native JsArray<Polygon> getPolygons() /*-{
        return this.getPolygons();
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
     * Set the coordinate of the point.
     * @param coordinates Coordinates.
     */
    public final native void setCoordinates(JsArray<JsArray<JsArray<Coordinate>>> coordinates) /*-{
        this.setCoordinates(coordinates);
    }-*/;
    
    /**
     * Set the coordinate of the point.
     * @param coordinates Coordinates.
     * @param layout Layout.
     */
    public final native void setCoordinates(JsArray<JsArray<JsArray<Coordinate>>> coordinates, GeometryLayout layout) /*-{
        this.setCoordinates(coordinates, layout);
    }-*/;
}
