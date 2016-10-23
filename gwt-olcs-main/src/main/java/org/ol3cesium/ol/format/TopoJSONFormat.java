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
import org.ol3cesium.ol.proj.Projection;
import org.ol3cesium.olx.format.TopoJSONFormatOptions;

/**
 * Feature format for reading data in the TopoJSON format.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TopoJSONFormat extends JSONFeatureFormat {
    protected TopoJSONFormat() {
        //
    }
    
    public static native TopoJSONFormat create() /*-{
        return new ol.format.TopoJSON();
    }-*/;
    
    public static native TopoJSONFormat create(TopoJSONFormatOptions options) /*-{
        return new ol.format.TopoJSON(options);
    }-*/;
    
    /**
     * Read all features from a TopoJSON source.
     * @param source Source.
     * @return Feature.
     */
    public final native JsArray<Feature> readFeatures(String source) /*-{
        return this.readFeatures(source);
    }-*/;
    
    /**
     * Read the projection from a TopoJSON source.
     * @param source Source.
     * @return Projection.
     */
    public final native Projection readProjection(String source) /*-{
        return this.readProjection(source);
    }-*/;
}
