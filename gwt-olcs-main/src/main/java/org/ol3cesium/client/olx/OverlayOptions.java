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
package org.ol3cesium.client.olx;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.dom.client.Element;
import org.ol3cesium.client.ol.Coordinate;
import org.ol3cesium.client.ol.OverlayPositioning;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OverlayOptions extends JavaScriptObject {
    protected OverlayOptions() {
        //
    }
    
    public static final native OverlayOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Set the overlay id. The overlay id can be used with the ol.Map#getOverlayById method.
     * @param id 
     */
    public final native void setId(int id) /*-{
        this.id = id;
    }-*/;
    
    /**
     * Set the overlay id. The overlay id can be used with the ol.Map#getOverlayById method.
     * @param id 
     */
    public final native void setId(String id) /*-{
        this.id = id;
    }-*/;

    /**
     * The overlay element.
     * @param element 
     */
    public final native void setElement(Element element) /*-{
        this.element = element;
    }-*/;

    /**
     * Offsets in pixels used when positioning the overlay. 
     * The first element in the array is the horizontal offset. 
     * A positive value shifts the overlay right. 
     * The second element in the array is the vertical offset. 
     * A positive value shifts the overlay down. Default is [0, 0].
     * @param offset 
     */
    public final native void setOffset(JsArrayNumber offset) /*-{
        this.offset = offset;
    }-*/;

    /**
     * The overlay position in map projection.
     * @param position Position.
     */
    public final native void setPosition(Coordinate position) /*-{
        this.position = position;
    }-*/;

    /**
     * Defines how the overlay is actually positioned with respect to its position property. 
     * Possible values are 'bottom-left', 'bottom-center', 'bottom-right', 'center-left', 
     * 'center-center', 'center-right', 'top-left', 'top-center', and 'top-right'. 
     * Default is 'top-left'.
     * @param positioning 
     */
    public final native void setPositioning(OverlayPositioning positioning) /*-{
        this.positioning = positioning.toString();
    }-*/;

    /**
     * Whether event propagation to the map viewport should be stopped. Default is true. 
     * If true the overlay is placed in the same container as that of the controls 
     * (CSS class name ol-overlaycontainer-stopevent); 
     * if false it is placed in the container with CSS class name ol-overlaycontainer.
     * @param stopEvent 
     */
    public final native void setStopEvent(boolean stopEvent) /*-{
        this.stopEvent = stopEvent;
    }-*/;

    /**
     * Whether the overlay is inserted first in the overlay container, or appended. 
     * Default is true. If the overlay is placed in the same container as that of the controls 
     * (see the stopEvent option) you will probably set insertFirst to true so the overlay is 
     * displayed below the controls.
     * @param intsertFirst 
     */
    public final native void setInsertFirst(boolean intsertFirst) /*-{
        this.insertFirst = insertFirst;
    }-*/;

    /**
     * If set to true the map is panned when calling setPosition, so that the 
     * overlay is entirely visible in the current viewport. The default is false.
     * @param autoPan 
     */
    public final native void setAutoPan(boolean autoPan) /*-{
        this.autoPan = autoPan;
    }-*/;
    

    //TODO
//    The options used to create a ol.animation.pan animation. This animation is only used when autoPan is enabled. By default the default options for ol.animation.pan are used. If set to null the panning is not animated.
//    public final native void setAutoPanAnimation	olx.animation.PanOptions | undefined	experimental

    /**
     * The margin (in pixels) between the overlay and the borders of the map when autopanning. The default is 20.
     * @param autoPanMargin 
     */
    public final native void setAutoPanMargin(int autoPanMargin) /*-{
        this.autoPanMargin = autoPanMargin;
    }-*/;
}
