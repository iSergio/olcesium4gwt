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
package org.ol3cesium.ol.source;

import org.ol3cesium.olx.source.RasterSourceOptions;

/**
 * A source that transforms data from any number of input sources using an array 
 * of ol.raster.Operation functions to transform input pixel values into output pixel values.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class RasterSource extends ImageSource {
    protected RasterSource() {
        //
    }
    
    public static native RasterSource create(RasterSourceOptions options) /*-{
        return new ol.source.Raster(options);
    }-*/;
    
//    setOperation(operation, opt_lib) experimental
//
//src/ol/source/rastersource.js, line 150
//Set the operation.
//
//Name	Type	Description
//operation	ol.raster.Operation	
//New operation.
//lib	Object	
//Functions that will be available to operations run in a worker.
}
