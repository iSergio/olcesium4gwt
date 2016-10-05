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
package org.ol3cesium.client.olx.format;

import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.client.ol.geom.GeometryLayout;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class PolylineFormatOptions extends JavaScriptObject {
    protected PolylineFormatOptions() {
        //
    }
    
    public static final native PolylineFormatOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param factor The factor by which the coordinates values will be scaled. Default is 1e5. Required.
     */
    public final native void setFactor(double factor) /*-{
            this.factor = factor;
    }-*/;

    /**
     * 
     * @param geometryLayout Layout of the feature geometries created by the format reader. Default is ol.geom.GeometryLayout.XY.
     */
    public final native void setGeometryLayout(GeometryLayout geometryLayout) /*-{
        this.geometryLayout = geometryLayout;
    }-*/;
}
