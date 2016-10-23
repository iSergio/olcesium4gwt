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
package org.ol3cesium.olx.format;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.ol.style.Style;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class KMLFormatOptions extends JavaScriptObject {
    protected KMLFormatOptions() {
        //
    }
    
    public static native KMLFormatOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param extractStyles Extract styles from the KML. Default is true.
     */
    public final native void setExtractStyles(boolean extractStyles) /*-{
        this.extractStyles = extractStyles;
    }-*/;

    /**
     * 
     * @param showPointNames Show names as labels for placemarks which contain points. Default is true.
     */
    public final native void setShowPointNames(boolean showPointNames) /*-{
        this.showPointNames = showPointNames;
    }-*/;

    /**
     * 
     * @param defaultStyle Default style. The default default style is the same as Google Earth.
     */
    public final native void setDefaultStyle(JsArray<Style> defaultStyle) /*-{
        this.defaultStyle = defaultStyle;
    }-*/;

    /**
     * 
     * @param writeStyles Write styles into KML. Default is true.
     */
    public final native void setWriteStyles(boolean writeStyles) /*-{
        this.writeStyles = writeStyles;
    }-*/;
}
