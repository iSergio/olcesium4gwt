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
package org.ol3cesium.ol.style;

import org.ol3cesium.olx.style.CircleStyleOptions;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class CircleStyle extends ImageStyle {
    protected CircleStyle() {
        //
    }
    
    public static native CircleStyle create() /*-{
        return new ol.style.Circle();
    }-*/;
    
    public static native CircleStyle create(CircleStyleOptions options) /*-{
        return new ol.style.Circle(options);
    }-*/;
    
    /**
     * Get the fill style.
     * @return Fill style.
     */
    public final native FillStyle getFill() /*-{
        return this.getFill();
    }-*/;
    
    /**
     * Get the circle radius.
     * @return Radius.
     */
    public final native int getRadius() /*-{
        return this.getRadius();
    }-*/;
    
    /**
     * Get the stroke style.
     * @return Stroke style. 
     */
    public final native StrokeStyle getStroke() /*-{
        return this,getStroke();
    }-*/;
}
