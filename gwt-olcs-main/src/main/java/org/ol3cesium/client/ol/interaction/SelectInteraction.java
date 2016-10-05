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

import org.ol3cesium.client.olx.interaction.SelectInteractionOptions;
import org.ol3cesium.client.ol.Collection;
import org.ol3cesium.client.ol.Feature;
import org.ol3cesium.client.ol.Map;
import org.ol3cesium.client.ol.event.SelectInteractionEventListener;
import org.ol3cesium.client.ol.layer.VectorLayer;

/**
 * Interaction for selecting vector features. By default, selected features are 
 * styled differently, so this interaction can be used for visual highlighting, 
 * as well as selecting features for other actions, such as modification or output. 
 * There are three ways of controlling which features are selected: using the 
 * browser event as defined by the condition and optionally the toggle, 
 * add/remove, and multi options; a layers filter; and a further feature 
 * filter using the filter option.
 * 
 * Selected features are added to an internal unmanaged layer.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class SelectInteraction extends Interaction {
    protected SelectInteraction() {
        //
    }
    
    public static final native SelectInteraction create() /*-{
        return new ol.interaction.Select();
    }-*/;
    
    public static final native SelectInteraction create(SelectInteractionOptions options) /*-{
        return new ol.interaction.Select(options);
    }-*/;

    /**
     * Get the selected features.
     * @return Features collection.
     */
    public final native Collection<Feature> getFeatures() /*-{
        return this.getFeatures();
    }-*/;
    
    /**
     * Returns the associated vectorlayer of the (last) selected feature. 
     * Note that this will not work with any programmatic method like pushing features to collection.
     * @param feature Feature.
     * @return Layer.
     */
    public final native VectorLayer getLayer(Feature feature) /*-{
        return this.getLayer(feature);
    }-*/;
    
    /**
     * Remove the interaction from its current map, if any, and attach it to a 
     * new map, if any. Pass null to just remove the interaction from the current map.
     * @param map Map.
     */
    public final native void setMap(Map map) /*-{
        this.setMap(map);
    }-*/;
    
    public final native void addSelectInteractionEventListener(SelectInteractionEventListener selectInteractionEventListener) /*-{   
        if (!this.__selectInteractionEventListenerRegistered) {
            var that = this;
            var callback = function(event) {
                var _event = {deselected: event.deselected, selected: event.selected, nativeEvent: event.originalEvent};
                that.__notifySelectInteractionEventListeners(_event);
            };
            this.on('select', $entry(callback), this);            
            
            this.__selectInteractionEventListenerRegistered = true;
            this.__selectInteractionEventListeners = [];
            this.__notifySelectInteractionEventListeners = function(event) {
                var length = this.__selectInteractionEventListeners.length;
                for(var i = 0; i < length; i++){
                    var listener = this.__selectInteractionEventListeners[i];
                    listener.@org.ol3cesium.client.ol.event.SelectInteractionEventListener::onSelectInteraction(Lorg/ol3cesium/client/ol/event/SelectInteractionEvent;)(event);
                }
            };
        }
        this.__selectInteractionEventListeners.push(selectInteractionEventListener);
    }-*/;
}
