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
package org.ol3cesium.client.ol.proj;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.Coordinate;
import org.ol3cesium.client.ol.Extent;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ProjectionUtils {
    /**
     * Registers transformation functions that don't alter coordinates. Those allow to transform between projections with equal meaning.
     * @param projections {@link Projection} Projections.
     */
    public static native void addEquivalentProjections(JsArray<Projection> projections) /*-{
        ol.proj.addEquivalentProjections(projections);
    }-*/;
    
    /**
     * Add a Projection object to the list of supported projections that can be looked up by their code.
     * @param projection {@link Projection} Projection instance.
     */
    public static native void addProjection(Projection projection) /*-{
        ol.proj.addProjection(projection);
    }-*/;
    
    /**
     * Transforms a coordinate from longitude/latitude to a different projection.
     * The default is Web Mercator, i.e. 'EPSG:3857'.
     * @param coordinate {@link Coordinate} Coordinate as longitude and latitude, i.e. an array with longitude as 1st and latitude as 2nd element.
     * @return Coordinate projected to the target projection.
     */
    public static native Coordinate fromLonLat(Coordinate coordinate) /*-{
        return ol.proj.fromLonLat(coordinate);
    }-*/;
    
    /**
     * Transforms a coordinate from longitude/latitude to a different projection.
     * The default is Web Mercator, i.e. 'EPSG:3857'.
     * @param coordinate {@link Coordinate} Coordinate as longitude and latitude, i.e. an array with longitude as 1st and latitude as 2nd element.
     * @param projection {@link Projection} Target projection. The default is Web Mercator, i.e. 'EPSG:3857'.
     * @return Coordinate projected to the target projection.
     */
    public static native Coordinate fromLonLat(Coordinate coordinate, Projection projection) /*-{
        return ol.proj.fromLonLat(coordinate, projection);
    }-*/;
    
    /**
     * Transforms a coordinate from longitude/latitude to a different projection.
     * The default is Web Mercator, i.e. 'EPSG:3857'.
     * @param coordinate {@link Coordinate} Coordinate as longitude and latitude, i.e. an array with longitude as 1st and latitude as 2nd element.
     * @param projection {@link Projection} Target projection. The default is Web Mercator, i.e. 'EPSG:3857'.
     * @return Coordinate projected to the target projection.
     */
    public static native Coordinate fromLonLat(Coordinate coordinate, String projection) /*-{
        return ol.proj.fromLonLat(coordinate, projection);
    }-*/;
    
    /**
     * Fetches a Projection object for the code specified.
     * @param projection Either a code string which is a combination of authority 
     * and identifier such as "EPSG:4326", or an existing projection object, or undefined.
     * @return Projection object, or null if not in list.
     */
    public static native Projection get(Projection projection) /*-{
        return ol.proj.get(projection);
    }-*/;
    
    /**
     * Fetches a Projection object for the code specified.
     * @param projection Either a code string which is a combination of authority 
     * and identifier such as "EPSG:4326", or an existing projection object, or undefined.
     * @return Projection object, or null if not in list.
     */
    public static native Projection get(String projection) /*-{
        return ol.proj.get(projection);
    }-*/;
    
    /**
     * TTransforms a coordinate to longitude/latitude.
     * The default is Web Mercator, i.e. 'EPSG:3857'.
     * @param coordinate {@link Coordinate} Coordinate as longitude and latitude, i.e. an array with longitude as 1st and latitude as 2nd element.
     * @return Coordinate as longitude and latitude, i.e. an array with longitude as 1st and latitude as 2nd element.
     */
    public static native Coordinate toLonLat(Coordinate coordinate) /*-{
        return ol.proj.toLonLat(coordinate);
    }-*/;
    
    /**
     * Transforms a coordinate to longitude/latitude.
     * The default is Web Mercator, i.e. 'EPSG:3857'.
     * @param coordinate {@link Coordinate} Coordinate as longitude and latitude, i.e. an array with longitude as 1st and latitude as 2nd element.
     * @param projection {@link Projection} Target projection. The default is Web Mercator, i.e. 'EPSG:3857'.
     * @return Coordinate as longitude and latitude, i.e. an array with longitude as 1st and latitude as 2nd element.
     */
    public static native Coordinate toLonLat(Coordinate coordinate, Projection projection) /*-{
        return ol.proj.toLonLat(coordinate, projection);
    }-*/;
    
    /**
     * Transforms a coordinate to longitude/latitude.
     * The default is Web Mercator, i.e. 'EPSG:3857'.
     * @param coordinate {@link Coordinate} Coordinate as longitude and latitude, i.e. an array with longitude as 1st and latitude as 2nd element.
     * @param projection {@link Projection} Target projection. The default is Web Mercator, i.e. 'EPSG:3857'.
     * @return Coordinate as longitude and latitude, i.e. an array with longitude as 1st and latitude as 2nd element.
     */
    public static native Coordinate toLonLat(Coordinate coordinate, String projection) /*-{
        return ol.proj.toLonLat(coordinate, projection);
    }-*/;
    
    /**
     * Transforms a coordinate from source projection to destination projection. This returns a new coordinate (and does not modify the original).
     * @param coordinate {@link Coordinate} Coordinate.
     * @param source {@link Projection} Source projection
     * @param destination {@link Projection} Destination projection
     * @return Coordinate.
     */
    public static native Coordinate transform(Coordinate coordinate, Projection source, Projection destination) /*-{
        return ol.proj.transform(coordinate, source, destination);
    }-*/;
    
    /**
     * Transforms a coordinate from source projection to destination projection. This returns a new coordinate (and does not modify the original).
     * @param coordinate {@link Coordinate} Coordinate.
     * @param source {@link String} Source projection
     * @param destination {@link String} Destination projection
     * @return Coordinate.
     */
    public static native Coordinate transform(Coordinate coordinate, String source, String destination) /*-{
        return ol.proj.transform(coordinate, source, destination);
    }-*/;
    
    /**
     * Transforms a coordinate from source projection to destination projection. This returns a new coordinate (and does not modify the original).
     * @param extent {@link Extent} Extent.
     * @param source {@link Projection} Source projection
     * @param destination {@link Projection} Destination projection
     * @return The transformed extent.
     */
    public static native Extent transformExtent(Extent extent, Projection source, Projection destination) /*-{
        return ol.proj.transformExtent(extent, source, destination);
    }-*/;
    
    /**
     * Transforms a coordinate from source projection to destination projection. This returns a new coordinate (and does not modify the original).
     * @param extent {@link Extent} Extent.
     * @param source {@link String} Source projection
     * @param destination {@link String} Destination projection
     * @return The transformed extent.
     */
    public static native Extent transformExtent(Extent extent, String source, String destination) /*-{
        return ol.proj.transformExtent(extent, source, destination);
    }-*/;
    
    /**
     * Given the projection-like objects, searches for a transformation function 
     * to convert a coordinates array from the source projection to the destination projection.
     * @param source Source.
     * @param destination Destination.
     * @return Transform function.
     */
    public static native JavaScriptObject getTransform(String source, String destination) /*-{
        return ol.proj.getTransform(source, destination);
    }-*/;
}
