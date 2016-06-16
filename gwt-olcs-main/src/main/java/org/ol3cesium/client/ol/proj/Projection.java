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
package org.ol3cesium.client.ol.proj;

import org.ol3cesium.client.olx.ProjectionOptions;
import com.google.gwt.core.client.JavaScriptObject;
import org.ol3cesium.client.ol.Coordinate;
import org.ol3cesium.client.ol.Extent;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Projection extends JavaScriptObject {
    protected Projection() {
        //
    }
    
    public static final native Projection create(String code) /*-{
        return new ol.proj.Projection({code: code});
    }-*/;
    
    public static final native Projection create(ProjectionOptions options) /*-{
        return new ol.proj.Projection(options);
    }-*/;
    
    /**
     * Get the code for this projection, e.g. 'EPSG:4326'.
     * @return Code.
     */
    public final native String getCode() /*-{
        return this.getCode();
    }-*/;
    
    /**
     * Get the validity extent for this projection.
     * @return Extent.
     */
    public final native Extent getExtent() /*-{
        return this.getExtent();
    }-*/;
    
    /**
     * Get the amount of meters per unit of this projection. 
     * If the projection is not configured with a units identifier, 
     * the return is undefined
     * @return Meters.
     */
    public final native double getMetersPerUnit() /*-{
        return this.getMetersPerUnit();
    }-*/;
    
    /**
     * Get the resolution of the point in degrees or distance units.
     * For projections with degrees as the unit this will simply return the provided resolution.
     * The default for other projections is to estimate the point resolution by transforming the 'point' pixel to EPSG:4326, 
     * measuring its width and height on the normal sphere, and taking the average of the width and height. 
     * An alternative implementation may be given when constructing a projection. For many local projections, 
     * such a custom function will return the resolution unchanged.
     * @param resolution Resolution in projection units.
     * @param point Point.
     * @return Point resolution in projection units.
     */
    public final native double getPointResolution(double resolution, Coordinate point) /*-{
        return this.getPointResolution(resolution, point);
    }-*/;
    
    public final Units getUnits() {
        return Units.fromString(getUnitsNative());
    }

    /**
     * Get the units of this projection.
     * @return Units.
     */
    public final native String getUnitsNative() /*-{
        return this.getUnits();
    }-*/;
    
    /**
     * Get the world extent for this projection.
     * @return Extent.
     */
    public final native Extent getWorldExtent() /*-{
        return this.getWorldExtent();
    }-*/;
    
    /**
     * Is this projection a global projection which spans the whole world?
     * @return Whether the projection is global.
     */
    public final native boolean isGlobal() /*-{
        return this.isGlobal();
    }-*/;
    
    /**
     * Set the validity extent for this projection.
     * @param extent Extent.
     */
    public final native void setExtent(Extent extent) /*-{
        this.setExtent(extent);
    }-*/;
    
    /**
     * Set if the projection is a global projection which spans the whole world
     * @param global Whether the projection is global.
     */
    public final native void setGlobal(boolean global) /*-{
        this.setGlobal(global);
    }-*/;
    
    /**
     * Set the world extent for this projection.
     * @param worldExtent World extent [minlon, minlat, maxlon, maxlat].
     */
    public final native void setWorldExtent(Extent worldExtent) /*-{
        this.setWorldExtent(worldExtent);
    }-*/;
    
    /**
     * Normalize coordinates if wrapX used
     * @param coordinate to normalize
     * @return normalized coordinate
     */
    public final native Coordinate normalizeCoordinate(Coordinate coordinate) /*-{
        var normalizedCoordinate = coordinate;
        var extent = this.getExtent();
        var worldWidth = ol.extent.getWidth(extent);
        var x = normalizedCoordinate[0];
        if (x < extent[0] || x > extent[2]) {
            var worldsAway = Math.ceil((extent[0] - x) / worldWidth);
            normalizedCoordinate = [x + worldWidth * worldsAway, normalizedCoordinate[1]];
        }
        return normalizedCoordinate;
    }-*/;
    
    /**
     * Normalize coordinates if wrapX used
     * @param coordinate to normalize
     * @param projection coordinate projection
     * @return normalized coordinate
     */
    public static final native Coordinate normalizeCoordinate(Coordinate coordinate, Projection projection) /*-{
        var normalizedCoordinate = coordinate;
        var extent = projection.getExtent();
        var worldWidth = ol.extent.getWidth(extent);
        var x = normalizedCoordinate[0];
        if (x < extent[0] || x > extent[2]) {
            var worldsAway = Math.ceil((extent[0] - x) / worldWidth);
            normalizedCoordinate = [x + worldWidth * worldsAway, normalizedCoordinate[1]];
        }
        return normalizedCoordinate;
    }-*/;
}
