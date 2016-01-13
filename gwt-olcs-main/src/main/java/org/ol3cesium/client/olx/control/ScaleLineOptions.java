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
package org.ol3cesium.client.olx.control;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class ScaleLineOptions extends JavaScriptObject {
    protected ScaleLineOptions() {
        //
    }
    
    public static final native ScaleLineOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param className CSS class name. Default is ol-attribution.
     */
    public final native void setClassName(String className) /*-{
        this.className = className;
    }-*/;
    
    /**
     * Minimum width in pixels. Default is 64.
     * @param minWidth 
     */
    public final native void setMinWidth(int minWidth) /*-{
        this.minWidth = minWidth;
    }-*/;
    
    /**
     * 
     * @param target Target.
     */
    public final native void setTarget(Element target) /*-{
        this.target = target;
    }-*/;
    
    public final native void setUnits(String units) /*-{
        this.units = units;
    }-*/;
    
    public final class ScaleLineUnits {
        public static final String DEGREES  = "degrees";
        public static final String IMPERIAL = "imperial";
        public static final String NAUTICAL = "nautical";
        public static final String METRIC   = "metric";
        public static final String US       = "us";
    }
}
