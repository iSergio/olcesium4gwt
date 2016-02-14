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
package org.ol3cesium.client.ol.source;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public enum SourceState {
    UNDEFINED("undefined"), LOADING("loading"), READY("ready"), ERROR("error"), UNKNOWN("unknown");
    
    private final String _value;
    
    private SourceState(String value) {
        _value = value;
    }
    
    public static SourceState fromString(String string) {
        if (UNDEFINED.toString().equalsIgnoreCase(string)) {
            return UNDEFINED;
        }
        else if (LOADING.toString().equalsIgnoreCase(string)) {
            return LOADING;
        }
        else if (READY.toString().equalsIgnoreCase(string)) {
            return READY;
        }
        else if (ERROR.toString().equalsIgnoreCase(string)) {
            return ERROR;
        } else {
            return UNKNOWN;
        }
    }
    
    @Override
    public String toString() {
        return _value;
    }
}
