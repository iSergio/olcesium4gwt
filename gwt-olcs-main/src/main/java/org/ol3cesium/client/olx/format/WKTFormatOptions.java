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

import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class WKTFormatOptions extends JavaScriptObject {
    protected WKTFormatOptions() {
        //
    }
    
    public static native WKTFormatOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Whether to split GeometryCollections into multiple features on reading. 
     * Default is false.
     * @param splitCollection 
     */
    public final native void setSplitCollection(boolean splitCollection) /*-{
        this.splitCollection = splitCollection;
    }-*/;
}
