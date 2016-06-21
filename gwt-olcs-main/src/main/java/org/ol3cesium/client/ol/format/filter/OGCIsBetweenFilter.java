/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.format.filter;

/**
 * Represents a <PropertyIsBetween> comparison operator.
 * @author iserge
 */
public class OGCIsBetweenFilter extends OGCComparisonFilter {
    protected OGCIsBetweenFilter() {
        //
    }
    
    /**
     * Represents a <PropertyIsBetween> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param lowerBoundary The lower bound of the range.
     * @param upperBoundary The upper bound of the range.
     * @return Represents a <PropertyIsBetween> comparison operator.
     */
    public static final native OGCIsBetweenFilter create(String propertyName, double lowerBoundary, double upperBoundary) /*-{
        return new ol.format.ogc.filter.IsBetween(propertyName, lowerBoundary, upperBoundary);
    }-*/;
}
