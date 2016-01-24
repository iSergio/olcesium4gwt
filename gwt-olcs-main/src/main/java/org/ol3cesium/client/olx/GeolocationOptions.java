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
package org.ol3cesium.client.olx;

import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.client.ol.proj.Projection;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class GeolocationOptions extends JavaScriptObject {
    protected GeolocationOptions() {
        //
    }
    
    public static final native GeolocationOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param tracking Start Tracking. Default is false.
     */
    public final native void setTracking(boolean tracking) /*-{
        this.tracking = tracking;
    }-*/;
    
    /**
     * 
     * @param geolocationPositionOptions Tracking options. See http://www.w3.org/TR/geolocation-API/#position_options_interface.
     */
    public final native void setTrackingOptions(JavaScriptObject/*GeolocationPositionOptions*/ geolocationPositionOptions) /*-{
        this.geolocationPositionOptions = geolocationPositionOptions;
    }-*/;

    /**
     * 
     * @param projection The projection the position is reported in.
     */
    public final native void setProjection(Projection projection) /*-{
        this.projection = projection;
    }-*/;
}
