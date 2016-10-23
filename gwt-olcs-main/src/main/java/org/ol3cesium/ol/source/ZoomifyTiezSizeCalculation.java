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
package org.ol3cesium.ol.source;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum ZoomifyTiezSizeCalculation {
    DEFAULT("default"), TRUNCATED("truncated"), UNKNOWN("unknown");
    
    private final String _value;
    
    ZoomifyTiezSizeCalculation(String value) {
        _value = value;
    }
    
    public static ZoomifyTiezSizeCalculation fromString(String string) {
        if (DEFAULT.toString().equalsIgnoreCase(string)) {
            return DEFAULT;
        }
        else if (TRUNCATED.toString().equalsIgnoreCase(string)) {
            return TRUNCATED;
        } else {
            return UNKNOWN;
        }
    }
    
    @Override
    public String toString() {
        return _value;
    }
}
