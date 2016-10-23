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
package org.ol3cesium.olx.style;

import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.ol.Color;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class FillStyleOptions extends JavaScriptObject {
    protected FillStyleOptions() {
        //
    }
    
    public static native FillStyleOptions create() /*-{
        return {};
    }-*/;
    
    public static native FillStyleOptions create(Color color) /*-{
        return {color: color};
    }-*/;
    
    public static native FillStyleOptions create(String color) /*-{
        return {color: color};
    }-*/;
    
    /**
     * 
     * @param color Color. See ol.color for possible formats. 
     * Default null; if null, the Canvas/renderer default black will be used.
     */
    public final native void setColor(Color color) /*-{
        this.color = color;
    }-*/;
    
    /**
     * 
     * @param color Color. See ol.color for possible formats. 
     * Default null; if null, the Canvas/renderer default black will be used.
     */
    public final native void setColor(String color) /*-{
        this.color = color;
    }-*/;
}
