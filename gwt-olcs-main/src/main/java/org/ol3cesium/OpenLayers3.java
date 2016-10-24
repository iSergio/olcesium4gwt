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
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.LinkElement;

import java.util.List;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OpenLayers3 {

    public static void initialize(String path, String name, List<String> styles, Document document, Callback<Void, Exception> callback) {
        Initializer initializer = Initializer.get(document);
        if (initializer != null) {
            initializer.addCallback(callback);
            initializer.invokeCallback();
        } else {
            for (String style : styles) {
                LinkElement linkElement = Document.get().createLinkElement();
                linkElement.setRel("stylesheet");
                linkElement.setHref(style);
                document.getElementsByTagName("head").getItem(0).appendChild(linkElement);
            }
            new Initializer(path, name, document, callback).initialize();
        }
    }
}
