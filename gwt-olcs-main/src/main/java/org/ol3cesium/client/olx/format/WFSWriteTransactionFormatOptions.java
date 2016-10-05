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
import com.google.gwt.core.client.JsArray;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class WFSWriteTransactionFormatOptions extends JavaScriptObject {
    protected WFSWriteTransactionFormatOptions() {
        //
    }
    
    public static native WFSWriteTransactionFormatOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param featureNS The namespace URI used for features. Required.
     */
    public final native void setfeatureNS(String featureNS) /*-{
        this.featureNS = featureNS;
    }-*/;
    
    /**
     * 
     * @param featurePrefix The prefix for the feature namespace. Required.
     */
    public final native void setfeaturePrefix(String featurePrefix) /*-{
        this.featurePrefix = featurePrefix;
    }-*/;
    
    /**
     * 
     * @param featureType The feature type name. Required.
     */
    public final native void setfeatureType(String featureType) /*-{
        this.featureType = featureType;
    }-*/;

    /**
     * 
     * @param srsName SRS name. No srsName attribute will be set on geometries when this is not provided.
     */
    public final native void setsrsName(String srsName) /*-{
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
     * @param nativeElements Native elements. Currently not supported. Required.
     */
    public final native void setnativeElements(JsArray<JavaScriptObject> nativeElements) /*-{
        this.nativeElements = nativeElements;
    }-*/;

    /**
     * 
     * @param gmlOptions GML options for the WFS transaction writer.
     */
    public final native void setgmlOptions(GMLFormatOptions gmlOptions) /*-{
        this.gmlOptions = gmlOptions;
    }-*/;
}
