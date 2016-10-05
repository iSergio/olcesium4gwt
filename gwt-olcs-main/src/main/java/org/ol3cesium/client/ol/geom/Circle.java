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

import org.ol3cesium.client.ol.Coordinate;
import org.ol3cesium.client.ol.Extent;
import org.ol3cesium.client.ol.proj.Projection;

/**
 * Circle geometry.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Circle extends SimpleGeometry {
    protected Circle() {
        //
    }
    
    /**
     * 
     * @param center Center.
     * @param radius Radius.
     * @return 
     */
    public static final native Circle create(Coordinate center, double radius) /*-{
        return new ol.geom.Circle(center, radius);
    }-*/;
    
    /**
     * 
     * @param center Center.
     * @param radius Radius.
     * @param layout Layout.
     * @return 
     */
    public static final native Circle create(Coordinate center, double radius, GeometryLayout layout) /*-{
        return new ol.geom.Circle(center, radius, layout);
    }-*/;
    
    /**
     * Make a complete copy of the geometry.
     * @return Clone.
     */
    public final native Circle clone() /*-{
        return this.clone();
    }-*/;
    
    /**
     * Return the center of the circle as coordinate.
     * @return Center
     */
    public final native Coordinate getCenter() /*-{
        return this.getCenter();
    }-*/;
    
    /**
     * Return the radius of the circle.
     * @return Radius.
     */
    public final native double getRadius() /*-{
        return this.getRadius();
    }-*/;
    
//    /**
//     * Get the type of this geometry.
//     * @return GeometryType
//     */
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
     * Set the center of the circle as coordinate.
     * @param center Center.
     */
    public final native void setCenter(Coordinate center) /*-{
        this.setCenter(center);
    }-*/;

    /**
     * Set the center (as coordinate) and the radius (as number) of the circle.
     * @param center Center.
     * @param radius Radius.
     * @param layout Layout.
     */
    public final native void setCenterAndRadius(Coordinate center, double radius, GeometryLayout layout) /*-{
        this.setCenterAndRadius(center, radius, layout);
    }-*/;

    /**
     * Set the center (as coordinate) and the radius (as number) of the circle.
     * @param center Center.
     * @param radius Radius.
     */
    public final native void setCenterAndRadius(Coordinate center, double radius) /*-{
        this.setCenterAndRadius(center, radius);
    }-*/;
    
    /**
     * Set the radius of the circle. The radius is in the units of the projection.
     * @param radius Radius.
     */
    public final native void setRadius(double radius) /*-{
        this.setRadius(radius);
    }-*/;
    
    /**
     * Transform each coordinate of the circle from one coordinate reference system to another. 
     * The geometry is modified in place. If you do not want the geometry modified in place, 
     * first clone() it and then use this function on the clone.
     * 
     * Internally a circle is currently represented by two points: the center of the circle [cx, cy], 
     * and the point to the right of the circle [cx + r, cy]. This transform function just 
     * transforms these two points. So the resulting geometry is also a circle, and 
     * that circle does not correspond to the shape that would be obtained by t
     * ransforming every point of the original circle.
     * @param source The current projection.
     * @param destination The desired projection.
     * @return This geometry. Note that original geometry is modified in place.
     */
    public final native Circle transformCircle(Projection source, Projection destination) /*-{
        return this.transform(source, destination);
    }-*/;
    
    /**
     * Transform each coordinate of the circle from one coordinate reference system to another. 
     * The geometry is modified in place. If you do not want the geometry modified in place, 
     * first clone() it and then use this function on the clone.
     * 
     * Internally a circle is currently represented by two points: the center of the circle [cx, cy], 
     * and the point to the right of the circle [cx + r, cy]. This transform function just 
     * transforms these two points. So the resulting geometry is also a circle, and 
     * that circle does not correspond to the shape that would be obtained by 
     * transforming every point of the original circle.
     * @param source The current projection.
     * @param destination The desired projection.
     * @return This geometry. Note that original geometry is modified in place.
     */
    public final native Circle transformCircle(String source, String destination) /*-{
        return this.transform(source, destination);
    }-*/;
}
