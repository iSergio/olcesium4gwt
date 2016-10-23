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
package org.ol3cesium.ol.event;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileLoadEvent extends Event {
    public enum Type {TILELOADSTART, TILELOADEND, TILELOADERROR, UNKNOWN}

    protected TileLoadEvent() {
        //
    }
    
    public final Type getType() {
        String type = getNativeType();
        switch (type) {
            case "tileloadstart": return Type.TILELOADSTART;
            case "tileloadend" : return Type.TILELOADEND;
            case "tileloaderror": return Type.TILELOADERROR;
            default: return Type.UNKNOWN;
        }
    }
}
