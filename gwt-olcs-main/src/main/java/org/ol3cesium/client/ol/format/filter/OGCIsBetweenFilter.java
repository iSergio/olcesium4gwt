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
    public static native OGCIsBetweenFilter create(String propertyName, double lowerBoundary, double upperBoundary) /*-{
        return new ol.format.ogc.filter.IsBetween(propertyName, lowerBoundary, upperBoundary);
    }-*/;
}
