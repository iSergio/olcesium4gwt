/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.format.filter;

/**
 * Represents a <PropertyIsEqualTo> comparison operator.
 * @author iserge
 */
public class OGCEqualToFilter extends OGCComparisonBinaryFilter {
    protected OGCEqualToFilter() {
        //
    }
    
    /**
     * Represents a <PropertyIsEqualTo> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @param matchCase Case-sensitive?
     * @return comparison operator
     */
    public static final native OGCEqualToFilter create(String propertyName, String expression, boolean matchCase) /*-{
        return new ol.format.ogc.filter.EqualTo(propertyName, expression, matchCase);
    }-*/;
}
