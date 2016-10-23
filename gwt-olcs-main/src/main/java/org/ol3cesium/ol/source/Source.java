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
package org.ol3cesium.ol.source;

import com.google.gwt.core.client.JsArray;
import org.ol3cesium.ol.Attribution;
import org.ol3cesium.ol.Object;
import org.ol3cesium.ol.proj.Projection;
import org.ol3cesium.olx.source.SourceOptions;

/**
 * Abstract base class; normally only used for creating subclasses and not 
 * instantiated in apps. Base class for ol.layer.Layer sources.
 * A generic change event is triggered when the state of the source changes.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Source extends Object {
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
    public final SourceState getState() {
        return SourceState.fromString(getStateNative());
    }
    
    /**
     * Get the state of the source, see ol.source.State for possible states.
     * @return State.
     */
    public final native String getStateNative() /*-{
        return this.getState();
    }-*/;
    
    /**
     * Refreshes the source and finally dispatches a 'change' event.
     */
    public final native void refresh() /*-{
        this.refresh();
    }-*/;
    
    /**
     * Set the attributions of the source.
     * @param attributions Attributions.
     */
    public final native void setAttributions(JsArray<Attribution> attributions) /*-{
        this.setAttributions(attributions);
    }-*/;
}
