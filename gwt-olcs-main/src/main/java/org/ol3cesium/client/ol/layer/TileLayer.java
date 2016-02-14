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
package org.ol3cesium.client.ol.layer;

import org.ol3cesium.client.olx.layer.TileLayerOptions;
import org.ol3cesium.client.ol.event.TileLayerChangeEventListener;
import org.ol3cesium.client.ol.source.TileSource;

/**
 * For layer sources that provide pre-rendered, tiled images in grids that are 
 * organized by zoom levels for specific resolutions. Note that any property set 
 * in the options is set as a ol.Object property on the layer object; for example, 
 * setting title: 'My Title' in the options means that title is observable, 
 * and has get/set accessors.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileLayer extends Layer {
    protected TileLayer() {
        //
    }
    
    public static final native TileLayer create() /*-{
        var tile = new ol.layer.Tile();
        tile.set('className', @org.ol3cesium.client.ol.layer.BaseLayer::TILE_LAYER_CLASS_NAME);
        return tile;
    }-*/;
    
    public static final native TileLayer create(TileLayerOptions options) /*-{
        var tile = new ol.layer.Tile(options);
        tile.set('className', @org.ol3cesium.client.ol.layer.BaseLayer::TILE_LAYER_CLASS_NAME);
        return tile;
    }-*/;

    /**
     * Return the level as number to which we will preload tiles up to.
     * @return The level to preload tiles up to.
     */
    public final native int getPreload() /*-{
        return this.getPreload();
    }-*/;
    
    /**
     * Return the associated tilesource of the layer.
     * @return Source
     */
    public final native TileSource getTileSource() /*-{
        return this.getSource();
    }-*/;

    /**
     * Whether we use interim tiles on error.
     * @return Use interim tiles on error.
     */
    public final native boolean getUseInterimTilesOnError() /*-{
        return this.getUseInterimTilesOnError();
    }-*/;
    
    /**
     * Set the level as number to which we will preload tiles up to.
     * @param preload The level to preload tiles up to.
     */
    public final native void setPreload(int preload) /*-{
        this.setPreload(preload);
    }-*/;
    
    /**
     * Set whether we use interim tiles on error.
     * @param useInterimTilesOnError Use interim tiles on error.
     */
    public final native void setUseInterimTilesOnError(boolean useInterimTilesOnError) /*-{
        this.setUseInterimTilesOnError(useInterimTilesOnError);
    }-*/;
    
    public final native void addTileLayerChangeEventListener(TileLayerChangeEventListener tileLayerChangeEventListener) /*-{
        if (!this.__tileLayerChangeEventListenerRegistered) {
            var that = this;
            
            function createCallback(type) {
                return function(event) {
                    var _event = {type: type, layer: that, nativeEvent: event};
                    that.__notifyTileLayerChangeEventListeners(_event);
                }
            }
            var types = ['extent', 'maxResolution', 'minResolution', 'opacity', 'preload', 'source', 'useInterimTilesOnError', 'visible', 'zIndex'];
            for (var i = 0; i < types.length; i++) {
                this.on('change:' + types[i], $entry(createCallback(types[i])), this);
            }
            
            this.__tileLayerChangeEventListenerRegistered = true;
            this.__tileLayerChangeEventListeners = [];
            this.__notifyTileLayerChangeEventListeners = function(event) {
                var length = this.__tileLayerChangeEventListeners.length;
                for (var i = 0; i < length; i++) {
                    var listener = this.__tileLayerChangeEventListeners[i];
                    listener.@org.ol3cesium.client.ol.event.TileLayerChangeEventListener::onTileLayerChange(Lorg/ol3cesium/client/ol/event/TileLayerChangeEvent;)(event);
                }
            };
        }
        this.__tileLayerChangeEventListeners.push(tileLayerChangeEventListener);
    }-*/;
    
    public final native void removeTileLayerChangeEventListener(TileLayerChangeEventListener tileLayerChangeEventListener) /*-{
        if (!this.__tileLayerChangeEventListeners) {
            return;
        }
        var index = this.__tileLayerChangeEventListeners.indexOf(tileLayerChangeEventListener);
        if (index > -1) {
            this.__tileLayerChangeEventListeners.splice(tileLayerChangeEventListener, 1);
        }
    }-*/;
}
