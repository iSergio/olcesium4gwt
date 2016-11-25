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

import com.google.gwt.core.client.Callback;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.event.logical.shared.AttachEvent.Handler;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.SimplePanel;
import org.ol3cesium.Configuration;
import org.ol3cesium.OpenLayers3;

import java.util.logging.Logger;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public abstract class MapPanelAbstract extends SimplePanel {
    private final Configuration _configuration;
    protected Map _map;

    public MapPanelAbstract(Configuration configuration) {
        _configuration = configuration;
        getElement().setClassName("map");
        getElement().setId(Random.nextInt() + "-" + Random.nextInt() + "-" + Random.nextInt());
        this.addAttachHandler(new AttachEvent.Handler() {
            @Override
            public void onAttachOrDetach(AttachEvent attachEvent) {
                if (attachEvent.isAttached()) {
                    inject(getElement());
                } else {
                    getElement().removeAllChildren();
                    getElement().removeFromParent();
                }
            }
        });
    }
    
    protected void inject(final Element element) {
        Document document = element.getOwnerDocument();

        OpenLayers3.initialize(_configuration.getPath(), _configuration.getName(), _configuration.getStyles(), document, new Callback<Void, Exception>() {
            @Override
            public void onFailure(Exception reason) {
                Window.alert("Error: Failed to inject scripts from "+ _configuration.getPath() + _configuration.getName());
            }

            @Override
            public void onSuccess(Void result) {
                _map = createMap(element);
            }
        });
    }
    
    public abstract Map createMap(Element element);
    
    public Map getMap(){
        return _map;
    }
}
