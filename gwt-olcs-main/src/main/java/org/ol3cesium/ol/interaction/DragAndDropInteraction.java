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
package org.ol3cesium.ol.interaction;

import org.ol3cesium.ol.event.DragAndDropInteractionEventListener;

/**
 * Handles input of vector data by drag and drop.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class DragAndDropInteraction extends Interaction {
    protected DragAndDropInteraction() {
        //
    }
    
    public static native DragAndDropInteraction create() /*-{
        return new ol.interaction.DragAndDrop();
    }-*/;
    
    public final native void addDragAndDropInteractionEventListener(DragAndDropInteractionEventListener dragAndDropInteractionEventListener) /*-{
        if (!this.__dragAndDropInteractionEventListenerRegistered) {
            var that = this;
            
            function createCallback(type) {
                return function(event) {
                    var _event = {type: type, features: event.features, projection: event.projection, nativeEvent: event.originalEvent};
                    that.__notifyDragAndDropInteractionEventListeners(_event);
                }
            }
            var types = ['addfeatures'];
            for (var i = 0; i < types.length; i++) {
                this.on(types[i], $entry(createCallback(types[i])), this);
            }
            
            this.__dragAndDropInteractionEventListenerRegistered = true;
            this.__dragAndDropInteractionEventListeners = [];
            this.__notifyDragAndDropInteractionEventListeners = function(event) {
                var length = this.__dragAndDropLayerChangeEventListeners.length;
                for (var i = 0; i < length; i++) {
                    var listener = this.__dragAndDropInteractionEventListeners[i];
                    listener.@org.ol3cesium.ol.event.DragAndDropInteractionEventListener::onDragAndDropInteraction(Lorg/ol3cesium/ol/event/DragAndDropInteractionEvent;)(event);
                }
            };
        }
        this.__dragAndDropInteractionEventListeners.push(dragAndDropInteractionEventListener);
    }-*/;
    
    public final native void removeDragAndDropInteractionEventListener(DragAndDropInteractionEventListener dragAndDropInteractionEventListener) /*-{
        var index = this.__dragAndDropInteractionEventListeners.indexOf(dragAndDropInteractionEventListener);
        if (index > -1) {
            this.__dragAndDropInteractionEventListeners.splice(dragAndDropInteractionEventListener, 1);
        }
    }-*/;
}
