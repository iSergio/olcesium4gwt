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
package org.ol3cesium.client.olx.source;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class MapQuestSourceOptions extends JavaScriptObject {
    protected MapQuestSourceOptions() {
        //
    }
    
    public static final native MapQuestSourceOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Layer. Possible values are osm, sat, and hyb. Required.
     * @param layer 
     */
    public final native void setLayer(String layer) /*-{
        this.layer = layer;
    }-*/;
    
    /**
     * Maximum allowed reprojection error (in pixels). Default is 0.5. 
     * Higher values can increase reprojection performance, but decrease precision.
     * @param reprojectionErrorThreshold 
     */
    public final native void setReprojectionErrorThreshold(double reprojectionErrorThreshold) /*-{
        this.reprojectionErrorThreshold = reprojectionErrorThreshold;
    }-*/;

//tileLoadFunction	ol.TileLoadFunctionType | undefined	experimental
//Optional function to load a tile given a URL.
    
    /**
     * URL template. Must include {x}, {y} or {-y}, and {z} placeholders.
     * @param url 
     */
    public final native void setUrl(String url) /*-{
        this.url = url;
    }-*/;
}
