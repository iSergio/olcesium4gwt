/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.format.filter;

/**
 * Represents a <PropertyIsGreaterThanOrEqualTo> comparison operator.
 * @author iserge
 */
public class OGCGreaterThanOrEqualToFilter extends OGCComparisonBinaryFilter {
    protected OGCGreaterThanOrEqualToFilter() {
        //
    }
    
    /**
     * Represents a <PropertyIsGreaterThanOrEqualTo> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @return 
     */
    public static final native OGCGreaterThanOrEqualToFilter create(String propertyName, double expression) /*-{
        return new ol.format.ogc.filter.GreaterThanOrEqualTo(propertyName, expression);
    }-*/;
}
