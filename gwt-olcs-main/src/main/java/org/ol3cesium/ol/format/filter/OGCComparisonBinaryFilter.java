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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.ol.format.filter;

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
    public static native OGCComparisonBinaryFilter create(String tagName, String propertyName, String expression, boolean matchCase) /*-{
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
    public static native OGCComparisonBinaryFilter create(String tagName, String propertyName, String expression) /*-{
        return new ol.format.ogc.filter.ComparisonBinary(tagName, propertyName, expression);
    }-*/;
}
