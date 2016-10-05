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
package org.ol3cesium.client.ol.style;

import org.ol3cesium.client.olx.style.FillStyleOptions;
import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.client.ol.Color;

/**
 * Set fill style for vector features.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class FillStyle extends JavaScriptObject {
    protected FillStyle() {
        //
    }
    
    public static native FillStyle create() /*-{
        return new ol.style.Fill();
    }-*/;
    
    public static native FillStyle create(Color color) /*-{
        return new ol.style.Fill({color: color});
    }-*/;
    
    public static native FillStyle create(String color) /*-{
        return new ol.style.Fill({color: color});
    }-*/;
    
    public static native FillStyle create(FillStyleOptions options) /*-{
        return new ol.style.Fill(options);
    }-*/;
    
    /**
     * Get the fill color.
     * @return Color.
     */
    public final native Color getColor() /*-{
        return this.getColor();
    }-*/;
    
    /**
     * Set the color.
     * @param color Color.
     */
    public final native void setColor(Color color) /*-{
        this.setColor(color);
    }-*/;
}
