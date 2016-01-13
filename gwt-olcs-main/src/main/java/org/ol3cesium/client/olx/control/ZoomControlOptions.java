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
public class ZoomControlOptions extends JavaScriptObject {
    protected ZoomControlOptions() {
        //
    }
    
    public static final native ZoomControlOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param duration Animation duration in milliseconds. Default is 250.
     */
    public final native void setDuration(int duration) /*-{
        this.duration = duration;
    }-*/;
    
    /**
     * 
     * @param className CSS class name. Default is ol-attribution.
     */
    public final native void setClassName(String className) /*-{
        this.className = className;
    }-*/;
    
    /**
     * Text label to use for the zoom-in button. Default is +. 
     * Instead of text, also a Node (e.g. a span element) can be used.
     * @param zoomInLabel 
     */
    public final native void setZoomInLabel(String zoomInLabel) /*-{
        this.zoomInLabel = zoomInLabel;
    }-*/;

    /**
     * Text label to use for the zoom-out button. Default is -. 
     * Instead of text, also a Node (e.g. a span element) can be used.
     * @param zoomOutLabel 
     */
    public final native void setZoomOutLabel(String zoomOutLabel) /*-{
        this.zoomOutLabel = zoomOutLabel;
    }-*/;

    /**
     * Text label to use for the button tip. Default is Zoom in
     * @param zoomInTipLabel 
     */
    public final native void setZoomInTipLabel(String zoomInTipLabel) /*-{
        this.zoomInTipLabel = zoomInTipLabel;
    }-*/;

    /**
     * Text label to use for the button tip. Default is Zoom out
     * @param zoomOutTipLabel 
     */
    public final native void setZoomOutTipLabel(String zoomOutTipLabel) /*-{
        this.zoomOutTipLabel = zoomOutTipLabel;
    }-*/;

    /**
     * The zoom delta applied on each click.
     * @param delta 
     */
    public final native void setDelta(int delta) /*-{
        this.delta = delta;
    }-*/;
    
    /**
     * 
     * @param target Target.
     */
    public final native void setTarget(Element target) /*-{
        this.target = target;
    }-*/;
}
