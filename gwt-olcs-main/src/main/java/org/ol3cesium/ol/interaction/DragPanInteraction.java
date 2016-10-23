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
package org.ol3cesium.ol.interaction;

import org.ol3cesium.ol.Kinetic;

/**
 * Allows the user to pan the map by dragging the map.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class DragPanInteraction extends PointerInteraction {
    protected DragPanInteraction() {
        //
    }
    
    public static native DragPanInteraction create() /*-{
        return new ol.interaction.DragPan();
    }-*/;
    
    public static native DragPanInteraction create(Kinetic kinetic) /*-{
        return new ol.interaction.DragPan(kinetic);
    }-*/;
}
