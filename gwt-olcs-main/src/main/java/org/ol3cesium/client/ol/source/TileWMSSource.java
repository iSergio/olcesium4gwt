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
package org.ol3cesium.client.ol.source;

import org.ol3cesium.client.olx.source.TileWMSSourceOptions;
import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.client.ol.Coordinate;
import org.ol3cesium.client.ol.proj.Projection;

/**
 * Layer source for tile data from WMS servers.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileWMSSource extends TileImageSource {
    protected TileWMSSource() {
        //
    }
    
    public static final native TileWMSSource create() /*-{
        return new ol.source.TileWMS();
    }-*/;
    
    public static final native TileWMSSource create(TileWMSSourceOptions options) /*-{
        return new ol.source.TileWMS(options);
    }-*/;
    
    /**
     * Return the GetFeatureInfo URL for the passed coordinate, resolution, and projection. 
     * Return undefined if the GetFeatureInfo URL cannot be constructed.
     * @param coordinate Coordinate.
     * @param resolution Resolution.
     * @param projection Projection.
     * @param params GetFeatureInfo params. INFO_FORMAT at least should be provided. 
     * If QUERY_LAYERS is not provided then the layers specified in the LAYERS 
     * parameter will be used. VERSION should not be specified here.
     * @return GetFeatureInfo URL.
     */
    public final native String getGetFeatureInfoUrl(Coordinate coordinate, double resolution, Projection projection, GetFeatureInfoParams params) /*-{
        return this.getGetFeatureInfoUrl(coordinate, resolution, projection, params);
    }-*/;
    
    /**
     * Return the GetFeatureInfo URL for the passed coordinate, resolution, and projection. 
     * Return undefined if the GetFeatureInfo URL cannot be constructed.
     * @param coordinate Coordinate.
     * @param resolution Resolution.
     * @param projection Projection.
     * @param params GetFeatureInfo params. INFO_FORMAT at least should be provided. 
     * If QUERY_LAYERS is not provided then the layers specified in the LAYERS 
     * parameter will be used. VERSION should not be specified here.
     * @return GetFeatureInfo URL.
     */
    public final native String getGetFeatureInfoUrl(Coordinate coordinate, double resolution, String projection, GetFeatureInfoParams params) /*-{
        return this.getGetFeatureInfoUrl(coordinate, resolution, projection, params);
    }-*/;
    
    /**
     * Get the user-provided params, i.e. those passed to the constructor through 
     * the "params" option, and possibly updated using the updateParams method.
     * @return Params JavaScriptObject
     */
    public final native JavaScriptObject getParams() /*-{
        return this.getParams();
    }-*/;
    
    /**
     * Update the user-provided params.
     * @param params JavaScriptObject
     */
    public final native void updateParams(JavaScriptObject params) /*-{
        this.updateParams(params);
    }-*/;
}
