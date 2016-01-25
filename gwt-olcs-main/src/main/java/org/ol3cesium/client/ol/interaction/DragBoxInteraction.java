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
package org.ol3cesium.client.ol.interaction;

import org.ol3cesium.client.olx.interaction.DragBoxInteractionOptions;
import org.ol3cesium.client.ol.event.DragBoxInteractionEventListener;
import org.ol3cesium.client.ol.geom.Polygon;

/**
 * Allows the user to dragBox a vector box by clicking and dragging on the map, normally combined with an ol.events.condition that limits it to when the shift or other key is held down. This is used, for example, for zooming to a specific area of the map (see ol.interaction.DragZoom and ol.interaction.DragRotateAndZoom).
 * This interaction is only supported for mouse devices.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class DragBoxInteraction extends PointerInteraction {
    protected DragBoxInteraction() {
        //
    }
    
    public static native DragBoxInteraction create() /*-{
        return new ol.interaction.DragBox();
    }-*/;
    
    public static final native DragBoxInteraction create(DragBoxInteractionOptions options) /*-{
        return new ol.interaction.DragBox(options);
    }-*/;

    /**
     * Returns geometry of last dragBoxn box.
     * @return Geometry.
     */    
    public final native Polygon getGeometry() /*-{
        return this.getGeometry();
    }-*/;
    
    public final native void addDragBoxInteractionEventListener(DragBoxInteractionEventListener dragBoxInteractionEventListener) /*-{
        if (!this.__dragBoxInteractionEventListenerRegistered) {
            var that = this;
            
            function createCallback(type) {
                return function(event) {
                    var _event = {type: type, coordinate: event.coordinate, geometry: that.getGeometry(), nativeEvent: event.originalEvent};
                    that.__notifyDragBoxInteractionEventListeners(_event);
                }
            }
            var types = ['boxend', 'boxstart'];
            for (var i = 0; i < types.length; i++) {
                this.on(types[i], $entry(createCallback(types[i])), this);
            }
            
            this.__dragBoxInteractionEventListenerRegistered = true;
            this.__dragBoxInteractionEventListeners = [];
            this.__notifyDragBoxInteractionEventListeners = function(event) {
                var length = this.__dragBoxInteractionEventListeners.length;
                for (var i = 0; i < length; i++) {
                    var listener = this.__dragBoxInteractionEventListeners[i];
                    listener.@org.ol3cesium.client.ol.event.DragBoxInteractionEventListener::onDragBoxInteraction(Lorg/ol3cesium/client/ol/event/DragBoxInteractionEvent;)(event);
                }
            };
        }
        this.__dragBoxInteractionEventListeners.push(dragBoxInteractionEventListener);
    }-*/;
    
    public final native void removeDragBoxInteractionEventListener(DragBoxInteractionEventListener dragBoxInteractionEventListener) /*-{
        var index = this.__dragBoxInteractionEventListeners.indexOf(dragBoxInteractionEventListener);
        if (index > -1) {
            this.__dragBoxInteractionEventListeners.splice(dragBoxInteractionEventListener, 1);
        }
    }-*/;
}
