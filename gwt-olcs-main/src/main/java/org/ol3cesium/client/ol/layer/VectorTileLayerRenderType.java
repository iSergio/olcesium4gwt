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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.layer;

/**
 * Render mode for vector tiles
 * 'image': Vector tiles are rendered as images. Great performance, but point 
 * symbols and texts are always rotated with the view and pixels are scaled during zoom animations.
 * 'hybrid': Polygon and line elements are rendered as images, so pixels are scaled during zoom animations. 
 * Point symbols and texts are accurately rendered as vectors and can stay upright on rotated views.
 * 'vector': Vector tiles are rendered as vectors. Most accurate rendering even during animations, 
 * but slower performance than the other options.
 * @author iserge
 */
public enum VectorTileLayerRenderType {
    IMAGE("image"), HYBRID("hybrid"), VECTOR("vector"), UNKNOWN("unknown");
    public final String _value;
    
    VectorTileLayerRenderType(String value) {
        _value = value;
    }
    
    public static VectorTileLayerRenderType fromString(String string) {
        if (IMAGE.toString().equalsIgnoreCase(string)) {
            return IMAGE;
        }
        else if (HYBRID.toString().equalsIgnoreCase(string)) {
            return HYBRID;
        }
        else if (VECTOR.toString().equalsIgnoreCase(string)) {
            return VECTOR;
        } else {
            return UNKNOWN;
        }
    }
    
    @Override
    public String toString() {
        return _value;
    }
}