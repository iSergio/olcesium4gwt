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
package org.ol3cesium.client.ol;

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.dom.client.Document;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;
import java.util.Map;
import java.util.logging.Level;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OLInitializer {
    private static final Logger _logger = Logger.getLogger(OLInitializer.class.getName());
  
    private static final Map<Document, OLInitializer> _ol3InitializerFromDocument = new HashMap<Document, OLInitializer>();

    private final String       _path;
    private final String       _name;
    private final Document     _document;
    private final List<Callback<Void, Exception>> _callbacks = new ArrayList<Callback<Void, Exception>>();
    
    public OLInitializer(String path, String name, Document document, Callback<Void, Exception> callback) {
        _path     = path;
        _name     = name;
        _document = document;
        addCallback(callback);
        _ol3InitializerFromDocument.put(document, this);
    }

    public void initialize() {
        final String url = _path + _name;

        ScriptInjector.fromUrl(url).setWindow(getWindow(_document)).setCallback(new Callback<Void,Exception>() {
            @Override
            public void onFailure(Exception reason) {
                for (Callback<Void, Exception> callback : _callbacks) {
                    callback.onFailure(reason);
                }
            }

            @Override
            public void onSuccess(Void result) {
                createSetter(_document);
                
                String script;
                JavaScriptObject scriptElement;

                if (olcsDefined()) {
                    script = "document.setGlobalInGWT(ol, olcs);";
                } else {
                    script = "document.setGlobalInGWT(ol, undefined);";
                }
                scriptElement = ScriptInjector.fromString(script).setWindow(getWindow(_document)).inject();
            }
        }).inject();
    }
    
    public static native boolean olDefined() /*-{
        return (typeof $wnd.ol != "undefined");
    }-*/;
    
    public static native boolean olcsDefined() /*-{
        return (typeof $wnd.olcs != "undefined");
    }-*/;
    
    public static native boolean cesiumDefined() /*-{
        return (typeof $wnd.Cesium != "undefined");
    }-*/;
    
    private void invokeCallback() {
        for (Callback<Void, Exception> callback : _callbacks) {
            try {
                callback.onSuccess(null);
            } catch (Throwable t) {
                _logger.log(Level.SEVERE, "Error initializing OpenLayers3: " + t.getMessage(), t);
            }
        }
    }
        
    private static native JavaScriptObject getWindow(Document document) /*-{
        var win = document.parentWindow || document.defaultView;
        return win;
    }-*/;

    private native void createSetter(Document document) /*-{
        var outerThis = this

        document.setGlobalInGWT = function(olToSet, olcsToSet) {
            ol   = olToSet;
            olcs = olcsToSet;
            outerThis.@org.ol3cesium.client.ol.OLInitializer::invokeCallback()();
        }
    }-*/;
    
    public final void addCallback(Callback<Void, Exception> callback) {
        _callbacks.add(callback);
    }
    
    public static OLInitializer get(Document document) {
        return _ol3InitializerFromDocument.get(document);
    }
}
