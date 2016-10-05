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
public class RotateControlOptions extends JavaScriptObject {
    protected RotateControlOptions() {
        //
    }
    
    public static native RotateControlOptions create() /*-{
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
     * @param tipLabel Text label to use for the button tip. Default is Attributions
     */
    public final native void setTipLabel(String tipLabel) /*-{
        this.tipLabel = tipLabel;
    }-*/;

    /**
     * Text label to use for the collapsed attributions button. Default is i. 
     * Instead of text, also a Node (e.g. a span element) can be used.
     * @param label 
     */
    public final native void setLabel(String label) /*-{
        this.label = label;
    }-*/;
    
    /**
     * 
     * @param duration Animation duration in milliseconds. Default is 250.
     */
    public final native void setDuration(int duration) /*-{
        this.duration = duration;
    }-*/;
    
    /**
     * Hide the control when rotation is 0. Default is true.
     * @param autoHide 
     */
    public final native void setAutoHide(boolean autoHide) /*-{
        this.autoHide = autoHide;
    }-*/;
    
    /**
     * 
     * @param target Target.
     */
    public final native void setTarget(Element target) /*-{
        this.target = target;
    }-*/;
}
