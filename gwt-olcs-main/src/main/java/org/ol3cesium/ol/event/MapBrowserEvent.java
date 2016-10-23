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
package org.ol3cesium.ol.event;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.NativeEvent;
import org.ol3cesium.ol.Coordinate;
import org.ol3cesium.ol.Map;
import org.ol3cesium.ol.Pixel;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class MapBrowserEvent extends JavaScriptObject {
    protected MapBrowserEvent() {
        //
    }

    /**
     * The coordinate of the original browser event.
     * @return 
     */    
    public final native Coordinate getCoordinate() /*-{
        return this.coordinate;
    }-*/;

    /**
     * Indicates if the map is currently being dragged. 
     * Only set for POINTERDRAG and POINTERMOVE events. Default is false.
     * @return 
     */
    public final native boolean getDragging() /*-{
        return this.dragging;
    }-*/;

    /**
     * The map where the event occurred.
     * @return 
     */
    public final native Map getMap() /*-{
        return this.map;
    }-*/;
    
    /**
     * The original browser event.
     * @return 
     */
    public final native NativeEvent getOriginalEvent() /*-{
        return this.originalEvent;
    }-*/;

    /**
     * The pixel of the original browser event.
     * @return 
     */
    public final native Pixel getPixel() /*-{
        return this.pixel;
    }-*/;
}
