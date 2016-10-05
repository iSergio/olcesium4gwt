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

import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;
import org.ol3cesium.client.ol.Feature;
import org.ol3cesium.client.ol.geom.Geometry;
import org.ol3cesium.client.ol.proj.Projection;
import org.ol3cesium.client.olx.format.PolylineFormatOptions;
import org.ol3cesium.client.olx.format.ReadFormatOptions;
import org.ol3cesium.client.olx.format.WriteFormatOptions;

/**
 * Feature format for reading and writing data in the Encoded Polyline Algorithm Format.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class PolylineFormat extends TextFeatureFormat {
    protected PolylineFormat() {
        //
    }
    
    public static final native PolylineFormat create() /*-{
        retrun new ol.format.Polyline();
    }-*/;
    
    public static final native PolylineFormat create(PolylineFormatOptions options) /*-{
        retrun new ol.format.Polyline(options);
    }-*/;
    
    /**
     * Decode a list of n-dimensional points from an encoded string
     * @param encoded An encoded string.
     * @param stride The number of dimension of the points in the encoded string.
     * @return 
     */
    public static final native JsArrayNumber decodeDeltas(String encoded, int stride) /*-{
        return ol.format.Polyline.decodeDeltas(encoded, stride);
    }-*/;
    
    /**
     * Decode a list of n-dimensional points from an encoded string
     * @param encoded An encoded string.
     * @param stride The number of dimension of the points in the encoded string.
     * @param factor The factor by which the resulting numbers will be divided. Default is 1e5.
     * @return A list of n-dimensional points.
     */
    public static final native JsArrayNumber decodeDeltas(String encoded, int stride, double factor) /*-{
        return ol.format.Polyline.decodeDeltas(encoded, stride, factor);
    }-*/;
    
    /**
     * Decode a list of floating point numbers from an encoded string
     * @param encoded An encoded string.
     * @return A list of floating point numbers.
     */
    public static final native JsArrayNumber decodeFloats(String encoded) /*-{
        return ol.format.Polyline.decodeFloats(encoded);
    }-*/;
    
    /**
     * Decode a list of floating point numbers from an encoded string
     * @param encoded An encoded string.
     * @param factor The factor by which the result will be divided. Default is 1e5.
     * @return A list of floating point numbers.
     */
    public static final native JsArrayNumber decodeFloats(String encoded, double factor) /*-{
        return ol.format.Polyline.decodeFloats(encoded, factor);
    }-*/;
    
    /**
     * Encode a list of n-dimensional points and return an encoded string
     * Attention: This function will modify the passed array!
     * @param numbers A list of n-dimensional points.
     * @param stride The number of dimension of the points in the list.
     * @return The encoded string.
     */
    public static final native String encodeDeltas(JsArrayNumber numbers, int stride) /*-{
        return ol.format.Polyline.encodeDeltas(numbers, stride);
    }-*/;
    
    /**
     * Encode a list of n-dimensional points and return an encoded string
     * Attention: This function will modify the passed array!
     * @param numbers A list of n-dimensional points.
     * @param stride The number of dimension of the points in the list.
     * @param factor The factor by which the numbers will be multiplied. 
     * The remaining decimal places will get rounded away. Default is 1e5.
     * @return The encoded string.
     */
    public static final native String encodeDeltas(JsArrayNumber numbers, int stride, double factor) /*-{
        return ol.format.Polyline.encodeDeltas(numbers, stride, factor);
    }-*/;
    
    /**
     * Encode a list of floating point numbers and return an encoded string
     * Attention: This function will modify the passed array!
     * @param numbers A list of floating point numbers.
     * @return The encoded string.
     */
    public static final native String encodeFloats(JsArrayNumber numbers) /*-{
        return ol.format.Polyline.encodeFloats(numbers);
    }-*/;
    
    /**
     * Encode a list of floating point numbers and return an encoded string
     * Attention: This function will modify the passed array!
     * @param numbers A list of floating point numbers.
     * @param factor The factor by which the numbers will be multiplied. 
     * The remaining decimal places will get rounded away. Default is 1e5.
     * @return The encoded string.
     */
    public static final native String encodeFloats(JsArrayNumber numbers, double factor) /*-{
        return ol.format.Polyline.encodeFloats(numbers, factor);
    }-*/;
    
    /**
     * Read the feature from the source. As Polyline sources 
     * contain a single feature, this will return the feature in an array.
     * @param source Source.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source) /*-{
        return this.readFeature(source);
    }-*/;
    
    /**
     * Read the feature from the source. As Polyline sources 
     * contain a single feature, this will return the feature in an array.
     * @param source Source.
     * @param options Read options.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source, ReadFormatOptions options) /*-{
        return this.readFeature(source, options);
    }-*/;
    
    /**
     * Read the geometry from the source.
     * @param source Source.
     * @return Geometry.
     */
    public final native Geometry readGeometry(String source) /*-{
        return this.readGeometry(source);
    }-*/;
    
    /**
     * Read the geometry from the source.
     * @param source Source.
     * @param options Read options.
     * @return Geometry.
     */
    public final native Geometry readGeometry(String source, ReadFormatOptions options) /*-{
        return this.readGeometry(source, options);
    }-*/;
    
    /**
     * Read the projection from a Polyline source.
     * @param source Source.
     * @return Projection
     */
    public final native Projection readProjection(String source) /*-{
        return this.readProjection(source);
    }-*/;
    
    /**
     * Write a single geometry in Polyline format.
     * @param geometry Geometry.
     * @return Geometry.
     */
    public final native String writeGeometry(Geometry geometry) /*-{
        return this.writeGeometry(geometry);
    }-*/;
    
    /**
     * Write a single geometry in Polyline format.
     * @param geometry Geometry.
     * @param options Write options.
     * @return Geometry.
     */
    public final native String writeGeometry(Geometry geometry, WriteFormatOptions options) /*-{
        return this.writeGeometry(geometry, options);
    }-*/;
}
