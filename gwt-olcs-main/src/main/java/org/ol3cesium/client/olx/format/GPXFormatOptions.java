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
package org.ol3cesium.client.olx.format;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class GPXFormatOptions extends JavaScriptObject {
    protected GPXFormatOptions() {
        //
    }
    
    public static final native GPXFormatOptions create() /*-{
        return {};
    }-*/;
    
//    readExtensions	function	
//    Callback function to process extensions nodes. To prevent memory leaks, this callback function must not store any references to the node. Note that the extensions node is not allowed in GPX 1.0. Moreover, only extensions nodes from wpt, rte and trk can be processed, as those are directly mapped to a feature. Required.
}
