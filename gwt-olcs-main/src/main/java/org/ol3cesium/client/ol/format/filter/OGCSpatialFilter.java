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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.format.filter;

/**
 * Represents a spatial operator to test whether a geometry-valued 
 * property relates to a given geometry.

 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OGCSpatialFilter extends OGCFilter {
    protected OGCSpatialFilter() {
        //
    }
    
//    /**
//     * Represents a spatial operator to test whether a geometry-valued property relates to a given geometry.
//     * @param tagName The XML tag name for this filter.
//     * @param geometryName Geometry name to use.
//     * @param geometry Geometry.
//     * @param srsName SRS name. No srsName attribute will be set on geometries when this is not provided.
//     * @return Spatial filter.
//     */
//    public static final native OGCSpatial create(String tagName, Geometry geometryName, String geometry, String srsName) /*-{
//        return new ol.format.ogc.filter.Spatial(tagName, geometryName, geometry, srsName);
//    }-*/;
//    
//    /**
//     * Represents a spatial operator to test whether a geometry-valued property relates to a given geometry.
//     * @param tagName The XML tag name for this filter.
//     * @param geometryName Geometry name to use.
//     * @param geometry Geometry.
//     * @return Spatial filter.
//     */
//    public static final native OGCSpatial create(String tagName, Geometry geometryName, String geometry) /*-{
//        return new ol.format.ogc.filter.Spatial(tagName, geometryName, geometry, srsName);
//    }-*/;
}
