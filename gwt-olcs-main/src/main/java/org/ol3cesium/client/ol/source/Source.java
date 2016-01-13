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
package org.ol3cesium.client.ol.source;

import org.ol3cesium.client.olx.source.SourceOptions;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.Attribution;
import org.ol3cesium.client.ol.proj.Projection;
import org.ol3cesium.client.ol.Object;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Source extends Object {
    public static final String STATE_UNDEFINED = "undefined";
    public static final String STATE_LOADING   = "loading";
    public static final String STATE_READY     = "ready";
    public static final String STATE_ERROR     = "error";
    
    public static final String WMTS_REQUEST_ENCODING_KVP = "KVP";
    public static final String WMTS_REQUEST_ENCODING_REST = "REST";
    
    protected Source() {
        //
    }
    
    public static native Source create(SourceOptions options) /*-{
        return new ol.source.Source(options);
    }-*/;
    
    /**
     * Get the attributions of the source.
     * @return Attributions.
     */
    public final native JsArray<Attribution> getAttributions() /*-{
        return this.getAttributions();
    }-*/;
    
    /**
     * Get the logo of the source.
     * @return Logo
     */
    public final native String getLogo() /*-{
        return this.getLogo();
    }-*/;
    
    /**
     * Get the projection of the source.
     * @return Projection.
     */
    public final native Projection getProjection() /*-{
        return this.getProjection();
    }-*/;
    
    /**
     * Get the state of the source, see ol.source.State for possible states.
     * @return State.
     */
    public final native String getState() /*-{
        return this.getState();
    }-*/;
    
    /**
     * Set the attributions of the source.
     * @param attributions Attributions.
     */
    public final native void setAttributions(JsArray<Attribution> attributions) /*-{
        this.setAttributions(attributions);
    }-*/;
}
