/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.format.filter;

/**
 * Represents a <PropertyIsNotEqualTo> comparison operator.
 * @author iserge
 */
public class OGCNotEqualToFilter extends OGCComparisonBinaryFilter {
    protected OGCNotEqualToFilter() {
        //
    }
    
    /**
     * Represents a <PropertyIsNotEqualTo> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @param matchCase Case-sensitive?
     * @return Represents a <PropertyIsNotEqualTo> comparison operator.
     */
    public static final native OGCNotEqualToFilter create(String propertyName, String expression, boolean matchCase) /*-{
        return new ol.format.ogc.filter.NotEqualTo(propertyName, expression, matchCase);
    }-*/;
}
