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
public class OGCComparisonBinaryFilter extends OGCComparisonFilter {
    protected OGCComparisonBinaryFilter() {
        //
    }
    
    /**
     * Abstract class; normally only used for creating subclasses and not instantiated in apps. 
     * Base class for WFS GetFeature property binary comparison filters.
     * @param tagName The XML tag name for this filter.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @param matchCase Case-sensitive?
     * @return 
     */
    public static final native OGCComparisonBinaryFilter create(String tagName, String propertyName, String expression, boolean matchCase) /*-{
        return new ol.format.ogc.filter.ComparisonBinary(tagName, propertyName, expression, matchCase);
    }-*/;
    
    /**
     * Abstract class; normally only used for creating subclasses and not instantiated in apps. 
     * Base class for WFS GetFeature property binary comparison filters.
     * @param tagName The XML tag name for this filter.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @return 
     */
    public static final native OGCComparisonBinaryFilter create(String tagName, String propertyName, String expression) /*-{
        return new ol.format.ogc.filter.ComparisonBinary(tagName, propertyName, expression);
    }-*/;
}
