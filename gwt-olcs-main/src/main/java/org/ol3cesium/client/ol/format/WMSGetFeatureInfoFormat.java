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
import org.ol3cesium.client.ol.Feature;
import org.ol3cesium.client.olx.format.ReadFormatOptions;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class WMSGetFeatureInfoFormat extends XMLFeatureFormat {
    protected WMSGetFeatureInfoFormat() {
        //
    }
    
    public static final native WMSGetFeatureInfoFormat create() /*-{
        return new ol.format.WMSGetFeatureInfo();
    }-*/;
    
    /**
     * Read all features from a WMSGetFeatureInfo response.
     * @param source Source.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source) /*-{
        return this.readFeatures(source);
    }-*/;
    
    /**
     * Read all features from a WMSGetFeatureInfo response.
     * @param source Source.
     * @param options Read options.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source, ReadFormatOptions options) /*-{
        return this.readFeatures(source, options);
    }-*/;
}
