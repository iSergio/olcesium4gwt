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
package org.ol3cesium.client.olx.source;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.source.Source;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class RasterSourceOptions extends JavaScriptObject {
    protected RasterSourceOptions() {
        //
    }
    
    public static final native RasterSourceOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * Input sources. Required.
     * @param sources 
     */
    public final native void setSources(JsArray<Source> sources) /*-{
        this.sources = sources;
    }-*/;

//operation	ol.raster.Operation | undefined	experimental
//Raster operation. The operation will be called with data from input sources and the output will be assigned to the raster source.
//lib	Object | undefined	experimental
//Functions that will be made available to operations run in a worker.
    
    /**
     * By default, operations will be run in a single worker thread. 
     * To avoid using workers altogether, set threads: 0. 
     * For pixel operations, operations can be run in multiple worker threads. 
     * Note that there is additional overhead in transferring data to multiple 
     * workers, and that depending on the user's system, it may not be 
     * possible to parallelize the work.
     * @param threads 
     */
    public final native void setThreads(int threads) /*-{
        this.threads = threads;
    }-*/;

//operationType	ol.raster.OperationType | undefined	experimental
//Operation type. Supported values are 'pixel' and 'image'. By default, 'pixel' operations are assumed, and operations will be called with an array of pixels from input sources. If set to 'image', operations will be called with an array of ImageData objects from input sources.
}
