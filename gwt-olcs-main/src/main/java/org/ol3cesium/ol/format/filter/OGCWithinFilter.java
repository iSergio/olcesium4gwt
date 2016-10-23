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
package org.ol3cesium.ol.format.filter;

import org.ol3cesium.ol.geom.Geometry;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OGCWithinFilter extends OGCSpatialFilter {
    protected OGCWithinFilter() {
        //
    }
    
    /**
     * Represents a <Within> operator to test whether a geometry-valued property is within a given geometry.
     * @param geometryName Geometry name to use.
     * @param geometry Geometry.
     * @param srsName SRS name. No srsName attribute will be set on geometries when this is not provided.
     * @return Within filter.
     */
    public static native OGCWithinFilter create(String geometryName, Geometry geometry, String srsName) /*-{
        return new ol.format.ogc.filter.Within(geometryName, geometry, opt_srsName);
    }-*/;
}
