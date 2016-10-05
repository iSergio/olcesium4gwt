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
package org.ol3cesium.client.ol.event;

import org.ol3cesium.client.ol.layer.BaseLayer;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class GroupLayerChangeEvent extends Event {
    public enum Type {EXTENT, LAYERS, MAX_RESOLUTION, MIN_RESOLUTION, OPACITY, VISIBLE, ZINDEX, UNKNOWN}

    protected GroupLayerChangeEvent() {
        //
    }
    
    public final native BaseLayer getLayer() /*-{
        return this.layer;
    }-*/;
    
    public final Type getType() {
        String type = getNativeType();
        switch (type) {
            case "extent":
                return Type.EXTENT;
            case "layers":
                return Type.LAYERS;
            case "maxResolution":
                return Type.MAX_RESOLUTION;
            case "minResolution":
                return Type.MIN_RESOLUTION;
            case "opacity":
                return Type.OPACITY;
            case "visible":
                return Type.VISIBLE;
            case "zIndex":
                return Type.ZINDEX;
            default:
                return Type.UNKNOWN;
        }
    }
}
