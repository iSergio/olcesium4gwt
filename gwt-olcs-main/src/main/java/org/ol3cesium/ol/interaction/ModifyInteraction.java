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

import org.ol3cesium.ol.event.ModifyInteractionEventListener;
import org.ol3cesium.olx.interaction.ModifyInteractionOptions;

/**
 * Interaction for modifying feature geometries.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ModifyInteraction extends PointerInteraction {
    protected ModifyInteraction() {
        //
    }
    
    public static native ModifyInteraction create(ModifyInteractionOptions options) /*-{
        return new ol.interaction.Modify(options);
    }-*/;
    
    public final native void addDrawInteractionEventListener(ModifyInteractionEventListener modifyInteractionEventListener) /*-{
        if (!this.__modifyInteractionEventListenerRegistered) {
            var that = this;
            
            function createCallback(type) {
                return function(event) {
                    var _event = {type: type, features: event.features, nativeEvent: event.originalEvent};
                    that.__notifyModifyInteractionEventListeners(_event);
                }
            }
            var types = ['modifyend', 'modifystart'];
            for (var i = 0; i < types.length; i++) {
                this.on(types[i], $entry(createCallback(types[i])), this);
            }
            
            this.__modifyInteractionEventListenerRegistered = true;
            this.__modifyInteractionEventListeners = [];
            this.__notifyModifyInteractionEventListeners = function(event) {
                var length = this.__modifyInteractionEventListeners.length;
                for (var i = 0; i < length; i++) {
                    var listener = this.__modifyInteractionEventListeners[i];
                    listener.@org.ol3cesium.ol.event.ModifyInteractionEventListener::onModifyInteraction(Lorg/ol3cesium/ol/event/ModifyInteractionEvent;)(event);
                }
            };
        }
        this.__modifyInteractionEventListeners.push(modifyInteractionEventListener);
    }-*/;
    
    public final native void removeModifyInteractionEventListener(ModifyInteractionEventListener modifyInteractionEventListener) /*-{
        var index = this.__modifyInteractionEventListeners.indexOf(modifyInteractionEventListener);
        if (index > -1) {
            this.__modifyInteractionEventListeners.splice(modifyInteractionEventListener, 1);
        }
    }-*/;
}
