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
