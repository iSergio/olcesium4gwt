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
package org.ol3cesium.client.ol.source;

import org.ol3cesium.client.olx.source.ImageMapGuideSourceOptions;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Source for images from Mapguide servers
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ImageMapGuideSource extends ImageSource {
    protected ImageMapGuideSource() {
        //
    }
    
    public static final native ImageMapGuideSource create(ImageMapGuideSourceOptions options) /*-{
        return new ol.source.ImageMapGuide(options);
    }-*/;
    
//    getImageLoadFunction(){ol.ImageLoadFunctionType} experimental
//
//src/ol/source/imagemapguidesource.js, line 165
//Return the image load function of the source.
//
//Returns:
//
//The image load function. 
    
//    setImageLoadFunction(imageLoadFunction) experimental
//
//src/ol/source/imagemapguidesource.js, line 238
//Set the image load function of the MapGuide source.
//
//Name	Type	Description
//imageLoadFunction	ol.ImageLoadFunctionType	
//Image load function.

    /**
     * Update the user-provided params.
     * @param params Params.
     */
    public final native void updateParams(JavaScriptObject params) /*-{
        this.updateParams(params);
    }-*/;
}
