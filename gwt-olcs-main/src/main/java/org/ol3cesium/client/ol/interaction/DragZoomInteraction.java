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
package org.ol3cesium.client.ol.interaction;

import org.ol3cesium.client.olx.interaction.DragZoomInteractionOptions;

/**
 * Allows the user to zoom the map by clicking and dragging on the map, normally 
 * combined with an ol.events.condition that limits it to when a key, 
 * shift by default, is held down.
 * 
 * To change the style of the box, use CSS and the .ol-dragzoom selector, 
 * or your custom one configured with className.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class DragZoomInteraction extends DragBoxInteraction {
    protected DragZoomInteraction() {
        //
    }
    
    public static native DragZoomInteraction create() /*-{
        return new ol.interaction.DragZoom();
    }-*/;
    
    public static native DragZoomInteraction create(DragZoomInteractionOptions options) /*-{
        return new ol.interaction.DragZoom(options);
    }-*/;
}
