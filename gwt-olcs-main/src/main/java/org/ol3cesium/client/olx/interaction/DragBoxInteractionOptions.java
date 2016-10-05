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
package org.ol3cesium.client.olx.interaction;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Allows the user to draw a vector box by clicking and dragging on the map, 
 * normally combined with an ol.events.condition that limits it to when the shift 
 * or other key is held down. This is used, for example, for zooming to a specific 
 * area of the map (see ol.interaction.DragZoom and ol.interaction.DragRotateAndZoom).
 * 
 * This interaction is only supported for mouse devices.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class DragBoxInteractionOptions extends JavaScriptObject {
    protected DragBoxInteractionOptions() {
        //
    }
    
    public static native DragBoxInteractionOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * CSS class name for styling the box. The default is ol-dragbox.
     * @param className CSS class name.
     */
    public final native void setClassName(String className) /*-{
        this.className = className;
    }-*/;
}
