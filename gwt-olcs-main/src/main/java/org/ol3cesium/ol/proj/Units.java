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
package org.ol3cesium.ol.proj;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum Units {
    DEGREES("degrees"), FEET("ft"), METERS("m"), 
    PIXELS("pixels"), TILE_PIXELS("tile-pixels"), USFEET("us-ft"), 
    UNKNOWN("unknown");
    
    private static final Map<String, Double> INCHES_PER_UNIT;
    static {
        Map<String, Double> aMap = new HashMap<>();
        aMap.put("ft", 12.0);
        aMap.put("m", 39.37);
        aMap.put("degrees", 4374754.0);
        INCHES_PER_UNIT = Collections.unmodifiableMap(aMap);
    }
    
    private final String _value;
    
    Units(String value) {
        _value = value;
    }
    
    public static double getInchesPerUnit(Units units) {
        return INCHES_PER_UNIT.get(units.toString());
    }
    
    public double getInchesPerUnit() {
        return INCHES_PER_UNIT.get(_value);
    }
    
    public static Units fromString(String string) {
        if (DEGREES.toString().equalsIgnoreCase(string)) {
            return DEGREES;
        }
        else if (FEET.toString().equalsIgnoreCase(string)) {
            return FEET;
        }
        else if (METERS.toString().equalsIgnoreCase(string)) {
            return METERS;
        }
        else if (PIXELS.toString().equalsIgnoreCase(string)) {
            return PIXELS;
        }
        else if (TILE_PIXELS.toString().equalsIgnoreCase(string)) {
            return TILE_PIXELS;
        }
        else if (USFEET.toString().equalsIgnoreCase(string)) {
            return USFEET;
        } else {
            return UNKNOWN;
        }
    }
    
    @Override
    public String toString() {
        return _value;
    }
}
