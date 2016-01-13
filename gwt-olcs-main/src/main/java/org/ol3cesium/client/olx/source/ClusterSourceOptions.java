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
package org.ol3cesium.client.olx.source;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.Attribution;
import org.ol3cesium.client.ol.Extent;
import org.ol3cesium.client.ol.format.FeatureFormat;
import org.ol3cesium.client.ol.proj.Projection;
import org.ol3cesium.client.ol.source.VectorSource;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ClusterSourceOptions extends JavaScriptObject {
    protected ClusterSourceOptions() {
        //
    }
    
    public static final native ClusterSourceOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Sets attributions.
     * @param attributions Attributions.
     */
    public final native void setAttributions(JsArray<Attribution> attributions)	/*-{
        this.attributions = attributions;
    }-*/;
    
    /**
     * Minimum distance in pixels between clusters. Default is 20.
     * @param distance 
     */
    public final native void setDistance(int distance) /*-{
        this.distance = distance;
    }-*/;

    /**
     * 
     * @param extent Extent.
     */
    public final native void setExtent(Extent extent) /*-{
        this.extent = extent;
    }-*/;
    
    /**
     * The feature format used by the XHR feature loader when url is set. 
     * Required if url is set, otherwise ignored. Default is undefined.
     * @param format Feature format
     */
    public final native void setFormat(FeatureFormat format) /*-{
        this.format = format;
    }-*/;
    
    /**
     * 
     * @param logo Logo.
     */
    public final native void setLogo(String logo) /*-{
        this.logo = logo;
    }-*/;

    /**
     * Projection.
     * @param projection Projection.
     */
    public final native void setProjection(Projection projection) /*-{
        this.projection = projection;
    }-*/;
    
    /**
     * Projection.
     * @param projection Projection.
     */
    public final native void setProjection(String projection) /*-{
        this.projection = projection;
    }-*/;

    /**
     * Source. Required.
     * @param source Source. Required.
     */
    public final native void setSource(VectorSource source) /*-{
        this.source = source;
    }-*/;

    /**
     * Wrap the world horizontally. Default is true. 
     * For vector editing across the -180° and 180° meridians to work properly, 
     * this should be set to false. The resulting geometry 
     * coordinates will then exceed the world bounds.
     * @param wrapX 
     */
    public final native void setWrapX(boolean wrapX) /*-{
        this.wrapX = wrapX;
    }-*/;
}
