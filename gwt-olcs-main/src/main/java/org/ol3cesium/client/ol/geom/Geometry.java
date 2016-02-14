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

import org.ol3cesium.client.ol.Coordinate;
import org.ol3cesium.client.ol.Extent;
import org.ol3cesium.client.ol.Object;
import org.ol3cesium.client.ol.event.GeometryChangeEventListener;
import org.ol3cesium.client.ol.proj.Projection;

/**
 * Abstract base class; normally only used for creating subclasses and not 
 * instantiated in apps. Base class for vector geometries.
 * 
 * To get notified of changes to the geometry, register a listener for the 
 * generic change event on your geometry instance.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Geometry extends Object {
    protected Geometry() {
        //
    }
    
    public static native Geometry create() /*-{
        return new new ol.geom.Geometry();
    }-*/;
    
    /**
     * Return the closest point of the geometry to the passed point as coordinate.
     * @param point Point.
     * @return Closest point.
     */
    public final native Coordinate getClosestPoint(Coordinate point) /*-{
        return this.getClosestPoint(point);
    }-*/;
    
    /**
     * Return the closest point of the geometry to the passed point as coordinate.
     * @param point Point.
     * @param closestPoint Closest point.
     * @return Closest point.
     */
    public final native Coordinate getClosestPoint(Coordinate point, Coordinate closestPoint) /*-{
        return this.getClosestPoint(point, closestPoint);
    }-*/;

    /**
     * Get the extent of the geometry.
     * @return Extent.
     */
    public final native Extent getExtent() /*-{
        return this.getExtent();
    }-*/;

    /**
     * Get the extent of the geometry.
     * @param extent Extent.
     * @return Extent.
     */
    public final native Extent getExtent(Extent extent) /*-{
        return this.getExtent(extent);
    }-*/;
    
    /**
     * Create a simplified version of this geometry. For linestrings, this uses 
     * the the Douglas Peucker algorithm. For polygons, 
     * a quantization-based simplification is used to preserve topology.
     * @param tolerance The tolerance distance for simplification.
     * @return A new, simplified version of the original geometry.
     */
    public final native Geometry simplify(double tolerance) /*-{
        return this.simplify(tolerance);
    }-*/;
    
    /**
     * Transform each coordinate of the geometry from one coordinate reference 
     * system to another. The geometry is modified in place. 
     * For example, a line will be transformed to a line and a circle to a circle. 
     * If you do not want the geometry modified in place, first clone() it
     * and then use this function on the clone.
     * @param source The current projection.
     * @param destination The desired projection.
     * @return This geometry. Note that original geometry is modified in place.
     */
    public final native Geometry transform(Projection source, Projection destination) /*-{
        return this.transform(source, destination);
    }-*/;
    
    /**
     * Transform each coordinate of the geometry from one coordinate reference 
     * system to another. The geometry is modified in place. 
     * For example, a line will be transformed to a line and a circle to a circle. 
     * If you do not want the geometry modified in place, first clone() it
     * and then use this function on the clone.
     * @param source The current projection.
     * @param destination The desired projection.
     * @return This geometry. Note that original geometry is modified in place.
     */
    public final native Geometry transform(String source, String destination) /*-{
        return this.transform(source, destination);
    }-*/;
    
    public final GeometryType getType() {
        return GeometryType.fromString(getTypeNative());
    }
    
    public final native String getTypeNative() /*-{
        return this.getType();
    }-*/;
    
    public final native void addGeometryChangeEventListener(GeometryChangeEventListener geometryChangeEventListener) /*-{
        if (!this.__geometryChangeEventListenerRegistered) {
            var that = this;
            
            function createCallback(type) {
                return function(event) {
                    var _event = {type: type, target: event.target, nativeEvent: event};
                    that.__notifyGeometryChangeEventListeners(_event);
                }
            }
            var types = ['change'];
            for (var i = 0; i < types.length; i++) {
                this.on(types[i], $entry(createCallback(types[i])), this);
            }
            
            this.__geometryChangeEventListenerRegistered = true;
            this.__geometryChangeEventListeners = [];
            this.__notifyGeometryChangeEventListeners = function(event) {
                var length = this.__geometryChangeEventListeners.length;
                for (var i = 0; i < length; i++) {
                    var listener = this.__geometryChangeEventListeners[i];
                    listener.@org.ol3cesium.client.ol.event.GeometryChangeEventListener::onGeometryChange(Lorg/ol3cesium/client/ol/event/GeometryChangeEvent;)(event);
                }
            };
        }
        this.__geometryChangeEventListeners.push(geometryChangeEventListener);
    }-*/;
    
    public final native void removeGeometryChangeEventListener(GeometryChangeEventListener geometryChangeEventListener) /*-{
        var index = this.__geometryChangeEventListeners.indexOf(geometryChangeEventListener);
        if (index > -1) {
            this.__geometryChangeEventListeners.splice(geometryChangeEventListener, 1);
        }
    }-*/;
}
