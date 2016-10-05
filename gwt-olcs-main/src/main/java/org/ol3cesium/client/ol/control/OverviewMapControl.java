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
package org.ol3cesium.client.ol.control;

import org.ol3cesium.client.olx.control.OverviewMapControlOptions;
import org.ol3cesium.client.ol.Map;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OverviewMapControl extends Control {
    protected OverviewMapControl() {
        //
    }
    
    public static final native OverviewMapControl create() /*-{
        return new ol.control.OverviewMap();
    }-*/;
    
    public static final native OverviewMapControl create(OverviewMapControlOptions options) /*-{
        return new ol.control.OverviewMap(options);
    }-*/;
    
    /**
     * Determine if the overview map is collapsed.
     * @return The overview map is collapsed.
     */
    public final native boolean getCollapsed() /*-{
        return this.getCollapsed();
    }-*/;
    
    /**
     * Return true if the overview map is collapsible, false otherwise.
     * @return True if the widget is collapsible.
     */
    public final native boolean getCollapsible() /*-{
        return this.getCollapsible();
    }-*/;
    
    /**
     * Return the overview map.
     * @return Overview map.
     */
    public final native Map getOverviewMap() /*-{
        return this.getOverviewMap();
    }-*/;
    
    /**
     * Collapse or expand the overview map according to the passed parameter. 
     * Will not do anything if the overview map isn't collapsible or if the 
     * current collapsed state is already the one requested.
     * @param collapsed True if the widget is collapsed.
     */
    public final native void setCollapsed(boolean collapsed) /*-{
        this.setCollapsed(collapsed);
    }-*/;

    /**
     * Set whether the overview map should be collapsible.
     * @param collapsible True if the widget is collapsible.
     */
    public final native void setCollapsible(boolean collapsible) /*-{
        this.setCollapsible(collapsible);
    }-*/;
}
