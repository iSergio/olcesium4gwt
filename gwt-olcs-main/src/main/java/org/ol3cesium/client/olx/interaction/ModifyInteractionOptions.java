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
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.Collection;
import org.ol3cesium.client.ol.Feature;
import org.ol3cesium.client.ol.style.Style;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ModifyInteractionOptions extends JavaScriptObject {
    protected ModifyInteractionOptions() {
        //
    }
    
    public static native ModifyInteractionOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Pixel tolerance for considering the pointer close enough to a segment or 
     * vertex for editing. Default is 10.
     * @param pixelTolerance 
     */
    public final native void setPixelTolerance(int pixelTolerance) /*-{
        this.pixelTolerance = pixelTolerance;
    }-*/;

    /**
     * Style used for the features being modified. By default the default edit 
     * style is used (see ol.style).
     * @param style 
     */
    public final native void setStyle(Style style) /*-{
        this.style = style;
    }-*/;
    
    /**
     * Style used for the features being modified. By default the default edit 
     * style is used (see ol.style).
     * @param style 
     */
    public final native void setStyle(JsArray<Style> style) /*-{
        this.style = style;
    }-*/;

    /**
     * The features the interaction works on. Required.
     * @param features 
     */
    public final native void setFeatures(Collection<Feature> features) /*-{
        this.features = features;
    }-*/;

    /**
     * Wrap the world horizontally on the sketch overlay. Default is false.
     * @param wrapX 
     */
    public final native void setWrapX(boolean wrapX) /*-{
        this.wrapX = wrapX;
    }-*/;
}
