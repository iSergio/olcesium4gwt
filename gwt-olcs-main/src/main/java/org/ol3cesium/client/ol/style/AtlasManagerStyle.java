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
package org.ol3cesium.client.ol.style;

import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.client.olx.style.AtlasManagerStyleOptions;

/**
 * Manages the creation of image atlases.
 * 
 * Images added to this manager will be inserted into an atlas, which will be 
 * used for rendering. The size given in the constructor is the size for the 
 * first atlas. After that, when new atlases are created, they will have twice 
 * the size as the latest atlas (until maxSize is reached).
 * 
 * If an application uses many images or very large images, it is recommended to 
 * set a higher size value to avoid the creation of too many atlases.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class AtlasManagerStyle extends JavaScriptObject {
    protected AtlasManagerStyle() {
        //
    }
    
    public static final native AtlasManagerStyle crate() /*-{
        return new ol.style.AtlasManager();
    }-*/;
    
    public static final native AtlasManagerStyle crate(AtlasManagerStyleOptions options) /*-{
        return new ol.style.AtlasManager(options);
    }-*/;
}
