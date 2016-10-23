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
package org.ol3cesium.olx.interaction;

import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.ol.Collection;
import org.ol3cesium.ol.Feature;
import org.ol3cesium.ol.source.VectorSource;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class SnapInteractionOptions extends JavaScriptObject {
    protected SnapInteractionOptions() {
        //
    }
    
    public static native SnapInteractionOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Snap to these features. Either this option or source should be provided.
     * @param features 
     */
    public final native void setFeatures(Collection<Feature> features) /*-{
        this.features = features;
    }-*/;

    /**
     * Pixel tolerance for considering the pointer close enough to a segment or vertex for snapping. 
     * Default is 10 pixels.
     * @param pixelTolerance 
     */
    public final native void setPixelTolerance(int pixelTolerance) /*-{
        this.pixelTolerance = pixelTolerance;
    }-*/;

    /**
     * Snap to features from this source. Either this option or features should be provided
     * @param source
     */
    public final native void setSource(VectorSource source) /*-{
        this.source = source;
    }-*/;
}
