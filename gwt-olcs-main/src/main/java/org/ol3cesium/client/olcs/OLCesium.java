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
package org.ol3cesium.client.olcs;

import com.google.gwt.core.client.JavaScriptObject;
import org.cesiumjs.cesium.Scene;
import org.cesiumjs.cesium.data.DataSourceCollection;
import org.ol3cesium.client.ol.Map;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OLCesium extends JavaScriptObject {
    protected OLCesium() {
        //
    }
    
    public static final native OLCesium create(OLCesiumOptions options) /*-{
        return new olcs.OLCesium(options);
    }-*/;
    
    /**
     * Render the globe only when necessary in order to save resources. Experimental.
     */
    public final native void enableAutoRenderLoop() /*-{
        this.enableAutoRenderLoop();
    }-*/;
    
    /**
     * 
     * @return 
     */
    public final native Camera getCamera() /*-{
        return this.getCamera();
    }-*/;
    
    /**
     * 
     * @return 
     */
    public final native Scene getCesiumScene() /*-{
        return this.getCesiumScene();
    }-*/;
    
    /**
     * 
     * @return 
     */
    public final native DataSourceCollection getDataSources() /*-{
        return this.getDataSources();
    }-*/;
    
    public final native boolean getEnabled() /*-{
        return this.getEnabled();
    }-*/;
    
    public final native Map getOlMap() /*-{
        return this.getOlMap();
    }-*/;
    
    /**
     * Block Cesium rendering to save resources.
     * @param block True to block.
     */
    public final native void setBlockCesiumRendering(boolean block) /*-{
        this.setBlockCesiumRendering(block);
    }-*/;
    
    /**
     * Enables/disables the Cesium. This modifies the visibility style of the container element.
     * @param enable 
     */
    public final native void setEnabled(boolean enable) /*-{
        this.setEnabled(enable);
    }-*/;
    
    /**
     * The 3D Cesium globe is rendered in a canvas with two different 
     * dimensions: clientWidth and clientHeight which are the dimension on the 
     * screen and width and height which are the dimensions of the drawing buffer.
     * By using a resolution scale lower than 1.0, it is possible to render 
     * the globe in a buffer smaller than the canvas client dimensions and 
     * improve performance, at the cost of quality.
     * Pixel ratio should also be taken into account; by default, a 
     * device with pixel ratio of 2.0 will have a buffer surface 4 
     * times bigger than the client surface.
     * @param value 
     */
    public final native void setResolutionScale(float value) /*-{
        this.setResolutionScale(value);
    }-*/;
    
    /**
     * Preload Cesium so that it is ready when transitioning from 2D to 3D.
     * @param height Target height of the camera.
     * @param timeout Milliseconds after which the warming will stop.
     */
    public final native void warmUp(double height, int timeout) /*-{
        this.warmUp(height, timeout);
    }-*/;
}
