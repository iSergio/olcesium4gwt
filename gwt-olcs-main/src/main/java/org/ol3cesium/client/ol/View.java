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
package org.ol3cesium.client.ol;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import org.ol3cesium.client.ol.event.ViewChangeEventListener;
import org.ol3cesium.client.ol.geom.SimpleGeometry;
import org.ol3cesium.client.ol.proj.Projection;
import org.ol3cesium.client.olx.ViewOptions;

/**
 * An ol.View object represents a simple 2D view of the map.
 * 
 * This is the object to act upon to change the center, resolution, and rotation of the map.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class View extends Object {
    protected View() {
        //
    }
    
    public static final native View create() /*-{
        return new ol.View({});
    }-*/;
    
    public static final native View create(ViewOptions options) /*-{
        var view = new ol.View(options);
        return view;
    }-*/;
    
    /**
     * Calculate the extent for the current view state and the passed size. 
     * The size is the pixel dimensions of the box into which the calculated 
     * extent should fit. In most cases you want to get the extent of the 
     * entire map, that is map.getSize().
     * @param size Box pixel size.
     * @return 
     */
    public final native Extent calculateExtent(Size size) /*-{
        return this.calculateExtent(size);
    }-*/;
    
    /**
     * Center on coordinate and view position.
     * @param coordinate Coordinate.
     * @param size Box pixel size.
     * @param position Position on the view to center on.
     */
    public final native void centerOn(Coordinate coordinate, Size size, Pixel position) /*-{
        this.centerOn(coordinate, size, position);
    }-*/;
    
    /**
     * Get the constrained center of this view.
     * @param center Center.
     * @return Constrained center.
     */
    public final native Coordinate constrainCenter(Coordinate center) /*-{
        return this.constrainCenter(center);
    }-*/;
    
    /**
     * Get the constrained resolution of this view.
     * @param resolution Resolution.
     * @return 
     */
    public final native double constrainResolution(double resolution) /*-{
        return this.constrainResolution(resolution);
    }-*/;
    
    /**
     * Get the constrained resolution of this view.
     * @param resolution Resolution.
     * @param delta Delta. Default is 0.
     * @return 
     */
    public final native double constrainResolution(double resolution, double delta) /*-{
        return this.constrainResolution(resolution, delta);
    }-*/;
    
    /**
     * Get the constrained resolution of this view.
     * @param resolution Resolution.
     * @param delta Delta. Default is 0.
     * @param direction Direction. Default is 0.
     * @return 
     */
    public final native double constrainResolution(double resolution, double delta, double direction) /*-{
        return this.constrainResolution(resolution, delta, direction);
    }-*/;
    
    /**
     * Get the constrained rotation of this view.
     * @param rotation Rotation.
     * @return 
     */
    public final native double constrainRotation(double rotation) /*-{
        return this.constrainRotation(rotation);
    }-*/;
    
    /**
     * Get the constrained rotation of this view.
     * @param rotation Rotation.
     * @param delta Delta. Default is 0.
     * @return 
     */
    public final native double constrainRotation(double rotation, double delta) /*-{
        return this.constrainRotation(rotation, delta);
    }-*/;
    
    /**
     * Fit the given geometry or extent based on the given map size and border. 
     * The size is pixel dimensions of the box to fit the extent into. 
     * In most cases you will want to use the map size, that is map.getSize(). 
     * Takes care of the map angle.
     * @param geometry Geometry.
     * @param size Box pixel size.
     */
    public final native void fit(SimpleGeometry geometry, Size size) /*-{
        this.fit(geometry, size);
    }-*/;
    
    /**
     * Fit the given geometry or extent based on the given map size and border. 
     * The size is pixel dimensions of the box to fit the extent into. 
     * In most cases you will want to use the map size, that is map.getSize(). 
     * Takes care of the map angle.
     * @param geometry Geometry.
     * @param size Box pixel size.
     * @param options
     */
    public final native void fit(SimpleGeometry geometry, Size size, FitOptions options) /*-{
        this.fit(geometry, size, options);
    }-*/;
    
    /**
     * Get the view center.
     * @return The center of the view.
     */
    public final native Coordinate getCenter() /*-{
        return this.getCenter();
    }-*/;
    
    /**
     * Get the view projection.
     * @return The projection of the view.
     */
    public final native Projection getProjection() /*-{
        return this.getProjection();
    }-*/;
    
    /**
     * Get the view resolution.
     * @return The resolution of the view.
     */
    public final native double getResolution() /*-{
        return this.getResolution();
    }-*/;
    
    /**
     * Get the view rotation.
     * @return The rotation of the view in radians.
     */
    public final native double getRotation() /*-{
        return this.getRotation();
    }-*/;
    
    /**
     * Get the current zoom level. Return undefined if the current 
     * resolution is undefined or not a "constrained resolution".
     * @return Zoom.
     */
    public final native int getZoom() /*-{
        return this.getZoom();
    }-*/;
    
    /**
     * Rotate the view around a given coordinate.
     * @param rotation New rotation value for the view.
     */
    public final native void rotate(double rotation) /*-{
        this.rotate(rotation);
    }-*/;
    
    /**
     * Rotate the view around a given coordinate.
     * @param rotation New rotation value for the view.
     * @param anchor The rotation center.
     */
    public final native void rotate(double rotation, Coordinate anchor) /*-{
        this.rotate(rotation, anchor);
    }-*/;
    
    /**
     * Set the center of the current view.
     * @param center The center of the view.
     */
    public final native void setCenter(Coordinate center) /*-{
        this.setCenter(center);
    }-*/;
    
    /**
     * Set the resolution for this view.
     * @param resolution The resolution of the view.
     */
    public final native void setResolution(double resolution) /*-{
        this.setResolution(resolution);
    }-*/;
    
    /**
     * Set the rotation for this view.
     * @param rotation The rotation of the view in radians.
     */
    public final native void setRotation(double rotation) /*-{
        this.setRotation(rotation);
    }-*/;
    
    /**
     * Zoom to a specific zoom level.
     * @param zoom Zoom level.
     */
    public final native void setZoom(int zoom) /*-{
        this.setZoom(zoom);
    }-*/;
    
    public final native void addViewChangeEventListener(ViewChangeEventListener viewChangeEventListener) /*-{
        if (!this.__viewChangeEventListenerRegistered) {
            var that = this;
            
            function createCallback(type) {
                return function(event) {
                    var _event = {type: type, center: event.target.get(event.key), resolution: event.target.get(event.key), rotation: event.target.get(event.key), nativeEvent: event};
                    that.__notifyViewChangeEventListeners(_event);
                }
            }
            var types = ['center', 'resolution', 'rotation'];
            for (var i = 0; i < types.length; i++) {
                this.on('change:' + types[i], $entry(createCallback(types[i])), this);
            }
            
            this.__viewChangeEventListenerRegistered = true;
            this.__viewChangeEventListeners = [];
            this.__notifyViewChangeEventListeners = function(event) {
                var length = this.__viewChangeEventListeners.length;
                for (var i = 0; i < length; i++) {
                    var listener = this.__viewChangeEventListeners[i];
                    listener.@org.ol3cesium.client.ol.event.ViewChangeEventListener::onViewChange(Lorg/ol3cesium/client/ol/event/ViewChangeEvent;)(event);
                }
            };
        }
        this.__viewChangeEventListeners.push(viewChangeEventListener);
    }-*/;

    public static class FitOptions extends JavaScriptObject {
        protected FitOptions() {
            //
        }
        
        public static final native FitOptions create() /*-{
            return {};
        }-*/;
        
        /**
         * Padding (in pixels) to be cleared inside the view. 
         * Values in the array are top, right, bottom and left padding. 
         * Default is [0, 0, 0, 0]. Required.
         * @param padding 
         */
        public final native void setPadding(JsArrayNumber padding) /*-{
            this.padding = padding;
        }-*/;
        
        /**
         * Constrain the resolution. Default is true.
         * @param constrainResolution 
         */
        public final native void setConstrainResolution(boolean constrainResolution) /*-{
            this.constrainResolution = constrainResolution;
        }-*/;
        
        /**
         * Get the nearest extent. Default is false.
         * @param nearest 
         */
        public final native void setNearest(boolean nearest) /*-{
            this.nearest = nearest;
        }-*/;
        
        /**
         * Minimum resolution that we zoom to. Default is 0.
         * @param minResolution 
         */
        public final native void setMinResolution(double minResolution) /*-{
            this.minResolution = minResolution;
        }-*/;
        
        /**
         * Maximum zoom level that we zoom to. If minResolution is given, this property is ignored.
         * @param maxZoom 
         */
        public final native void setMaxZoom(int maxZoom) /*-{
            this.maxZoom = maxZoom;
        }-*/;
    }
}
