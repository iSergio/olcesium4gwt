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
package org.ol3cesium.ol;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

/**
 * Abstract basic class; normally only used for creating subclasses and not
 * instantiated in apps. Most non-trivial classes inherit from this.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Object extends Observable {
    protected Object() {
        //
    }
    
    public static native Object create() /*-{
        return new ol.Object();
    }-*/;
    
    /**
     * Gets a value.
     * @param key Key name.
     * @return Value
     */
    public final native JavaScriptObject get(String key) /*-{
        return this.get(key);
    }-*/;
    
    /**
     * Get a list of object property names.
     * @return List of property names.
     */
    public final native JsArrayString getKeys() /*-{
        return this.getKeys();
    }-*/;
    
    /**
     * Sets a value.
     * @param key Key name.
     * @param value Value.
     */
    public final native void set(String key, JavaScriptObject value) /*-{
        this.set(key, value);
    }-*/;
    
    /**
     * Sets a value.
     * @param key Key name.
     * @param value Value.
     */
    public final native void set(String key, String value) /*-{
        this.set(key, value);
    }-*/;
    
    /**
     * Sets a value.
     * @param key Key name.
     * @param value Value.
     * @param silent Update without triggering an event.
     */
    public final native void set(String key, JavaScriptObject value, boolean silent) /*-{
        this.set(key, value, silent);
    }-*/;
    
    /**
     * Sets a value.
     * @param key Key name.
     * @param value Value.
     * @param silent Update without triggering an event.
     */
    public final native void set(String key, String value, boolean silent) /*-{
        this.set(key, value, silent);
    }-*/;
    
    /**
     * Unsets a property.
     * @param key Key name.
     */
    public final native void unset(String key) /*-{
            this.unset(key);
    }-*/;
    
    /**
     * Unsets a property.
     * @param key Key name.
     * @param silent Unset without triggering an event.
     */
    public final native void unset(String key, boolean silent) /*-{
        this.unset(key, silent);
    }-*/;
}
