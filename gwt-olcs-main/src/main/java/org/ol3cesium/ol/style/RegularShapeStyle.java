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
package org.ol3cesium.ol.style;

import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.user.client.ui.Image;
import org.ol3cesium.ol.Size;
import org.ol3cesium.olx.style.RegularShapeStyleOptions;

/**
 * Set regular shape style for vector features. The resulting shape will be a 
 * regular polygon when radius is provided, or a star when radius1 and radius2 are provided.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class RegularShapeStyle extends ImageStyle {
    protected RegularShapeStyle() {
        //
    }
    
    public static native RegularShapeStyle create(RegularShapeStyleOptions options) /*-{
        return new ol.style.RegularShape(options);
    }-*/;
    
    /**
     * Get the anchor point. The anchor determines the center point for the 
     * symbolizer. Its units are determined by anchorXUnits and anchorYUnits.
     * @return Anchor.
     */
    public final native JsArrayNumber getAnchor() /*-{
        return this.getAnchor();
    }-*/;
    
    /**
     * Get the angle used in generating the shape.
     * @return Shape's rotation in radians.
     */
    public final native Number getAngle() /*-{
        return this.getAngle();
    }-*/;
    
    /**
     * Get the fill style for the shape.
     * @return Fill style.
     */
    public final native FillStyle getFill() /*-{
        return this.getFill();
    }-*/;
    
    /**
     * Get the image element for the symbolizer.
     * @param pixelRatio Pixel ratio.
     * @return Image element.
     */
    public final native Image getImage(Number pixelRatio) /*-{
        return this.getImage(pixelRatio);
    }-*/;

    /**
     * Get the origin of the symbolizer.
     * @return Origin.
     */
    public final native JsArrayNumber getOrigin() /*-{
        return this.getOrigin();
    }-*/;
    
    /**
     * Get the number of points for generating the shape.
     * @return Number of points for stars and regular polygons.
     */
    public final native int getPoints() /*-{
        return this.getPoints();
    }-*/;
    
    /**
     * Get the (primary) radius for the shape.
     * @return Radius.
     */
    public final native double getRadius() /*-{
        return this.getRadius();
    }-*/;
    
    /**
     * Get the secondary radius for the shape.
     * @return Radius2.
     */
    public final native double getRadius2() /*-{
        return this.getRadius2();
    }-*/;
    
    /**
     * Get the size of the symbolizer (in pixels).
     * @return Size.
     */
    public final native Size getSize() /*-{
        return this.getSize();
    }-*/;
    
    /**
     * Get the stroke style for the shape.
     * @return Stroke style.
     */
    public final native StrokeStyle getStroke() /*-{
        return this.getStroke();
    }-*/;
}
