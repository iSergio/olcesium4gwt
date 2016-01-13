/* 
 * Copyright 2016 iserge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
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

/**
 * Point geometry.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Point extends SimpleGeometry {
    protected Point() {
        //
    }
    
    public static final native Point create(Coordinate coordinates) /*-{
        return new ol.geom.Point(coordinates);
    }-*/;
    
    public static final native Point create(Coordinate coordinates, GeometryLayout layout) /*-{
        return new ol.geom.Point(coordinates, layout);
    }-*/;
    
    /**
     * Make a complete copy of the geometry.
     * @return Clone.
     */
    public final native Point clone() /*-{
        return this.clone();
    }-*/;
    
    /**
     * Return the coordinate of the point.
     * @return Coordinates.
     */
    public final native Coordinate getCoordinates() /*-{
        return this.getCoordinates();
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
    public final native void setCoordinates(Coordinate coordinates) /*-{
        this.setCoordinates(coordinates);
    }-*/;
    
    /**
     * Set the coordinate of the point.
     * @param coordinates Coordinates.
     * @param layout Layout.
     */
    public final native void setCoordinates(Coordinate coordinates, GeometryLayout layout) /*-{
        this.setCoordinates(coordinates, layout);
    }-*/;
}
