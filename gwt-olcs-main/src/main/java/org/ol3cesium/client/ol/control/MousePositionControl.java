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

import org.ol3cesium.client.olx.control.MousePositionControlOptions;
import org.ol3cesium.client.ol.proj.Projection;

/**
 * A control to show the 2D coordinates of the mouse cursor. 
 * By default, these are in the view projection, but can be in any supported 
 * projection. By default the control is shown in the top right corner of the 
 * map, but this can be changed by using the css selector .ol-mouse-position.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class MousePositionControl extends Control {
    protected MousePositionControl() {
        //
    }
    
    public static final native MousePositionControl create() /*-{
        return new ol.control.MousePosition();
    }-*/;
    
    public static final native MousePositionControl create(MousePositionControlOptions options) /*-{
        return new ol.control.MousePosition(options);
    }-*/;
    
    /**
     * Return the projection that is used to report the mouse position.
     * @return The projection to report mouse position in.
     */
    public final native Projection getProjection() /*-{
        return this.getProjection();
    }-*/;
    
    /**
     * Set the projection that is used to report the mouse position.
     * @param projection The projection to report mouse position in.
     */
    public final native void setProjection(Projection projection) /*-{
        this.setProjection(projection);
    }-*/;
}
