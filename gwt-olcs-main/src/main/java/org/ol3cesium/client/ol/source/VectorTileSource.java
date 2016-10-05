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

import org.ol3cesium.client.olx.source.VectorTileSourceOptions;

/**
 * Class for layer sources providing vector data divided into a tile grid, to be 
 * used with ol.layer.VectorTile. Although this source receives tiles with 
 * vector features from the server, it is not meant for feature editing. 
 * Features are optimized for rendering, their geometries are clipped at or 
 * near tile boundaries and simplified for a view resolution. See ol.source.
 * Vector for vector sources that are suitable for feature editing.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class VectorTileSource extends UrlTileSource {
    protected VectorTileSource() {
        //
    }
    
    public static native VectorTileSource create(VectorTileSourceOptions options) /*-{
        return new ol.source.VectorTile(options);
    }-*/;
}
