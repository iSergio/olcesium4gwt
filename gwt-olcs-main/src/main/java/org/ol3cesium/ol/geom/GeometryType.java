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

/**
 * The geometry type. One of 'Point', 'LineString', 'LinearRing', 'Polygon', 
 * 'MultiPoint', 'MultiLineString', 'MultiPolygon', 'GeometryCollection', 'Circle'.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum GeometryType {
    POINT("Point"), LINE_STRING("LineString"), LINEAR_RING("LinearRing"),
    POLYGON("Polygon"), MULTI_POINT("MultiPoint"), MULTI_LINE_STRING("MultiLineString"),
    MULTI_POLYGON("MultiPolygon"), GEOMETRY_COLLECTION("GeometryCollection"), CIRCLE("Circle"),
    UNKNOWN("unknown");

    private final String _value;

    GeometryType(String value) {
        _value = value;
    }

    public static GeometryType fromString(String string) {
        if (POINT.toString().equalsIgnoreCase(string)) {
            return POINT;
        }
        else if (LINE_STRING.toString().equalsIgnoreCase(string)) {
            return LINE_STRING;
        }
        else if (LINEAR_RING.toString().equalsIgnoreCase(string)) {
            return LINEAR_RING;
        }
        else if (POLYGON.toString().equalsIgnoreCase(string)) {
            return POLYGON;
        }
        else if (MULTI_POINT.toString().equalsIgnoreCase(string)) {
            return MULTI_POINT;
        }
        else if (MULTI_LINE_STRING.toString().equalsIgnoreCase(string)) {
            return MULTI_LINE_STRING;
        }
        else if (MULTI_POLYGON.toString().equalsIgnoreCase(string)) {
            return MULTI_POLYGON;
        }
        else if (GEOMETRY_COLLECTION.toString().equalsIgnoreCase(string)) {
            return GEOMETRY_COLLECTION;
        }
        else if (CIRCLE.toString().equalsIgnoreCase(string)) {
            return CIRCLE;
        } else {
            return UNKNOWN;
        }
    }

    @Override
    public String toString() {
        return _value;
    }
}
