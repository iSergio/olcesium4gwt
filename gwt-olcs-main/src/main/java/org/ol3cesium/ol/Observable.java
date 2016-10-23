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

/**
 * Abstract base class; normally only used for creating subclasses and not 
 * instantiated in apps. An event target providing convenient methods for 
 * listener registration and unregistration. A generic change event is always 
 * available through ol.Observable#changed.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Observable extends JavaScriptObject {
    protected Observable() {
        //
    }
    
    public static native Observable create() /*-{
        return new ol.Observable();
    }-*/;
    
//    public static final native void unByKey(JavaScriptObject key) /*-{
//        ol.Observable.unByKey(key);
//    }-*/;
    
    /**
     * Dispatches an event and calls all listeners listening for events of this type. 
     * The event parameter can either be a string or an Object with a type property.
     * @param event Event object.
     */
    public final native void dispatchEvent(JavaScriptObject event) /*-{
        this.dispatchEvent(event);
    }-*/;
    
    /**
     * Get the version number for this object. Each time the object is modified, 
     * its version number will be incremented.
     * @return Revision
     */
    public final native int getRevision() /*-{
        return this.getRevision();
    }-*/;
    
    /**
     * Listen for a certain type of event.
     * @param type The event type or array of event types.
     * @param listener The listener function.
     */
    public final native void on(String type, JavaScriptObject listener) /*-{
        this.on(type, listener);
    }-*/;
    
    /**
     * Listen once for a certain type of event.
     * @param type The event type or array of event types.
     * @param listener The listener function.
     */
    public final native void once(String type, JavaScriptObject listener) /*-{
        this.once(type, listener);
    }-*/;
    
    /**
     * Unlisten for a certain type of event.
     * @param type The event type or array of event types.
     * @param listener The listener function.
     */
    public final native void un(String type, JavaScriptObject listener) /*-{
        this.un(type, listener);
    }-*/;
    
    /**
     * Removes an event listener using the key returned by on() or once(). 
     * Note that using the ol.Observable.unByKey static function is to be preferred.
     * @param key The key returned by on() or once().
     */
    public final native void unByKey(JavaScriptObject key) /*-{
        this.unByKey(key);
    }-*/;
}
