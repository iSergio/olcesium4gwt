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
package org.ol3cesium.client.ol.proj;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum Units {
    DEGREES("degrees"), FEET("ft"), METERS("m"), 
    PIXELS("pixels"), TILE_PIXELS("tile-pixels"), USFEET("us-ft"), 
    UNKNOWN("unknown");
    
    private final String _value;
    
    private Units(String value) {
        _value = value;
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
