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

import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.cesiumjs.cs.scene.Scene;
import org.openlayers.ol.Map;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "olcs", name = "AbstractSynchronizer")
public class AbstractSynchronizer {
    @JsConstructor
    public AbstractSynchronizer(Map map, Scene scene) {}

    /**
     * Destroy all and perform complete synchronization of the layers.
     */
    @JsMethod
    public native void synchronize();
}
