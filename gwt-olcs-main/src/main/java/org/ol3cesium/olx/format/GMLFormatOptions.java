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
package org.ol3cesium.olx.format;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class GMLFormatOptions extends JavaScriptObject {
    protected GMLFormatOptions() {
        //
    }
    
    public static native GMLFormatOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Feature namespace. If not defined will be derived from GML. 
     * If multiple feature types have been configured which come 
     * from different feature namespaces, this will be an object with 
     * the keys being the prefixes used in the entries of featureType array. 
     * The values of the object will be the feature namespaces themselves. 
     * So for instance there might be a featureType item topp:states in the 
     * featureType array and then there will be a key topp in the featureNS 
     * object with value http://www.openplans.org/topp.
     * @param featureNS 
     */
    public final native void setFeatureNS(JavaScriptObject featureNS) /*-{
        this.featureNS = featureNS;
    }-*/;
    
    /**
     * Feature type(s) to parse. If multiple feature types need to be configured 
     * which come from different feature namespaces, featureNS will be an object 
     * with the keys being the prefixes used in the entries of featureType array. 
     * The values of the object will be the feature namespaces themselves. 
     * So for instance there might be a featureType item topp:states and then 
     * there will be a key named topp in the featureNS object with value http://www.openplans.org/topp.
     * @param featureType 
     */
    public final native void setFeatureType(JsArrayString featureType) /*-{
            this.featureType = featureType;
    }-*/;
    
    /**
     * Feature type(s) to parse. If multiple feature types need to be configured 
     * which come from different feature namespaces, featureNS will be an object 
     * with the keys being the prefixes used in the entries of featureType array. 
     * The values of the object will be the feature namespaces themselves. 
     * So for instance there might be a featureType item topp:states and then 
     * there will be a key named topp in the featureNS object with value http://www.openplans.org/topp.
     * @param featureType 
     */
    public final native void setFeatureType(String featureType) /*-{
            this.featureType = featureType;
    }-*/;

    /**
     * 
     * @param srsName srsName to use when writing geometries. Required.
     */
    public final native void setSrsName(String srsName) /*-{
        this.srsName = srsName;
    }-*/;

    /**
     * Write gml:Surface instead of gml:Polygon elements. 
     * This also affects the elements in multi-part geometries. Default is false.
     * @param surface 
     */
    public final native void setSurface(boolean surface) /*-{
        this.surface = surface;
    }-*/;

    /**
     * Write gml:Curve instead of gml:LineString elements. 
     * This also affects the elements in multi-part geometries. Default is false.
     * @param curve 
     */
    public final native void setCurve(boolean curve) /*-{
        this.curve = curve;
    }-*/;

    /**
     * Write gml:MultiCurve instead of gml:MultiLineString. 
     * Since the latter is deprecated in GML 3, the default is true.
     * @param multiCurve 
     */
    public final native void setMultiCurve(boolean multiCurve) /*-{
        this.multiCurve = multiCurve;
    }-*/;

    /**
     * Write gml:multiSurface instead of gml:MultiPolygon. 
     * Since the latter is deprecated in GML 3, the default is true.
     * @param multiSurface 
     */
    public final native void setMultiSurface(boolean multiSurface) /*-{
        this.multiSurface = multiSurface;
    }-*/;

    /**
     * Optional schemaLocation to use when writing out the GML, this will override the default provided.
     * @param schemaLocation 
     */
    public final native void setSchemaLocation(String schemaLocation) /*-{
        this.schemaLocation = schemaLocation;
    }-*/;
}
