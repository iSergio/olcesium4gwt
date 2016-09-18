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
public class OGCIntersectsFilter extends OGCSpatialFilter {
    protected OGCIntersectsFilter() {
        //
    }
    
    /**
     * Represents a <Intersects> operator to test whether a geometry-valued property intersects a given geometry.
     * @param geometryName Geometry name to use.
     * @param geometry Geoemtry.
     * @return Intersects filter.
     */
    public static final native OGCIntersectsFilter create(String geometryName, Geometry geometry) /*-{
        retutn new ol.format.ogc.filter.Intersects(geometryName, geometry);
    }-*/;
    
    /**
     * Represents a <Intersects> operator to test whether a geometry-valued property intersects a given geometry.
     * @param geometryName Geometry name to use.
     * @param geometry Geoemtry.
     * @param srsName SRS name. No srsName attribute will be set on geometries when this is not provided.
     * @return Intersects filter.
     */
    public static final native OGCIntersectsFilter create(String geometryName, Geometry geometry, String srsName) /*-{
        retutn new ol.format.ogc.filter.Intersects(geometryName, geometry, srsName);
    }-*/;
}
