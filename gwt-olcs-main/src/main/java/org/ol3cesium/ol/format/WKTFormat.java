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
import org.ol3cesium.ol.Feature;
import org.ol3cesium.ol.geom.Geometry;
import org.ol3cesium.olx.format.ReadFormatOptions;
import org.ol3cesium.olx.format.WKTFormatOptions;
import org.ol3cesium.olx.format.WriteFormatOptions;

/**
 * Geometry format for reading and writing data in the WellKnownText (WKT) format.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class WKTFormat extends TextFeatureFormat {
    protected WKTFormat() {
        //
    }
    
    public static native WKTFormat create() /*-{
        return new ol.format.WKT();
    }-*/;
    
    public static native WKTFormat create(WKTFormatOptions options) /*-{
        return new ol.format.WKT(options);
    }-*/;
    
    /**
     * Read a feature from a WKT source.
     * @param source Source.
     * @return Feature.
     */
    public final native Feature readFeature(String source) /*-{
        return this.readFeature(source);
    }-*/;
    
    /**
     * Read a feature from a WKT source.
     * @param source Source.
     * @param options Read options.
     * @return Feature.
     */
    public final native Feature readFeature(String source, ReadFormatOptions options) /*-{
        return this.readFeature(source);
    }-*/;
    
    /**
     * Read all features from a WKT source.
     * @param source Source.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source) /*-{
        return this.readFeatures(source);
    }-*/;
    
    /**
     * Read all features from a WKT source.
     * @param source Source.
     * @param options Read options.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source, ReadFormatOptions options) /*-{
        return this.readFeatures(source, options);
    }-*/;
    
    /**
     * Read a single geometry from a WKT source.
     * @param source Source.
     * @return Geometry.
     */
    public final native Geometry readGeometry(String source) /*-{
        return this.readGeometry(source);
    }-*/;
    
    /**
     * Read a single geometry from a WKT source.
     * @param source Source.
     * @param options Read options.
     * @return Geometry.
     */
    public final native Feature readGeometry(String source, ReadFormatOptions options) /*-{
        return this.readGeometry(source);
    }-*/;
    
    /**
     * Encode a feature as a WKT string.
     * @param feature Feature.
     * @return WKT String.
     */
    public final native String writeFeature(Feature feature) /*-{
        return this.writeFeature(feature);
    }-*/;
    
    /**
     * Encode a feature as a WKT string.
     * @param feature Feature.
     * @param options Read options.
     * @return WKT String.
     */
    public final native String writeFeature(Feature feature, WriteFormatOptions options) /*-{
        return this.writeFeature(feature);
    }-*/;
    
    /**
     * Encode an array of features as a WKT string.
     * @param features Features.
     * @return WKT String.
     */
    public final native String writeFeatures(JsArray<Feature> features) /*-{
        return this.writeFeatures(features);
    }-*/;
    
    /**
     * Encode an array of features as a WKT string.
     * @param features Features.
     * @param options Read options.
     * @return WKT String.
     */
    public final native String writeFeature(JsArray<Feature> features, WriteFormatOptions options) /*-{
        return this.writeFeatures(features);
    }-*/;
    
    /**
     * Write a single geometry as a WKT string.
     * @param geometry Geometry.
     * @return WKT string.
     */
    public final native String writeGeometry(Geometry geometry) /*-{
        return this.writeGeometry(geometry);
    }-*/;
}
