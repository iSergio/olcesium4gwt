/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.format.filter;

/**
 * Represents a logical <Not> operator for a filter condition.
 * @author iserge
 */
public class OGCNotFilter extends OGCLogicalFilter {
    protected OGCNotFilter() {
        //
    }
    
    /**
     * Represents a logical <Not> operator for a filter condition.
     * @param condition Filter condition.
     * @return logical <Not> operator for a filter condition.
     */
    public static final native OGCNotFilter create(OGCFilter condition) /*-{
        return new ol.format.ogc.filter.Not(condition);
    }-*/;
}
