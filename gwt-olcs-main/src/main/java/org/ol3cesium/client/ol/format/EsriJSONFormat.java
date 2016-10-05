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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.format;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.Feature;
import org.ol3cesium.client.ol.geom.Geometry;
import org.ol3cesium.client.ol.proj.Projection;
import org.ol3cesium.client.olx.format.EsriJSONFormatOptions;
import org.ol3cesium.client.olx.format.ReadFormatOptions;
import org.ol3cesium.client.olx.format.WriteFormatOptions;

/**
 * Feature format for reading and writing data in the EsriJSON format.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class EsriJSONFormat extends JSONFeatureFormat {
    protected EsriJSONFormat() {
        //
    }

    public static native EsriJSONFormat create() /*-{
        return new ol.format.EsriJSON();
    }-*/;

    public static native EsriJSONFormat create(EsriJSONFormatOptions options) /*-{
        return new ol.format.EsriJSON(options);
    }-*/;

    /**
     * Read a feature from a EsriJSON Feature source. Only works for Feature, use readFeatures to read FeatureCollection source.
     * @param source Source.
     * @return Feature.
     */
    public final native Feature readFeature(String source) /*-{
        return this.readFeature(source);
    }-*/;

    /**
     * Read a feature from a EsriJSON Feature source. Only works for Feature, use readFeatures to read FeatureCollection source.
     * @param source Source.
     * @param options Read options.
     * @return Feature.
     */
    public final native Feature readFeature(String source, ReadFormatOptions options) /*-{
        return this.readFeature(source);
    }-*/;

    /**
     * Read all features from a EsriJSON source. Works with both Feature and FeatureCollection sources.
     * @param source Source.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source) /*-{
        return this.readFeatures(source);
    }-*/;

    /**
     * Read all features from a EsriJSON source. Works with both Feature and FeatureCollection sources.
     * @param source Source.
     * @param options Read options.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source, ReadFormatOptions options) /*-{
        return this.readFeature(source);
    }-*/;

    /**
     * Read a geometry from a EsriJSON source.
     * @param source Source.
     * @return Geometry.
     */
    public final native Geometry readGeometry(String source) /*-{
        return this.readGeometry(source);
    }-*/;

    /**
     * Read a geometry from a EsriJSON source.
     * @param source Source.
     * @param options Read options.
     * @return Geometry.
     */
    public final native Geometry readGeometry(String source, ReadFormatOptions options) /*-{
        return this.readGeometry(source, options);
    }-*/;

    /**
     * Read the projection from a EsriJSON source.
     * @param source Source.
     * @return Projection.
     */
    public final native Projection readProjection(String source) /*-{
        return this.readProjection(source);
    }-*/;

    /**
     * Encode a feature as a EsriJSON Feature string.
     * @param feature Feature.
     * @return EsriJSON.
     */
    public final native String writeFeature(Feature feature) /*-{
        this.writeFeature(feature);
    }-*/;

    /**
     * Encode a feature as a EsriJSON Feature string.
     * @param feature Feature.
     * @param options Write options.
     * @return EsriJSON.
     */
    public final native String writeFeature(Feature feature, WriteFormatOptions options) /*-{
        this.writeFeature(feature, options);
    }-*/;

    /**
     * Encode a feature as a esriJSON Feature object.
     * @param feature Feature.
     * @return Object
     */
    public final native JavaScriptObject writeFeatureObject(Feature feature) /*-{
        this.writeFeatureObject(feature);
    }-*/;

    /**
     * Encode a feature as a esriJSON Feature object.
     * @param feature Feature.
     * @param options Write options.
     * @return Object
     */
    public final native JavaScriptObject writeFeatureObject(Feature feature, WriteFormatOptions options) /*-{
        this.writeFeatureObject(feature, options);
    }-*/;

    /**
     * Encode an array of features as EsriJSON.
     * @param features Features.
     * @return EsriJSON.
     */
    public final native String writeFeatures(JsArray<Feature> features) /*-{
        this.writeFeatures(features);
    }-*/;

    /**
     * Encode an array of features as EsriJSON.
     * @param features Features.
     * @param options Write options.
     * @return EsriJSON.
     */
    public final native String writeFeatures(JsArray<Feature> features, WriteFormatOptions options) /*-{
        this.writeFeatures(features, options);
    }-*/;

        /**
     * Encode an array of features as EsriJSON.
     * @param features Features.
     * @return Object
     */
    public final native JavaScriptObject writeFeaturesObject(JsArray<Feature> features) /*-{
        this.writeFeaturesObject(features);
    }-*/;

    /**
     * Encode an array of features as EsriJSON.
     * @param features Features.
     * @param options Write options.
     * @return Object
     */
    public final native JavaScriptObject writeFeaturesObject(JsArray<Feature> features, WriteFormatOptions options) /*-{
        this.writeFeaturesObject(features, options);
    }-*/;

    /**
     * Encode a geometry as a EsriJSON string.
     * @param geometry Geometry.
     * @return EsriJSON.
     */
    public final native String writeGeometry(Geometry geometry) /*-{
        return this.writeGeometry(geometry);
    }-*/;

    /**
     * Encode a geometry as a EsriJSON string.
     * @param geometry Geometry.
     * @param options Write options.
     * @return EsriJSON.
     */
    public final native String writeGeometry(Geometry geometry, WriteFormatOptions options) /*-{
        return this.writeGeometry(geometry, options);
    }-*/;

    /**
     * Encode a geometry as a EsriJSON object.
     * @param geometry Geometry.
     * @return Object.
     */
    public final native JavaScriptObject writeGeometryObject(Geometry geometry) /*-{
        return this.writeGeometryObject(geometry);
    }-*/;

    /**
     * Encode a geometry as a EsriJSON object.
     * @param geometry Geometry.
     * @param options Write options.
     * @return Object.
     */
    public final native JavaScriptObject writeGeometryObject(Geometry geometry, WriteFormatOptions options) /*-{
        return this.writeGeometryObject(geometry, options);
    }-*/;
}
