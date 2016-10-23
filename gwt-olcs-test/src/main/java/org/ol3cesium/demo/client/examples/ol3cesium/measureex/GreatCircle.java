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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import org.ol3cesium.ol.Coordinate;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class GreatCircle extends JavaScriptObject {
    protected GreatCircle() {
        //
    }

    public static final native GreatCircle create(Coordinate start, Coordinate end) /*-{
        return new $wnd.arc.GreatCircle({x: start[0], y: start[1]}, {x: end[0], y: end[1]});
    }-*/;

    public static final native GreatCircle create(Coordinate start, Coordinate end, GreatCircleOptions options) /*-{
        return $wnd.garc.GreatCircle({x: start[0], y: start[1]}, {x: end[0], y: end[1]}, options);
    }-*/;

    public final native JsArray<Coordinate> Arc(int nPoints) /*-{
        return this.Arc(nPoints).geometries[0].coords;
    }-*/;

    public final native JsArray<Coordinate> Arc(int nPoints, int offset) /*-{
        return this.Arc(nPoints, offset).geometries[0].coords;
    }-*/;

    public static class GreatCircleOptions extends JavaScriptObject {
        protected GreatCircleOptions() {
            //
        }

        public static final native GreatCircleOptions create() /*-{
            return {};
        }-*/;
    }
}
