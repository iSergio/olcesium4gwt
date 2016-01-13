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
package org.ol3cesium.client.ol;

import com.google.gwt.dom.client.Element;
import org.ol3cesium.client.ol.control.Control;
import org.ol3cesium.client.ol.event.MapClickEventListener;
import org.ol3cesium.client.ol.event.MapPointerMoveEventListener;
import org.ol3cesium.client.ol.event.MouseMoveEventListener;
import org.ol3cesium.client.ol.geom.Geometry;
import org.ol3cesium.client.ol.interaction.Interaction;
import org.ol3cesium.client.ol.layer.BaseLayer;
import org.ol3cesium.client.ol.layer.GroupLayer;
import org.ol3cesium.client.olx.MapOptions;

/**
 * The map is the core component of OpenLayers. For a map to render, a view, 
 * one or more layers, and a target container are needed
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Map extends Object {
    protected Map() {
        //
    }
    
    public static final native Map create(Element element) /*-{
        return new ol.Map({target: element});
    }-*/;
    
    public static final native Map create(MapOptions options) /*-{
        var map = new ol.Map(options);
        return map;
    }-*/;
    
    /**
     * Add the given control to the map.
     * @param control Control.
     */
    public final native void addControl(Control control) /*-{
        this.addControl(control);
    }-*/;
    
    /**
     * Add the given interaction to the map.
     * @param interaction Interaction to add.
     */
    public final native void addInteraction(Interaction interaction) /*-{
        this.addInteraction(interaction);
    }-*/;
    
    /**
     * Adds the given layer to the top of this map. If you want to add a 
     * layer elsewhere in the stack, use getLayers() and the methods 
     * available on ol.Collection.
     * @param layer Layer.
     */
    public final native void addLayer(BaseLayer layer) /*-{
        this.addLayer(layer);
    }-*/;
    
    /**
     * Add the given overlay to the map.
     * @param overlay Overlay.
     */
    public final native void addOverlay(Overlay overlay) /*-{
        this.addOverlay(overlay);
    }-*/;
