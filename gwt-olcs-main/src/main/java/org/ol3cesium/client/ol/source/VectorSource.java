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

import org.ol3cesium.client.olx.source.VectorSourceOptions;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.Collection;
import org.ol3cesium.client.ol.Coordinate;
import org.ol3cesium.client.ol.Extent;
import org.ol3cesium.client.ol.Feature;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class VectorSource extends Source {
    protected VectorSource() {
        //
    }
    
    public static final native VectorSource create() /*-{
        return new ol.source.Vector();
    }-*/;
    
    public static final native VectorSource create(VectorSourceOptions options) /*-{
        return new ol.source.Vector(options);
    }-*/;
    
    /**
     * Add a single feature to the source. If you want to add a batch of features 
     * at once, call source.addFeatures() instead.
     * @param feature Feature to add.
     */
    public final native void addFeature(Feature feature) /*-{
        this.addFeature(feature);
    }-*/;

    /**
     * Add a batch of features to the source.
     * @param features Features to add.
     */
    public final native void addFeatures(JsArray<Feature> features) /*-{
        this.addFeatures(features);
    }-*/;
    
    /**
     * Remove all features from the source.
     */
    public final native void clear() /*-{
        this.clear();
    }-*/;
    
    /**
     * Remove all features from the source.
     * @param fast Skip dispatching of removefeature events.
     */
    public final native void clear(boolean fast) /*-{
        this.clear(fast);
    }-*/;
    
    /**
     * Get the closest feature to the provided coordinate.
     * This method is not available when the source is configured with useSpatialIndex set to false.
     * @param coordinate Coordinate.
     * @return Closest feature.
     */
    public final native Feature getClosestFeatureToCoordinate(Coordinate coordinate) /*-{
        return this.getClosestFeatureToCoordinate(coordinate);
    }-*/;
    
    /**
     * Get the extent of the features currently in the source.
     * This method is not available when the source is configured with useSpatialIndex set to false.
     * @return Extent.
     */
    public final native Extent getExtent() /*-{
        return this.getExtent();
    }-*/;
    
    /**
     * Get a feature by its identifier (the value returned by feature.getId()). 
     * Note that the index treats string and numeric identifiers as the same. 
     * So source.getFeatureById(2) will return a feature with id '2' or 2.
     * @param id Feature identifier.
     * @return The feature (or null if not found).
     */
    public final native Feature getFeatureById(String id) /*-{
        return this.getFeatureById(id);
    }-*/;
    
    /**
     * Get all features on the source.
     * @return Features.
     */
    public final native JsArray<Feature> getFeatures() /*-{
        return this.getFeatures();
    }-*/;
    
    /**
     * Get all features whose geometry intersects the provided coordinate.
     * @param coordinate Coordinate.
     * @return Features.
     */
    public final native JsArray<Feature> getFeaturesAtCoordinate(Coordinate coordinate) /*-{
        return this.getFeaturesAtCoordinate(coordinate);
    }-*/;
    
    /**
     * Get the features collection associated with this source. 
     * Will be null unless the source was configured with useSpatialIndex set to false, o
     * r with an ol.Collection as features.
     * @return Collection of features.
     */
    public final native Collection<Feature> getFeaturesCollection() /*-{
        return this.getFeaturesCollection();
    }-*/;
    
    /**
     * Get all features in the provided extent. Note that this returns all 
     * features whose bounding boxes intersect the given extent (so it may 
     * include features whose geometries do not intersect the extent).
     * 
     * This method is not available when the source is configured with 
     * useSpatialIndex set to false.
     * @param extent Extent.
     * @return Features.
     */
    public final native JsArray<Feature> getFeaturesInExtent(Extent extent) /*-{
        return this.getFeaturesInExtent(extent);
    }-*/;
    
    /**
     * Remove a single feature from the source. If you want to remove all 
     * features at once, use the source.clear() method instead.
     * @param feature Feature to remove.
     */
    public final native void removeFeature(Feature feature) /*-{
        this.removeFeature(feature);
    }-*/;
}
