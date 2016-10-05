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
package org.ol3cesium.client.olx.format;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;
import org.ol3cesium.client.ol.format.GMLBaseFormat;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class WFSFormatOptions extends JavaScriptObject {
    protected WFSFormatOptions() {
        //
    }
    
    public static native WFSFormatOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param featureNS The namespace URI used for features.
     */
    public final native void setFeatureNS(JavaScriptObject featureNS) /*-{
        this.featureNS = featureNS;
    }-*/;
    
    /**
     * 
     * @param featureType The feature type to parse. Only used for read operations.
     */
    public final native void setFeatureType(JsArrayString featureType) /*-{
        this.featureType = featureType;
    }-*/;
    
    /**
     * 
     * @param gmlFormat The GML format to use to parse the response. Default is ol.format.GML3.
     */
    public final native void setGmlFormat(GMLBaseFormat gmlFormat) /*-{
        this.gmlFormat = gmlFormat;
    }-*/;

    /**
     * 
     * @param schemaLocation Optional schemaLocation to use for serialization, this will override the default.
     */
    public final native void setSchemaLocation(String schemaLocation) /*-{
        this.schemaLocation = schemaLocation;
    }-*/;
}
