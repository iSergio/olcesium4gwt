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

import com.google.gwt.core.client.JsArrayString;
import org.ol3cesium.client.ol.event.TileLoadEventListener;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class UrlTileSource extends TileSource {
    protected UrlTileSource() {
        //
    }
    
    public final native JsArrayString getUrls() /*-{
        return this.getUrls();
    }-*/;
    
    public final native void setUrl(String url) /*-{
        this.setUrl(url);
    }-*/;
    
    public final native void setUrls(JsArrayString urls) /*-{
        this.setUrls(urls);
    }-*/;
    
    public final native void addTileLoadEventListener(TileLoadEventListener tileLoadEventListener) /*-{
        if (!this.__tileLoadEventListenerRegistered) {
            var that = this;
            
            function createCallback(type) {
                return function(event) {
                    var _event = {type: type, nativeEvent: event};
                    that.__notifyTileLoadEventListeners(_event);
                }
            }
            var types = ['tileloadstart', 'tileloadend', 'tileloaderror'];
            for (var i = 0; i < types.length; i++) {
                this.on(types[i], $entry(createCallback(types[i])), this);
            }
            
            this.__tileLoadEventListenerRegistered = true;
            this.__tileLoadEventListeners = [];
            this.__notifyTileLoadEventListeners = function(event) {
                var length = this.__tileLoadEventListeners.length;
                for (var i = 0; i < length; i++) {
                    var listener = this.__tileLoadEventListeners[i];
                    listener.@org.ol3cesium.client.ol.event.TileLoadEventListener::onTileLoad(Lorg/ol3cesium/client/ol/event/TileLoadEvent;)(event);
                }
            };
        }
        this.__tileLoadEventListeners.push(tileLoadEventListener);
    }-*/;
    
    public final native void removeTileLoadEventListener(TileLoadEventListener tileLoadEventListener) /*-{
        if (!this.__notifyTileLoadEventListeners) {
            return;
        }
        var index = this.__notifyTileLoadEventListeners.indexOf(tileLoadEventListener);
        if (index > -1) {
            this.__notifyTileLoadEventListeners.splice(tileLoadEventListener, 1);
        }
    }-*/;
}
