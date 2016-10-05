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

import org.ol3cesium.client.olx.interaction.PinchZoomInteractionOptions;

/**
 * Allows the user to zoom the map by pinching with two fingers on a touch screen.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class PinchZoomInteraction extends PointerInteraction {
    protected PinchZoomInteraction() {
        //
    }
    
    /**
     * 
     * @return 
     */
    public static native PinchZoomInteraction create() /*-{
        return new ol.interaction.PinchZoom();
    }-*/;
    
    /**
     * 
     * @param options
     * @return 
     */
    public static native PinchZoomInteraction create(PinchZoomInteractionOptions options);
}
