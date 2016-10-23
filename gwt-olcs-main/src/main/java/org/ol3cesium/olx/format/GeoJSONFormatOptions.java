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
package org.ol3cesium.olx.format;

import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.ol.proj.Projection;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class GeoJSONFormatOptions extends JavaScriptObject {
    protected GeoJSONFormatOptions() {
        //
    }
    
    public static native GeoJSONFormatOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param defaultDataProjection Default data projection.
     */
    public final native void setDefaultDataProjection(Projection defaultDataProjection) /*-{
        this.defaultDataProjection = defaultDataProjection;
    }-*/;
    
    /**
     * 
     * @param defaultDataProjection Default data projection.
     */
    public final native void setDefaultDataProjection(String defaultDataProjection) /*-{
        this.defaultDataProjection = defaultDataProjection;
    }-*/;

    /**
     * 
     * @param geometryName Geometry name to use when creating features.
     */
    public final native void setGeometryName(String geometryName) /*-{
        this.geometryName = geometryName;
    }-*/;
}
