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
package org.ol3cesium.client.ol.event;

import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.Feature;
import org.ol3cesium.client.ol.proj.Projection;

/**
 * Events emitted by ol.interaction.DragAndDrop instances are instances of this type.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class DragAndDropInteractionEvent extends Event {
    public enum Type {ADD_FEATURES, UNKNOWN}

    protected DragAndDropInteractionEvent() {
        //
    }
    
    /**
     * 
     * @return The features parsed from dropped data.
     */
    public final native JsArray<Feature> getFeatures() /*-{
        return this.features;
    }-*/;
    
    /**
     * 
     * @return The feature projection.
     */
    public final native Projection getProjection() /*-{
        return this.projection;
    }-*/;
    
    public final Type getType() {
        String type = getNativeType();
        if (type.equals("addfeatures")) {
            return Type.ADD_FEATURES;
        } else {
            return Type.UNKNOWN;
        }
    }
}
