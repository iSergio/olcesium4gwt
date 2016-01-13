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
package org.ol3cesium.client.ol.interaction;

import org.ol3cesium.client.olx.interaction.SnapInteractionOptions;
import org.ol3cesium.client.ol.Feature;

/**
 * Handles snapping of vector features while modifying or drawing them. 
 * The features can come from a ol.source.Vector or ol.Collection Any interaction 
 * object that allows the user to interact with the features using the mouse 
 * can benefit from the snapping, as long as it is added before.
 * 
 * The snap interaction modifies map browser event coordinate and pixel properties 
 * to force the snap to occur to any interaction that them.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class SnapInteraction extends PointerInteraction {
    protected SnapInteraction() {
        //
    }
    
    public static final native SnapInteraction create() /*-{
        return new ol.interaction.Snap();
    }-*/;
    
    public static final native SnapInteraction create(SnapInteractionOptions options) /*-{
        return new ol.interaction.Snap(options);
    }-*/;
    
    /**
     * Add a feature to the collection of features that we may snap to.
     * @param feature Feature
     */
    public final native void addFeature(Feature feature) /*-{
        this.addFeature(feature);
    }-*/;
    
    /**
     * Add a feature to the collection of features that we may snap to.
     * @param feature Feature
     * @param listen Whether to listen to the geometry change or not Defaults to true.
     */
    public final native void addFeature(Feature feature, boolean listen) /*-{
        this.addFeature(feature, listen);
    }-*/;
    
    /**
     * Remove a feature from the collection of features that we may snap to.
     * @param feature Feature.
     */
    public final native void removeFeature(Feature feature) /*-{
        this.removeFeature(feature);
    }-*/;
    
    /**
     * Remove a feature from the collection of features that we may snap to.
     * @param feature Feature.
     * @param unlisten Whether to unlisten to the geometry change or not. Defaults to true.
     */
    public final native void removeFeature(Feature feature, boolean unlisten) /*-{
        this.removeFeature(feature, unlisten);
    }-*/;
}
