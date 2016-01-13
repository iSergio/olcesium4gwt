/* 
 * Copyright 2016 iserge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ol3cesium.client.ol.geom;

import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.Extent;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class GeometryCollection extends Geometry {
    protected GeometryCollection() {
        //
    }
    
    public static final native GeometryCollection create() /*-{
        return new ol.geom.GeometryCollection();
    }-*/;
    
    public static final native GeometryCollection create(JsArray<Geometry> geometries) /*-{
        return new ol.geom.GeometryCollection(geometries);
    }-*/;
    
    /**
     * Make a complete copy of the geometry.
     * @return Clone.
     */
    public final native GeometryCollection clone() /*-{
        return this.clone();
    }-*/;
    
    /**
     * Return the geometries that make up this geometry collection.
     * @return Geometries.
     */
    public final native JsArray<Geometry> getGeometries() /*-{
        return this.getGeometries();
    }-*/;
    
    /**
     * Test if the geometry and the passed extent intersect.
     * @param extent Extent.
     * @return true if the geometry and the extent intersect.
     */
    public final native boolean intersectsExtent(Extent extent) /*-{
        return this.intersectsExtent(extent);
    }-*/;
    
    /**
     * Set the geometries that make up this geometry collection.
     * @param geometries Geometries.
     */
    public final native void setGeometries(JsArray<Geometry> geometries) /*-{
        this.setGeometries(geometries);
    }-*/;
    
    /**
     * Translate the geometry.
     * @param deltaX Delta X.
     * @param deltaY Delta Y.
     */
    public final native void translate(double deltaX, double deltaY) /*-{
        this.translate(deltaX, deltaY);
    }-*/;
}
