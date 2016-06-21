/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.format.filter;

import org.ol3cesium.client.ol.Extent;

/**
 * Represents a <BBOX> operator to test whether a geometry-valued property intersects a fixed bounding box
 * @author iserge
 */
public class OGCBboxFilter extends OGCFilter {
    protected OGCBboxFilter() {
        //
    }
    
    /**
     * Represents a <BBOX> operator to test whether a geometry-valued property intersects a fixed bounding box
     * @param geometryName Geometry name to use.
     * @param extent Extent.
     * @param srsName SRS name. No srsName attribute will be set on geometries when this is not provided.
     * @return Represents a <BBOX> operator to test whether a geometry-valued property intersects a fixed bounding box
     */
    public static final native OGCBboxFilter create(String geometryName, Extent extent, String srsName) /*-{
        return new ol.format.ogc.filter.Bbox(geometryName, extent, srsName);
    }-*/;
    
        /**
     * Represents a <BBOX> operator to test whether a geometry-valued property intersects a fixed bounding box
     * @param geometryName Geometry name to use.
     * @param extent Extent.
     * @return Represents a <BBOX> operator to test whether a geometry-valued property intersects a fixed bounding box
     */
    public static final native OGCBboxFilter create(String geometryName, Extent extent) /*-{
        return new ol.format.ogc.filter.Bbox(geometryName, extent, srsName);
    }-*/;
}
