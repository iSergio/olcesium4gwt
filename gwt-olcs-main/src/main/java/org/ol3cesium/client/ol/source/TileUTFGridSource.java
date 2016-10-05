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

import org.ol3cesium.client.olx.source.TileUTFGridSourceOptions;

/**
 * Layer source for UTFGrid interaction data loaded from TileJSON format.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileUTFGridSource extends TileSource {
    protected TileUTFGridSource() {
        //
    }
    
    public static final native TileUTFGridSource create(TileUTFGridSourceOptions options) /*-{
        return new ol.source.TileUTFGrid(options);
    }-*/;

    /**
     * Return the template from TileJSON.
     * @return The template from TileJSON.
     */
    public final native String getTemplate() /*-{
        return this.getTemplate();
    }-*/;
}
