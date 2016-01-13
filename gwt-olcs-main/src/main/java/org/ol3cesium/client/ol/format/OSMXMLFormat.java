/*
 * Copyright 2016 Serge Silaev aka iSergio <s.serge.b@gmail.com>.
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

import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.Feature;
import org.ol3cesium.client.ol.proj.Projection;
import org.ol3cesium.client.olx.format.ReadFormatOptions;

/**
 * Feature format for reading data in the OSMXML format.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OSMXMLFormat extends XMLFeatureFormat {
    protected OSMXMLFormat() {
        //
    }
    
    public static final native OSMXMLFormat create() /*-{
        return new ol.format.OSMXML();
    }-*/;
    
    /**
     * Read all features from an OSM source.
     * this will return the feature in an array.
     * @param source Source.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source) /*-{
        return this.readFeature(source);
    }-*/;
    
    /**
     * Read all features from an OSM source.
     * this will return the feature in an array.
     * @param source Source.
     * @param options Read options.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source, ReadFormatOptions options) /*-{
        return this.readFeature(source, options);
    }-*/;
    
    /**
     * Read the projection from an OSM source.
     * @param source Source.
     * @return Projection
     */
    public final native Projection readProjection(String source) /*-{
        return this.readProjection(source);
    }-*/;
}
