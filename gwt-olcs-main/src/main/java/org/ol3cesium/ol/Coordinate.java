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
package org.ol3cesium.ol;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * 
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Coordinate extends JavaScriptObject {
    protected Coordinate() {
        //
    }

    public static native Coordinate create(double x, double y) /*-{
        return [x,y];
    }-*/;
    
    public static native Coordinate create(double x, double y, double z) /*-{
        return [x, y, z];
    }-*/;

    public native final double getX() /*-{
        return this[0] == null ? 0 : this[0];
    }-*/;
    
    public native final double getY() /*-{
        return this[1] == null ? 0 : this[1];
    }-*/;
    
    public native final double getZ() /*-{
        return this[2] == null ? 0 : this[2];
    }-*/;
}
