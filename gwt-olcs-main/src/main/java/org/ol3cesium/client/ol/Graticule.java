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
package org.ol3cesium.client.ol;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.geom.LineString;
import org.ol3cesium.client.olx.GraticuleOptions;

/**
 * Render a grid for a coordinate system on a map.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Graticule extends JavaScriptObject {
    protected Graticule() {
        //
    }
    
    public static final native Graticule create() /*-{
        return new ol.Graticule();
    }-*/;
    
    public static final native Graticule create(GraticuleOptions options) /*-{
        return new ol.Graticule(options);
    }-*/;
    
    /**
     * Get the map associated with this graticule.
     * @return The map.
     */
    public final native Map getMap() /*-{
        return this.getMap();
    }-*/;

    /**
     * Get the list of meridians. Meridians are lines of equal longitude.
     * @return The meridians.
     */
    public final native JsArray<LineString> getMeridians() /*-{
        return this.getMeridians();
    }-*/;
    
    /**
     * Get the list of parallels. Pallels are lines of equal latitude.
     * @return The parallels.
     */
    public final native JsArray<LineString> getParallels() /*-{
        return this.getParallels();
    }-*/;
    
    /**
     * Set the map for this graticule. The graticule will be rendered on the provided map.
     * @param map Map.
     */
    public final native void setMap(Map map) /*-{
        this.setMap(map);
    }-*/;
}
