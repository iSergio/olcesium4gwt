/*
 * Copyright 2016 Serge Silaev aka iSergio <s.serge.b@gmail.com>.
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
package org.ol3cesium.client.ol;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum OverlayPositioning {
    BOTTOM_LEFT("bottom-left"), BOTTOM_CENTER("bottom-center"), BOTTOM_RIGHT("bottom-right"), 
    CENTER_LEFT("center-left"), CENTER_CENTER("center-center"), CENTER_RIGHT("center-right"), 
    TOP_LEFT("top-left"), TOP_CENTER("top-center"), TOP_RIGHT("top-right"),
    UNKNOWN("unknown");

    private final String _value;

    private OverlayPositioning(String value) {
        _value = value;
    }

    public static OverlayPositioning fromString(String string) {
        if (BOTTOM_LEFT.toString().equalsIgnoreCase(string)) {
            return BOTTOM_LEFT;
        }
        else if (BOTTOM_CENTER.toString().equalsIgnoreCase(string)) {
            return BOTTOM_CENTER;
        }
        else if (BOTTOM_RIGHT.toString().equalsIgnoreCase(string)) {
            return BOTTOM_RIGHT;
        }
        else if (CENTER_LEFT.toString().equalsIgnoreCase(string)) {
            return CENTER_LEFT;
        }
        else if (CENTER_CENTER.toString().equalsIgnoreCase(string)) {
            return CENTER_CENTER;
        }
        else if (CENTER_RIGHT.toString().equalsIgnoreCase(string)) {
            return CENTER_RIGHT;
        }
        else if (TOP_LEFT.toString().equalsIgnoreCase(string)) {
            return TOP_LEFT;
        }
        else if (TOP_CENTER.toString().equalsIgnoreCase(string)) {
            return TOP_CENTER;
        }
        else if (TOP_RIGHT.toString().equalsIgnoreCase(string)) {
            return TOP_RIGHT;
        } else {
            return UNKNOWN;
        }
    }

    @Override
    public String toString() {
        return _value;
    }
}
