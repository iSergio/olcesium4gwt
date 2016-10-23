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
package org.ol3cesium.olx.style;

import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.ol.style.FillStyle;
import org.ol3cesium.ol.style.StrokeStyle;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class RegularShapeStyleOptions extends JavaScriptObject {
    protected RegularShapeStyleOptions() {
        //
    }
    
    public static native RegularShapeStyleOptions create() /*-{
        return {};
    }-*/;
    
    /**
     * 
     * @param fill Fill style.
     */
    public final native void setFill(FillStyle fill) /*-{
        this.fill = fill;
    }-*/;
    
    /**
     * 
     * @param points Number of points for stars and regular polygons. In case 
     * of a polygon, the number of points is the number of sides. Required.
     */
    public final native void setPoints(Number points) /*-{
        this.points = points;
    }-*/;
    
    /**
     * 
     * @param radius Radius of a regular polygon.
     */
    public final native void setRadius(Number radius) /*-{
        this.radius = radius;
    }-*/;
    
    /**
     * 
     * @param radius1 Inner radius of a star.
     */
    public final native void setRadius1(Number radius1) /*-{
        this.radius1 = radius1;
    }-*/;
    
    /**
     * 
     * @param radius2 Outer radius of a star.
     */
    public final native void setRadius2(Number radius2) /*-{
        this.radius2 = radius2;
    }-*/;
    
    /**
     * 
     * @param angle Shape's angle in radians. A value of 0 will have one of the \
     * shape's point facing up. Default value is 0.
     */
    public final native void setAngle(Number angle) /*-{
        this.angle = angle;
    }-*/;
    
    /**
     * 
     * @param snapToPixel If true integral numbers of pixels are used as the X and Y 
     * pixel coordinate when drawing the shape in the output canvas. If false 
     * fractional numbers may be used. Using true allows for "sharp" rendering (no blur), 
     * while using false allows for "accurate" rendering. Note that accuracy is important 
     * if the shape's position is animated. Without it, the shape may jitter noticeably. 
     * Default value is true.
     */
    public final native void setSnapToPixel(boolean snapToPixel) /*-{
        this.snapToPixel = snapToPixel;
    }-*/;
    
    /**
     * 
     * @param stroke Stroke style.
     */
    public final native void setStroke(StrokeStyle stroke) /*-{
        this.stroke = stroke;
    }-*/;
    
    /**
     * 
     * @param rotation Rotation in radians (positive rotation clockwise). Default is 0.
     */
    public final native void setRotation(Number rotation) /*-{
        this.rotation = rotation;
    }-*/;
}
