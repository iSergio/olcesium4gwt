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
package org.ol3cesium.client.olx.source;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.Attribution;
import org.ol3cesium.client.ol.Collection;
import org.ol3cesium.client.ol.Feature;
import org.ol3cesium.client.ol.format.FeatureFormat;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class VectorSourceOptions extends JavaScriptObject {
    protected VectorSourceOptions() {
        //
    }
    
    public static final native VectorSourceOptions create() /*-{
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
     * Features. If provided as ol.Collection, the features in the source and the collection will stay in sync.
     * @param features Features
     */
    public final native void setFeatures(JsArray<Feature> features) /*-{
        this.features = features;
    }-*/;
    
    /**
     * Features. If provided as ol.Collection, the features in the source and the collection will stay in sync.
     * @param features Features
     */
    public final native void setFeatures(Collection<Feature> features) /*-{
        this.features = features;
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
     * Setting this option instructs the source to use an XHR loader (see ol.featureloader.xhr). 
     * Use a string and an ol.loadingstrategy.all for a one-off download of all features from the given URL. 
     * Use a ol.FeatureUrlFunction to generate the url with other loading strategies. 
     * Requires format to be set as well. When default XHR feature loader is provided, 
     * the features will be transformed from the data projection to the view projection 
     * during parsing. If your remote data source does not advertise its projection properly, 
     * this transformation will be incorrect. For some formats, the default projection 
     * (usually EPSG:4326) can be overridden by setting the defaultDataProjection 
     * constructor option on the format.
     * @param url 
     */
    public final native void setUrl(String url) /*-{
        this.url = url;
    }-*/;
    
    /**
     * This source may have overlapping geometries. Default is true. 
     * Setting this to false (e.g. for sources with polygons that represent 
     * administrative boundaries or TopoJSON sources) allows the renderer to 
     * optimise fill and stroke operations.
     * @param overlaps 
     */
    public final native void setOverlaps(boolean overlaps) /*-{
        this.overlaps = overlaps;
    }-*/;
    
    /**
     * By default, an RTree is used as spatial index. When features are removed 
     * and added frequently, and the total number of features is low, setting 
     * this to false may improve performance
     * 
     * Note that ol.source.Vector#getFeaturesInExtent, ol.source.Vector#getClosestFeatureToCoordinate 
     * and ol.source.Vector#getExtent cannot be used when useSpatialIndex is set to false, 
     * and ol.source.Vector#forEachFeatureInExtent will loop through all features.
     * 
     * When set to false, the features will be maintained in an ol.Collection, 
     * which can be retrieved through ol.source.Vector#getFeaturesCollection.
     * 
     * The default is true.
     * @param useSpatialIndex 
     */
    public final native void setUseSpatialIndex(boolean useSpatialIndex) /*-{
        this.useSpatialIndex = useSpatialIndex;
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
