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
import com.google.gwt.core.client.JsArrayNumber;
import java.util.ArrayList;
import java.util.List;
import org.ol3cesium.ol.Color;
import org.ol3cesium.ol.Coordinate;
import org.ol3cesium.ol.Feature;
import org.ol3cesium.ol.Map;
import org.ol3cesium.ol.OverlayPositioning;
import org.ol3cesium.ol.Sphere;
import org.ol3cesium.ol.event.DrawInteractionEvent;
import org.ol3cesium.ol.event.DrawInteractionEventListener;
import org.ol3cesium.ol.event.GeometryChangeEvent;
import org.ol3cesium.ol.event.GeometryChangeEventListener;
import org.ol3cesium.ol.event.LayerChangeEvent;
import org.ol3cesium.ol.event.LayerChangeEventListener;
import org.ol3cesium.ol.event.MapBrowserEvent;
import org.ol3cesium.ol.event.MapClickEventListener;
import org.ol3cesium.ol.event.MapPointerMoveEventListener;
import org.ol3cesium.ol.geom.Circle;
import org.ol3cesium.ol.geom.Geometry;
import org.ol3cesium.ol.geom.GeometryType;
import org.ol3cesium.ol.geom.LineString;
import org.ol3cesium.ol.geom.Polygon;
import org.ol3cesium.ol.interaction.DrawInteraction;
import org.ol3cesium.ol.interaction.SnapInteraction;
import org.ol3cesium.ol.layer.Layer;
import org.ol3cesium.ol.layer.VectorLayer;
import org.ol3cesium.ol.proj.Projection;
import org.ol3cesium.ol.proj.ProjectionUtils;
import org.ol3cesium.ol.source.VectorSource;
import org.ol3cesium.ol.style.CircleStyle;
import org.ol3cesium.ol.style.FillStyle;
import org.ol3cesium.ol.style.StrokeStyle;
import org.ol3cesium.ol.style.Style;
import org.ol3cesium.olx.OverlayOptions;
import org.ol3cesium.olx.interaction.DrawInteractionOptions;
import org.ol3cesium.olx.interaction.SnapInteractionOptions;
import org.ol3cesium.olx.layer.VectorLayerOptions;
import org.ol3cesium.olx.source.VectorSourceOptions;
import org.ol3cesium.olx.style.CircleStyleOptions;
import org.ol3cesium.olx.style.StrokeStyleOptions;
import org.ol3cesium.olx.style.StyleOptions;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class Measure {
    // Base
    private final Map _olMap;
    private final Layer _olLayer;
    private final List<MeasureOverlay> _olOverlays = new ArrayList<MeasureOverlay>();

    // Geometryes
    private Geometry _olGeometry;
    private LineString _olCircleRadiusLineString;
    private final Sphere _olSphere = Sphere.create(6378137);

    // Interactions
    private DrawInteraction _olDrawInteraction;
    private SnapInteraction _olSnapInteraction;

    // Listeners
    private MapPointerMoveEventListener _olMapPointerMoveEventListener;
    private OLMapClickEventListener _olMapClickEventListener;
    private OLGeometryChangeEventListener _olGeometryChangeEventListener;

    // My classes
    private final MeasureOverlay _overlay;
    private final MeasureOverlay _circleLengthOverlay;

    boolean _geodesic = false;

    public Measure(Map olMap) {
        _olMap = olMap;

        FillStyle fillStyle = FillStyle.create(Color.create(255, 255, 255, 0.3f));

        StrokeStyle strokeStyle = StrokeStyle.create("#ffcc33");
        strokeStyle.setWidth(2);

        CircleStyleOptions circleStyleOptions = CircleStyleOptions.create();
        circleStyleOptions.setRadius(7);
        circleStyleOptions.setFill(FillStyle.create("#ffcc33"));
        CircleStyle circleStyle = CircleStyle.create(circleStyleOptions);

        StyleOptions styleOptions = StyleOptions.create();
        styleOptions.setFill(fillStyle);
        styleOptions.setStroke(strokeStyle);
        styleOptions.setImage(circleStyle);

        Style style = Style.create(styleOptions);
        VectorSourceOptions vectorSourceOptions = VectorSourceOptions.create();
        vectorSourceOptions.setWrapX(true);
        VectorSource vectorSource = VectorSource.create(vectorSourceOptions);
        VectorLayerOptions vectorLayerOptions = VectorLayerOptions.create();
        vectorLayerOptions.setSource(vectorSource);
        vectorLayerOptions.setStyle(style);
        _olLayer = VectorLayer.create(vectorLayerOptions);
        _olLayer.set("name", "Измерения");
        _olLayer.set("type", "overlay");
        _olLayer.set("switcher", "true");
        _olLayer.set("altitudeMode", "clampToGround");
        _olMap.addLayer(_olLayer);

        _olLayer.addLayerChangeEventListener(new LayerChangeEventListener() {
            @Override
            public void onLayerChange(LayerChangeEvent event) {
                if (event.getType() == LayerChangeEvent.Type.VISIBLE) {
                    for (MeasureOverlay overlay : _olOverlays) {
                        if (event.getLayer().getVisible()) {
                            overlay.show();
                        } else {
                            overlay.hide();
                        }
                    }
                }
            }
        });

        OverlayOptions overlayOptions = OverlayOptions.create();
        JsArrayNumber offset = JavaScriptObject.createArray().cast();
        offset.push(0.);
        offset.push(-15.);
        overlayOptions.setOffset(offset);
        overlayOptions.setPositioning(OverlayPositioning.BOTTOM_CENTER);
        _overlay = MeasureOverlay.create(overlayOptions);

        _circleLengthOverlay = MeasureOverlay.create(overlayOptions);
    }

    public void setGeodesic(boolean geodesic) {
        _geodesic = geodesic;
    }

    public boolean getGeodesic() {
        return _geodesic;
    }

    public void setMeasure(GeometryType type, boolean enable) {
        if (_olDrawInteraction != null) {
            _olDrawInteraction.setActive(false);
            _olMap.removeInteraction(_olDrawInteraction);
            _olDrawInteraction = null;

            _olMap.removeOverlay(_overlay);
            _olMap.removeOverlay(_circleLengthOverlay);
        }
        if (_olSnapInteraction != null) {
            _olSnapInteraction.setActive(false);
            _olMap.removeInteraction(_olSnapInteraction);
            _olSnapInteraction = null;
        }

        if (enable) {
            FillStyle fillStyle = FillStyle.create(Color.create(255, 255, 255, 0.3f));

            StrokeStyleOptions strokeStyleOptions = StrokeStyleOptions.create();
            strokeStyleOptions.setColor(Color.create(0, 0, 0, 0.5f));
            strokeStyleOptions.setWidth(2);
            JsArrayNumber lineDash = JavaScriptObject.createArray().cast();
            lineDash.push(10);
            lineDash.push(10);
            strokeStyleOptions.setLineDash(lineDash);
            StrokeStyle strokeStyle = StrokeStyle.create(strokeStyleOptions);

            CircleStyleOptions circleStyleOptions = CircleStyleOptions.create();
            circleStyleOptions.setRadius(5);
            circleStyleOptions.setStroke(StrokeStyle.create(Color.create(0, 0, 0, 0.7f)));
            circleStyleOptions.setFill(FillStyle.create(Color.create(255, 255, 255, 0.3f)));
            CircleStyle circleStyle = CircleStyle.create(circleStyleOptions);

            StyleOptions styleOptions = StyleOptions.create();
            styleOptions.setFill(fillStyle);
            styleOptions.setStroke(strokeStyle);
            styleOptions.setImage(circleStyle);
            Style style = Style.create(styleOptions);

            DrawInteractionOptions drawInteractionOptions = DrawInteractionOptions.create();
            drawInteractionOptions.setType(type);
            drawInteractionOptions.setStyle(style);
            drawInteractionOptions.setSource((VectorSource)_olLayer.getSource());
            _olDrawInteraction = DrawInteraction.create(drawInteractionOptions);
            _olDrawInteraction.set("altitudeMode", "clampToGround");
            _olMap.addInteraction(_olDrawInteraction);

            _olDrawInteraction.setActive(enable);

            _olDrawInteraction.addDrawInteractionEventListener(new OLDrawInteractionEventListener());

            SnapInteractionOptions snapInteractionOptions = SnapInteractionOptions.create();
            snapInteractionOptions.setSource((VectorSource)_olLayer.getSource());
            _olSnapInteraction = SnapInteraction.create(snapInteractionOptions);
            _olMap.addInteraction(_olSnapInteraction);

            _olSnapInteraction.setActive(enable);
        } else {
            _olGeometry = null;
            if (_olMapPointerMoveEventListener != null) {
                _olMap.removeOverlay(_circleLengthOverlay);
                _olMap.removeMapPointerMoveEventListener(_olMapPointerMoveEventListener);
                _olMapPointerMoveEventListener = null;
            }

            if (_olMapClickEventListener != null) {
                _olMap.removeMapClickEventListener(_olMapClickEventListener);
                _olMapClickEventListener = null;
            }
        }
    }

    public void clearMeasure() {
        VectorLayer vectorLayer = (VectorLayer)_olLayer;
        ((VectorSource)vectorLayer.getSource()).clear();
        for (MeasureOverlay measureOverlay : _olOverlays) {
            _olMap.removeOverlay(measureOverlay);
        }
        _olOverlays.clear();
    }

    private String formatArea(Geometry geometry) {
        double area = 0.;
        if (_geodesic) {
            Projection srcProj = _olMap.getView().getProjection();
            if (geometry.getType() == GeometryType.POLYGON) {
                Geometry geom = ((Polygon)geometry).clone().transform(srcProj, Projection.create("EPSG:4326"));
                JsArray<Coordinate> coordinates = ((Polygon)geom).getLinearRing(0).getCoordinates();
                area = Math.abs(_olSphere.geodesicArea(coordinates));
            }
            else if (geometry.getType() == GeometryType.CIRCLE) {
                Circle circle = ((Circle)geometry);
                Coordinate center = circle.getCenter();
                Coordinate point = Coordinate.create(center.getX(), center.getY() + circle.getRadius());
                Coordinate c1 = ProjectionUtils.transform(center, srcProj, Projection.create("EPSG:4326"));
                Coordinate c2 = ProjectionUtils.transform(point,  srcProj, Projection.create("EPSG:4326"));
                double radius = _olSphere.haversineDistance(c1, c2);
                area = Math.PI * Math.pow(radius, 2.);
            }
        } else {
            if (geometry.getType() == GeometryType.POLYGON) {
                area = ((Polygon)geometry).getArea();
            }
            else if (geometry.getType() == GeometryType.CIRCLE) {
                area = Math.PI * Math.pow(((Circle)geometry).getRadius(), 2.);
            }

        }
        if (area > 1000) {
            return (Math.round(area / 1000000 * 100) / 100) + " " + "км<sup>2</sup>";
        } else {
            return (Math.round(area * 100) / 100) + " " + "м<sup>2</sup>";
        }
    }

    private String formatLength(Geometry geometry) {
        double length = 0.;
        if (_geodesic) {
            JsArray<Coordinate> coordinates = ((LineString)geometry).getCoordinates();
            Projection srcProj = _olMap.getView().getProjection();
            for (int i = 0; i < coordinates.length() - 1; i++) {
                Coordinate c1 = ProjectionUtils.transform(coordinates.get(i), srcProj, Projection.create("EPSG:4326"));
                Coordinate c2 = ProjectionUtils.transform(coordinates.get(i + 1), srcProj, Projection.create("EPSG:4326"));
                length += _olSphere.haversineDistance(c1, c2);
            }
        } else {
            length = Math.round(((LineString)geometry).getLength() * 100) / 100;
        }

        if (length > 1000) {
            return (Math.round(length / 1000 * 100) / 100) + " км";
        } else {
            return (Math.round(length * 100) / 100) + " м";
        }
    }

    private String formatRadius(Circle circle) {
        double radius;
        if (_geodesic) {
            Projection srcProj = _olMap.getView().getProjection();
            Coordinate center = circle.getCenter();
            Coordinate point = Coordinate.create(center.getX(), center.getY() + circle.getRadius());
            Coordinate c1 = ProjectionUtils.transform(center, srcProj, Projection.create("EPSG:4326"));
            Coordinate c2 = ProjectionUtils.transform(point,  srcProj, Projection.create("EPSG:4326"));
            radius = _olSphere.haversineDistance(c1, c2);
        } else {
            radius = Math.round(circle.getRadius() * 100) / 100;
        }

        if (radius > 1000) {
            return (Math.round(radius / 1000 * 100) / 100) + " км";
        } else {
            return (Math.round(radius * 100) / 100) + " м";
        }
    }

    private String getInnerHTML(Geometry geometry) {
        String innerHTML = "";
        switch (geometry.getType()) {
            case POLYGON: innerHTML = formatArea(geometry); break;
            case CIRCLE: innerHTML = formatArea(geometry); break;
            case LINE_STRING: innerHTML = formatLength(geometry); break;
            default: break;
        }
        return innerHTML;
    }

    private Coordinate getPosition(Geometry geometry) {
        Coordinate position = null;
        switch (geometry.getType()) {
            case POLYGON: position = ((Polygon)geometry).getInteriorPoint().getCoordinates(); break;
            case CIRCLE: position = ((Circle)geometry).getCenter(); break;
            case LINE_STRING: position = ((LineString)geometry).getLastCoordinate(); break;
            default: break;
        }
        return position;
    }

    private class OLDrawInteractionEventListener implements DrawInteractionEventListener {
        @Override
        public void onDrawInteraction(DrawInteractionEvent event) {
            Geometry geometry = event.getFeature().getGeometry();
            if (event.getType() == DrawInteractionEvent.Type.DRAW_START) {
                _olMap.addOverlay(_overlay);
                _overlay.setClassName("tooltip tooltip-measure");
                _overlay.setPosition(getPosition(geometry));
                _overlay.setContent(getInnerHTML(geometry));

                if (geometry.getType() == GeometryType.CIRCLE) {
                    _olMap.addOverlay(_circleLengthOverlay);
                    if (_olMapClickEventListener != null) {
                        _olMap.removeMapClickEventListener(_olMapClickEventListener);
                        _olMapClickEventListener = null;
                    }
                    _circleLengthOverlay.setPosition(getPosition(geometry));
                    _olMapClickEventListener = new OLMapClickEventListener();
                    _olMap.addMapClickEventListener(_olMapClickEventListener);
                }
                if (_olGeometryChangeEventListener == null) {
                    _olGeometryChangeEventListener = new OLGeometryChangeEventListener();
                }
                geometry.addGeometryChangeEventListener(_olGeometryChangeEventListener);
            }
            else if (event.getType() == DrawInteractionEvent.Type.DRAW_END) {
                Projection srcProj = _olMap.getView().getProjection();
                Projection dstProj = Projection.create("EPSG:4326");
                if (geometry.getType() == GeometryType.CIRCLE) {
                    if (_olMapPointerMoveEventListener != null) {
                        _olMap.removeOverlay(_circleLengthOverlay);
                        _olMap.removeMapPointerMoveEventListener(_olMapPointerMoveEventListener);
                        _olMapPointerMoveEventListener = null;
                    }
                    Coordinate c1 = _olCircleRadiusLineString.getFirstCoordinate();
                    Coordinate c2 = _olCircleRadiusLineString.getLastCoordinate();
                    c1 = ProjectionUtils.transform(c1, srcProj, dstProj);
                    c2 = ProjectionUtils.transform(c2, srcProj, dstProj);
                    double length = _olSphere.haversineDistance(c1, c2);
                    double n = length;
                    if (n > 100) {
                        n = (Math.round(n / 1000 * 100) / 100);
                    } else {
                        n = (Math.round(n * 100) / 100);
                    }
                    Polygon olPolygon = Polygon.circular(_olSphere, c1, length, (int)n);
                    olPolygon = (Polygon)olPolygon.clone().transform(dstProj, srcProj);
                    event.getFeature().setGeometry(olPolygon);
                }
                else if (geometry.getType() == GeometryType.LINE_STRING) {
                    LineString lineString = (LineString)geometry;
                    JsArray<Coordinate> dstCoordinates = JavaScriptObject.createArray().cast();
                    for (int i = 0; i < lineString.getCoordinates().length() - 1; i++) {
                        Coordinate c1 = lineString.getCoordinates().get(i);
                        Coordinate c2 = lineString.getCoordinates().get(i + 1);
                        c1 = ProjectionUtils.transform(c1, srcProj, dstProj);
                        c2 = ProjectionUtils.transform(c2, srcProj, dstProj);
                        GreatCircle greatCircle = GreatCircle.create(c1, c2);
                        JsArray<Coordinate> coordinates = greatCircle.Arc(1000, 10);
                        for (int k = 0; k < coordinates.length(); k++) {
                            dstCoordinates.push(coordinates.get(k));
                        }
                    }
                    lineString = (LineString)LineString.create(dstCoordinates).transform(dstProj, srcProj);
                    event.getFeature().setGeometry(lineString);
                }

                if (_olGeometryChangeEventListener != null) {
                    geometry.removeGeometryChangeEventListener(_olGeometryChangeEventListener);
                    _olGeometryChangeEventListener = null;
                }

                OverlayOptions overlayOptions = OverlayOptions.create();
                JsArrayNumber offset = JavaScriptObject.createArray().cast();
                offset.push(0.);
                offset.push(-7.);
                overlayOptions.setOffset(offset);
                overlayOptions.setPositioning(OverlayPositioning.BOTTOM_CENTER);
                MeasureOverlay olOverlay = MeasureOverlay.create(overlayOptions);
                _olMap.addOverlay(olOverlay);
                olOverlay.setClassName("tooltip tooltip-static");
                Coordinate position = getPosition(geometry);
                String innerHTML = getInnerHTML(geometry);
                olOverlay.setPosition(position);
                olOverlay.setContent(innerHTML);
                olOverlay.set("altitudeMode", "clampToGround");
                _olOverlays.add(olOverlay);
                _olMap.removeOverlay(_overlay);
            }
        }
    }

    private class OLMapClickEventListener implements MapClickEventListener {
        @Override
        public void onMapClick(MapBrowserEvent event) {
            if (_olGeometry == null) {
                return;
            }
            JsArray<Coordinate> coordinates = JavaScriptObject.createArray().cast();
            coordinates.push(((Circle)_olGeometry).clone().getCenter());
            coordinates.push(event.getCoordinate());
            _olCircleRadiusLineString = LineString.create(coordinates);
            Feature lineFeature = Feature.create();
            lineFeature.setGeometry(_olCircleRadiusLineString.clone());
            ((VectorSource)_olLayer.getSource()).addFeature(lineFeature);

            String innerHTML = formatLength(_olCircleRadiusLineString);

            OverlayOptions overlayOptions = OverlayOptions.create();
            JsArrayNumber offset = JavaScriptObject.createArray().cast();
            offset.push(0.);
            offset.push(-7.);
            overlayOptions.setOffset(offset);
            overlayOptions.setPositioning(OverlayPositioning.BOTTOM_CENTER);
            MeasureOverlay olOverlay = MeasureOverlay.create(overlayOptions);                            
            _olMap.addOverlay(olOverlay);
            olOverlay.setClassName("tooltip tooltip-static");
            olOverlay.setPosition(_olCircleRadiusLineString.getLastCoordinate());
            olOverlay.setContent(innerHTML);
            _olOverlays.add(olOverlay);
            _olGeometry = null;
        }
    }

    private class OLGeometryChangeEventListener implements GeometryChangeEventListener {
        @Override
        public void onGeometryChange(GeometryChangeEvent event) {
            Geometry geometry = event.getGeometry();
            Coordinate position = getPosition(geometry);
            String innerHTML = getInnerHTML(geometry);
            if (_overlay != null) {
                _overlay.setContent(innerHTML);
                _overlay.setPosition(position);
            }

            if (geometry.getType() == GeometryType.CIRCLE) {
                _olGeometry = geometry;
                if (_olMapPointerMoveEventListener == null) {
                    _olMapPointerMoveEventListener = new MapPointerMoveEventListener() {
                        @Override
                        public void onMapPointerMove(MapBrowserEvent event) {
                            JsArray<Coordinate> coordinates = JavaScriptObject.createArray().cast();
                            coordinates.push(((Circle)_olGeometry).getCenter());
                            coordinates.push(event.getCoordinate());
                            _olCircleRadiusLineString = LineString.create(coordinates);
                            String innerHTML = formatLength(_olCircleRadiusLineString);
                            _circleLengthOverlay.setContent(innerHTML);
                            _circleLengthOverlay.setPosition(event.getCoordinate());
                        }
                    };
                    _olMap.addMapPointerMoveEventListener(_olMapPointerMoveEventListener);
                }
            }
        }
    }
}