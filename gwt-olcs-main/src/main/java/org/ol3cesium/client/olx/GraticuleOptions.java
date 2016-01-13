/*
 * Copyright 2016 Serge Silaev aka iSergio <s.serge.b@gmail.com>.
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
package org.ol3cesium.client.olx;

import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.client.ol.Map;
import org.ol3cesium.client.ol.style.StrokeStyle;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class GraticuleOptions extends JavaScriptObject {
    protected GraticuleOptions() {
        //
    }
    
    public static final native GraticuleOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param map Reference to an ol.Map object.
     */
    public final native void setMap(Map map) /*-{
        this.map = map;
    }-*/;

    /**
     * 
     * @param maxLines The maximum number of meridians and parallels from the 
     * center of the map. The default value is 100, which means that at most 
     * 200 meridians and 200 parallels will be displayed. The default value 
     * is appropriate for conformal projections like Spherical Mercator. 
     * If you increase the value more lines will be drawn and the drawing 
     * performance will decrease.
     */
    public final native void setMaxLines(int maxLines) /*-{
        this.maxLines = maxLines;
    }-*/;
    
    /**
     * 
     * @param strokeStyle The stroke style to use for drawing the graticule. 
     * If not provided, the lines will be drawn with rgba(0,0,0,0.2), 
     * a not fully opaque black.
     */
    public final native void setStrokeStyle(StrokeStyle strokeStyle) /*-{
        this.strokeStyle = strokeStyle;
    }-*/;
    
    /**
     * 
     * @param targetSize The target size of the graticule cells, in pixels. 
     * Default value is 100 pixels.
     */
    public final native void setTargetSize(int targetSize) /*-{
        this.targetSize = targetSize;
    }-*/;
}
