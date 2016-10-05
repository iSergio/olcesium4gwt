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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.Feature;
import org.ol3cesium.client.ol.proj.Projection;
import org.ol3cesium.client.olx.format.ReadFormatOptions;
import org.ol3cesium.client.olx.format.WFSFormatOptions;
import org.ol3cesium.client.olx.format.WFSWriteGetFeatureFormatOptions;
import org.ol3cesium.client.olx.format.WFSWriteTransactionFormatOptions;

/**
 * Feature format for reading and writing data in the WFS format. 
 * By default, supports WFS version 1.1.0. You can pass a GML format as 
 * option if you want to read a WFS that contains GML2 (WFS 1.0.0). 
 * Also see ol.format.GMLBase which is used by this format.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class WFSFormat extends XMLFeatureFormat {
    protected WFSFormat() {
        //
    }
    
    public static native WFSFormat create() /*-{
        return new ol.format.WFS();
    }-*/;
    
    public static native WFSFormat create(WFSFormatOptions options) /*-{
        return new ol.format.WFS(options);
    }-*/;
    
//readFeatureCollectionMetadata(source){ol.format.WFS.FeatureCollectionMetadata|undefined}
//
//src/ol/format/wfsformat.js, line 173
//Read feature collection metadata of the source.
//
//Name	Type	Description
//source	Document | Node | Object | string	
//Source.
//Returns:
//
//FeatureCollection metadata. 
    
    /**
     * Read all features from a WFS FeatureCollection.
     * @param source Source.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source) /*-{
        return this.readFeatures(source);
    }-*/;
    
    /**
     * Read all features from a WFS FeatureCollection.
     * @param source Source.
     * @param options Read options.
     * @return Features.
     */
    public final native JsArray<Feature> readFeatures(String source, ReadFormatOptions options) /*-{
        return this.readFeatures(source, options);
    }-*/;

    /**
     * Read the projection from a WFS source.
     * @param source Source.
     * @return Projection.
     */
    public final native Projection readProjection(String source) /*-{
        return this.readProjection(source);
    }-*/;
    
//readTransactionResponse(source){ol.format.WFS.TransactionResponse|undefined}
//
//src/ol/format/wfsformat.js, line 149
//Read transaction response of the source.
//
//Name	Type	Description
//source	Document | Node | Object | string	
//Source.
//Returns:
//
//Transaction response.
    
    /**
     * Encode format as WFS GetFeature and return the Node.
     * @param options
     * @return Result.
     */
    public final native String writeGetFeature(WFSWriteGetFeatureFormatOptions options) /*-{
        return new XMLSerializer().serializeToString(this.writeGetFeature(options));
    }-*/;
    
    /**
     * Encode format as WFS Transaction and return the Node.
     * @param inserts The features to insert.
     * @param updates The features to update.
     * @param deletes The features to delete.
     * @param options
     * @return Result.
     */
    public final native JavaScriptObject writeTransaction(JsArray<Feature> inserts, JsArray<Feature> updates, JsArray<Feature> deletes, WFSWriteTransactionFormatOptions options) /*-{
        return this.writeTransaction(inserts, updates, deletes, options);
    }-*/;
}
