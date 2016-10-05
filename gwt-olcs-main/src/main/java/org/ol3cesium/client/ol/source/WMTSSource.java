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
package org.ol3cesium.client.ol.source;

import org.ol3cesium.client.olx.source.WMTSSourceOptions;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Layer source for tile data from WMTS servers.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class WMTSSource extends TileImageSource {
    protected WMTSSource() {
        //
    }
    
    public static final native WMTSSource create(WMTSSourceOptions options) /*-{
        return new ol.source.WMTS(options);
    }-*/;
    
    /**
     * Generate source options from a capabilities object.
     * @param wmtsCap An object representing the capabilities document.
     * @param config Configuration properties for the layer. Defaults for the layer will apply if not provided
     * Required config properties
     * layer - {string} The layer identifier.Optional config properties:
     * matrixSet - {string} The matrix set identifier, required if there is more than one matrix set in the layer capabilities.
     * projection - {string} The desired CRS when no matrixSet is specified. eg: "EPSG:3857". If the desired projection is not available, an error is thrown.
     * requestEncoding - {string} url encoding format for the layer. Default is the first tile url format found in the GetCapabilities response.
     * style - {string} The name of the style
     * format - {string} Image format for the layer. Default is the first format returned in the GetCapabilities response.
     * @return WMTS source options object.
     */
    public static final native WMTSSourceOptions optionsFromCapabilities(JavaScriptObject wmtsCap, JavaScriptObject config) /*-{
        return ol.source.WMTS.optionsFromCapabilities(wmtsCap, config);
    }-*/;
    
    /**
     * Get the dimensions, i.e. those passed to the constructor through the "dimensions" 
     * option, and possibly updated using the updateDimensions method.
     * @return Dimensions.
     */
    public final native JavaScriptObject getDimensions() /*-{
        return this.getDimensions();
    }-*/;

    /**
     * Return the image format of the WMTS source.
     * @return Format.
     */
    public final native String getFormat() /*-{
        return this.getFormat();
    }-*/;
    
    /**
     * Return the layer of the WMTS source.
     * @return Layer.
     */
    public final native String getLayer() /*-{
        return this.getLayer();
    }-*/;
    
    /**
     * Return the matrix set of the WMTS source.
     * @return MatrixSet.
     */
    public final native String getMatrixSet() /*-{
        return this.getMatrixSet();
    }-*/;
    
    /**
     * Return the request encoding, either "KVP" or "REST".
     * @return Request encoding.
     */
    public final WMTSRequestEncoding getRequestEncoding() {
        return WMTSRequestEncoding.fromString(getRequestEncodingNative());
    }
    
    /**
     * Return the request encoding, either "KVP" or "REST".
     * @return Request encoding.
     */
    public final native String getRequestEncodingNative() /*-{
        return this.getRequestEncoding();
    }-*/;
    
    /**
     * Return the style of the WMTS source.
     * @return Style.
     */
    public final native String getStyle() /*-{
        return this.getStyle();
    }-*/;
    
    /**
     * Return the version of the WMTS source.
     * @return Version.
     */
    public final native String getVersion() /*-{
        return this.getVersion();
    }-*/;
    
    /**
     * Update the dimensions.
     * @param dimensions Dimensions.
     */
    public final native void updateDimensions(JavaScriptObject dimensions) /*-{
        this.updateDimensions(dimensions);
    }-*/;
}
