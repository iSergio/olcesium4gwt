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
import org.ol3cesium.olx.format.KMLFormatOptions;
import org.ol3cesium.olx.format.ReadFormatOptions;
import org.ol3cesium.olx.format.WriteFormatOptions;

/**
 * Feature format for reading and writing data in the KML format.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class KMLFormat extends XMLFeatureFormat {
    protected KMLFormat() {
        //
    }
    
    public static native KMLFormat create() /*-{
        return new ol.format.KML();
    }-*/;
    
    public static native KMLFormat create(KMLFormatOptions options) /*-{
        return new ol.format.KML(options);
    }-*/;
    
    /**
     * Read the first feature from a KML source.
     * @param source Source.
     * @return Feature.
     */
    public final native Feature readFeature(String source) /*-{
        return this.readFeature(source);
    }-*/;
    
    /**
     * Read the first feature from a KML source.
     * @param source Source.
     * @param options Read options.
     * @return Feature.
     */
    public final native Feature readFeature(String source, ReadFormatOptions options) /*-{
        return this.readFeature(source, options);
    }-*/;
    
    /**
     * Read all features from a KML source.
     * this will return the feature in an array.
     * @param source Source.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source) /*-{
        return this.readFeature(source);
    }-*/;
    
    /**
     * Read all features from a KML source.
     * this will return the feature in an array.
     * @param source Source.
     * @param options Read options.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source, ReadFormatOptions options) /*-{
        return this.readFeature(source, options);
    }-*/;
    
    /**
     * Read the name of the KML.
     * @param source Source.
     * @return Name.
     */
    public final native String readName(String source) /*-{
        return this.readName(source);
    }-*/;
    
    /**
     * Read the network links of the KML.
     * @param source Source.
     * @return Network links.
     */
    public final native JsArray readNetworkLinks(String source) /*-{
        return this.readNetworkLinks(source);
    }-*/;
    
    /**
     * Encode an array of features in the KML format.
     * @param features Features.
     * @return Result.
     */
    public final native String writeFeatures(JsArray<Feature> features) /*-{
        return this.writeFeatures(features);
    }-*/;
    
    /**
     * Encode an array of features in the KML format.
     * @param features Features.
     * @param options Write options.
     * @return Result.
     */
    public final native String writeFeatures(JsArray<Feature> features, WriteFormatOptions options) /*-{
        return this.writeFeatures(features, options);
    }-*/;
    
    /**
     * Encode an array of features in the KML format as an XML node.
     * @param features Features.
     * @return Node.
     */
    public final native Node writeFeaturesNode(JsArray<Feature> features) /*-{
        return this.writeFeaturesNode(features);
    }-*/;
    
    /**
     * Encode an array of features in the KML format as an XML node.
     * @param features Features.
     * @param options Write options.
     * @return Node.
     */
    public final native Node writeFeaturesNode(JsArray<Feature> features, WriteFormatOptions options) /*-{
        return this.writeFeaturesNode(features, options);
    }-*/;
}
