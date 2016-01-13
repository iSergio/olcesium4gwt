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
package org.ol3cesium.client.olx.control;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class FullScreenControlOptions extends JavaScriptObject {
    protected FullScreenControlOptions() {
        //
    }
    
    public static final native FullScreenControlOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param className CSS class name. Default is ol-full-screen.
     */
    public final native void setClassName(String className) /*-{
        this.className = className;
    }-*/;

    /**
     * Text label to use for the button. Default is \u2922 
     * (NORTH EAST AND SOUTH WEST ARROW). Instead of text, also a Node 
     * (e.g. a span element) can be used.
     * @param label 
     */
    public final native void setLabel(String label) /*-{
        this.label = label;
    }-*/;

    /**
     * Text label to use for the button when full-screen is active. 
     * Default is \u00d7 (a cross). Instead of text, also a Node (e.g. a span element) can be used.
     * @param labelActive 
     */
    public final native void setLabelActive(String labelActive) /*-{
        this.labelActive = labelActive;
    }-*/;

    /**
     * Text label to use for the button tip. Default is Toggle full-screen
     * @param tipLabel 
     */
    public final native void setTipLabel(String tipLabel) /*-{
        this.tipLabel = tipLabel;
    }-*/;

    /**
     * Full keyboard access.
     * @param keys 
     */
    public final native void setKeys(boolean keys) /*-{
        this.keys = keys;
    }-*/;

    /**
     *
     * @param target Target.
     */
    public final native void setTarget(Element target) /*-{
        this.target = target;
    }-*/;
}
