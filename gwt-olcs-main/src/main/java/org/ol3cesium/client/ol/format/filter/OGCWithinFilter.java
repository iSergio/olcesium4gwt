/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.format.filter;

import org.ol3cesium.client.ol.geom.Geometry;

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
    public static final native OGCWithinFilter create(String geometryName, Geometry geometry, String srsName) /*-{
        return new ol.format.ogc.filter.Within(geometryName, geometry, opt_srsName);
    }-*/;
}
