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
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.event.logical.shared.AttachEvent.Handler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.SimplePanel;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public abstract class MapPanel extends SimplePanel {
    protected Map _map;
    private final OLConfiguration _olConfiguration;
    public MapPanel(OLConfiguration olConfiguration) {
        _olConfiguration = olConfiguration;
        
        super.addAttachHandler(new Handler() {
            @Override
            public void onAttachOrDetach(AttachEvent event) {
                if (event.isAttached()) {
                    injectOpenLayers(getElement());
                }
            }
        });
    }
    
    protected void injectOpenLayers(final Element element) {
        Document document = element.getOwnerDocument();
        OL.initialize(_olConfiguration.getPath(), _olConfiguration.getName(), _olConfiguration.getStyles(), document, new Callback<Void, Exception>() {
            @Override
            public void onFailure(Exception reason) {
                Window.alert("Error: Failed to inject scripts from "+ _olConfiguration.getPath() + _olConfiguration.getName());
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
