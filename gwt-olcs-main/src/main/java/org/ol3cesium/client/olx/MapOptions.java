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
package org.ol3cesium.client.olx;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import java.util.List;
import org.ol3cesium.client.ol.Collection;
import org.ol3cesium.client.ol.Overlay;
import org.ol3cesium.client.ol.RendererType;
import org.ol3cesium.client.ol.View;
import org.ol3cesium.client.ol.control.Control;
import org.ol3cesium.client.ol.interaction.Interaction;
import org.ol3cesium.client.ol.layer.BaseLayer;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class MapOptions extends JavaScriptObject {
    protected MapOptions() {
        //
    }
    
    public static native MapOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Controls initially added to the map. If not specified, ol.control.defaults() is used.
     * @param controls 
     */
    public final native void setControls(Collection<Control> controls) /*-{
        this.controls = controls;
    }-*/;
    
    public final native void setControls(JsArray<Control> controls) /*-{
        this.controls = controls;
    }-*/;
    
    /**
     * The ratio between physical pixels and device-independent pixels (dips) 
     * on the device. If undefined then it gets 
     * set by using window.devicePixelRatio.
     * @param pixelRatio pixel ration
     */
    public final native void setPixelRatio(double pixelRatio) /*-{
        this.pixelRatio = pixelRatio;
    }-*/;
    
    /**
     * Interactions that are initially added to the map. 
     * If not specified, ol.interaction.defaults() is used.
     * @param interactions collection of interactions
     */
    public final native void setInteractions(Collection<Interaction> interactions) /*-{
        this.interactions = interactions;
    }-*/;
    
    /**
     * Interactions that are initially added to the map. 
     * If not specified, ol.interaction.defaults() is used.
     * @param interactions collection of interactions
     */
    public final native void setInteractions(JsArray<Interaction> interactions) /*-{
        this.interactions = interactions;
    }-*/;
    
    /**
     * The element to listen to keyboard events on. This determines when 
     * the KeyboardPan and KeyboardZoom interactions trigger. 
     * For example, if this option is set to document the keyboard interactions 
     * will always trigger. If this option is not specified, the element the 
     * library listens to keyboard events on is the map target 
     * (i.e. the user-provided div for the map). 
     * If this is not document the target element needs to be focused for 
     * key events to be emitted, requiring that the target element has a 
     * tabindex attribute.
     * @param keyboardEventTarget 
     */
    public final native void setKeyboardEventTarget(Element keyboardEventTarget) /*-{
        this.keyboardEventTarget = keyboardEventTarget;
    }-*/;
    
    /**
     * The element to listen to keyboard events on. This determines when 
     * the KeyboardPan and KeyboardZoom interactions trigger. 
     * For example, if this option is set to document the keyboard interactions 
     * will always trigger. If this option is not specified, the element the 
     * library listens to keyboard events on is the map target 
     * (i.e. the user-provided div for the map). 
     * If this is not document the target element needs to be focused for 
     * key events to be emitted, requiring that the target element has a 
     * tabindex attribute.
     * @param keyboardEventTarget 
     */
    public final native void setKeyboardEventTarget(Document keyboardEventTarget) /*-{
        this.keyboardEventTarget = keyboardEventTarget;
    }-*/;
    
    /**
     * The element to listen to keyboard events on. This determines when 
     * the KeyboardPan and KeyboardZoom interactions trigger. 
     * For example, if this option is set to document the keyboard interactions 
     * will always trigger. If this option is not specified, the element the 
     * library listens to keyboard events on is the map target 
     * (i.e. the user-provided div for the map). 
     * If this is not document the target element needs to be focused for 
     * key events to be emitted, requiring that the target element has a 
     * tabindex attribute.
     * @param keyboardEventTarget 
     */
    public final native void setKeyboardEventTarget(String keyboardEventTarget) /*-{
        this.keyboardEventTarget = keyboardEventTarget;
    }-*/;
    
    /**
     * Layers. If this is not defined, a map with no layers will be rendered. 
     * Note that layers are rendered in the order supplied, 
     * so if you want, for example, a vector layer to appear on top of a tile layer, 
     * it must come after the tile layer.
     * @param layers 
     */
    public final native void setLayers(JsArray<BaseLayer> layers) /*-{
        this.layers = layers;
    }-*/;
    
    /**
     * When set to true, tiles will be loaded during animations. 
     * This may improve the user experience, but can also make animations 
     * stutter on devices with slow memory. Default is false.
     * @param loadTilesWhileAnimating 
     */
    public final native void setLoadTilesWhileAnimating(boolean loadTilesWhileAnimating) /*-{
        this.loadTilesWhileAnimating = loadTilesWhileAnimating;
    }-*/;
    
    /**
     * When set to true, tiles will be loaded while interacting with the map. 
     * This may improve the user experience, but can also make map panning and 
     * zooming choppy on devices with slow memory. Default is false.
     * @param loadTilesWhileInteracting 
     */
    public final native void setLoadTilesWhileInteracting(boolean loadTilesWhileInteracting) /*-{
        this.loadTilesWhileInteracting = loadTilesWhileInteracting;
    }-*/;
    
    /**
     * The map logo. A logo to be displayed on the map at all times. 
     * If a string is provided, it will be set as the image source of the logo. 
     * If an object is provided, the src property should be the URL for 
     * an image and the href property should be a URL for creating a link. 
     * To disable the map logo, set the option to false. By default, 
     * the OpenLayers 3 logo is shown.
     * @param logo 
     */
    public final native void setLogo(boolean logo) /*-{
        this.logo = logo;
    }-*/;
    
    /**
     * The map logo. A logo to be displayed on the map at all times. 
     * If a string is provided, it will be set as the image source of the logo. 
     * If an object is provided, the src property should be the URL for 
     * an image and the href property should be a URL for creating a link. 
     * To disable the map logo, set the option to false. By default, 
     * the OpenLayers 3 logo is shown.
     * @param logo 
     */
    public final native void setLogo(String logo) /*-{
        this.logo = logo;
    }-*/;
    
    /**
     * Overlays initially added to the map. By default, no overlays are added.
     * @param overlays 
     */
    public final native void setOverlays(Collection<Overlay> overlays) /*-{
        this.overlays = overlays;
    }-*/;
    
    /**
     * Overlays initially added to the map. By default, no overlays are added.
     * @param overlays 
     */
    public final native void setOverlays(JsArray<Overlay> overlays) /*-{
        this.overlays = overlays;
    }-*/;
    
    /**
     * Renderer. By default, Canvas, DOM and WebGL renderers are tested for 
     * support in that order, and the first supported used. 
     * Specify a ol.RendererType here to use a specific renderer. 
     * Note that at present only the Canvas renderer supports vector data.
     * @param renderer 
     */
    public final native void setRenderer(RendererType renderer) /*-{
        this.renderer = renderer.toString();
    }-*/;
    
    /**
     * Renderer. By default, Canvas, DOM and WebGL renderers are tested for 
     * support in that order, and the first supported used. 
     * Specify a ol.RendererType here to use a specific renderer. 
     * Note that at present only the Canvas renderer supports vector data.
     * @param renderer 
     */
    public final native void setRenderer(String renderer) /*-{
        this.renderer = renderer;
    }-*/;
    
    /**
     * Renderer. By default, Canvas, DOM and WebGL renderers are tested for 
     * support in that order, and the first supported used. 
     * Specify a ol.RendererType here to use a specific renderer. 
     * Note that at present only the Canvas renderer supports vector data.
     * @param renderer 
     */
    public final void setRenderer(List<RendererType> renderer) {
        JsArrayString jsArrayString = JavaScriptObject.createArray().cast();
        for (int i = 0; i < renderer.size(); i++) {
            RendererType rendererType = renderer.get(i);
            jsArrayString.set(i, rendererType.toString());
        }
        setRenderer(jsArrayString);
    }
    
    /**
     * Renderer. By default, Canvas, DOM and WebGL renderers are tested for 
     * support in that order, and the first supported used. 
     * Specify a ol.RendererType here to use a specific renderer. 
     * Note that at present only the Canvas renderer supports vector data.
     * @param renderer 
     */
    public final native void setRenderer(JsArrayString renderer) /*-{
        this.renderer = renderer;
    }-*/;
    
    /**
     * The container for the map, either the element itself or the id of the element. 
     * If not specified at construction time, ol.Map#setTarget 
     * must be called for the map to be rendered.
     * @param target 
     */
    public final native void setTarget(Element target) /*-{
        this.target = target;
    }-*/;
    
    /**
     * The container for the map, either the element itself or the id of the element. 
     * If not specified at construction time, ol.Map#setTarget 
     * must be called for the map to be rendered.
     * @param target 
     */
    public final native void setTarget(String target) /*-{
        this.target = target;
    }-*/;
    
    /**
     * The map's view. No layer sources will be fetched unless this is 
     * specified at construction time or through ol.Map#setView.
     * @param view 
     */
    public final native void setView(View view) /*-{
        this.view = view;
    }-*/;
}