//    
//    // TODO
//    //beforeRender
//    //forEachFeatureAtPixel
//    //forEachLayerAtPixel
//    
    /**
     * Get the map controls. Modifying this collection changes the controls associated with the map.
     * @return Controls.
     */
    public final native Collection<Control> getControls() /*-{
        return this.getControls();
    }-*/;
    
    /**
     * Get the coordinate for a given pixel. This returns a coordinate in the map view projection.
     * @param pixel Pixel position in the map viewport.
     * @return The coordinate for the pixel position.
     */
    public final native Coordinate getCoordinateFromPixel(Pixel pixel) /*-{
        return this.getCoordinateFromPixel(pixel);
    }-*/;
    
    // TODO
    //getEventCoordinate
    //getEventPixel
    
    /**
     * Get the map interactions. Modifying this collection changes the 
     * interactions associated with the map.
     * Interactions are used for e.g. pan, zoom and rotate.
     * @return Interactions
     */
    public final native Collection<Interaction> getInteractions() /*-{
        return this.getInteractions();
    }-*/;
    
    /**
     * Get the layergroup associated with this map.
     * @return A layer group containing the layers in this map.
     */
    public final native GroupLayer getLayerGroup() /*-{
        return this.getLayerGroup();
    }-*/;
    
    public final native Collection<BaseLayer> getLayers() /*-{
        return this.getLayers();
    }-*/;
    
    /**
     * Get an overlay by its identifier (the value returned by overlay.getId()).
     * Note that the index treats string and numeric identifiers as the same. 
     * So map.getOverlayById(2) will return an overlay with id '2' or 2.
     * @param id Overlay identifier.
     * @return Overlay
     */
    public final native Overlay getOverlayById(String id) /*-{
        return this.getOverlayById(id);
    }-*/;
    
    /**
     * Get an overlay by its identifier (the value returned by overlay.getId()).
     * Note that the index treats string and numeric identifiers as the same. 
     * So map.getOverlayById(2) will return an overlay with id '2' or 2.
     * @param id Overlay identifier.
     * @return Overlay
     */
    public final native Overlay getOverlayById(int id) /*-{
        return this.getOverlayById(id);
    }-*/;
    
    /**
     * Get the map overlays. Modifying this collection changes the overlays associated with the map.
     * @return Overlays.
     */
    public final native Collection<Overlay> getOverlays() /*-{
        return this.getOverlays();
    }-*/;
    
    /**
     * Get the pixel for a coordinate. This takes a coordinate in the map view projection and returns the corresponding pixel.
     * @param coordinate A map coordinate.
     * @return A pixel position in the map viewport.
     */
    public final native Pixel getPixelFromCoordinate(Coordinate coordinate) /*-{
        return this.getPixelFromCoordinate(coordinate);
    }-*/;
    
    /**
     * Get the size of this map.
     * @return The size in pixels of the map in the DOM.
     */
    public final native Size getSize() /*-{
        return this.getSize();
    }-*/;
    
    /**
     * Get the target in which this map is rendered. Note that this returns 
     * what is entered as an option or in setTarget: if that was an element, 
     * it returns an element; if a string, it returns that.
     * @return The Element or id of the Element that the map is rendered in.
     */
    public final native String getTarget() /*-{
        return this.getTarget();
    }-*/;
    
    /**
     * Get the DOM element into which this map is rendered. 
     * In contrast to getTarget this method always return an Element, 
     * or null if the map has no target.
     * @return The element that the map is rendered in.
     */
    public final native Element getTargetElement() /*-{
        return this.getTargetElement();
    }-*/;
    
    /**
     * Get the view associated with this map. A view manages properties such as center and resolution.
     * @return The view that controls this map.
     */
    public final native View getView() /*-{
        return this.getView();
    }-*/;
    
    /**
     * Get the element that serves as the map viewport.
     * @return Viewport
     */
    public final native Element getViewport() /*-{
        return this.getViewport();
    }-*/;
    
    // TODO
    //hasFeatureAtPixel
    
    /**
     * Remove the given control from the map.
     * @param control Control.
     * @return The removed control (or undefined if the control was not found).
     */
    public final native Control removeControl(Control control) /*-{
        return this.removeControl(control);
    }-*/;
    
    /**
     * Remove the given interaction from the map.
     * @param interaction Interaction to remove.
     * @return The removed interaction (or undefined if the interaction was not found).
     */
    public final native Interaction removeInteraction(Interaction interaction) /*-{
        return this.removeInteraction(interaction);
    }-*/;
    
    /**
     * Removes the given layer from the map.
     * @param layer Layer.
     * @return The removed layer (or undefined if the layer was not found).
     */
    public final native BaseLayer removeLayer(BaseLayer layer) /*-{
        return this.removeLayer(layer);
    }-*/;
    
    /**
     * Remove the given overlay from the map.
     * @param overlay Overlay.
     * @return The removed overlay (or undefined if the overlay was not found).
     */
    public final native Overlay removeOverlay(Overlay overlay) /*-{
        return this.removeOverlay(overlay);
    }-*/;
    
    /**
     * Request a map rendering (at the next animation frame).
     */
    public final native void render() /*-{
        this.render();
    }-*/;
    
    /**
     * Requests an immediate render in a synchronous manner.
     */
    public final native void renderSync() /*-{
        this.renderSync();
    }-*/;
    
    /**
     * Sets the layergroup of this map.
     * @param groupLayer A layer group containing the layers in this map.
     */
    public final native void setLayerGroup(GroupLayer groupLayer) /*-{
        this.setLayerGroup(groupLayer);
    }-*/;
    
    /**
     * Set the size of this map.
     * @param size The size in pixels of the map in the DOM.
     */
    public final native void setSize(Size size) /*-{
        this.setSize(size);
    }-*/;
    
    /**
     * Set the target element to render this map into.
     * @param target The Element or id of the Element that the map is rendered in.
     */
    public final native void setTarget(Element target) /*-{
        this.setTarget(target);
    }-*/;
    
    /**
     * Set the target element to render this map into.
     * @param target The Element or id of the Element that the map is rendered in.
     */
    public final native void setTarget(String target) /*-{
        this.setTarget(target);
    }-*/;
    
    /**
     * Set the view for this map.
     * @param view The view that controls this map.
     */
    public final native void setView(View view) /*-{
        this.setView(view);
    }-*/;
    
    /**
     * Force a recalculation of the map viewport size. 
     * This should be called when third-party code changes the size of the map viewport.
     */
    public final native void updateSize() /*-{
        this.updateSize();
    }-*/;
    
    /**
     * If geometry is not point/multipoint maxZoom ignored
     * @param geometry Geometry.
     * @param zoom Zoom.
     */
    public final native void flyTo(Geometry geometry, int zoom) /*-{
        var duration = 1000;
        var start = +new Date();
        var pan = $wnd.ol.animation.pan({
            duration: duration,
            source: (this.getView().getCenter()),
            start: start
        });
        var bounce = $wnd.ol.animation.bounce({
            duration: duration,
            resolution: this.getView().getZoom() * this.getView().getResolution(),
            start: start
        });
        this.beforeRender(pan, bounce);
        var opts = {};
            console.log(geometry.getType());
        if (geometry.getType() != 'MultiPolygon' || geometry.getType() != 'Polygon') {
            opts = {maxZoom: zoom};
        }
            console.log(opts);
        this.getView().fit(geometry, this.getSize(), opts);
    }-*/;
    
    public final native void addMouseMoveEventListener(MouseMoveEventListener mouseMoveEventListener) /*-{
        if (!this.__mouseMoveEventListenerRegistered) {
            var that = this;
            var callback = function (event) {
                var _event = {pixel: that.getEventPixel(event), coordinate: that.getEventCoordinate(event), type: "mousemove", nativeEvent: event};
                that.__notifyMouseMoveEventListeners(_event);
                event.preventDefault();
            };
            this.getViewport().addEventListener('mousemove', $entry(callback));
            this.__mouseMoveEventListenerRegistered = true;
            this.__mouseMoveEventListeners = [];
            this.__notifyMouseMoveEventListeners = function(mouseMoveEvent) {
                var length = this.__mouseMoveEventListeners.length;
                for (var i = 0; i < length;  i++) {
                    var listener = this.__mouseMoveEventListeners[i];
                    listener.@org.ol3cesium.client.ol.event.MouseMoveEventListener::onMouseMove(Lorg/ol3cesium/client/ol/event/MouseMoveEvent;)(mouseMoveEvent);
                }
            };
        }
        this.__mouseMoveEventListeners.push(mouseMoveEventListener);
    }-*/;
    
    public final native void removeMouseMoveEventListener(MouseMoveEventListener mouseMoveEventListener) /*-{
        var index = this.__mouseMoveEventListeners.indexOf(mouseMoveEventListener);
        if (index > -1) {
            this.__mouseMoveEventListeners.splice(mouseMoveEventListener, 1);
        }
    }-*/;
    
    public final native void addMapClickEventListener(MapClickEventListener mapClickEventListener) /*-{
        if (!this.__mapClickEventListenerRegistered) {
            var that = this;
            var callback = function(event) {
                var _event = {coordinate: event.coordinate, dragging: event.dragging, map: event.map, originalEvent: event.originalEvent, pixel: event.pixel};
                that.__notifyMapClickEventListeners(_event);
            };
            this.on('click', $entry(callback), this);
            this.__mapClickEventListenerRegistered = true;
            this.__mapClickEventListeners = [];
            this.__notifyMapClickEventListeners = function(event) {
                var length = this.__mapClickEventListeners.length;
                for (var i = 0; i < length; i++) {
                    var listener = this.__mapClickEventListeners[i];
                    listener.@org.ol3cesium.client.ol.event.MapClickEventListener::onMapClick(Lorg/ol3cesium/client/ol/event/MapBrowserEvent;)(event);
                }
            }
        }
        this.__mapClickEventListeners.push(mapClickEventListener);
    }-*/;
    
    public final native void removeMapClickEventListener(MapClickEventListener mapClickEventListener) /*-{
        var index = this.__mapClickEventListeners.indexOf(mapClickEventListener);
        if (index > -1) {
            this.__mapClickEventListeners.splice(mapClickEventListener, 1);
        }
    }-*/;
    
    public final native void addMapPointerMoveEventListener(MapPointerMoveEventListener mapPointerMoveEventListener) /*-{
        if (!this.__mapPointerMoveEventListenerRegistered) {
            var that = this;
            var callback = function(event) {
                var _event = {coordinate: event.coordinate, dragging: event.dragging, map: event.map, originalEvent: event.originalEvent, pixel: event.pixel};
                that.__notifyMapPointerMoveEventListeners(_event);
            };
            this.on('pointermove', $entry(callback), this);
            this.__mapPointerMoveEventListenerRegistered = true;
            this.__mapPointerMoveEventListeners = [];
            this.__notifyMapPointerMoveEventListeners = function(event) {
                var length = this.__mapPointerMoveEventListeners.length;
                for (var i = 0; i < length; i++) {
                    var listener = this.__mapPointerMoveEventListeners[i];
                    listener.@org.ol3cesium.client.ol.event.MapPointerMoveEventListener::onMapPointerMove(Lorg/ol3cesium/client/ol/event/MapBrowserEvent;)(event);
                }
            }
        }
        this.__mapPointerMoveEventListeners.push(mapPointerMoveEventListener);
    }-*/;
    
    public final native void removeMapPointerMoveEventListener(MapPointerMoveEventListener mapPointerMoveEventListener) /*-{
        var index = this.__mapPointerMoveEventListeners.indexOf(mapPointerMoveEventListener);
        if (index > -1) {
            this.__mapPointerMoveEventListeners.splice(mapPointerMoveEventListener, 1);
        }
    }-*/;
}