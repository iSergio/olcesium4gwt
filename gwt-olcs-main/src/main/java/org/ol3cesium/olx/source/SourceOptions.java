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
package org.ol3cesium.olx.source;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.ol.Attribution;
import org.ol3cesium.ol.proj.Projection;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class SourceOptions extends JavaScriptObject {
    protected SourceOptions() {
        //
    }
    
    public static native SourceOptions create() /*-{
        return {};
    }-*/;
    
    public final native void setProjection(Projection projection) /*-{
        this.projection = projection;
    }-*/;
    
    /**
     * 
     * @param attributions Attributions.
     */
    public final native void setAttributions(JsArray<Attribution> attributions) /*-{
        this.attributions = attributions;
    }-*/;
    
    /**
     * 
     * @param logo Logo.
     */
    public final native void setLogo(String logo) /*-{
        this.logo = logo;
    }-*/;
    
    /**
     * 
     * @param state Source state.
     */
    public final native void setState(String state) /*-{
        this.state = state;
    }-*/;
    
    /**
     * Whether to wrap the world horizontally. 
     * The default, undefined, is to request out-of-bounds tiles from the server. 
     * When set to false, only one world will be rendered. 
     * When set to true, tiles will be requested for one world only, 
     * but they will be wrapped horizontally to render multiple worlds.
     * @param wrapX 
     */
    public final native void setWrapX(boolean wrapX) /*-{
        this.wrapX = wrapX;
    }-*/;
}
