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
package org.ol3cesium.client.ol.interaction;

import org.ol3cesium.client.olx.interaction.MouseWheelZoomInteractionOptions;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class MouseWheelZoomInteraction extends Interaction {
    protected MouseWheelZoomInteraction() {
        //
    }
    
    public static final native MouseWheelZoomInteraction create() /*-{
        return new ol.interaction.MouseWheeZoom();
    }-*/;
    
    public static final native MouseWheelZoomInteraction create(MouseWheelZoomInteractionOptions options) /*-{
        return new ol.interaction.MouseWheeZoom(options);
    }-*/;
    
    /**
     * Enable or disable using the mouse's location as an anchor when zooming
     * @param useAnchor true to zoom to the mouse's location, false to zoom to the center of the map
     */
    public final native void setMouseAnchor(boolean useAnchor) /*-{
        this.setMouseAnchor(useAnchor);
    }-*/;
}
