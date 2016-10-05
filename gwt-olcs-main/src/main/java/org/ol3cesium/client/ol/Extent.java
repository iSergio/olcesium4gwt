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
package org.ol3cesium.client.ol;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Extent extends JavaScriptObject {
    protected Extent() {
        //
    }
    
    public static final native Extent create(double minX, double minY, double maxX, double maxY) /*-{
        return [minX, minY, maxX, maxY];
    }-*/;
    
    public final native double getMinX()/*-{
        return this[0];
    }-*/;

    public final native double getMinY()/*-{
        return this[1];
    }-*/;

    public final native double getMaxX()/*-{
        return this[2];
    }-*/;

    public final native double getMaxY()/*-{
        return this[3];
    }-*/;
    
    /**
     * Apply a transform function to the extent.
     * @param extent Extent.
     * @param transformFn Transform function. Called with [minX, minY, maxX, maxY] extent coordinates.
     * @return Extent.
     */
    public static final native Extent applyTransform(Extent extent, JavaScriptObject transformFn) /*-{
        return ol.extent.applyTransform(extent, transformFn);
    }-*/;
    
    /**
     * Build an extent that includes all given coordinates.
     * @param coordinates Coordinates.
     * @return Bounding extent.
     */
    public static final native Extent boundingExtent(JsArray<Coordinate> coordinates) /*-{
        return ol.extent.boundingExtent(coordinates);
    }-*/;
    
    /**
     * Return extent increased by the provided value.
     * @param extent Extent.
     * @param value The amount by which the extent should be buffered.
     * @return Extent.
     */
    public static final native Extent buffer(Extent extent, double value) /*-{
        return ol.extent.buffer(extent, value);
    }-*/;
    
    /**
     * Return extent increased by the provided value.
     * @param extent Extent.
     * @param value The amount by which the extent should be buffered.
     * @param opt_extent Extent.
     * @return Extent.
     */
    public static final native Extent buffer(Extent extent, double value, Extent opt_extent) /*-{
        return ol.extent.buffer(extent, value, opt_extent);
    }-*/;
    
    /**
     * Check if the passed coordinate is contained or on the edge of the extent.
     * @param coordinate Coordinate.
     * @return The coordinate is contained in the extent.
     */
    public final native boolean containsCoordinate(Coordinate coordinate) /*-{
        return ol.extent.containsCoordinate(this, coordinate);
    }-*/;
    
    /**
     * Check if the passed coordinate is contained or on the edge of the extent.
     * @param extent Extent.
     * @param coordinate Coordinate.
     * @return The coordinate is contained in the extent.
     */
    public static final native boolean containsCoordinate(Extent extent, Coordinate coordinate) /*-{
        return ol.extent.containsCoordinate(extent, coordinate);
    }-*/;
    
    /**
     * Check if one extent contains another.
     * An extent is deemed contained if it lies completely within the other extent, 
     * including if they share one or more edges.
     * @param extent Extent.
     * @return The second extent is contained by or on the edge of the first.
     */
    public final native boolean containsExtent(Extent extent) /*-{
        return ol.extent.containsExtent(this, extent);
    }-*/;
    
        /**
     * Check if one extent contains another.
     * An extent is deemed contained if it lies completely within the other extent, 
     * including if they share one or more edges.
     * @param extent1 Extent1.
     * @param extent2 Extent2.
     * @return The second extent is contained by or on the edge of the first.
     */
    public static final native boolean containsExtent(Extent extent1, Extent extent2) /*-{
        return ol.extent.containsExtent(extent1, extent2);
    }-*/;
    
    /**
     * Check if the passed coordinate is contained or on the edge of the extent.
     * @param x X coordinate.
     * @param y Y coordinate.
     * @return The x, y values are contained in the extent.
     */
    public final native boolean containsXY(double x, double y) /*-{
        return ol.extent.containsXY(this, x, y);
    }-*/;
    
        /**
     * Check if the passed coordinate is contained or on the edge of the extent.
     * @param extent Extent.
     * @param x X coordinate.
     * @param y Y coordinate.
     * @return The x, y values are contained in the extent.
     */
    public static final native boolean containsXY(Extent extent, double x, double y) /*-{
        return ol.extent.containsXY(extent, x, y);
    }-*/;
    
    /**
     * Determine if two extents are equivalent.
     * @param extent Extent.
     * @return The two extents are equivalent.
     */
    public final native boolean equals(Extent extent) /*-{
        return ol.extent.equals(this, extent);
    }-*/;
    
    /**
     * Determine if two extents are equivalent.
     * @param extent1 Extent 1.
     * @param extent2 Extent 2.
     * @return The two extents are equivalent.
     */
    public static final native boolean equals(Extent extent1, Extent extent2) /*-{
        return ol.extent.equals(extent1, extent2);
    }-*/;
    
    /**
     * Modify an extent to include another extent.
     * @param extent The extent that will be included in the first.
     * @return A reference to the first (extended) extent.
     */
    public final native Extent extend(Extent extent) /*-{
        return ol.extent.extend(this, extent);
    }-*/;
    
    /**
     * Modify an extent to include another extent.
     * @param extent1 The extent to be modified.
     * @param extent2 The extent that will be included in the first.
     * @return A reference to the first (extended) extent.
     */
    public static final native Extent extend(Extent extent1, Extent extent2) /*-{
        return ol.extent.extend(this, extent);
    }-*/;
    
    /**
     * Get the bottom left coordinate of an extent.
     * @return Bottom left coordinate.
     */
    public final native Coordinate getBottomLeft() /*-{
        return ol.extent.getBottomLeft(this);
    }-*/;
    
    /**
     * Get the bottom left coordinate of an extent.
     * @param extent Extent.
     * @return Bottom left coordinate.
     */
    public static final native Coordinate getBottomLeft(Extent extent) /*-{
        return ol.extent.getBottomLeft(extent);
    }-*/;
    
    /**
     * Get the bottom right coordinate of an extent.
     * @return Bottom right coordinate.
     */
    public final native Coordinate getBottomRight() /*-{
        return ol.extent.getBottomRight(this);
    }-*/;
    
    /**
     * Get the bottom right coordinate of an extent.
     * @param extent Extent.
     * @return Bottom right coordinate.
     */
    public static final native Coordinate getBottomRight(Extent extent) /*-{
        return ol.extent.getBottomRight(extent);
    }-*/;

    /**
     * Get the center coordinate of an extent.
     * @return Center.
     */
    public final native Coordinate getCenter() /*-{
        return ol.extent.getCenter(this);
    }-*/;
    
    /**
     * Get the center coordinate of an extent.
     * @param extent Extent.
     * @return Center.
     */
    public static final native Coordinate getCenter(Extent extent) /*-{
        return ol.extent.getCenter(extent);
    }-*/;
    
    /**
     * Get the height of an extent.
     * @return Height.
     */
    public final native double getHeight() /*-{
        return ol.extent.getHeight(this);
    }-*/;
    
    /**
     * Get the height of an extent.
     * @param extent Extent.
     * @return Height.
     */
    public static final native double getHeight(Extent extent) /*-{
        return ol.extent.getHeight(extent);
    }-*/;
    
    /**
     * Get the intersection with extent.
     * @param extent Extent.
     * @return Intersecting extent.
     */
    public final native Extent getIntersection(Extent extent) /*-{
        return ol.extent.getIntersection(this, extent, opt_extent);
    }-*/;
    
    /**
     * Get the intersection with extent.
     * @param extent Extent.
     * @param opt_extent Optional extent to populate with intersection.
     * @return Intersecting extent.
     */
    public final native Extent getIntersectionOpt(Extent extent, Extent opt_extent) /*-{
        return ol.extent.getIntersection(this, extent, opt_extent);
    }-*/;
    
    /**
     * Get the intersection with extent.
     * @param extent1 Extent.
     * @param extent2 Extent.
     * @return Intersecting extent.
     */
    public static final native Extent getIntersection(Extent extent1, Extent extent2) /*-{
        return ol.extent.getIntersection(extent1, extent2);
    }-*/;
    
    /**
     * Get the intersection with extent.
     * @param extent1 Extent.
     * @param extent2 Extent.
     * @param opt_extent Optional extent to populate with intersection.
     * @return Intersecting extent.
     */
    public static final native Extent getIntersection(Extent extent1, Extent extent2, Extent opt_extent) /*-{
        return ol.extent.getIntersection(extent1, extent2, opt_extent);
    }-*/;
    
    /**
     * Get the size (width, height) of an extent.
     * @return The extent size.
     */
    public final native Size getSize() /*-{
        return ol.extent.getSize(this);
    }-*/;
    
    /**
     * Get the size (width, height) of an extent.
     * @param extent The extent.
     * @return The extent size.
     */
    public static final native Size getSize(Extent extent) /*-{
        return ol.extent.getSize(extent);
    }-*/;
    
    /**
     * Get the top left coordinate of an extent.
     * @return Top left coordinate.
     */
    public final native Coordinate getTopLeft() /*-{
        return ol.extent.getTopLeft(this);
    }-*/;
    
    /**
     * Get the top left coordinate of an extent.
     * @param extent Extent.
     * @return Top left coordinate.
     */
    public final native Coordinate getTopLeft(Extent extent) /*-{
        return ol.extent.getTopLeft(extent);
    }-*/;
    
    /**
     * Get the top right coordinate of an extent.
     * @return Top right coordinate.
     */
    public final native Coordinate getTopRight() /*-{
        return ol.extent.getTopRight(this);
    }-*/;
    
    /**
     * Get the top right coordinate of an extent.
     * @param extent Extent.
     * @return Top right coordinate.
     */
    public final native Coordinate getTopRight(Extent extent) /*-{
        return ol.extent.getTopRight(extent);
    }-*/;
    
    /**
     * Get the width of an extent.
     * @return Width.
     */
    public final native double getWidth() /*-{
        return ol.extent.getWidth(this);
    }-*/;
    
    /**
     * Get the width of an extent.
     * @param extent Extent.
     * @return Width.
     */
    public static final native double getWidth(Extent extent) /*-{
        return ol.extent.getWidth(extent);
    }-*/;
    
    /**
     * Determine if one extent intersects another.
     * @param extent Extent.
     * @return The two extents intersect.
     */
    public final native boolean intersects(Extent extent) /*-{
        return ol.extent.intersects(this, extent);
    }-*/;
    
    /**
     * Determine if one extent intersects another.
     * @param extent1 Extent.
     * @param extent2 Extent.
     * @return The two extents intersect.
     */
    public static final native boolean intersects(Extent extent1, Extent extent2) /*-{
        return ol.extent.intersects(extent1, extent2);
    }-*/;
    
    /**
     * Determine if an extent is empty.
     * @return is empty.
     */
    public final native boolean isEmpty() /*-{
        return ol.extent.isEmpty(this);
    }-*/;
    
    /**
     * Determine if an extent is empty.
     * @param extent Extent.
     * @return is empty.
     */
    public static final native boolean isEmpty(Extent extent) /*-{
        return ol.extent.isEmpty(extent);
    }-*/;
}
