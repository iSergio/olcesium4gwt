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

import org.ol3cesium.client.olx.interaction.DrawInteractionOptions;
import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.client.ol.Feature;
import org.ol3cesium.client.ol.event.DrawInteractionEventListener;

/**
 * Interaction for drawing feature geometries.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class DrawInteraction extends PointerInteraction {
    protected DrawInteraction() {
        //
    }
    
    public static final native DrawInteraction create(DrawInteractionOptions options) /*-{
        return new ol.interaction.Draw(options);
    }-*/;
    
    /**
     * Create a geometryFunction for mode: 'Circle' that will create a regular 
     * polygon with a user specified number of sides and start angle instead of an ol.geom.Circle geometry.
     * @return Function that draws a polygon.
     */
    public final native JavaScriptObject createRegularPolygon() /*-{
        return ol.interaction.Draw.createRegularPolygon();
    }-*/;
    
    /**
     * Create a geometryFunction for mode: 'Circle' that will create a regular 
     * polygon with a user specified number of sides and start angle instead of an ol.geom.Circle geometry.
     * @param sides Number of sides of the regular polygon. Default is 32.
     * @return Function that draws a polygon.
     */
    public static final native JavaScriptObject createRegularPolygon(int sides) /*-{
        return ol.interaction.Draw.createRegularPolygon(sides);
    }-*/;
    
    /**
     * Create a geometryFunction for mode: 'Circle' that will create a regular 
     * polygon with a user specified number of sides and start angle instead of an ol.geom.Circle geometry.
     * @param sides Number of sides of the regular polygon. Default is 32.
     * @param angle Angle of the first point in radians. 0 means East. 
     * Default is the angle defined by the heading from the center of the regular polygon to the current pointer position.
     * @return Function that draws a polygon.
     */
    public final native JavaScriptObject createRegularPolygon(int sides, double angle) /*-{
        return ol.interaction.Draw.createRegularPolygon(sides, angle);
    }-*/;

    /**
     * Extend an existing geometry by adding additional points. This only works on 
     * features with LineString geometries, where the interaction will extend 
     * lines by adding points to the end of the coordinates array.
     * @param feature Feature to be extended.
     */
    public final native void extend(Feature feature) /*-{
        this.extend(feature);
    }-*/;
    
    /**
     * Stop drawing and add the sketch feature to the target layer. 
     * The ol.interaction.DrawEventType.DRAWEND event is dispatched before 
     * inserting the feature.
     */
    public final native void finishDrawing() /*-{
        this.finishDrawing();
    }-*/;
    
    /**
     * Remove last point of the feature currently being drawn.
     */
    public final native void removeLastPoint() /*-{
        this.removeLastPoint();
    }-*/;
    
    public final native void addDrawInteractionEventListener(DrawInteractionEventListener drawInteractionEventListener) /*-{
        if (!this.__drawInteractionEventListenerRegistered) {
            var that = this;
            
            function createCallback(type) {
                return function(event) {
                    var _event = {type: type, feature: event.feature, nativeEvent: event.originalEvent};
                    that.__notifyDrawInteractionEventListeners(_event);
                }
            }
            var types = ['drawend', 'drawstart'];
            for (var i = 0; i < types.length; i++) {
                this.on(types[i], $entry(createCallback(types[i])), this);
            }
            
            this.__drawInteractionEventListenerRegistered = true;
            this.__drawInteractionEventListeners = [];
            this.__notifyDrawInteractionEventListeners = function(event) {
                var length = this.__drawInteractionEventListeners.length;
                for (var i = 0; i < length; i++) {
                    var listener = this.__drawInteractionEventListeners[i];
                    listener.@org.ol3cesium.client.ol.event.DrawInteractionEventListener::onDrawInteraction(Lorg/ol3cesium/client/ol/event/DrawInteractionEvent;)(event);
                }
            };
        }
        this.__drawInteractionEventListeners.push(drawInteractionEventListener);
    }-*/;
    
    public final native void removeDrawInteractionEventListener(DrawInteractionEventListener drawInteractionEventListener) /*-{
        var index = this.__drawInteractionEventListeners.indexOf(drawInteractionEventListener);
        if (index > -1) {
            this.__drawInteractionEventListeners.splice(drawInteractionEventListener, 1);
        }
    }-*/;
}
