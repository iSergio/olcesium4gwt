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

import org.ol3cesium.client.olx.layer.VectorTileLayerOptions;
import org.ol3cesium.client.ol.event.VectorTileLayerChangeEventListener;

/**
 * Layer for vector tile data that is rendered client-side. Note that any 
 * property set in the options is set as a ol.Object property on the layer object; 
 * for example, setting title: 'My Title' in the options means that title is 
 * observable, and has get/set accessors.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class VectorTileLayer extends VectorLayer {
    protected VectorTileLayer() {
        //
    }
    
    public static final native VectorTileLayer create() /*-{
        var vectorTile = new ol.layer.VectorTile();
        vectorTile.set('className', @org.ol3cesium.client.ol.layer.BaseLayer::VECTOR_TILE_LAYER_CLASS_NAME);
        return vectorTile;
    }-*/;
    
    public static final native VectorTileLayer create(VectorTileLayerOptions options) /*-{
        var vectorTile = new ol.layer.VectorTile(options);
        vectorTile.set('className', @org.ol3cesium.client.ol.layer.BaseLayer::VECTOR_TILE_LAYER_CLASS_NAME);
        return vectorTile;
    }-*/;
    
    /**
     * Return the level as number to which we will preload tiles up to.
     * @return The level to preload tiles up to.
     */
    public final native int getPreload() /*-{
        return this.getPreload();
    }-*/;

//    /**
//     * Return the associated source of the layer.
//     * @return Source.
//     */
//    public final native VectorTileSource getVectorTileSource() /*-{
//        return this.getSource();
//    }-*/;
    
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
    
    public final native void addTileLayerChangeEventListener(VectorTileLayerChangeEventListener vectorTileLayerChangeEventListener) /*-{
        if (!this.__vectorTileLayerChangeEventListenerRegistered) {
            var that = this;
            
            function createCallback(type) {
                return function(event) {
                    var _event = {type: type, layer: that, nativeEvent: event};
                    that.__notifyVectorTileLayerChangeEventListeners(_event);
                }
            }
            var types = ['extent', 'maxResolution', 'minResolution', 'opacity', 'preload', 'source', 'useInterimTilesOnError', 'visible', 'zIndex'];
            for (var i = 0; i < types.length; i++) {
                this.on('change:' + types[i], $entry(createCallback(types[i])), this);
            }
            
            this.__vectorTileLayerChangeEventListenerRegistered = true;
            this.__vectorTileLayerChangeEventListeners = [];
            this.__notifyVectorTileLayerChangeEventListeners = function(event) {
                var length = this.__vectorTileLayerChangeEventListeners.length;
                for (var i = 0; i < length; i++) {
                    var listener = this.__vectorTileLayerChangeEventListeners[i];
                    listener.@org.ol3cesium.client.ol.event.VectorTileLayerChangeEventListener::onVectorTileLayerChange(Lorg/ol3cesium/client/ol/event/VectorTileLayerChangeEvent;)(event);
                }
            };
        }
        this.__vectorTileLayerChangeEventListeners.push(vectorTileLayerChangeEventListener);
    }-*/;
    
    public final native void removeTileLayerChangeEventListener(VectorTileLayerChangeEventListener vectorTileLayerChangeEventListener) /*-{
        if (!this.__vectorTileLayerChangeEventListeners) {
            return;
        }
        var index = this.__vectorTileLayerChangeEventListeners.indexOf(vectorTileLayerChangeEventListener);
        if (index > -1) {
            this.__vectorTileLayerChangeEventListeners.splice(vectorTileLayerChangeEventListener, 1);
        }
    }-*/;
}
