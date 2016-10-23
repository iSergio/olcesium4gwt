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
package org.ol3cesium.olx.control;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Element;
import org.ol3cesium.ol.Collection;
import org.ol3cesium.ol.View;
import org.ol3cesium.ol.layer.Layer;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OverviewMapControlOptions extends JavaScriptObject {
    protected OverviewMapControlOptions() {
        //
    }
    
    public static native OverviewMapControlOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Whether the control should start collapsed or not (expanded). Default to true.
     * @param collapsed 
     */
    public final native void setCollapsed(boolean collapsed) /*-{
        this.collapsed = collapsed;
    }-*/;

    /**
     * Text label to use for the expanded overviewmap button. Default is «. 
     * Instead of text, also a Node (e.g. a span element) can be used.
     * @param collapseLabel 
     */
    public final native void setCollapseLabel(String collapseLabel) /*-{
        this.collapseLabel = collapseLabel;
    }-*/;

    /**
     * Whether the control can be collapsed or not. Default to true.
     * @param collapsible 
     */
    public final native void setCollapsible(boolean collapsible) /*-{
        this.collapsible = collapsible;
    }-*/;

    /**
     * Text label to use for the collapsed overviewmap button. Default is ». 
     * Instead of text, also a Node (e.g. a span element) can be used.
     * @param label 
     */
    public final native void setLabel(String label) /*-{
        this.label = label;
    }-*/;

    /**
     * Layers for the overview map. If not set, then all main map layers are used instead.
     * @param layers 
     */
    public final native void setLayers(Collection<Layer> layers) /*-{
        this.layers = layers;
    }-*/;
    
    /**
     * Layers for the overview map. If not set, then all main map layers are used instead.
     * @param layers 
     */
    public final native void setLayers(JsArray<Layer> layers) /*-{
        this.layers = layers;
    }-*/;

//    /**
//     * Function called when the control should be re-rendered. This is called in a requestAnimationFrame callback.
//     */
//    public final native void setRender() /*-{
//        //
//    }-*/;

    /**
     * Specify a target if you want the control to be rendered outside of the map's viewport.
     * @param target 
     */
    public final native void setTarget(Element target) /*-{
        this.layers = layers;
    }-*/;

    /**
     * Text label to use for the button tip. Default is Overview map
     * @param tipLabel 
     */
    public final native void setTipLabel(String tipLabel) /*-{
        this.tipLabel = tipLabel;
    }-*/;

    /**
     * Custom view for the overview map. If not provided, a default view with an EPSG:3857 projection will be used.
     * @param view 
     */
    public final native void setView(View view) /*-{
        this.view = view;
    }-*/;
    
    public final native void setClassName(String className)/*-{
        this.className = className;
    }-*/;
}
