/* 
 * Copyright 2016 iserge.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
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

/**
 * Geometry format for reading and writing data in the WellKnownText (WKT) format.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class WKTFormat extends TextFeatureFormat {
    protected WKTFormat() {
        //
    }
    
    public static final native WKTFormat create() /*-{
        return new ol.format.WKT();
    }-*/;
    
    public static final native WKTFormat create(WKTFormatOptions options) /*-{
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
    public final native Feature readFeature(String source, WKTFormatReadOptions options) /*-{
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
    public final native JsArray<Feature> readFeatures(String source, WKTFormatReadOptions options) /*-{
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
    public final native Feature readGeometry(String source, WKTFormatReadOptions options) /*-{
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
    public final native String writeFeature(Feature feature, WKTFormatWriteOptions options) /*-{
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
    public final native String writeFeature(JsArray<Feature> features, WKTFormatWriteOptions options) /*-{
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
    
    public static class WKTFormatReadOptions extends JavaScriptObject {
        protected WKTFormatReadOptions() {
            //
        }
        
        public static native WKTFormatReadOptions create() /*-{
            return {};
        }-*/;
        
        /**
         * Projection of the data we are reading. 
         * If not provided, the projection will be derived from the data 
         * (where possible) or the defaultDataProjection of the format is 
         * assigned (where set). If the projection can not be derived from 
         * the data and if no defaultDataProjection is set for a format, 
         * the features will not be reprojected.
         * @param dataProjection 
         */
        public final native void setDataProjection(Projection dataProjection) /*-{
            this.dataProjection = dataProjection;
        }-*/;
        
        /**
         * Projection of the feature geometries created by the format reader. 
         * If not provided, features will be returned in the dataProjection.
         * @param featureProjection 
         */
        public final native void setFeatureProjection(Projection featureProjection) /*-{
            this.featureProjection = featureProjection;
        }-*/;
        
        /**
         * Projection of the data we are reading. 
         * If not provided, the projection will be derived from the data 
         * (where possible) or the defaultDataProjection of the format is 
         * assigned (where set). If the projection can not be derived from 
         * the data and if no defaultDataProjection is set for a format, 
         * the features will not be reprojected.
         * @param dataProjection 
         */
        public final native void setDataProjection(String dataProjection) /*-{
            this.dataProjection = dataProjection;
        }-*/;
        
        /**
         * Projection of the feature geometries created by the format reader. 
         * If not provided, features will be returned in the dataProjection.
         * @param featureProjection 
         */
        public final native void setFeatureProjection(String featureProjection) /*-{
            this.featureProjection = featureProjection;
        }-*/;
    }
    
    public static class WKTFormatWriteOptions extends WKTFormatReadOptions {
        protected WKTFormatWriteOptions() {
            //
        }
        
        public static final native WKTFormatWriteOptions create() /*-{
            return {};
        }-*/;
        
        /**
         * When writing geometries, follow the right-hand rule for linear ring orientation. 
         * This means that polygons will have counter-clockwise exterior rings and 
         * clockwise interior rings. By default, coordinates are serialized as they 
         * are provided at construction. If true, the right-hand rule will be applied. 
         * If false, the left-hand rule will be applied (clockwise for exterior and 
         * counter-clockwise for interior rings). Note that not all formats support this. 
         * The GeoJSON format does use this property when writing geometries.
         * @param rightHanded 
         */
        public final native void setRightHanded(boolean rightHanded) /*-{
            this.rightHanded = rightHanded;
        }-*/;
    }
}
