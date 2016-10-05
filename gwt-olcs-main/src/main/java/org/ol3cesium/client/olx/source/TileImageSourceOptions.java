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
package org.ol3cesium.client.olx.source;

import com.google.gwt.core.client.JsArrayString;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileImageSourceOptions extends TileSourceOptions {
    protected TileImageSourceOptions() {
        //
    }
    
    public static native TileImageSourceOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * URL template. Must include {x}, {y} or {-y}, and {z} placeholders. A {?-?} template pattern, 
     * for example subdomain{a-f}.domain.com, may be used instead of defining 
     * each one separately in the urls option.
     * @param url 
     */
    public final native void setUrl(String url) /*-{
        this.url = url;
    }-*/;
    
    /**
     * An array of URL templates.
     * @param urls An array of URL templates.
     */
    public final native void setUrls(JsArrayString urls) /*-{
        this.urls = urls;
    }-*/;
}
