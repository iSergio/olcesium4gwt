/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.format.filter;

/**
 * Represents a <PropertyIsLike> comparison operator.
 * @author iserge
 */
public class OGCIsLikeFilter extends OGCComparisonFilter {
    protected OGCIsLikeFilter() {
        //
    }
    
    /**
     * Represents a <PropertyIsLike> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param pattern Text pattern.
     * @param wildCard Pattern character which matches any sequence of zero or more string characters. Default is '*'.
     * @param singleChar pattern character which matches any single string character. Default is '.'.
     * @param escapeChar Escape character which can be used to escape the pattern characters. Default is '!'.
     * @param matchCase Case-sensitive?
     * @return Represents a <PropertyIsLike> comparison operator.
     */
    public static final native OGCIsLikeFilter create(String propertyName, String pattern, String wildCard, String singleChar, String escapeChar, boolean matchCase) /*-{
        return new ol.format.ogc.filter.IsLike(propertyName, pattern, wildCard, singleChar, escapeChar, matchCase);
    }-*/;
    
    /**
     * Represents a <PropertyIsLike> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param pattern Text pattern.
     * @return Represents a <PropertyIsLike> comparison operator.
     */
    public static final native OGCIsLikeFilter create(String propertyName, String pattern) /*-{
        return new ol.format.ogc.filter.IsLike(propertyName, pattern, wildCard, singleChar, escapeChar, matchCase);
    }-*/;
}
