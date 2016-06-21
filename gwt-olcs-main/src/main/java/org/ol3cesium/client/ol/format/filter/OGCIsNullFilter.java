/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.format.filter;

/**
 * Represents a <PropertyIsNull> comparison operator.
 * @author iserge
 */
public class OGCIsNullFilter extends OGCComparisonFilter {
    protected OGCIsNullFilter() {
        //
    }
    
    /**
     * Represents a <PropertyIsNull> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @return Represents a <PropertyIsNull> comparison operator.
     */
    public static final native OGCIsNullFilter create(String propertyName) /*-{
        return new ol.format.ogc.filter.IsNull(propertyName);
    }-*/;
}
