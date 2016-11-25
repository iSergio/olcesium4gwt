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
package org.ol3cesium;

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.dom.client.Document;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Initializer {
    private static final Logger LOGGER = Logger.getLogger(Initializer.class.getName());
    /**
     * Path to OpenLayers3 library and css files
     */
    private final String _path;
    /**
     * OpenLayers3 library (examples.js | examples-debug.js | ol3.js | ol3-debug.js)
     */
    private final String _name;
    private List<Callback<Void, Exception>> _callbacks = new ArrayList<>();
    private static Map<Document, Initializer> _initializerMap = new HashMap<>();

    public Initializer(String path, String name, Document document, Callback<Void, Exception> callback) {
        _path = path;
        _name = name;
        addCallback(callback);
        _initializerMap.put(document, this);
    }

    public void initialize() {
        String path = _path + _name;

        ScriptInjector.fromUrl(path).setWindow(ScriptInjector.TOP_WINDOW).setCallback(new Callback<Void, Exception>() {
            @Override
            public void onFailure(Exception e) {
                for (Callback<Void, Exception> callback : _callbacks) {
                    callback.onFailure(e);
                }
            }

            @Override
            public void onSuccess(Void aVoid) {
                setOl(getOl());
                setOlcs(getOlcs());
                invokeCallback();
            }
        }).inject();
    }

    public void addCallback(Callback<Void, Exception> callback) {
        _callbacks.add(callback);
    }

    public void invokeCallback() {
        for (Callback<Void, Exception> callback : _callbacks) {
            invokeCallback(callback);
        }
    }

    public void invokeCallback(Callback<Void, Exception> callback) {
        try {
            callback.onSuccess(null);
        } catch (Throwable t) {
            LOGGER.log(Level.SEVERE, "Error initialization : " + t.getMessage(), t);
        }
    }

    private native void setOl(JavaScriptObject olToSet) /*-{
        ol = olToSet;
    }-*/;

    private native JavaScriptObject getOl() /*-{
        return $wnd.ol;
    }-*/;

    private native void setOlcs(JavaScriptObject olcsToSet) /*-{
        olcs = olcsToSet;
    }-*/;

    private native JavaScriptObject getOlcs() /*-{
        return $wnd.olcs;
    }-*/;

    public static Initializer get(Document document) {
        return _initializerMap.get(document);
    }
}
