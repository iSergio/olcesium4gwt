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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.source;

import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.client.olx.source.ImageArcGISRestSourceOptions;

/**
 * Source for data from ArcGIS Rest services providing single, untiled images. 
 * Useful when underlying map service has labels.
 * If underlying map service is not using labels, take advantage of ol image 
 * caching and use ol.source.TileArcGISRest data source.
 * @author iserge
 */
public class ImageArcGISRestSource extends ImageSource {
    protected ImageArcGISRestSource() {
        //
    }
    
    public static final native ImageArcGISRestSource create() /*-{
        return new ol.source.ImageArcGISRest();
    }-*/;
    
    /**
     * 
     * @param options Image ArcGIS Rest Options.
     * @return 
     */
    public static final native ImageArcGISRestSource create(ImageArcGISRestSourceOptions options) /*-{
        return new ol.source.ImageArcGISRest(options);
    }-*/;
    
    /**
     * Get the user-provided params, i.e. those passed to the constructor through 
     * the "params" option, and possibly updated using the updateParams method.
     * @return Params
     */
    public final native JavaScriptObject getParams() /*-{
        return this.getParams();
    }-*/;
    
    /**
     * Return the URL used for this ArcGIS source.
     * @return URL
     */
    public final native String getUrl() /*-{
        return this.getUrl();
    }-*/;
    
    /**
     * Set the URL to use for requests.
     * @param url URL
     */
    public final native void setUrl(String url) /*-{
        return this.setUrl(url);
    }-*/;
    
    /**
     * Update the user-provided params.
     * @param params Params
     */
    public final native void updateParams(JavaScriptObject params) /*-{
        this.updateParams(params);
    }-*/;
}
