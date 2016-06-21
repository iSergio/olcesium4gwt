/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.format.filter;

/**
 * Represents a <PropertyIsGreaterThan> comparison operator.
 * @author iserge
 */
public class OGCGreaterThanFilter extends OGCComparisonBinaryFilter {
    protected OGCGreaterThanFilter() {
        //
    }
    
    /**
     * Represents a <PropertyIsGreaterThan> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @return Represents a <PropertyIsGreaterThan> comparison operator.
     */
    public static final native OGCGreaterThanFilter create(String propertyName, double expression) /*-{
        return new new ol.format.ogc.filter.GreaterThan(propertyName, expression);
    }-*/;
}
