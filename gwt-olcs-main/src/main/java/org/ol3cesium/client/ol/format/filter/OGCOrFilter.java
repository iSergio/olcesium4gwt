/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.format.filter;

/**
 * Represents a logical <Or> operator between two filter conditions.
 * @author iserge
 */
public class OGCOrFilter extends OGCLogicalBinaryFilter {
    protected OGCOrFilter() {
        //
    }
    
    /**
     * 
     * @param conditionA First filter condition.
     * @param conditionB Second filter condition.
     * @return logical <Or> operator between two filter conditions.
     */
    public static final native OGCOrFilter create(OGCFilter conditionA, OGCFilter conditionB) /*-{
        return new ol.format.ogc.filter.Or(conditionA, conditionB);
    }-*/;
}
