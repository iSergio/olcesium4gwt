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

import org.ol3cesium.client.ol.Coordinate;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ViewChangeEvent extends Event {
    public enum Type {CENTER, RESOLUTION, ROTATION, UNKNOWN}

    protected ViewChangeEvent() {
        //
    }
    
    public final Type getType() {
        String type = getNativeType();
        if (type.equals("center")) {
            return Type.CENTER;
        }
        else if (type.equals("resolution")) {
            return Type.RESOLUTION;
        }
        else if (type.equals("rotation")) {
            return Type.ROTATION;
        } else {
            return Type.UNKNOWN;
        }
    }

    public final native Coordinate getCenter() /*-{
        return this.center;
    }-*/;
    
    public final native double getResoluton() /*-{
        return this.resolution;
    }-*/;
    
    public final native double getRotation() /*-{
        return this.rotation;
    }-*/;
}
