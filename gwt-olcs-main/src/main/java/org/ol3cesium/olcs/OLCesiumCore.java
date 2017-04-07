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
package org.ol3cesium.olcs;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.cesiumjs.cs.core.*;
import org.cesiumjs.cs.scene.ImageryLayer;
import org.cesiumjs.cs.scene.Scene;
import org.openlayers.ol.Coordinate;
import org.openlayers.ol.Extent;
import org.openlayers.ol.geom.Geometry;
import org.openlayers.ol.layer.BaseLayer;
import org.openlayers.ol.proj.Projection;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@JsType(isNative = true, namespace = "olcs", name = "core")
public class OLCesiumCore {
    /**
     * 
     * @param geometry
     * @param height 
     */
    @JsMethod
    public static native void applyHeightOffsetToGeometry(Geometry geometry, double height);
    
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
    @JsMethod
    public static native double computeAngleToZenith(Scene scene, Cartesian3 pivot);
    
    /**
     * Compute the pixel width and height of a point in meters using the camera frustum.
     * @param scene {@link Scene}
     * @param target
     * @return 
     */
    @JsMethod
    public static native Cartesian2 computePixelSizeAtCoordinate(Scene scene, Cartesian3 target);
    
    /**
     * Compute the signed tilt angle on globe, between the opposite of the camera 
     * direction and the target normal. Return undefined if there is no 
     * intersection of the camera direction with the globe.
     * @param scene
     * @return 
     */
    @JsMethod
    public static native double computeSignedTiltAngleOnGlobe(Scene scene);
    
    /**
     * Convert an OpenLayers color to Cesium.
     * @param olColor
     * @return 
     */
    @JsMethod
    public static native Color convertColorToCesium(String olColor);
    
    /**
     * Convert an OpenLayers color to Cesium.
     * @param olColor
     * @return 
     */
    @JsMethod
    public static native Color convertColorToCesium(org.openlayers.ol.Color olColor);
    
    /**
     * Convert an OpenLayers extent to a Cesium rectangle.
     * @param extent Extent.
     * @param projection Extent projection.
     * @return The corresponding Cesium rectangle.
     */
    @JsMethod
    public static native Rectangle extentToRectangle(Extent extent, Projection projection);
    
    /**
     * Convert an OpenLayers extent to a Cesium rectangle.
     * @param extent Extent.
     * @param projection Extent projection.
     * @return The corresponding Cesium rectangle.
     */
    @JsMethod
    public static native Rectangle extentToRectangle(Extent extent, String projection);
    
    /**
     * Rotate the camera so that its direction goes through the target point. 
     * If a globe is given, the target height is first interpolated from terrain.
     * @param camera
     * @param target
     * @param globe 
     */
    @JsMethod
    public static native void lookAt(Camera camera, Cartographic target, Globe globe);
    
    /**
     * Rotate the camera so that its direction goes through the target point. 
     * If a globe is given, the target height is first interpolated from terrain.
     * @param camera
     * @param target
     */
        @JsMethod
        public static native void lookAt(Camera camera, Cartographic target);
    
    /**
     * Convert an array of 2D or 3D OpenLayers coordinates to Cesium.
     * @param coordinates Ol3 coordinates.
     * @return 
     */
    @JsMethod
    public static native Cartesian3[] ol4326CoordinateArrayToCsCartesians(Coordinate[] coordinates);
    
    /**
     * Convert a 2D or 3D OpenLayers coordinate to Cesium.
     * @param coordinate Ol3 coordinate.
     * @return 
     */
    @JsMethod
    public static native Cartesian3 ol4326CoordinateToCesiumCartesian(Coordinate coordinate);
    
    /**
     * Reproject an OpenLayers geometry to EPSG:4326 if needed. 
     * The geometry will be cloned only when original projection is not 
     * EPSG:4326 and the properties will be shallow copied.
     * @param geometry
     * @param projection
     * @return 
     */
    @JsMethod
    public static native Geometry olGeometryCloneTo4326(Geometry geometry, Projection projection);
    
    /**
     * Get the 3D position of the point at the bottom-center of the screen.
     * @param scene
     * @return 
     */
    @JsMethod
    public static native Cartesian3 pickBottomPoint(Scene scene);
    
    /**
     * Get the 3D position of the point at the center of the screen.
     * @param scene
     * @return 
     */
    @JsMethod
    public static native Cartesian3 pickCenterPoint(Scene scene);
    
    /**
     * Get the 3D position of the given pixel of the canvas.
     * @param scene
     * @param pixel
     * @return 
     */
    @JsMethod
    public static native Cartesian3 pickOnTerrainOrEllipsoid(Scene scene, Cartesian2 pixel);
    
    /**
     * 
     * @param camera
     * @param angle
     * @param axis
     * @param transform 
     */
    @JsMethod
    public static native void rotateAroundAxis(Camera camera, double angle, Cartesian3 axis, Matrix4 transform);
    
    /**
     * 
     * @param scene
     * @param heading
     * @param bottomCenter 
     */
    @JsMethod
    public static native void setHeadingUsingBottomCenter(Scene scene, double heading, Cartesian3 bottomCenter);
    
    /**
     * Creates Cesium.ImageryLayer best corresponding to the given ol.layer.Layer. Only supports raster layers
     * @param olLayer
     * @param viewProj Projection of the view.
     * @return 
     */
    @JsMethod
    public static native ImageryLayer tileLayerToImageryLayer(BaseLayer olLayer, Projection viewProj);
    
    /**
     * Synchronizes the layer rendering properties (opacity, visible) to the given Cesium ImageryLayer.
     * @param olLayer
     * @param csLayer 
     */
    @JsMethod
    public static native void updateCesiumLayerProperties(BaseLayer olLayer, ImageryLayer csLayer);
}
