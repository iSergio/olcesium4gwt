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
package org.ol3cesium.client.ol;

import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.dom.client.Element;
import org.ol3cesium.client.olx.OverlayOptions;

/**
 * An element to be displayed over the map and attached to a single map location. 
 * Like ol.control.Control, Overlays are visible widgets. Unlike Controls, 
 * they are not in a fixed position on the screen, but are tied to a geographical 
 * coordinate, so panning the map will move an Overlay but not a Control.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Overlay extends Object {
    protected Overlay() {
        //
    }
    
    public static native Overlay create(OverlayOptions options) /*-{
        return ol.Overlay(options);
    }-*/;
    
    /**
     * Get the DOM element of this overlay.
     * @return The Element containing the overlay. 
     */
    public final native Element getElement() /*-{
        return this.getElement();
    }-*/;

    /**
     * Get the overlay identifier which is set on constructor.
     * @return Id.
     */
    public final native String getId() /*-{
        return this.getId();
    }-*/;

    /**
     * Get the map associated with this overlay.
     * @return The map that the overlay is part of.
     */
    public final native Map getMap() /*-{
        return this.getMap();
    }-*/;

    /**
     * Get the offset of this overlay.
     * @return The offset.
     */
    public final native JsArrayNumber getOffset() /*-{
        return this.getOffset();
    }-*/;

    /**
     * Get the current position of this overlay.
     * @return The spatial point that the overlay is anchored at. 
     */
    public final native Coordinate getPosition() /*-{
        return this.getPosition();
    }-*/;
    
    /**
     * Get the current positioning of this overlay.
     * @return How the overlay is positioned relative to its point on the map.
     */
    public final native String getPositioning() /*-{
        return this.getPositioning();
    }-*/;
    
    /**
     * Set the DOM element to be associated with this overlay.
     * @param element The Element containing the overlay.
     */
    public final native void setElement(Element element) /*-{
        this.setElement(element);
    }-*/;

    /**
     * Set the map to be associated with this overlay.
     * @param map The map that the overlay is part of.
     */
    public final native void setMap(Map map) /*-{
        this.setMap(map);
    }-*/;

    /**
     * Set the offset for this overlay.
     * @param offset Offset.
     */
    public final native void setOffset(JsArrayNumber offset) /*-{
        this.setOffset(offset);
    }-*/;
    
    /**
     * Set the position for this overlay. If the position is undefined the overlay is hidden.
     * @param position The spatial point that the overlay is anchored at.
     */
    public final native void setPosition(Coordinate position) /*-{
        this.setPosition(position);
    }-*/;

    /**
     * Set the positioning for this overlay.
     * @param positioning how the overlay is positioned relative to its point on the map.
     */
    public final native void setPositioning(String positioning) /*-{
        this.setPositioning(positioning);
    }-*/;
}
