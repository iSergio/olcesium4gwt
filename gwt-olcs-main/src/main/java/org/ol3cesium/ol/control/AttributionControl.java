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
package org.ol3cesium.ol.control;

import org.ol3cesium.olx.control.AttributionControlOptions;

/**
 * Control to show all the attributions associated with the layer sources in the map. 
 * This control is one of the default controls included in maps. 
 * By default it will show in the bottom right portion of the map, 
 * but this can be changed by using a css selector for .ol-attribution.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class AttributionControl extends Control {
    protected AttributionControl() {
        //
    }
    
    public static native AttributionControl create() /*-{
        return new ol.control.Attribution();
    }-*/;
    
    public static native AttributionControl create(AttributionControlOptions options) /*-{
        return new ol.control.Attribution(options);
    }-*/;

    /**
     * Return true when the attribution is currently collapsed or false otherwise.
     * @return True if the widget is collapsed.
     */
    public final native boolean getCollapsed() /*-{
        return this.getCollapsed();
    }-*/;

    /**
     * Return true if the attribution is collapsible, false otherwise.
     * @return True if the widget is collapsible.
     */
    public final native boolean getCollapsible() /*-{
        return this.getCollapsible();
    }-*/;
    
    /**
     * Collapse or expand the attribution according to the passed parameter. 
     * Will not do anything if the attribution isn't collapsible or if the current 
     * collapsed state is already the one requested.
     * @param collapsed True if the widget is collapsed.
     */
    public final native void setCollapsed(boolean collapsed) /*-{
        this.setCollapsed(collapsed);
    }-*/;

    /**
     * Set whether the attribution should be collapsible.
     * @param collapsible True if the widget is collapsible.
     */
    public final native void setCollapsible(boolean collapsible) /*-{
        this.setCollapsible(collapsible);
    }-*/;
}
