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
import org.ol3cesium.ol.proj.Projection;
import org.ol3cesium.olx.format.GPXFormatOptions;
import org.ol3cesium.olx.format.ReadFormatOptions;
import org.ol3cesium.olx.format.WriteFormatOptions;

/**
 * Feature format for reading and writing data in the GPX format.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class GPXFormat extends XMLFeatureFormat {
    protected GPXFormat() {
        //
    }
    
    public static native GPXFormat create() /*-{
        return new ol.format.GPX();
    }-*/;
    
    public static native GPXFormat create(GPXFormatOptions options) /*-{
        return new ol.format.GPX(options);
    }-*/;
    
    /**
     * Read the first feature from a GPX source.
     * @param source Source.
     * @return Feature.
     */
    public final native Feature readFeature(String source) /*-{
        return this.readFeature(source);
    }-*/;
    
    /**
     * Read the first feature from a GPX source.
     * @param source Source.
     * @param options Read options.
     * @return Feature.
     */
    public final native Feature readFeature(String source, ReadFormatOptions options) /*-{
        return this.readFeature(source, options);
    }-*/;
    
    /**
     * Read all features from a GPX source.
     * @param source Source.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source) /*-{
        return this.readFeature(source);
    }-*/;
    
        /**
     * Read all features from a GPX source.
     * @param source Source.
     * @param options Read options.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source, ReadFormatOptions options) /*-{
        return this.readFeature(source, options);
    }-*/;
    
    /**
     * Read the projection from a GPX source.
     * @param source Source.
     * @return Projection
     */
    public final native Projection readProjection(String source) /*-{
        return this.readProjection(source);
    }-*/;
    
    /**
     * Encode an array of features in the GPX format.
     * @param features Features.
     * @return Result.
     */
    public final native String writeFeatures(JsArray<Feature> features) /*-{
        return this.writeFeatures(features);
    }-*/;
    
    /**
     * Encode an array of features in the GPX format.
     * @param features Features.
     * @param options Write options.
     * @return Result.
     */
    public final native String writeFeatures(JsArray<Feature> features, WriteFormatOptions options) /*-{
        return this.writeFeatures(features, options);
    }-*/;
    
    /**
     * Encode an array of features in the GPX format.
     * @param features Features.
     * @return Result.
     */
    public final native Node writeFeaturesNode(JsArray<Feature> features) /*-{
        return this.writeFeaturesNode(features);
    }-*/;
    
    /**
     * Encode an array of features in the GPX format.
     * @param features Features.
     * @param options Write options.
     * @return Result.
     */
    public final native Node writeFeaturesNode(JsArray<Feature> features, WriteFormatOptions options) /*-{
        return this.writeFeaturesNode(features, options);
    }-*/;
}
