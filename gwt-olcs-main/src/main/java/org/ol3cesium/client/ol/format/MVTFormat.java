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
package org.ol3cesium.client.ol.format;

import com.google.gwt.core.client.JsArrayString;
import org.ol3cesium.client.olx.format.MVTFormatOptions;

/**
 * Feature format for reading data in the Mapbox MVT format.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class MVTFormat extends FeatureFormat {
    protected MVTFormat() {
        //
    }
    
    public static native MVTFormat create() /*-{
        return new ol.format.MVT();
    }-*/;
    
    public static native MVTFormat create(MVTFormatOptions options) /*-{
        return new ol.format.MVT(options);
    }-*/;
    
    /**
     * Sets the layers that features will be read from.
     * @param layers 
     */
    public final native void setLayers(JsArrayString layers) /*-{
        this.setLayers(layers);
    }-*/;
}
