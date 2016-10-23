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
package org.ol3cesium.ol.event;

import org.ol3cesium.ol.Coordinate;
import org.ol3cesium.ol.geom.Polygon;

/**
 * Events emitted by ol.interaction.DragBox instances are instances of this type.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class DragBoxInteractionEvent extends Event {
    public enum Type {BOX_END, BOX_START, UNKNOWN}

    protected DragBoxInteractionEvent() {
        //
    }
    
    public final native Coordinate getCoordinate() /*-{
        return this.cordinate;
    }-*/;
    
    public final native Polygon getGeometry() /*-{
        return this.geometry;
    }-*/;
    
    public final Type getType() {
        String type = getNativeType();
        switch (type) {
            case "boxend":
                return Type.BOX_END;
            case "boxstart":
                return Type.BOX_START;
            default:
                return Type.UNKNOWN;
        }
    }
}
