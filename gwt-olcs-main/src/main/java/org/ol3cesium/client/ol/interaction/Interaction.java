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
package org.ol3cesium.client.ol.interaction;

import org.ol3cesium.client.ol.Map;
import org.ol3cesium.client.ol.Object;

/**
 * Abstract base class; normally only used for creating subclasses and not 
 * instantiated in apps. User actions that change the state of the map. 
 * Some are similar to controls, but are not associated with a DOM element. 
 * For example, ol.interaction.KeyboardZoom is functionally the same as 
 * ol.control.Zoom, but triggered by a keyboard event not a button element event. 
 * Although interactions do not have a DOM element, some of them do render 
 * vectors and so are visible on the screen.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Interaction extends Object {
    protected Interaction() {
        //
    }
    
    public static native Interaction create() /*-{
        return new ol.interaction.Interaction({});
    }-*/;
    
    /**
     * Return whether the interaction is currently active.
     * @return true if the interaction is active, false otherwise.
     */
    public native final boolean getActive() /*-{
        return this.getActive();
    }-*/;
    
    /**
     * Get the map associated with this interaction.
     * @return Map.
     */
    public native final Map getMap() /*-{
        return this.getMap();
    }-*/;
    
    /**
     * Activate or deactivate the interaction.
     * @param active Active.
     */
    public native final void setActive(boolean active) /*-{
        this.setActive(active);
    }-*/;
}
