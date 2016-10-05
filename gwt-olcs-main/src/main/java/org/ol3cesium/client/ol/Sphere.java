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
 * Class to create objects that can be used with ol.geom.Polygon.circular.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Sphere extends JavaScriptObject {
    protected Sphere() {
        //
    }
    
    public static final native Sphere create(double radius) /*-{
        return new ol.Sphere(radius);
    }-*/;
    
    /**
     * Returns the geodesic area for a list of coordinates. Reference Robert. 
     * G. Chamberlain and William H. Duquette, "Some Algorithms for Polygons on a Sphere", 
     * JPL Publication 07-03, Jet Propulsion Laboratory, Pasadena, CA, June 2007
     * @param coordinates List of coordinates of a linear ring. If the ring is oriented clockwise, the area will be positive, otherwise it will be negative.
     * @return Area.
     */
    public final native double geodesicArea(JsArray<Coordinate> coordinates) /*-{
        return this.geodesicArea(coordinates);
    }-*/;

    /**
     * Returns the distance from c1 to c2 using the haversine formula.
     * @param c1 Coordinate 1.
     * @param c2 Coordinate 2.
     * @return Haversine distance.
     */
    public final native double haversineDistance(Coordinate c1, Coordinate c2) /*-{
        return this.haversineDistance(c1, c2);
    }-*/;
}
