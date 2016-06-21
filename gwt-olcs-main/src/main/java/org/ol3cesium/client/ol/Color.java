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
package org.ol3cesium.client.ol;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Colors can be defined as a ol.Color array, or as strings in rgb(r,g,b) or 
 * rgba(r,g,b,a) format, or in hex #rrggbb or #rgb format. 
 * Color names, like 'red', 'blue' or 'green', may also be used with the Canvas renderer.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Color extends JavaScriptObject {
    protected Color() {
        //
    }
    
    public final static native Color create(int r, int g, int b, float a) /*-{
        return [r, g, b, a];
    }-*/;
    
    public final native void setRed(int r) /*-{
        this[0] = r;
    }-*/;
    
    public final native int getRed() /*-{
        return this[0];
    }-*/;
    
    public final native void setGreen(int g) /*-{
        this[1] = g;
    }-*/;
    
    public final native int getGren() /*-{
        return this[1];
    }-*/;
    
    public final native void setBlue(int b) /*-{
        this[2] = b;
    }-*/;
    
    public final native int getBlue() /*-{
        return this[2];
    }-*/;
    
    public final native void setAlpha(float a) /*-{
        this[3] = a;
    }-*/;
    
    public final native float getAlpha() /*-{
        return this[3];
    }-*/;
    
    public final native String asArray() /*-{
        return ol.color.asArray(this);
    }-*/;
    
    public final native String asString() /*-{
        return ol.color.asString(this);
    }-*/;
}
