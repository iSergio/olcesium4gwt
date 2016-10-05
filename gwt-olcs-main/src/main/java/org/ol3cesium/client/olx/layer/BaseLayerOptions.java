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
package org.ol3cesium.client.olx.layer;

import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.client.ol.Extent;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class BaseLayerOptions extends JavaScriptObject {
    protected BaseLayerOptions() {
        //
    }
    
    public static native BaseLayerOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Opacity (0, 1). Default is 1.
     * @param opacity Opacity.
     */
    public final native void setOpacity(float opacity) /*-{
        this.opacity = opacity;
    }-*/;
    
    /**
     * Visibility. Default is true (visible).
     * @param visible Visible.
     */
    public final native void setVisible(boolean visible) /*-{
        this.visible = visible;
    }-*/;
    
    /**
     * The bounding extent for layer rendering. The layer will not be rendered outside of this extent.
     * @param extent Extent.
     */
    public final native void setExtent(Extent extent) /*-{
        this.extent = extent;
    }-*/;
    
    /**
     * 
     * @param zIndex The z-index for layer rendering. At rendering time, the layers will be ordered, first by Z-index and then by position. The default Z-index is 0.
     */
    public final native void setZIndex(int zIndex) /*-{
        this.zIndex = zIndex;
    }-*/;
    
    /**
     * The minimum resolution (inclusive) at which this layer will be visible.
     * @param minResolution min resolution.
     */
    public final native void setMinResolution(double minResolution) /*-{
        this.minResolution = minResolution;
    }-*/;
    
    /**
     * The maximum resolution (exclusive) below which this layer will be visible.
     * @param maxResolution max resolution.
     */
    public final native void setMaxResolution(double maxResolution) /*-{
        this.maxResolution = maxResolution;
    }-*/;
}
