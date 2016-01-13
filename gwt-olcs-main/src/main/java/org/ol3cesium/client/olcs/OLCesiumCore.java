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
package org.ol3cesium.client.olcs;

import com.google.gwt.core.client.JsArray;
import org.cesiumjs.cesium.Cartesian2;
import org.cesiumjs.cesium.Cartesian3;
import org.cesiumjs.cesium.Cartographic;
import org.cesiumjs.cesium.Color;
import org.cesiumjs.cesium.Globe;
import org.cesiumjs.cesium.ImageryLayer;
import org.cesiumjs.cesium.Matrix4;
import org.cesiumjs.cesium.Rectangle;
import org.cesiumjs.cesium.Scene;
import org.ol3cesium.client.ol.Coordinate;
import org.ol3cesium.client.ol.Extent;
import org.ol3cesium.client.ol.geom.Geometry;
import org.ol3cesium.client.ol.layer.BaseLayer;
import org.ol3cesium.client.ol.proj.Projection;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OLCesiumCore {
    /**
     * 
     * @param geometry
     * @param height 
     */
    public static final native void applyHeightOffsetToGeometry(Geometry geometry, double height) /*-{
        olcs.core.applyHeightOffsetToGeometry(geometry, height);
    }-*/;
    
    /**
     * Compute the rotation angle around a given point, needed to reach the 
     * zenith position. At a zenith position, the camera direction is going 
     * througth the earth center and the frustrum bottom ray is going through 
     * the chosen pivot point. The bottom-center of the screen is a good candidate 
     * for the pivot point.
     * @param scene {@link Scene}
     * @param pivot Point around which the camera rotates.
     * @return 
     */
    public static final native double computeAngleToZenith(Scene scene, Cartesian3 pivot) /*-{
        olcs.core.computeAngleToZenith(scene, pivot);
    }-*/;
    
    /**
     * Compute the pixel width and height of a point in meters using the camera frustum.
     * @param scene {@link Scene}
     * @param target
     * @return 
     */
    public static final native Cartesian2 computePixelSizeAtCoordinate(Scene scene, Cartesian3 target) /*-{
        olcs.core.computePixelSizeAtCoordinate(scene, target);
    }-*/;
    
    /**
     * Compute the signed tilt angle on globe, between the opposite of the camera 
     * direction and the target normal. Return undefined if there is no 
     * intersection of the camera direction with the globe.
     * @param scene
     * @return 
     */
    public static final native double computeSignedTiltAngleOnGlobe(Scene scene) /*-{
        olcs.core.computeSignedTiltAngleOnGlobe(scene);
    }-*/;
    
    /**
     * Convert an OpenLayers color to Cesium.
     * @param olColor
     * @return 
     */
    public static final native Color convertColorToCesium(String olColor) /*-{
        return olcs.core.convertColorToCesium(olColor);
    }-*/;
    
    /**
     * Convert an OpenLayers color to Cesium.
     * @param olColor
     * @return 
     */
    public static final native Color convertColorToCesium(org.ol3cesium.client.ol.Color olColor) /*-{
        return olcs.core.convertColorToCesium(olColor);
    }-*/;
    
    /**
     * Convert an OpenLayers extent to a Cesium rectangle.
     * @param extent Extent.
     * @param projection Extent projection.
     * @return The corresponding Cesium rectangle.
     */
    public static final native Rectangle extentToRectangle(Extent extent, Projection projection) /*-{
        return olcs.core.extentToRectangle(extent, projection);
    }-*/;
    
    /**
     * Convert an OpenLayers extent to a Cesium rectangle.
     * @param extent Extent.
     * @param projection Extent projection.
     * @return The corresponding Cesium rectangle.
     */
    public static final native Rectangle extentToRectangle(Extent extent, String projection) /*-{
        return olcs.core.extentToRectangle(extent, projection);
    }-*/;
    
    /**
     * Rotate the camera so that its direction goes through the target point. 
     * If a globe is given, the target height is first interpolated from terrain.
     * @param camera
     * @param target
     * @param globe 
     */
    public static final native void lookAt(Camera camera, Cartographic target, Globe globe) /*-{
        olcs.core.lookAt(camera, target, globe);
    }-*/;
    
        /**
     * Rotate the camera so that its direction goes through the target point. 
     * If a globe is given, the target height is first interpolated from terrain.
     * @param camera
     * @param target
     */
    public static final native void lookAt(Camera camera, Cartographic target) /*-{
        olcs.core.lookAt(camera, target);
    }-*/;
    
    /**
     * Convert an array of 2D or 3D OpenLayers coordinates to Cesium.
     * @param coordinates Ol3 coordinates.
     * @return 
     */
    public static final native JsArray<Cartesian3> ol4326CoordinateArrayToCsCartesians(JsArray<Coordinate> coordinates) /*-{
        return olcs.core.ol4326CoordinateArrayToCsCartesians(coordinates);
    }-*/;
    
    /**
     * Convert a 2D or 3D OpenLayers coordinate to Cesium.
     * @param coordinate Ol3 coordinate.
     * @return 
     */
    public static final native Cartesian3 ol4326CoordinateToCesiumCartesian(Coordinate coordinate) /*-{
        return olcs.core.ol4326CoordinateToCesiumCartesian(coordinate);
    }-*/;
    
    /**
     * Reproject an OpenLayers geometry to EPSG:4326 if needed. 
     * The geometry will be cloned only when original projection is not 
     * EPSG:4326 and the properties will be shallow copied.
     * @param geometry
     * @param projection
     * @return 
     */
    public static final native Geometry olGeometryCloneTo4326(Geometry geometry, Projection projection) /*-{
        return olcs.core.olGeometryCloneTo4326(geometry, projection);
    }-*/;
    
    /**
     * Get the 3D position of the point at the bottom-center of the screen.
     * @param scene
     * @return 
     */
    public static final native Cartesian3 pickBottomPoint(Scene scene) /*-{
        return olcs.core.pickBottomPoint(scene);
    }-*/;
    
    /**
     * Get the 3D position of the point at the center of the screen.
     * @param scene
     * @return 
     */
    public static final native Cartesian3 pickCenterPoint(Scene scene) /*-{
        return olcs.core.pickCenterPoint(scene);
    }-*/;
    
    /**
     * Get the 3D position of the given pixel of the canvas.
     * @param scene
     * @param pixel
     * @return 
     */
    public static final native Cartesian3 pickOnTerrainOrEllipsoid(Scene scene, Cartesian2 pixel) /*-{
        return olcs.core.pickOnTerrainOrEllipsoid(scene, pixel);
    }-*/;
    
    /**
     * 
     * @param camera
     * @param angle
     * @param axis
     * @param transform 
     */
    public static final native void rotateAroundAxis(Camera camera, double angle, Cartesian3 axis, Matrix4 transform) /*-{
        olcs.core.rotateAroundAxis(camera, angle, axis, transform);
    }-*/;
    
    /**
     * 
     * @param scene
     * @param heading
     * @param bottomCenter 
     */
    public static final native void setHeadingUsingBottomCenter(Scene scene, double heading, Cartesian3 bottomCenter) /*-{
        olcs.core.setHeadingUsingBottomCenter(scene, heading, bottomCenter);
    }-*/;
    
    /**
     * Creates Cesium.ImageryLayer best corresponding to the given ol.layer.Layer. Only supports raster layers
     * @param olLayer
     * @param viewProj Projection of the view.
     * @return 
     */
    public static final native ImageryLayer tileLayerToImageryLayer(BaseLayer olLayer, Projection viewProj) /*-{
        return olcs.core.tileLayerToImageryLayer(olLayer, viewProj);
    }-*/;
    
    /**
     * Synchronizes the layer rendering properties (opacity, visible) to the given Cesium ImageryLayer.
     * @param olLayer
     * @param csLayer 
     */
    public static final native void updateCesiumLayerProperties(BaseLayer olLayer, ImageryLayer csLayer) /*-{
        olcs.core.updateCesiumLayerProperties(olLayer, csLayer);
    }-*/;
}
