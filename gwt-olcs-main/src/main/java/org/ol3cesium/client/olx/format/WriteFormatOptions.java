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
package org.ol3cesium.client.olx.format;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class WriteFormatOptions extends ReadFormatOptions {
    protected WriteFormatOptions() {
        //
    }

    public static final native WriteFormatOptions create() /*-{
        return {};
    }-*/;

    /**
     * When writing geometries, follow the right-hand rule for linear ring orientation. 
     * This means that polygons will have counter-clockwise exterior rings and 
     * clockwise interior rings. By default, coordinates are serialized as they 
     * are provided at construction. If true, the right-hand rule will be applied. 
     * If false, the left-hand rule will be applied (clockwise for exterior and 
     * counter-clockwise for interior rings). Note that not all formats support this. 
     * The GeoJSON format does use this property when writing geometries.
     * @param rightHanded 
     */
    public final native void setRightHanded(boolean rightHanded) /*-{
        this.rightHanded = rightHanded;
    }-*/;
}
