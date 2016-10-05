/*
 * Copyright 2016 iserge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ol3cesium.client.ol.format.filter;

import org.ol3cesium.client.ol.Object;
import org.ol3cesium.client.ol.Extent;
import org.ol3cesium.client.ol.geom.Geometry;

/**
 * This namespace contains convenience functions to create filters for ol.format.WFS#writeGetFeature.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OGCFilter extends Object {
    protected OGCFilter() {
        //
    }
    
    /**
     * Abstract class; normally only used for creating subclasses and not instantiated in apps. 
     * Base class for WFS GetFeature filters.
     * @param tagName The XML tag name for this filter.
     * @return Abstract class
     */
    public static native OGCFilter create(String tagName) /*-{
        return new ol.format.ogc.filter.Filter(tagName);
    }-*/;
    
    /**
     * Create a logical <And> operator between two filter conditions.
     * @param conditionA First filter condition.
     * @param conditionB Second filter condition.
     * @return <And> operator.
     */
    public static native OGCAndFilter and(OGCFilter conditionA, OGCFilter conditionB) /*-{
        return new ol.format.ogc.filter.and(conditionA, conditionB);
    }-*/;
    
    /**
     * Create a <BBOX> operator to test whether a geometry-valued property intersects a fixed bounding box
     * @param geometryName Geometry name to use.
     * @param extent Extent.
     * @return <BBOX> operator.
     */
    public static native OGCBboxFilter bbox(String geometryName, Extent extent) /*-{
        return new ol.format.ogc.filter.bbox(geometryName, extent);
    }-*/;
    
    /**
     * Create a <BBOX> operator to test whether a geometry-valued property intersects a fixed bounding box
     * @param geometryName Geometry name to use.
     * @param extent Extent.
     * @param srsName SRS name. No srsName attribute will be set on geometries when this is not provided.
     * @return <BBOX> operator.
     */
    public static native OGCBboxFilter bbox(String geometryName, Extent extent, String srsName) /*-{
        return new ol.format.ogc.filter.bbox(geometryName, extent, srsName);
    }-*/;

    /**
     * Creates a <PropertyIsBetween> comparison operator to test whether an expression value 
     * lies within a range given by a lower and upper bound (inclusive).
     * @param propertyName Name of the context property to compare.
     * @param lowerBoundary The lower bound of the range.
     * @param upperBoundary The upper bound of the range.
     * @return <PropertyIsBetween> operator.
     */
    public static native OGCBboxFilter between(String propertyName, double lowerBoundary, double upperBoundary) /*-{
        return new ol.format.ogc.filter.between(propertyName, lowerBoundary, upperBoundary);
    }-*/;

    /**
     * Creates a <PropertyIsEqualTo> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @return <PropertyIsEqualTo> operator.
     */
    public static native OGCEqualToFilter equalTo(String propertyName, String expression) /*-{
        return new ol.format.ogc.filter.equalTo(propertyName, expression);
    }-*/;


    /**
     * Creates a <PropertyIsEqualTo> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @param matchCase Case-sensitive?
     * @return <PropertyIsEqualTo> operator.
     */
    public static native OGCEqualToFilter equalTo(String propertyName, String expression, boolean matchCase) /*-{
        return new ol.format.ogc.filter.equalTo(propertyName, expression, matchCase);
    }-*/;
    
    /**
     * Creates a <PropertyIsGreaterThan> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @return <PropertyIsGreaterThan> operator.
     */
    public static native OGCGreaterThanFilter greaterThan(String propertyName, double expression) /*-{
        return new ol.format.ogc.filter.greaterThan(propertyName, expression);
    }-*/;
 
    /**
     * Creates a <PropertyIsGreaterThanOrEqualTo> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @return <PropertyIsGreaterThanOrEqualTo> operator. 
     */
    public static native OGCGreaterThanOrEqualToFilter greaterThanOrEqualTo(String propertyName, double expression) /*-{
        return new ol.format.ogc.filter.greaterThanOrEqualTo(propertyName, expression);
    }-*/;

    /**
     * Creates a <PropertyIsNull> comparison operator to test whether a property value is null.
     * @param propertyName Name of the context property to compare.
     * @return <PropertyIsNull> operator.
     */
    public static native OGCIsNullFilter isNull(String propertyName) /*-{
        return new ol.format.ogc.filter.isNull(propertyName);
    }-*/;
 
    /**
     * Creates a <PropertyIsLessThan> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @return <PropertyIsLessThan> operator.
     */
    public static native OGCLessThanFilter lessThan(String propertyName, double expression) /*-{
        return new ol.format.ogc.filter.lessThan(propertyName, expression);
    }-*/;
 
    /**
     * Creates a <PropertyIsLessThanOrEqualTo> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @return <PropertyIsLessThanOrEqualTo> operator.
     */
    public static native OGCLessThanOrEqualToFilter lessThanOrEqualTo(String propertyName, double expression) /*-{
        return new ol.format.ogc.filter.lessThanOrEqualTo(propertyName, expression);
    }-*/;
    
    /**
     * Represents a <PropertyIsLike> comparison operator that matches a string property value against a text pattern.
     * @param propertyName Name of the context property to compare.
     * @param pattern Text pattern.
     * @return <PropertyIsLike> operator.
     */
    public static native OGCIsLikeFilter like(String propertyName, String pattern) /*-{
        return new ol.format.ogc.filter.like(propertyName, pattern);
    }-*/;

    /**
     * Represents a <PropertyIsLike> comparison operator that matches a string property value against a text pattern.
     * @param propertyName Name of the context property to compare.
     * @param pattern Text pattern.
     * @param wildCard Pattern character which matches any sequence of zero or more string characters. Default is '*'.
     * @param singleChar pattern character which matches any single string character. Default is '.'.
     * @param escapeChar Escape character which can be used to escape the pattern characters. Default is '!'.
     * @param matchCase Case-sensitive?
     * @return <PropertyIsLike> operator.
     */
    public static native OGCIsLikeFilter like(String propertyName, String pattern, String wildCard, String singleChar, String escapeChar, boolean matchCase) /*-{
        return new ol.format.ogc.filter.like(propertyName, pattern, wildCard, singleChar, escapeChar, matchCase);
    }-*/;
    
    /**
     * Creates a <PropertyIsNotEqualTo> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @return <PropertyIsNotEqualTo> operator.
     */
    public static native OGCNotEqualToFilter notEqualTo(String propertyName, String expression) /*-{
        return new ol.format.ogc.filter.notEqualTo(propertyName, expression);
    }-*/;
    
    /**
     * Creates a <PropertyIsNotEqualTo> comparison operator.
     * @param propertyName Name of the context property to compare.
     * @param expression The value to compare.
     * @param matchCase Case-sensitive?
     * @return <PropertyIsNotEqualTo> operator.
     */
    public static native OGCNotEqualToFilter notEqualTo(String propertyName, String expression, boolean matchCase) /*-{
        return new ol.format.ogc.filter.notEqualTo(propertyName, expression, matchCase);
    }-*/;
 
    /**
     * Create a logical <Or> operator between two filter conditions.
     * @param conditionA First filter condition.
     * @param conditionB Second filter condition.
     * @return <Or> operator.
     */
    public static native OGCOrFilter or(OGCFilter conditionA, OGCFilter conditionB) /*-{
        return new ol.format.ogc.filter.or(conditionA, conditionB);
    }-*/;
    
    /**
     * Create a <Intersects> operator to test whether a geometry-valued property intersects a given geometry.
     * @param geometryName Geometry name to use.
     * @param geometry Geometry.
     * @param srsName SRS name. No srsName attribute will be set on geometries when this is not provided.
     * @return <Intersects> operator.
     */
    public static native OGCIntersectsFilter intersects(String geometryName, Geometry geometry, String srsName) /*-{
        return ol.format.ogc.filter.intersects(geometryName, geometry, srsName);
    }-*/;
    
    /**
     * Create a <Within> operator to test whether a geometry-valued property is within a given geometry.
     * @param geometryName Geometry name to use.
     * @param geometry Geometry.
     * @return <Within> operator.
     */
    public static native OGCWithinFilter within(String geometryName, Geometry geometry) /*-{
        return new ol.format.ogc.filter.within(geometryName, geometry);
    }-*/;
    
    /**
     * Create a <Within> operator to test whether a geometry-valued property is within a given geometry.
     * @param geometryName Geometry name to use.
     * @param geometry Geometry.
     * @param srsName SRS name. No srsName attribute will be set on geometries when this is not provided.
     * @return <Within> operator.
     */
    public static native OGCWithinFilter within(String geometryName, Geometry geometry, String srsName) /*-{
        return new ol.format.ogc.filter.within(geometryName, geometry, srsName);
    }-*/;
}
