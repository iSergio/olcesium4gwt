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

import org.ol3cesium.ol.Map;
import org.ol3cesium.ol.event.LayerChangeEventListener;
import org.ol3cesium.ol.source.Source;
import org.ol3cesium.olx.layer.LayerOptions;

/**
 * Abstract base class; normally only used for creating subclasses and not 
 * instantiated in apps. A visual representation of raster or vector map data. 
 * Layers group together those properties that pertain to how the data is to be 
 * displayed, irrespective of the source of that data.
 * 
 * Layers are usually added to a map with ol.Map#addLayer. Components like 
 * ol.interaction.Select use unmanaged layers internally. These unmanaged 
 * layers are associated with the map using ol.layer.Layer#setMap instead.
 * 
 * A generic change event is fired when the state of the source changes.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public abstract class Layer extends BaseLayer {
    protected Layer() {
        //
    }
    
    public static native Layer create(LayerOptions options) /*-{
        var layer = new ol.layer.Layer();
        layer.set('className', @org.ol3cesium.ol.layer.BaseLayer::LAYER_LAYER_CLASS_NAME);
        return layer;
    }-*/;
    
    /**
     * Get the layer source.
     * @return The layer source (or null if not yet set).
     */
    public final native Source getSource() /*-{
        return this.getSource();
    }-*/;
    
    /**
     * Sets the layer to be rendered on top of other layers on a map.
     * The map will not manage this layer in its layers collection, and the callback in ol.Map#forEachLayerAtPixel will receive null as layer.
     * This is useful for temporary layers. To remove an unmanaged layer from the map, use #setMap(null).
     * To add the layer to a map and have it managed by the map, use ol.Map#addLayer instead.
     * @param map Map
     */
    public final native void setMap(Map map) /*-{
        this.setMap(map);
    }-*/;
    
    public final native void setSource(Source source) /*-{
        this.setSource(source);
    }-*/;
    
    public final native void addLayerChangeEventListener(LayerChangeEventListener layerChangeEventListener) /*-{
        if (!this.__layerChangeEventListenerRegistered) {
            var that = this;
            
            function createCallback(type) {
                return function(event) {
                    var _event = {type: type, layer: that, nativeEvent: event};
                    that.__notifyLayerChangeEventListeners(_event);
                }
            }
            var types = ['extent', 'maxResolution', 'minResolution', 'opacity', 'source', 'visible', 'zIndex'];
            for (var i = 0; i < types.length; i++) {
                this.on('change:' + types[i], $entry(createCallback(types[i])), this);
            }
            
            this.__layerChangeEventListenerRegistered = true;
            this.__layerChangeEventListeners = [];
            this.__notifyLayerChangeEventListeners = function(event) {
                var length = this.__layerChangeEventListeners.length;
                for (var i = 0; i < length; i++) {
                    var listener = this.__layerChangeEventListeners[i];
                    listener.@org.ol3cesium.ol.event.LayerChangeEventListener::onLayerChange(Lorg/ol3cesium/ol/event/LayerChangeEvent;)(event);
                }
            };
        }
        this.__layerChangeEventListeners.push(layerChangeEventListener);
    }-*/;
    
    public final native void removeLayerChangeEventListener(LayerChangeEventListener layerChangeEventListener) /*-{
        if (!this.__layerChangeEventListeners) {
            return;
        }
        var index = this.__layerChangeEventListeners.indexOf(layerChangeEventListener);
        if (index > -1) {
            this.__layerChangeEventListeners.splice(layerChangeEventListener, 1);
        }
    }-*/;
}
