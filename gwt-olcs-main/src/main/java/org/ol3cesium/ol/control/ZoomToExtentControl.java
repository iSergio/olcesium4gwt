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
package org.ol3cesium.ol.control;

import org.ol3cesium.olx.control.ZoomToExtentControlOptions;

/**
 * A button control which, when pressed, changes the map view to a specific extent. 
 * To style this control use the css selector .ol-zoom-extent.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ZoomToExtentControl extends Control {
    protected ZoomToExtentControl() {
        //
    }
    
    public static native ZoomToExtentControl create() /*-{
        return new ol.control.ZoomToExtent();
    }-*/;
    
    public static native ZoomToExtentControl create(ZoomToExtentControlOptions options) /*-{
        return new ol.control.ZoomToExtent(options);
    }-*/;
}
