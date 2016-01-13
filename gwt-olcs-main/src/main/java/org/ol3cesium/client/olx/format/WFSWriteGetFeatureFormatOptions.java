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
package org.ol3cesium.client.olx.format;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import org.ol3cesium.client.ol.Extent;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class WFSWriteGetFeatureFormatOptions extends JavaScriptObject {
    protected WFSWriteGetFeatureFormatOptions() {
        //
    }
    
    public static final native WFSWriteGetFeatureFormatOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param featureNS The namespace URI used for features. Required.
     */
    public final native void setFeatureNS(String featureNS) /*-{
        this.featureNS = featureNS;
    }-*/;

    /**
     * 
     * @param featurePrefix The prefix for the feature namespace. Required.
     */
    public final native void setFeaturePrefix(String featurePrefix) /*-{
        this.featurePrefix = featurePrefix;
    }-*/;
    
    /**
     * 
     * @param featureTypes The feature type names. Required.
     */
    public final native void setFeatureTypes(JsArrayString featureTypes) /*-{
        this.featureTypes = featureTypes;
    }-*/;

    /**
     * 
     * @param srsName SRS name. No srsName attribute will be set on geometries when this is not provided.
     */
    public final native void setSrsName(String srsName) /*-{
        this.srsName = srsName;
    }-*/;

    /**
     * 
     * @param handle Handle.
     */
    public final native void setHandle(String handle) /*-{
        this.handle = handle;
    }-*/;

    /**
     * 
     * @param outputFormat Output format.
     */
    public final native void setOutputFormat(String outputFormat) /*-{
        this.outputFormat = outputFormat;
    }-*/;
    
    /**
     * 
     * @param maxFeatures Maximum number of features to fetch.
     */
    public final native void setMaxFeatures(int maxFeatures) /*-{
        this.maxFeatures = maxFeatures;
    }-*/;
    
    /**
     * 
     * @param geometryName Geometry name to use in a BBOX filter.
     */
    public final native void setGeometryName(String geometryName) /*-{
        this.geometryName = geometryName;
    }-*/;
    
    /**
     * 
     * @param propertyNames Optional list of property names to serialize.
     */
    public final native void setPropertyNames(JsArrayString propertyNames) /*-{
        this.propertyNames = propertyNames;
    }-*/;

    /**
     * This is a WFS 2.0 feature backported to WFS 1.1.0 by some Web Feature Services.
     * @param startIndex Start index to use for WFS paging. 
     */
    public final native void setStartIndex(int startIndex) /*-{
        this.startIndex = startIndex;
    }-*/;

    /**
     * This is a WFS 2.0 feature backported to WFS 1.1.0 by some Web Feature Services. 
     * Please note that some Web Feature Services have repurposed maxfeatures instead.
     * @param count Number of features to retrieve when paging. 
     */
    public final native void setCount(int count) /*-{
        this.count = count;
    }-*/;

    /**
     * 
     * @param bbox Extent to use for the BBOX filter.
     */
    public final native void setBbox(Extent bbox) /*-{
        this.bbox = bbox;
    }-*/;
}
