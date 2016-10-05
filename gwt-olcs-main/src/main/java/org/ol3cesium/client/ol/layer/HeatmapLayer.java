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
package org.ol3cesium.client.ol.layer;

import org.ol3cesium.client.olx.layer.HeatmapLayerOptions;
import com.google.gwt.core.client.JsArrayString;
import org.ol3cesium.client.ol.event.HeatmapLayerChangeEventListener;

/**
 * Layer for rendering vector data as a heatmap. Note that any property set in 
 * the options is set as a ol.Object property on the layer object; for example, 
 * setting title: 'My Title' in the options means that title is observable, 
 * and has get/set accessors.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class HeatmapLayer extends VectorLayer {
    protected HeatmapLayer() {
        //
    }
    
    public static native HeatmapLayer create() /*-{
        var heatmap = new ol.layer.Heatmap();
        heatmap.set('className', @org.ol3cesium.client.ol.layer.BaseLayer::HEATMAP_LAYER_CLASS_NAME);
        return heatmap;
    }-*/;
    
    public static native HeatmapLayer create(HeatmapLayerOptions options) /*-{
        var heatmap = new ol.layer.Heatmap(options);
        heatmap.set('className', @org.ol3cesium.client.ol.layer.BaseLayer::HEATMAP_LAYER_CLASS_NAME);
        return heatmap;
    }-*/;
    
    /**
     * Return the blur size in pixels.
     * @return Blur size in pixels.
     */
    public final native int getBlur() /*-{
        return this.getBlur();
    }-*/;

    /**
     * Return the gradient colors as array of strings.
     * @return Colors.
     */
    public final native JsArrayString getGradient() /*-{
        return this.getGradient();
    }-*/;

    /**
     * Return the size of the radius in pixels.
     * @return Radius size in pixel.
     */
    public final native int getRadius() /*-{
        return this.getRadius();
    }-*/;

    /**
     * Set the blur size in pixels.
     * @param blur Blur size in pixels.
     */
    public final native void setBlur(int blur) /*-{
        this.setBlur(blur);
    }-*/;

    /**
     * Set the gradient colors as array of strings.
     * @param colors Gradient.
     */
    public final native void setGradient(JsArrayString colors) /*-{
        this.setGradient(colors);
    }-*/;

    /**
     * Set the size of the radius in pixels.
     * @param radius Radius size in pixel.
     */
    public final native void setRadius(int radius) /*-{
        this.setRadius(radius);
    }-*/;
    
        public final native void addHeatmapLayerChangeEventListener(HeatmapLayerChangeEventListener heatmapLayerChangeEventListener) /*-{
        if (!this.__heatmapLayerChangeEventListenerRegistered) {
            var that = this;
            
            function createCallback(type) {
                return function(event) {
                    var _event = {type: type, layer: that, nativeEvent: event};
                    that.__notifyHeatmapLayerChangeEventListeners(_event);
                }
            }
            var types = ['blur', 'extent', 'gradient', 'maxResolution', 'minResolution', 'opacity', 'radius', 'source', 'visible', 'zIndex'];
            for (var i = 0; i < types.length; i++) {
                this.on('change:' + types[i], $entry(createCallback(types[i])), this);
            }
            
            this.__heatmapLayerChangeEventListenerRegistered = true;
            this.__heatmapLayerChangeEventListeners = [];
            this.__notifyHeatmapLayerChangeEventListeners = function(event) {
                var length = this.__heatmapLayerChangeEventListeners.length;
                for (var i = 0; i < length; i++) {
                    var listener = this.__heatmapLayerChangeEventListeners[i];
                    listener.@org.ol3cesium.client.ol.event.HeatmapLayerChangeEventListener::onHeatmapLayerChange(Lorg/ol3cesium/client/ol/event/HeatmapLayerChangeEvent;)(event);
                }
            };
        }
        this.__heatmapLayerChangeEventListeners.push(heatmapLayerChangeEventListener);
    }-*/;
    
    public final native void removeHeatmapLayerChangeEventListener(HeatmapLayerChangeEventListener heatmapLayerChangeEventListener) /*-{
        if (!this.__heatmapLayerChangeEventListeners) {
            return;
        }
        var index = this.__heatmapLayerChangeEventListeners.indexOf(heatmapLayerChangeEventListener);
        if (index > -1) {
            this.__heatmapLayerChangeEventListeners.splice(heatmapLayerChangeEventListener, 1);
        }
    }-*/;
}
