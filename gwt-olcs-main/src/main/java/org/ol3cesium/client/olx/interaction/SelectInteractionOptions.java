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
package org.ol3cesium.client.olx.interaction;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.Collection;
import org.ol3cesium.client.ol.Feature;
import org.ol3cesium.client.ol.layer.Layer;
import org.ol3cesium.client.ol.style.Style;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class SelectInteractionOptions extends JavaScriptObject {
    protected SelectInteractionOptions() {
        //
    }
    
    public static final native SelectInteractionOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * A function that takes an ol.MapBrowserEvent and returns a boolean to 
     * indicate whether that event should be handled. 
     * This is the event for the selected features as a whole. 
     * By default, this is ol.events.condition.singleClick. Clicking on a 
     * feature selects that feature and removes any that were in the selection. 
     * Clicking outside any feature removes all from the selection. See toggle, 
     * add, remove options for adding/removing extra features to/ from the selection.
     * @param condition Condition function
     */
    public final native void setCondition(JavaScriptObject condition) /*-{
        this.condition = condition;
    }-*/;
    
    /**
     * A list of layers from which features should be selected. 
     * Alternatively, a filter function can be provided. The function will be 
     * called for each layer in the map and should return true for layers that 
     * you want to be selectable. If the option is absent, all visible layers 
     * will be considered selectable. Required.
     * @param layers Layers.
     */
    public final native void setLayers(JsArray<Layer> layers) /*-{
        this.layers = layers;
    }-*/;

    /**
     * Style for the selected features. By default the default edit style is used (see ol.style).
     * @param style Style.
     */
    public final native void setStyle(Style style) /*-{
            this.style = style;
    }-*/;

    /**
     * Style for the selected features. By default the default edit style is used (see ol.style).
     * @param style Styles.
     */
    public final native void setStyle(JsArray<Style> style) /*-{
            this.style = style;
    }-*/;
    
    /**
     * A boolean that determines if the default behaviour should select only single 
     * features or all (overlapping) features at the clicked map position. 
     * Default is false i.e single select
     * @param multi 
     */
    public final native void setMulti(boolean multi) /*-{
            this.multi = multi;
    }-*/;

    /**
     * Collection where the interaction will place selected features. Optional. 
     * If not set the interaction will create a collection. 
     * In any case the collection used by the interaction is returned by 
     * ol.interaction.Select#getFeatures. Required.
     * @param features 
     */
    public final native void setFeatures(Collection<Feature> features) /*-{
        this.features = features;
    }-*/;
    
    /**
     * Wrap the world horizontally on the selection overlay. Default is true.
     * @param wrapX 
     */
    public final native void setWrapX(boolean wrapX) /*-{
        this.wrapX = wrapX;
    }-*/;
}
