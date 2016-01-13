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
package org.ol3cesium.client.ol.source;

import com.google.gwt.core.client.JsArrayString;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class UrlTileSource extends TileSource {
    protected UrlTileSource() {
        //
    }
    
    public final native JsArrayString getUrls() /*-{
        return this.getUrls();
    }-*/;
    
    public final native void setUrl(String url) /*-{
        this.setUrl(url);
    }-*/;
    
    public final native void setUrls(JsArrayString urls) /*-{
        this.setUrls(urls);
    }-*/;
}
