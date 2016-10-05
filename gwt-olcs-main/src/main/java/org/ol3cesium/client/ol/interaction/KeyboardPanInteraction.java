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

import org.ol3cesium.client.olx.interaction.KeyboardPanInteractionOptions;

/**
 * Allows the user to pan the map using keyboard arrows. Note that, although 
 * this interaction is by default included in maps, the keys can only be used 
 * when browser focus is on the element to which the keyboard events are attached. 
 * By default, this is the map div, though you can change this with the 
 * keyboardEventTarget in ol.Map. document never loses focus but, for any other 
 * element, focus will have to be on, and returned to, this element if the keys 
 * are to function. See also ol.interaction.KeyboardZoom.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class KeyboardPanInteraction extends Interaction {
    protected KeyboardPanInteraction() {
        //
    }
    
    public static native KeyboardPanInteraction create() /*-{
        return new ol.interaction.KeyboardPan();
    }-*/;
    
    public static native KeyboardPanInteraction create(KeyboardPanInteractionOptions options) /*-{
        return new ol.interaction.KeyboardPan(options);
    }-*/;
}
