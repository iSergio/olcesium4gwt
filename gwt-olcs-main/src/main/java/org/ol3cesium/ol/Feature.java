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
package org.ol3cesium.ol;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.ol.event.FeatureChangeEventListener;
import org.ol3cesium.ol.geom.Geometry;
import org.ol3cesium.ol.style.Style;

/**
 * A vector object for geographic features with a geometry and other attribute 
 * properties, similar to the features in vector file formats like GeoJSON.
 * 
 * Features can be styled individually with setStyle; otherwise they use 
 * the style of their vector layer.
 * 
 * Note that attribute properties are set as ol.Object properties on the 
 * feature object, so they are observable, and have get/set accessors.
 * 
 * Typically, a feature has a single geometry property. You can set the 
 * geometry using the setGeometry method and get it with getGeometry. 
 * It is possible to store more than one geometry on a feature using attribute properties. 
 * By default, the geometry used for rendering is identified by the property name geometry. 
 * If you want to use another geometry property for rendering, use the 
 * setGeometryName method to change the attribute property associated 
 * with the geometry for the feature.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Feature extends Object {
    protected Feature() {
        //
    }
    
    public static native Feature create() /*-{
        return new ol.Feature();
    }-*/;
    
    /**
     * Clone this feature. If the original feature has a geometry it is also cloned. 
     * The feature id is not set in the clone.
     * @return The clone.
     */
    public final native Feature clone() /*-{
        return this.clone();
    }-*/;
    
    /**
     * Get the feature's default geometry. A feature may have any number of 
     * named geometries. The "default" geometry (the one that is rendered by default) 
     * is set when calling ol.Feature#setGeometry.
     * @return The default geometry for the feature.
     */
    public final native Geometry getGeometry() /*-{
        return this.getGeometry();
    }-*/;
    
    /**
     * Get the name of the feature's default geometry. By default, 
     * the default geometry is named geometry.
     * @return Get the property name associated with the default geometry for this feature.
     */
    public final native String getGeometryName() /*-{
        return this.getGeometryName();
    }-*/;
    
    /**
     * Get the feature identifier. This is a stable identifier for the feature 
     * and is either set when reading data from a remote source or set 
     * explicitly by calling ol.Feature#setId.
     * @return Id.
     */
    public final native String getId() /*-{
        return this.getId();
    }-*/;
    
    /**
     * Get the feature's style. This return for this method depends on what 
     * was provided to the ol.Feature#setStyle method.
     * @return The feature styles.
     */
    public final native JsArray<Style> getStyles() /*-{
        return this.getStyle();
    }-*/;
    
    /**
     * Get the feature's style. This return for this method depends on what 
     * was provided to the ol.Feature#setStyle method.
     * @return The feature styles.
     */
    public final native Style getStyle() /*-{
        return this.getStyle();
    }-*/;
    
    /**
     * Get the feature's style. This return for this method depends on what 
     * was provided to the ol.Feature#setStyle method.
     * @return Style function
     */
    public final native JavaScriptObject getStyleFunction() /*-{
        return this.getStyle();
    }-*/;
    
    /**
     * Set the default geometry for the feature. 
     * This will update the property with the name returned by ol.Feature#getGeometryName.
     * @param geometry The new geometry.
     */
    public final native void setGeometry(Geometry geometry) /*-{
        this.setGeometry(geometry);
    }-*/;

    /**
     * Set the property name to be used when getting the feature's default geometry. 
     * When calling ol.Feature#getGeometry, the value of the property with this name will be returned.
     * @param geometryName The property name of the default geometry.
     */
    public final native void setGeometryName(String geometryName) /*-{
        this.setGeometryName(geometryName);
    }-*/;
    
    /**
     * Set the feature id. The feature id is considered stable and may be used 
     * when requesting features or comparing identifiers returned from a remote source. 
     * The feature id can be used with the ol.source.Vector#getFeatureById method.
     * @param id The feature id.
     */
    public final native void setId(String id) /*-{
        this.setId(id);
    }-*/;
    
    /**
     * Set the style for the feature. This can be a single style object, an array 
     * of styles, or a function that takes a resolution and returns an array of styles. 
     * If it is null the feature has no style (a null style).
     * @param style Style.
     */
    public final native void setStyle(Style style) /*-{
        this.setStyle(style);
    }-*/;
    
    /**
     * Set the style for the feature. This can be a single style object, an array 
     * of styles, or a function that takes a resolution and returns an array of styles. 
     * If it is null the feature has no style (a null style).
     * @param style Style.
     */
    public final native void setStyle(JsArray<Style> style) /*-{
        this.setStyle(style);
    }-*/;
    
    /**
     * Set the style for the feature. This can be a single style object, an array 
     * of styles, or a function that takes a resolution and returns an array of styles. 
     * If it is null the feature has no style (a null style).
     * @param styleFunction Style function.
     */
    public final native void setStyle(JavaScriptObject styleFunction) /*-{
        this.setStyle(styleFunction);
    }-*/;
    
    public final native void addFeatureChangeEventListener(FeatureChangeEventListener featureChangeEventListener) /*-{
        if (!this.__featureChangeEventListenerRegistered) {
            var that = this;
            
            function createCallback(type) {
                return function(event) {
                    var _event = {type: type, feature: that, nativeEvent: event};
                    that.__notifyFeatureChangeEventListeners(_event);
                }
            }
            var types = ['geometry', 'id', 'style'];
            for (var i = 0; i < types.length; i++) {
                this.on('change:' + types[i], $entry(createCallback(types[i])), this);
            }
            
            this.__featureChangeEventListenerRegistered = true;
            this.__featureChangeEventListeners = [];
            this.__notifyFeatureChangeEventListeners = function(event) {
                var length = this.__featureChangeEventListeners.length;
                for (var i = 0; i < length; i++) {
                    var listener = this.__featureChangeEventListeners[i];
                    listener.@org.ol3cesium.ol.event.FeatureChangeEventListener::onFeatureChange(Lorg/ol3cesium/ol/event/FeatureChangeEvent;)(event);
                }
            };
        }
        this.__featureChangeEventListeners.push(featureChangeEventListener);
    }-*/;
    
    public final native void removeFeatureChangeEventListener(FeatureChangeEventListener featureChangeEventListener) /*-{
        if (!this.__featureChangeEventListeners) {
            return;
        }
        var index = this.__featureChangeEventListeners.indexOf(featureChangeEventListener);
        if (index > -1) {
            this.__featureChangeEventListeners.splice(featureChangeEventListener, 1);
        }
    }-*/;
}
