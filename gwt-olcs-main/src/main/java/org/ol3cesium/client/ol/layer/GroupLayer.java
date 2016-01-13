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
package org.ol3cesium.client.ol.layer;

import org.ol3cesium.client.olx.layer.GroupLayerOptions;
import org.ol3cesium.client.ol.Collection;
import org.ol3cesium.client.ol.event.GroupLayerChangeEventListener;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class GroupLayer extends BaseLayer {
    protected GroupLayer() {
        //
    }
    
    public static final native GroupLayer create() /*-{
        var group = new ol.layer.Group();
        group.set('className', @org.ol3cesium.client.ol.layer.BaseLayer::GROUP_LAYER_CLASS_NAME);
        return group;
    }-*/;
    
    public static final native GroupLayer create(GroupLayerOptions options) /*-{
        var group = new ol.layer.Group(options);
        group.set('className', @org.ol3cesium.client.ol.layer.BaseLayer::GROUP_LAYER_CLASS_NAME);
        return group;
    }-*/;
    
    /**
     * Returns the collection of layers in this group.
     * @return Collection of layers that are part of this group.
     */
    public final native Collection<BaseLayer> getLayers() /*-{
        return this.getLayers();
    }-*/;
    
    /**
     * Set the collection of layers in this group.
     * @param layers Collection of layers that are part of this group.
     */
    public final native void setLayers(Collection<BaseLayer> layers) /*-{
        this.setLayers(layers);
    }-*/;
    
//    public final native void addGroupLayerChangeEventListener(GroupLayerChangeEventListener groupLayerChangeEventListener) /*-{
//        if (!this.__groupLayerChangeEventListenerRegistered) {
//            var that = this;
//            
//            function createCallback(type) {
//                return function(event) {
//                    var _event = {type: type, layer: that, nativeEvent: event};
//                    that.__notifyGroupLayerChangeEventListeners(_event);
//                }
//            }
//            var types = ['extent', 'layers', 'maxResolution', 'minResolution', 'opacity', 'visible', 'zIndex'];
//            for (var i = 0; i < types.length; i++) {
//                this.on('change:' + types[i], $entry(createCallback(types[i])), this);
//            }
//            
//            this.__groupLayerChangeEventListenerRegistered = true;
//            this.__groupLayerChangeEventListeners = [];
//            this.__notifyGroupLayerChangeEventListeners = function(event) {
//                var length = this.__groupLayerChangeEventListeners.length;
//                for (var i = 0; i < length; i++) {
//                    var listener = this.__groupLayerChangeEventListeners[i];
//                    listener.@org.ol3cesium.client.ol.event.GroupLayerChangeEventListener::onGroupLayerChange(Lorg/ol3cesium/client/ol/event/GroupLayerChangeEvent;)(event);
//                }
//            };
//        }
//        this.__groupLayerChangeEventListeners.push(groupLayerChangeEventListener);
//    }-*/;
    
    public final native void removeGroupLayerChangeEventListener(GroupLayerChangeEventListener groupLayerChangeEventListener) /*-{
        var index = this.__groupLayerChangeEventListeners.indexOf(groupLayerChangeEventListener);
        if (index > -1) {
            this.__groupLayerChangeEventListeners.splice(groupLayerChangeEventListener, 1);
        }
    }-*/;
}
