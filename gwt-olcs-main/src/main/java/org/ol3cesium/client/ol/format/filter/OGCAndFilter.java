/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.format.filter;

/**
 * Represents a logical <And> operator between two filter conditions.
 * @author iserge
 */
public class OGCAndFilter extends OGCLogicalBinaryFilter {
    protected OGCAndFilter() {
        //
    }
    
    /**
     * 
     * @param conditionA First filter condition.
     * @param conditionB Second filter condition.
     * @return logical <And> operator between two filter conditions
     */
    public static final native OGCAndFilter create(OGCFilter conditionA, OGCFilter conditionB) /*-{
        return new ol.format.ogc.filter.And(conditionA, conditionB);
    }-*/;
}
