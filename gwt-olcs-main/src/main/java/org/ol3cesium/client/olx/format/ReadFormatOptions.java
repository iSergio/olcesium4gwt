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
import org.ol3cesium.client.ol.proj.Projection;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ReadFormatOptions extends JavaScriptObject {
    protected ReadFormatOptions() {
        //
    }
        
    public static native ReadFormatOptions create() /*-{
        return {};
    }-*/;

    /**
     * Projection of the data we are reading. 
     * If not provided, the projection will be derived from the data 
     * (where possible) or the defaultDataProjection of the format is 
     * assigned (where set). If the projection can not be derived from 
     * the data and if no defaultDataProjection is set for a format, 
     * the features will not be reprojected.
     * @param dataProjection 
     */
    public final native void setDataProjection(Projection dataProjection) /*-{
        this.dataProjection = dataProjection;
    }-*/;

    /**
     * Projection of the feature geometries created by the format reader. 
     * If not provided, features will be returned in the dataProjection.
     * @param featureProjection 
     */
    public final native void setFeatureProjection(Projection featureProjection) /*-{
        this.featureProjection = featureProjection;
    }-*/;

    /**
     * Projection of the data we are reading. 
     * If not provided, the projection will be derived from the data 
     * (where possible) or the defaultDataProjection of the format is 
     * assigned (where set). If the projection can not be derived from 
     * the data and if no defaultDataProjection is set for a format, 
     * the features will not be reprojected.
     * @param dataProjection 
     */
    public final native void setDataProjection(String dataProjection) /*-{
        this.dataProjection = dataProjection;
    }-*/;

    /**
     * Projection of the feature geometries created by the format reader. 
     * If not provided, features will be returned in the dataProjection.
     * @param featureProjection 
     */
    public final native void setFeatureProjection(String featureProjection) /*-{
        this.featureProjection = featureProjection;
    }-*/;
}
