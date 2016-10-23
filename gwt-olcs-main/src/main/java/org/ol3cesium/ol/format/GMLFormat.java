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
package org.ol3cesium.ol.format;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.dom.client.Node;
import org.ol3cesium.ol.Feature;
import org.ol3cesium.olx.format.GMLFormatOptions;
import org.ol3cesium.olx.format.WriteFormatOptions;

/**
 * Feature format for reading and writing data in the GML format version 3.1.1. 
 * Currently only supports GML 3.1.1 Simple Features profile.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class GMLFormat extends GMLBaseFormat {
    protected GMLFormat() {
        //
    }
    
    public static native GMLFormat create() /*-{
        return new ol.format.GML();
    }-*/;
    
    public static native GMLFormat create(GMLFormatOptions options) /*-{
        return new ol.format.GML(options);
    }-*/;
 
    /**
     * Encode an array of features in GML 3.1.1 Simple Features.
     * @param features Features.
     * @return Result.
     */
    public final native String writeFeatures(JsArray<Feature> features) /*-{
        return this.writeFeatures(features);
    }-*/;
    
    /**
     * Encode an array of features in GML 3.1.1 Simple Features.
     * @param features Features.
     * @param options Write options.
     * @return Result.
     */
    public final native String writeFeatures(JsArray<Feature> features, WriteFormatOptions options) /*-{
        return this.writeFeatures(features, options);
    }-*/;
    
    /**
     * Encode an array of features in GML 3.1.1 Simple Features.
     * @param features Features.
     * @return Node.
     */
    public final native Node writeFeaturesNode(JsArray<Feature> features) /*-{
        return this.writeFeaturesNode(features);
    }-*/;
    
    /**
     * Encode an array of features in GML 3.1.1 Simple Features.
     * @param features Features.
     * @param options Write options.
     * @return Node.
     */
    public final native Node writeFeaturesNode(JsArray<Feature> features, WriteFormatOptions options) /*-{
        return this.writeFeaturesNode(features, options);
    }-*/;
}
