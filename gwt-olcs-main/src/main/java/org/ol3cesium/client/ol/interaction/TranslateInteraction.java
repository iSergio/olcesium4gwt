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
package org.ol3cesium.client.ol.interaction;

import org.ol3cesium.client.olx.interaction.TranslateInteractionOptions;
import org.ol3cesium.client.ol.event.TranslateInteractionEventListener;

/**
 * Interaction for translating (moving) features.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TranslateInteraction extends PointerInteraction {
    protected TranslateInteraction() {
        //
    }
    
    public static final native TranslateInteraction create(TranslateInteractionOptions options) /*-{
        return new ol.interaction.Translate(options);
    }-*/;
    
    public final native void addTranslateInteractionEventListener(TranslateInteractionEventListener translateInteractionEventListener) /*-{
        if (!this.__translateInteractionEventListenerRegistered) {
            var that = this;
            
            function createCallback(type) {
                return function(event) {
                    var _event = {type: type, feature: event.feature, nativeEvent: event.originalEvent};
                    that.__notifyTranslateInteractionEventListeners(_event);
                }
            }
            var types = ['translateend', 'translatestart', 'translating'];
            for (var i = 0; i < types.length; i++) {
                this.on(types[i], $entry(createCallback(types[i])), this);
            }
            
            this.__translateInteractionEventListenerRegistered = true;
            this.__translateInteractionEventListeners = [];
            this.__notifyTranslateInteractionEventListeners = function(event) {
                var length = this.__translateLayerChangeEventListeners.length;
                for (var i = 0; i < length; i++) {
                    var listener = this.__translateInteractionEventListeners[i];
                    listener.@org.ol3cesium.client.ol.event.TranslateInteractionEventListener::onTranslateInteraction(Lorg/ol3cesium/client/ol/event/TranslateInteractionEvent;)(event);
                }
            };
        }
        this.__translateInteractionEventListeners.push(translateInteractionEventListener);
    }-*/;
    
    public final native void removeTranslateInteractionEventListener(TranslateInteractionEventListener translateInteractionEventListener) /*-{
        var index = this.__translateInteractionEventListeners.indexOf(translateInteractionEventListener);
        if (index > -1) {
            this.__translateInteractionEventListeners.splice(translateInteractionEventListener, 1);
        }
    }-*/;
}
