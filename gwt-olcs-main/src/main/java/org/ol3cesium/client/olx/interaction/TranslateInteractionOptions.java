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
package org.ol3cesium.client.olx.interaction;

import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.client.ol.Collection;
import org.ol3cesium.client.ol.Feature;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TranslateInteractionOptions extends JavaScriptObject {
    protected TranslateInteractionOptions() {
        //
    }
    
    public static native TranslateInteractionOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Only features contained in this collection will be able to be translated. 
     * If not specified, all features on the map will be able to be translated.
     * @param features 
     */
    public final native void setFeatures(Collection<Feature> features) /*-{
        this.features = features;
    }-*/;
}
