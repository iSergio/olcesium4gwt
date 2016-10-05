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
import org.ol3cesium.client.ol.Extent;

/**
 *
 * A button control which, when pressed, changes the map view to 
 * a specific extent. To style this control use the css selector .ol-zoom-extent.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ZoomToExtentControlOptions extends JavaScriptObject {
    protected ZoomToExtentControlOptions() {
        //
    }
    
    public static native ZoomToExtentControlOptions create() /*-{
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
     * @param target Target.
     */
    public final native void setTarget(Element target) /*-{
        this.target = target;
    }-*/;
    
    /**
     * 
     * @param tipLabel Text label to use for the button tip. Default is Zoom to extent
     */
    public final native void setTipLabel(String tipLabel) /*-{
        this.tipLabel = tipLabel;
    }-*/;

    /**
     * Text label to use for the button. Default is E. 
     * Instead of text, also a Node (e.g. a span element) can be used.
     * @param label 
     */
    public final native void setLabel(String label) /*-{
        this.label = label;
    }-*/;
    
    /**
     * The extent to zoom to. If undefined the validity extent of the view projection is used.
     * @param extent 
     */
    public final native void setExtent(Extent extent) /*-{
        this.extent = extetn;
    }-*/;
}
