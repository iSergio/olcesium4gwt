/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.format.filter;

/**
 * Abstract class; normally only used for creating subclasses and not instantiated 
 * in apps. Base class for WFS GetFeature property comparison filters.
 * @author iserge
 */
public class OGCComparisonFilter extends OGCFilter {
    protected OGCComparisonFilter() {
        //
    }
    
    /**
     * 
     * @param tagName The XML tag name for this filter.
     * @param propertyName Name of the context property to compare.
     * @return 
     */
    public static native OGCComparisonFilter create(String tagName, String propertyName) /*-{
        return new ol.format.ogc.filter.Comparison(tagName, propertyName);
    }-*/;
}
