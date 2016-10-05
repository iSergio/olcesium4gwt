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
package org.ol3cesium.client.ol;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.client.ol.event.CollectionAddEventListener;
import org.ol3cesium.client.ol.event.CollectionRemoveEventListener;

/**
 * An expanded version of standard JS Array, adding convenience methods for manipulation. 
 * Add and remove changes to the Collection trigger a Collection event. 
 * Note that this does not cover changes to the objects within the Collection; 
 * they trigger events on the appropriate object, not on the Collection as a whole.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 * @param <T>
 */
public class Collection<T extends JavaScriptObject> extends Object {
    protected Collection() {
        //
    }
    
    public static final native Collection create() /*-{
        return new ol.Collection();
    }-*/;
    
    public static final native Collection create(JsArray array) /*-{
        var collection = new ol.Collection();
        return collection.extend(array);
    }-*/;
    
    /**
     * Remove all elements from the collection.
     */
    public final native void clear() /*-{
        this.clear();
    }-*/;
    
    /**
     * Get the length of this collection.
     * @return The length of the array.
     */
    public final native int getLength() /*-{
        return this.getLength();
    }-*/;
    
    /**
     * Insert an element at the provided index.
     * @param index Index.
     * @param elem  Element.
     */
    public final native void insertAt(int index, T elem) /*-{
        this.insertAt(index, elem);
    }-*/;
    
    /**
     * Get the element at the provided index.
     * @param index Index.
     * @return Element.
     */
    public final native T item(int index) /*-{
        return this.item(index);
    }-*/;
    
    /**
     * Remove the last element of the collection and return it. Return undefined if the collection is empty.
     * @return Element.
     */
    public final native T pop() /*-{
        this.pop();
    }-*/;
    
    /**
     * Insert the provided element at the end of the collection.
     * @param elem Element.
     * @return Length.
     */
    public final native Number push(T elem) /*-{
        return this.push(elem);
    }-*/;
    
    /**Remove the first occurrence of an element from the collection.
     * Remove the first occurrence of an element from the collection.
     * @param elem Element.
     * @return The removed element or undefined if none found.
     */
    public final native T remove(T elem) /*-{
        return this.remove(elem);
    }-*/;
    
    /**
     * Remove the element at the provided index and return it. Return undefined if the collection does not contain this index.
     * @param index Index.
     * @return The removed element or undefined if the collection does not contain this index.
     */
    public final native T removeAt(int index) /*-{
        return this.removeAt(index);
    }-*/;
    
    /**
     * Set the element at the provided index.
     * @param index Index.
     * @param elem Element.
     */
    public final native void setAt(int index, T elem) /*-{
        this.setAt(index, elem);
    }-*/;
    
    public final native void addCollectionAddEventListener(CollectionAddEventListener collectionAddEventListener) /*-{
        if (!this.__collectionAddEventListenerRegistered) {
            var that = this;
            var callback = function (event) {
                that.__notifyCollectionAddEventListeners(event.element);
            };
            this.on('add', $entry(callback), this);
            this.__collectionAddEventListenerRegistered = true;
            this.__collectionAddEventListeners = [];
            this.__notifyCollectionAddEventListeners = function(collectionAddEvent) {
                var length = this.__collectionAddEventListeners.length;
                for (var i = 0; i < length;  i++) {
                    var listener = this.__collectionAddEventListeners[i];
                    listener.@org.ol3cesium.client.ol.event.CollectionAddEventListener::onCollectionAdd(Lcom/google/gwt/core/client/JavaScriptObject;)(collectionAddEvent);
                }
            };
        }
        this.__collectionAddEventListeners.push(collectionAddEventListener);
    }-*/;
    
    public final native void removeCollectionAddEventListener(CollectionAddEventListener collectionAddEventListener) /*-{
        if (!this.__collectionAddEventListeners) {
            return;
        }
        var index = this.__collectionAddEventListeners.indexOf(collectionAddEventListener);
        if (index > -1) {
            this.__collectionAddEventListeners.splice(collectionAddEventListener, 1);
        }
    }-*/;
    
    public final native void addCollectionRemoveEventListener(CollectionRemoveEventListener collectionRemoveEventListener) /*-{
        if (!this.__collectionRemoveEventListenerRegistered) {
            var that = this;
            var callback = function (event) {
                that.__notifyCollectionRemoveEventListeners(event.element);
            };
            this.on('remove', $entry(callback), this);
            this.__collectionRemoveEventListenerRegistered = true;
            this.__collectionRemoveEventListeners = [];
            this.__notifyCollectionRemoveEventListeners = function(event) {
                var length = this.__collectionRemoveEventListeners.length;
                for (var i = 0; i < length;  i++) {
                    var listener = this.__collectionRemoveEventListeners[i];
                    listener.@org.ol3cesium.client.ol.event.CollectionRemoveEventListener::onCollectionRemove(Lcom/google/gwt/core/client/JavaScriptObject;)(event);
                }
            };
        }
        this.__collectionRemoveEventListeners.push(collectionRemoveEventListener);
    }-*/;
    
    public final native void removeCollectionRemoveEventListener(CollectionRemoveEventListener collectionRemoveEventListener) /*-{
        if (!this.__collectionRemoveEventListeners) {
            return;
        }
        var index = this.__collectionRemoveEventListeners.indexOf(collectionRemoveEventListener);
        if (index > -1) {
            this.__collectionRemoveEventListeners.splice(collectionRemoveEventListener, 1);
        }
    }-*/;
}
