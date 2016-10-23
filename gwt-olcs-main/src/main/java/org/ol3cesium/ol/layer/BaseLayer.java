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
package org.ol3cesium.ol.layer;

import org.ol3cesium.ol.Extent;
import org.ol3cesium.ol.Object;
import org.ol3cesium.ol.event.BaseLayerChangeEventListener;
import org.ol3cesium.olx.layer.BaseLayerOptions;

/**
 * Abstract base class; normally only used for creating subclasses and 
 * not instantiated in apps. Note that with ol.layer.Base and all its subclasses, 
 * any property set in the options is set as a ol.Object property on the layer 
 * object, so is observable, and has get/set accessors.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class BaseLayer extends Object {
    public static final String BASE_LAYER_CLASS_NAME        = "ol.layer.Base";
    public static final String GROUP_LAYER_CLASS_NAME       = "ol.layer.Group";
    public static final String HEATMAP_LAYER_CLASS_NAME     = "ol.layer.Heatmap";
    public static final String IMAGE_LAYER_CLASS_NAME       = "ol.layer.Image";
    public static final String LAYER_LAYER_CLASS_NAME       = "ol.layer.Layer";
    public static final String TILE_LAYER_CLASS_NAME        = "ol.layer.Tile";
    public static final String VECTOR_LAYER_CLASS_NAME      = "ol.layer.Vector";
    public static final String VECTOR_TILE_LAYER_CLASS_NAME = "ol.layer.VectorTile";
    
    
    protected BaseLayer() {
        //
    }
    
    public static native BaseLayer create() /*-{
        var base = new ol.layer.Base({});
        base.set('className', @org.ol3cesium.ol.layer.BaseLayer::BASE_LAYER_CLASS_NAME);
        return base;
    }-*/;
    
    public static native BaseLayer create(BaseLayerOptions options) /*-{
        var base = new ol.layer.Base(options);
        base.set('className', @org.ol3cesium.ol.layer.BaseLayer::BASE_LAYER_CLASS_NAME);
        return base;
    }-*/;
    
    public final native String getId() /*-{
        if (this.id === undefined) {
            var d = new Date().getTime();
            this.id = 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {
                var r = (d + Math.random()*16)%16 | 0;
                d = Math.floor(d/16);
                return (c=='x' ? r : (r&0x3|0x8)).toString(16);
            });
        }
        return this.id;
    }-*/;
    
    public final native String getClassName() /*-{
        return this.get('className');
    }-*/;
    
    public final LayerType getType() {
        return LayerType.fromString(this.getClassName());
    }
    
    /**
     * Return the extent of the layer or null if it will be visible regardless of extent
     * @return The layer extent
     */
    public final native Extent getExtent() /*-{
        return this.getExtent();
    }-*/;
    
    /**
     * Return the maximum resolution of the layer
     * @return The maximum resolution of the layer
     */
    public final native double getMaxResolution() /*-{
        return this.getMaxResolution();
    }-*/;
    
    /**
     * Return the minimum resolution of the layer
     * @return The minimum resolution of the layer
     */
    public final native double getMinResolution() /*-{
        return this.getMinResolution();
    }-*/;

    /**
     * Return the opacity of the layer (between 0 and 1)
     * @return The opacity of the layer
     */
    public final native float getOpacity() /*-{
        return this.getOpacity();
    }-*/;

    /**
     * Return the visibility of the layer (true or false)
     * @return The visibility of the layer
     */
    public final native boolean getVisible() /*-{
        return this.getVisible();
    }-*/;

    /**
     * Return the Z-index of the layer, which is used to order layers before rendering. The default Z-index is 0
     * @return The Z-index of the layer
     */
    public final native int getZIndex() /*-{
        return this.getZIndex();
    }-*/;
    
    /**
     * Set the extent at which the layer is visible. If undefined, the layer will be visible at all extents
     * @param extent The extent of the layer
     */
    public final native void setExtent(Extent extent) /*-{
        return this.setExtent(extent);
    }-*/;
    
    /**
     * Set the maximum resolution at which the layer is visible
     * @param maxResolution The maximum resolution of the layer
     */
    public final native void setMaxResolution(double maxResolution) /*-{
        this.setMaxResolution(maxResolution);
    }-*/;
    
    /**
     * Set the minimum resolution at which the layer is visible
     * @param minResolution The minimum resolution of the layer
     */
    public final native void setMinResolution(double minResolution) /*-{
        this.setMinResolution(minResolution);
    }-*/;

    /**
     * Set the opacity of the layer, allowed values range from 0 to 1
     * @param opacity The opacity of the layer
     */
    public final native void setOpacity(float opacity) /*-{
        this.setOpacity(opacity);
    }-*/;

    /**
     * Set the visibility of the layer (true or false)
     * @param visible The visibility of the layer
     */
    public final native void setVisible(boolean visible) /*-{
        this.setVisible(visible);
    }-*/;
    
    /**
     * Set Z-index of the layer, which is used to order layers before rendering. The default Z-index is 0
     * @param zIndex The z-index of the layer
     */
    public final native void setZIndex(int zIndex) /*-{
        this.setZIndex(zIndex);
    }-*/;
    
    public final native void addBaseLayerChangeEventListener(BaseLayerChangeEventListener baseLayerChangeEventListener) /*-{
        if (!this.__baseLayerChangeEventListenerRegistered) {
            var that = this;
            
            function createCallback(type) {
                return function(event) {
                    var _event = {type: type, layer: that, nativeEvent: event};
                    that.__notifyBaseLayerChangeEventListeners(_event);
                }
            }
            var types = ['extent', 'maxResolution', 'minResolution', 'opacity', 'visible', 'zIndex'];
            for (var i = 0; i < types.length; i++) {
                this.on('change:' + types[i], $entry(createCallback(types[i])), this);
            }
            
            this.__baseLayerChangeEventListenerRegistered = true;
            this.__baseLayerChangeEventListeners = [];
            this.__notifyBaseLayerChangeEventListeners = function(event) {
                var length = this.__baseLayerChangeEventListeners.length;
                for (var i = 0; i < length; i++) {
                    var listener = this.__baseLayerChangeEventListeners[i];
                    listener.@org.ol3cesium.ol.event.BaseLayerChangeEventListener::onBaseLayerChange(Lorg/ol3cesium/ol/event/BaseLayerChangeEvent;)(event);
                }
            };
        }
        this.__baseLayerChangeEventListeners.push(baseLayerChangeEventListener);
    }-*/;
    
    public final native void removeBaseLayerChangeEventListener(BaseLayerChangeEventListener baseLayerChangeEventListener) /*-{
        if (!this.__baseLayerChangeEventListeners) {
            return;
        }
        var index = this.__baseLayerChangeEventListeners.indexOf(baseLayerChangeEventListener);
        if (index > -1) {
            this.__baseLayerChangeEventListeners.splice(baseLayerChangeEventListener, 1);
        }
    }-*/;
}
