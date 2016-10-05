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

import org.ol3cesium.client.olx.control.ControlOptions;
import com.google.gwt.dom.client.Element;
import org.ol3cesium.client.ol.Map;
import org.ol3cesium.client.ol.Object;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Control extends Object {
    protected Control() {
        //
    }
    
    public static final native Control create(ControlOptions options) /*-{
        return new ol.control.Control(options);
    }-*/;
    
    /**
     * Get the map associated with this control.
     * @return Map.
     */
    public final native Map getMap() /*-{
        return this.getMap();
    }-*/;
    
    /**
     * Remove the control from its current map and attach it to the new map. 
     * Subclasses may set up event handlers to get notified about changes to the map here.
     * @param map Map.
     */
    public final native void setMap(Map map) /*-{
        this.setMap(map);
    }-*/;
    
    /**
     * This function is used to set a target element for the control. 
     * It has no effect if it is called after the control has been 
     * added to the map (i.e. after setMap is called on the control). 
     * If no target is set in the options passed to the control constructor and 
     * if setTarget is not called then the control is added to the map's overlay container.
     * @param target Target.
     */
    public final native void setTarget(Element target) /*-{
        this.setTarget(target);
    }-*/;
    
    /**
     * This function is used to set a target element for the control. 
     * It has no effect if it is called after the control has been 
     * added to the map (i.e. after setMap is called on the control). 
     * If no target is set in the options passed to the control constructor and 
     * if setTarget is not called then the control is added to the map's overlay container.
     * @param target Target.
     */
    public final native void setTarget(String target) /*-{
        this.setTarget(target);
    }-*/;
}
