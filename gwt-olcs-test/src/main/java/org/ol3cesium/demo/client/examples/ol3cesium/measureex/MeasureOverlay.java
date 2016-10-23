/*
 * Copyright 2016 Serge Silaev aka iSergio <s.serge.b@gmail.com>.
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
package org.ol3cesium.demo.client.examples.ol3cesium.measureex;

import org.ol3cesium.ol.Overlay;
import org.ol3cesium.olx.OverlayOptions;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class MeasureOverlay extends Overlay {
    protected MeasureOverlay() {
        //
    }

    public static final native MeasureOverlay create(OverlayOptions options) /*-{
        var d = new Date().getTime();
        var id = 'xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function(c) {
            var r = (d + Math.random()*16)%16 | 0;
            d = Math.floor(d/16);
            return (c=='x' ? r : (r&0x3|0x8)).toString(16);
        });
        var div = $wnd.document.createElement('div');
        div.id = 'measureoverlay_' + id;
        div.className = 'tooltip tooltip-measure';

        $wnd.document.body.appendChild(div);

        var overlay = new $wnd.ol.Overlay(options);
        overlay.set('id', id);
        overlay.setElement(div);
        return overlay;
    }-*/;

    public final native void setClassName(String className) /*-{
        var overlay = $wnd.document.getElementById('measureoverlay_' + this.get('id'));
        overlay.className = className;
    }-*/;

    public final native void setContent(String content) /*-{
        var overlay = $wnd.document.getElementById('measureoverlay_' + this.get('id'));
//        overlay.className = 'tooltip tooltip-static';
            if (overlay == null) return;
        overlay.innerHTML = content;
    }-*/;

    public final native void show() /*-{
        var overlay = $wnd.document.getElementById('measureoverlay_' + this.get('id'));
        overlay.style.display = '';
    }-*/;

    public final native void hide() /*-{
        var overlay = $wnd.document.getElementById('measureoverlay_' + this.get('id'));
        overlay.style.display = 'none';
    }-*/;
}
