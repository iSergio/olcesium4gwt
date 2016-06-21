/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.format.filter;

/**
 * Represents a <PropertyIsLessThanOrEqualTo> comparison operator.
 * @author iserge
 */
public class OGCLessThanOrEqualToFilter extends OGCComparisonBinaryFilter {
    protected OGCLessThanOrEqualToFilter() {
        //
    }
    
    /**
     * Represents a <PropertyIsLessThanOrEqualTo> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @return Represents a <PropertyIsLessThanOrEqualTo> comparison operator.
     */
    public static final native OGCLessThanOrEqualToFilter create(String propertyName, double expression) /*-{
        return new ol.format.ogc.filter.LessThanOrEqualTo(propertyName, expression);
    }-*/;
}
