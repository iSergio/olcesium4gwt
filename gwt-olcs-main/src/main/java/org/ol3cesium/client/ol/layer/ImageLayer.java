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
package org.ol3cesium.client.ol.layer;

import org.ol3cesium.client.olx.layer.ImageLayerOptions;
import org.ol3cesium.client.ol.source.ImageSource;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ImageLayer extends Layer {
    protected ImageLayer() {
        //
    }
    
    public static final native ImageLayer create() /*-{
        var image = new ol.layer.Image();
        image.set('className', @org.ol3cesium.client.ol.layer.BaseLayer::IMAGE_LAYER_CLASS_NAME);
        return image;
    }-*/;
    
    public static final native ImageLayer create(ImageLayerOptions options) /*-{
        var image = new ol.layer.Image(options);
        image.set('className', @org.ol3cesium.client.ol.layer.BaseLayer::IMAGE_LAYER_CLASS_NAME);
        return image;
    }-*/;
    
    public static final native ImageLayer create(ImageSource source) /*-{
        var image = new ol.layer.Image({source: source});
        image.set('className', @org.ol3cesium.client.ol.layer.BaseLayer::IMAGE_LAYER_CLASS_NAME);
        return image;
    }-*/;
}
