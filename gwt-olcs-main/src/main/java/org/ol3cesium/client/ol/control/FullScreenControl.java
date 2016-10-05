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
package org.ol3cesium.client.ol.control;

import org.ol3cesium.client.olx.control.FullScreenControlOptions;

/**
 * Provides a button that when clicked fills up the full screen with the map. 
 * When in full screen mode, a close button is shown to exit full screen mode. 
 * The Fullscreen API is used to toggle the map in full screen mode.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class FullScreenControl extends Control {
    protected FullScreenControl() {
        //
    }
    
    public static final native FullScreenControl create() /*-{
        return new ol.control.FullScreen();
    }-*/;
    
    public static final native FullScreenControl create(FullScreenControlOptions options) /*-{
        return new ol.control.FullScreen(options);
    }-*/;
}
