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
package org.ol3cesium.client.ol.interaction;

/**
 * Base class that calls user-defined functions on down, move and up events. 
 * This class also manages "drag sequences".
 * 
 * When the handleDownEvent user function returns true a drag sequence is started. 
 * During a drag sequence the handleDragEvent user function is called on move events. 
 * The drag sequence ends when the handleUpEvent user function is called and returns false.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class PointerInteraction extends Interaction {
    protected PointerInteraction() {
        //
    }
    
    public static native PointerInteraction create() /*-{
        return new ol.interaction.Pointer();
    }-*/;
}
