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
package org.ol3cesium.olcs;

import jsinterop.annotations.*;
import org.cesiumjs.cs.collections.DataSourceCollection;
import org.cesiumjs.cs.datasources.DataSourceDisplay;
import org.cesiumjs.cs.scene.Scene;
import org.ol3cesium.olcs.options.OLCesiumOptions;
import org.openlayers.ol.Map;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "olcs", name = "OLCesium")
public class OLCesium {
    @JsConstructor
    public OLCesium(OLCesiumOptions options) {}

    @JsProperty(namespace = JsPackage.GLOBAL, name = "olcs")
    public static native boolean isInitialized();

    public native void disableRootEvents(boolean disableRootEvents);

    /**
     * Render the globe only when necessary in order to save resources. Experimental.
     */
    @JsMethod
    public native void enableAutoRenderLoop();

    /**
     * Get the autorender loop.
     * @return autorender loop.
     */
    @JsMethod
    public native AutoRenderLoop getAutoRenderLoop();

    /**
     *
     * @return
     */
    @JsMethod
    public native Camera getCamera();

    /**
     *
     * @return
     */
    @JsMethod
    public native Scene getCesiumScene();

    @JsMethod
    public native DataSourceDisplay getDataSourceDisplay();

    /**
     *
     * @return
     */
    @JsMethod
    public native DataSourceCollection getDataSources();

    @JsMethod
    public native boolean getEnabled();

    @JsMethod
    public native Map getOlMap();

    /**
     * Block Cesium rendering to save resources. Block if you use tab widget or overlay widgets.
     * @param block True to block.
     */
    @JsMethod
    public native void setBlockCesiumRendering(boolean block);

    /**
     * Enables/disables the Cesium. This modifies the visibility style of the container element.
     * @param enable
     */
    @JsMethod
    public native void setEnabled(boolean enable);

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
    @JsMethod
    public native void setResolutionScale(float value);

    /**
     * Preload Cesium so that it is ready when transitioning from 2D to 3D.
     * @param height Target height of the camera.
     * @param timeout Milliseconds after which the warming will stop.
     */
    @JsMethod
    public native void warmUp(double height, int timeout);
}