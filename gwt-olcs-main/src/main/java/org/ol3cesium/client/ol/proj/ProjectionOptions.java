/* 
 * Copyright 2016 iserge.
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
package org.ol3cesium.client.ol.proj;

import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.client.ol.Extent;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ProjectionOptions extends JavaScriptObject {
    protected ProjectionOptions() {
        //
    }
    
    public static native ProjectionOptions create() /*-{
        return {};
    }-*/;

    /**
     * 
     * @param code The SRS identifier code, e.g. EPSG:4326. Required
     */
    public final native void setCode(String code) /*-{
        this.code = code;
    }-*/;

    /**
     * 
     * @param units Required unless a proj4 projection is defined for code
     */
    public final native void setUnits(Units units) /*-{
        this.units = units;
    }-*/;
    
    /**
     * 
     * @param units Required unless a proj4 projection is defined for code
     */
    public final native void setUnits(String units) /*-{
        this.units = units;
    }-*/;

    /**
     * 
     * @param extent The validity extent for the SRS
     */
    public final native void setExtent(Extent extent) /*-{
        this.extent = extent;
    }-*/;
    
    /**
     * 
     * @param axisOrientation The axis orientation as specified in Proj4. The default is enu
     */
    public final native void setAxisOrientation(String axisOrientation) /*-{
        this.axisOrientation = axisOrientation;
    }-*/;
    
    /**
     * 
     * @param global Whether the projection is valid for the whole globe. Default is false
     */
    public final native void setGlobal(boolean global) /*-{
        this.global = global;
    }-*/;
    
    /**
     * 
     * @param worldExtent The world extent for the SRS
     */
    public final native void setWorldExtent(Extent worldExtent) /*-{
        this.worldExtent = worldExtent;
    }-*/;
}
