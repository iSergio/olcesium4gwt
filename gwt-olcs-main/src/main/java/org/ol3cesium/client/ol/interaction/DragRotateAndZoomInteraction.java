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

import org.ol3cesium.client.olx.interaction.DragRotateAndZoomInteractionOptions;

/**
 * Allows the user to zoom and rotate the map by clicking and dragging on the map. 
 * By default, this interaction is limited to when the shift key is held down.
 * 
 * This interaction is only supported for mouse devices.
 * 
 * And this interaction is not included in the default interactions.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class DragRotateAndZoomInteraction extends PointerInteraction {
    protected DragRotateAndZoomInteraction() {
        //
    }
    
    public static final native DragRotateAndZoomInteraction create() /*-{
        return new ol.interaction.DragRotateAndZoom();
    }-*/;
    
    public static final native DragRotateAndZoomInteraction create(DragRotateAndZoomInteractionOptions options) /*-{
        return new ol.interaction.DragRotateAndZoom(options);
    }-*/;
}
