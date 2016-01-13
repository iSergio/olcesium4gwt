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
package org.ol3cesium.client.ol.source;

import org.ol3cesium.client.olx.source.TileArcGISRestSourceOptions;
import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileArcGISRestSource extends TileImageSource {
    protected TileArcGISRestSource() {
        //
    }
    
    public static final native TileArcGISRestSource create() /*-{
        return new ol.source.TileArcGISRest();
    }-*/;
    
    public static final native TileArcGISRestSource create(TileArcGISRestSourceOptions options) /*-{
        return new ol.source.TileArcGISRest(options);
    }-*/;
    
    /**
     * Update the user-provided params.
     * @param params Params.
     */
    public final native void updateParams(JavaScriptObject params) /*-{
        this.updateParams(params);
    }-*/;
}
