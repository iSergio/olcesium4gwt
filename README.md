GWT-OL3-Cesium
==============
gwt-olcs this wrapper for [OpenLayers 3](http://openlayers.org) and [OL3-Cesium](http://openlayers.org/ol3-cesium/). Work with Cesium realised through [cesium-gwt](https://github.com/richkadel/cesium-gwt).

This wrapper may work with ol.js(ol-debug.js) without Cesium, and with ol3cesium.js(ol3cesium-debug.js) with Cesium using [cesium-gwt](https://github.com/richkadel/cesium-gwt).

This wrapper is different from the [v-ol3](https://github.com/VOL3/v-ol3) so that injection occurs in the GWT code (In v-ol3 ol.js(ol-debug.js) includes in html page, which leads to errors in the console) and OL3-Cesium not worked with them. Difference in call ol functional: in v-ol3 it occurs vid $wnd.ol... and i have through native ol... call.

This wrapper will strive for 100% implementation of the functional [OpenLayers 3](http://openlayers.org) and [OL3-Cesium](http://openlayers.org/ol3-cesium/).

Getting started
---------------
You not need include JavaScript of OpenLayers 3 or Cesium into main html file, injection realised in GWT code.

Building the library
--------------------
 * Build [JsFunction-GWT](https://github.com/richkadel/jsfunction-gwt):

    $ git clone https://github.com/richkadel/jsfunction-gwt && cd jsfunction-gwt && mvn install

 * Build [cesium-gwt](https://github.com/iSergio/cesium-gwt). If you not need examples use original repo of [cesium-gwt](https://github.com/richkadel/cesium-gwt.git) (In examples uses some functional, which i added in my fork)

    $ git clone https://github.com/iSergio/cesium-gwt && cd cesium-gwt && mvn install

 * Build [gwt-olcs](https://github.com/iSergio/gwt-olcs.git)

    $ git clone https://github.com/iSergio/gwt-olcs.git && cd gwt-olcs && mvn install


Examples
--------
Library provided showcase based on [GWT-OpenLayers Showcase](http://www.gwt-openlayers.org).
[Show online showcase](http://sergeserver.noip.me/gwt-olcs-test/)
