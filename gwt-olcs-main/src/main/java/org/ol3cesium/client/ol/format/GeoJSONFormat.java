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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.Feature;
import org.ol3cesium.client.ol.geom.Geometry;
import org.ol3cesium.client.ol.proj.Projection;
import org.ol3cesium.client.olx.format.GeoJSONFormatOptions;
import org.ol3cesium.client.olx.format.ReadFormatOptions;
import org.ol3cesium.client.olx.format.WriteFormatOptions;

/**
 * Feature format for reading and writing data in the GeoJSON format.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class GeoJSONFormat extends JSONFeatureFormat {
    protected GeoJSONFormat() {
        //
    }
    
    public static native GeoJSONFormat create() /*-{
        return new ol.format.GeoJSON();
    }-*/;
    
    public static native GeoJSONFormat create(GeoJSONFormatOptions options) /*-{
        return new ol.format.GeoJSON(options);
    }-*/;
    
    /**
     * Read a feature from a GeoJSON Feature source. Only works for Feature, use readFeatures to read FeatureCollection source.
     * @param source Source.
     * @return Feature.
     */
    public final native Feature readFeature(String source) /*-{
        return this.readFeature(source);
    }-*/;
    
    /**
     * Read a feature from a GeoJSON Feature source. Only works for Feature, use readFeatures to read FeatureCollection source.
     * @param source Source.
     * @param options Read options.
     * @return Feature.
     */
    public final native Feature readFeature(String source, ReadFormatOptions options) /*-{
        return this.readFeature(source, options);
    }-*/;
    
    /**
     * Read all features from a GeoJSON source. Works with both Feature and FeatureCollection sources.
     * @param source Source.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source) /*-{
        return this.readFeatures(source);
    }-*/;
    
    /**
     * Read all features from a GeoJSON source. Works with both Feature and FeatureCollection sources.
     * @param source Source.
     * @param options Read options.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source, ReadFormatOptions options) /*-{
        return this.readFeatures(source, options);
    }-*/;
    
    /**
     * Read a geometry from a GeoJSON source.
     * @param source Source.
     * @return Geometry.
     */
    public final native Geometry readGeometry(String source) /*-{
        return this.readGeometry(source);
    }-*/;
    
    /**
     * Read a geometry from a GeoJSON source.
     * @param source Source.
     * @param options Read options.
     * @return Geometry.
     */
    public final native Geometry readGeometry(String source, ReadFormatOptions options) /*-{
        return this.readGeometry(source, options);
    }-*/;
    
    /**
     * Read the projection from a GeoJSON source.
     * @param source Source.
     * @return Projection.
     */
    public final native Projection readProjection(String source) /*-{
        return this.readProjection(source);
    }-*/;
    
    /**
     * Encode a feature as a GeoJSON Feature string.
     * @param feature Feature.
     * @return GeoJSON.
     */
    public final native String writeFeature(Feature feature) /*-{
        return this.writeFeature(feature);
    }-*/;
    
    /**
     * Encode a feature as a GeoJSON Feature string.
     * @param feature Feature.
     * @param options Write options.
     * @return GeoJSON.
     */
    public final native String writeFeature(Feature feature, WriteFormatOptions options) /*-{
        return this.writeFeature(feature, options);
    }-*/;
    
    /**
     * Encode a feature as a GeoJSON Feature string.
     * @param feature Feature.
     * @return Object.
     */
    public final native JavaScriptObject writeFeatureObject(Feature feature) /*-{
        return this.writeFeatureObject(feature);
    }-*/;
    
    /**
     * Encode a feature as a GeoJSON Feature string.
     * @param feature Feature.
     * @param options Write options.
     * @return Object.
     */
    public final native JavaScriptObject writeFeatureObject(Feature feature, WriteFormatOptions options) /*-{
        return this.writeFeatureObject(feature, options);
    }-*/;
    
    /**
     * Encode a feature as a GeoJSON Feature string.
     * @param features Features.
     * @return GeoJSON.
     */
    public final native String writeFeatures(JsArray<Feature> features) /*-{
        return this.writeFeatures(features);
    }-*/;
    
    /**
     * Encode a feature as a GeoJSON Feature string.
     * @param features Features.
     * @param options Write options.
     * @return GeoJSON.
     */
    public final native String writeFeatures(JsArray<Feature> features, WriteFormatOptions options) /*-{
        return this.writeFeatures(features, options);
    }-*/;
    
    /**
     * Encode a feature as a GeoJSON Feature string.
     * @param features Features.
     * @return GeoJSON.
     */
    public final native JavaScriptObject writeFeaturesObject(JsArray<Feature> features) /*-{
        return this.writeFeaturesObject(features);
    }-*/;
    
    /**
     * Encode a feature as a GeoJSON Feature string.
     * @param features Features.
     * @param options Write options.
     * @return GeoJSON.
     */
    public final native JavaScriptObject writeFeaturesObject(JsArray<Feature> features, WriteFormatOptions options) /*-{
        return this.writeFeaturesObject(features, options);
    }-*/;
    
    /**
     * Encode a feature as a GeoJSON Feature string.
     * @param geometry Geometry.
     * @return GeoJSON.
     */
    public final native String writeGeometry(Geometry geometry) /*-{
        return this.writeGeometry(geometry);
    }-*/;
    
    /**
     * Encode a feature as a GeoJSON Feature string.
     * @param geometry Geometry.
     * @param options Write options.
     * @return GeoJSON.
     */
    public final native String writeGeometry(Geometry geometry, WriteFormatOptions options) /*-{
        return this.writeGeometry(geometry, options);
    }-*/;
    
    // TODO
//    writeGeometryObject(geometry, opt_options){GeoJSONGeometry|GeoJSONGeometryCollection}
}
