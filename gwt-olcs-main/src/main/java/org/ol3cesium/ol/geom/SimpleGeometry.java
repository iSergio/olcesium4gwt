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
package org.ol3cesium.ol.geom;

import org.ol3cesium.ol.Coordinate;

/**
 * Abstract base class; only used for creating subclasses; do not instantiate 
 * in apps, as cannot be rendered.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class SimpleGeometry extends Geometry {
    protected SimpleGeometry() {
        //
    }
    
    // TODO
    //applyTransform(transformFn)
    
    /**
     * Return the first coordinate of the geometry.
     * @return First coordinate.
     */
    public native final Coordinate getFirstCoordinate() /*-{
        return this.getFirstCoordinate();
    }-*/;
    
    /**
     * Return the last coordinate of the geometry.
     * @return Last point.
     */
    public native final Coordinate getLastCoordinate() /*-{
        return this.getLastCoordinate();
    }-*/;
    
    /**
     * Return the layout of the geometry.
     * @return Layout.
     */
    public final GeometryLayout getLayout() {
        return GeometryLayout.fromString(getLayoutNative());
    }
    
    /**
     * Return the layout of the geometry.
     * @return Layout.
     */
    public native final String getLayoutNative() /*-{
        return this.getLayout();
    }-*/;
    
    /**
     * Translate the geometry. This modifies the geometry coordinates in place. 
     * If instead you want a new geometry, first clone() this geometry.
     * @param deltaX Delta X.
     * @param deltaY Delta Y.
     */
    public native final void translate(double deltaX, double deltaY) /*-{
        this.translate(deltaX, deltaY);
    }-*/;
}
