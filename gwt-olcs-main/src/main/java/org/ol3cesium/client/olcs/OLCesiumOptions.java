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
package org.ol3cesium.client.olcs;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import org.ol3cesium.client.ol.Map;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OLCesiumOptions extends JavaScriptObject {
    protected OLCesiumOptions() {
        //
    }
    
    public static native OLCesiumOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param map The OpenLayers map we want to show on a Cesium scene.
     */
    public final native void setMap(Map map) /*-{
        this.map = map;
    }-*/;
    
    /**
     * 
     * @param target Target element for the Cesium scene.
     */
    public final native void setTarget(String target) /*-{
        this.target = target;
    }-*/;
    
    /**
     * 
     * @param target Target element for the Cesium scene.
     */
    public final native void setTarget(Element target) /*-{
        this.target = target;
    }-*/;
}
