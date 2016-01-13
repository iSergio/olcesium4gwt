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

import org.ol3cesium.client.olx.source.MapQuestSourceOptions;

/**
 * Layer source for the MapQuest tile server.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class MapQuestSource extends XYZSource {
    protected MapQuestSource() {
        //
    }
    
    public static final native MapQuestSource create() /*-{
        return new ol.source.MapQuest();
    }-*/;
    
    public static final native MapQuestSource create(MapQuestSourceOptions options) /*-{
        return new ol.source.MapQuest(options);
    }-*/;
    
    /**
     * Get the layer of the source, either osm, sat, or hyb.
     * @return Layer.
     */
    public final native String getLayer() /*-{
        return getLayer();
    }-*/;
}
