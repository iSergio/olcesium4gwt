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
package org.ol3cesium.client.olx.control;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class AttributionControlOptions extends JavaScriptObject {
    protected AttributionControlOptions() {
        //
    }
    
    public final native AttributionControlOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param className CSS class name. Default is ol-attribution.
     */
    public final native void setClassName(String className) /*-{
        this.className = className;
    }-*/;

    /**
     * 
     * @param element Target.
     */
    public final native void setTarget(Element element) /*-{
        this.element = element;
    }-*/;

    /**
     * Specify if attributions can be collapsed. If you use an OSM source, 
     * should be set to false — see OSM Copyright — Default is true.
     * @param collapsible Specify if attributions can be collapsed.
     */
    public final native void setCollapsible(boolean collapsible) /*-{
        this.collapsible = collapsible;
    }-*/;

    /**
     * 
     * @param collapsed Specify if attributions should be collapsed at startup. Default is true.
     */
    public final native void setCollapsed(boolean collapsed) /*-{
        this.collapsed = collapsed;
    }-*/;

    /**
     * 
     * @param tipLabel Text label to use for the button tip. Default is Attributions
     */
    public final native void setTipLabel(String tipLabel) /*-{
        this.tipLabel = tipLabel;
    }-*/;

    /**
     * Text label to use for the collapsed attributions button. Default is i. 
     * Instead of text, also a Node (e.g. a span element) can be used.
     * @param label label to use.
     */
    public final native void setLabel(String label) /*-{
        this.label = label;
    }-*/;
    
    /**
     * Text label to use for the expanded attributions button. Default is ». 
     * Instead of text, also a Node (e.g. a span element) can be used.
     * @param collapseLabel Collapse label flag.
     */
    public final native void setCollapseLabel(String collapseLabel) /*-{
        this.collapseLabel = collapseLabel;
    }-*/;
}
