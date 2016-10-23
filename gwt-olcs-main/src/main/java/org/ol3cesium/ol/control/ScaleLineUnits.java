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
package org.ol3cesium.ol.control;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum ScaleLineUnits {
    DEGREES("degrees"), IMPERIAL("imperial"), NAUTICAL("nautical"),
    METRIC("metric"), US("us"), UNKNOWN("unknown");
    
    private final String _value;
    
    ScaleLineUnits(String value) {
        _value = value;
    }
    
    public static ScaleLineUnits fromString(String string) {
        if (DEGREES.toString().equalsIgnoreCase(string)) {
            return DEGREES;
        }
        else if (IMPERIAL.toString().equalsIgnoreCase(string)) {
            return IMPERIAL;
        }
        else if (NAUTICAL.toString().equalsIgnoreCase(string)) {
            return NAUTICAL;
        }
        else if (METRIC.toString().equalsIgnoreCase(string)) {
            return METRIC;
        }
        else if (US.toString().equalsIgnoreCase(string)) {
            return US;
        } else {
            return UNKNOWN;
        }
    }
    
    @Override
    public String toString() {
        return _value;
    }
}
