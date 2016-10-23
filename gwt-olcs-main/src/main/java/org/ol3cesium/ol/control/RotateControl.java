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

import org.ol3cesium.olx.control.RotateControlOptions;

/**
 * A button control to reset rotation to 0. To style this control use css 
 * selector .ol-rotate. A .ol-hidden css selector is added to the button 
 * when the rotation is 0.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class RotateControl extends Control {
    protected RotateControl() {
        //
    }
    
    public static native RotateControl create() /*-{
        return new ol.control.Rotate();
    }-*/;
    
    public static native RotateControl create(RotateControlOptions options) /*-{
        return new ol.control.Rotate(options);
    }-*/;
}
