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
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum LayerType {
    BASE("ol.layer.Base"), GROUP("ol.layer.Group"), HEATMAP("ol.layer.Heatmap"),
    IMAGE("ol.layer.Image"), LAYER("ol.layer.Layer"), TILE("ol.layer.Tile"),
    VECTOR("ol.layer.Vector"), VECTOR_TILE("ol.layer.VectorTile"), UNKNOWN("ol.layer.Unknown");
    
    private final String _value;
    
    private LayerType(String value) {
        _value = value;
    }
    
    public static LayerType fromString(String string) {
        if (BASE.toString().equalsIgnoreCase(string)) {
            return BASE;
        }
        else if (GROUP.toString().equalsIgnoreCase(string)) {
            return GROUP;
        }
        else if (HEATMAP.toString().equalsIgnoreCase(string)) {
            return HEATMAP;
        }
        else if (IMAGE.toString().equalsIgnoreCase(string)) {
            return IMAGE;
        }
        else if (LAYER.toString().equalsIgnoreCase(string)) {
            return LAYER;
        }
        else if (TILE.toString().equalsIgnoreCase(string)) {
            return TILE;
        }
        else if (VECTOR.toString().equalsIgnoreCase(string)) {
            return VECTOR;
        }
        else if (VECTOR_TILE.toString().equalsIgnoreCase(string)) {
            return VECTOR_TILE;
        }
        return UNKNOWN;
    }
    
    @Override
    public String toString() {
        return _value;
    }
}
