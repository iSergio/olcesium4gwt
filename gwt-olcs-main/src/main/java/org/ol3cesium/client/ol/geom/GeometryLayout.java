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
package org.ol3cesium.client.ol.geom;

/**
 *The coordinate layout for geometries, indicating whether a 3rd or 4th z ('Z') 
 * or measure ('M') coordinate is available. Supported values are 'XY', 'XYZ', 'XYM', 'XYZM'.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class GeometryLayout {
    public static final String XY   = "XY";
    public static final String XYZ  = "XYZ";
    public static final String XYM  = "XYM";
    public static final String XYZM = "XYZM";
}
