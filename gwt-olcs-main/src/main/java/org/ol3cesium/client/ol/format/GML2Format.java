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
package org.ol3cesium.client.ol.format;

import org.ol3cesium.client.olx.format.GMLFormatOptions;

/**
 * Feature format for reading and writing data in the GML format, version 2.1.2.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class GML2Format extends GMLBaseFormat {
    protected GML2Format() {
        //
    }
    
    public static final native GML2Format create() /*-{
        return new ol.format.GML2();
    }-*/;
    
    public static final native GML2Format create(GMLFormatOptions options) /*-{
        return new ol.format.GML2(options);
    }-*/;
}
