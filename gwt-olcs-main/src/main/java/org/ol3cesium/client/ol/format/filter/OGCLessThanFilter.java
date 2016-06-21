/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.format.filter;

/**
 *
 * @author iserge
 */
public class OGCLessThanFilter extends OGCComparisonBinaryFilter {
    protected OGCLessThanFilter() {
        //
    }
    
    /**
     * Represents a <PropertyIsLessThan> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @return Represents a <PropertyIsLessThan> comparison operator.
     */
    public static final native OGCLessThanFilter create(String propertyName, double expression) /*-{
        return new ol.format.ogc.filter.LessThan(propertyName, expression);
    }-*/;
}
