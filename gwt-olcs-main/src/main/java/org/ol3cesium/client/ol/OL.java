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

import com.google.gwt.core.client.Callback;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.LinkElement;
import java.util.List;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OL extends JavaScriptObject {
    protected OL() {
        //
    }
    
//    public static native OL get() /*-{
//        if (typeof ol === "undefined") {
//          return null;
//        } else {
//          return ol;
//        }
//    }-*/;
    
    public static void initialize(String path, String name, List<String> styles, Document document, Callback<Void, Exception> callback) {
        OLInitializer olInitializer = OLInitializer.get(document);
        if (olInitializer != null) {
            olInitializer.addCallback(callback);
            olInitializer.initialize();
        } else {
            for (String style : styles) {
                LinkElement link = Document.get().createLinkElement();
                link.setRel("stylesheet");
                link.setHref(style);
                document.getElementsByTagName("head").getItem(0).appendChild(link);
            }
            new OLInitializer(path, name, document, callback).initialize();
        }
    }
}
