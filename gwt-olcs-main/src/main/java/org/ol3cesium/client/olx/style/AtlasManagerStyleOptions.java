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
package org.ol3cesium.client.olx.style;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class AtlasManagerStyleOptions extends JavaScriptObject {
    protected AtlasManagerStyleOptions() {
        //
    }
    
    public static final native AtlasManagerStyleOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param initialSize The size in pixels of the first atlas image. 
     * If no value is given the ol.INITIAL_ATLAS_SIZE compile-time constant will be used.
     */
    public final native void setInitialSize(Number initialSize) /*-{
        this.initialSize = initialSize;
    }-*/;

    /**
     * 
     * @param maxSize The maximum size in pixels of atlas images. If no value 
     * is given then the ol.MAX_ATLAS_SIZE compile-time constant will be used. 
     * And if ol.MAX_ATLAS_SIZE is set to -1 (the default) then ol.WEBGL_MAX_TEXTURE_SIZE 
     * will used if WebGL is supported. Otherwise 2048 is used.
     */
    public final native void setMaxSize(Number maxSize) /*-{
        this.maxSize = maxSize;
    }-*/;

    /**
     * 
     * @param space The space in pixels between images (default: 1).
     */
    public final native void setSpace(Number space) /*-{
        this.space = space;
    }-*/;
}
