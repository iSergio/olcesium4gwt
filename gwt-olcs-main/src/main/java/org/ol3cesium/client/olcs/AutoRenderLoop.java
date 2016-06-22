/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.olcs;

import com.google.gwt.core.client.JavaScriptObject;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class AutoRenderLoop extends JavaScriptObject {
    protected AutoRenderLoop() {
        //
    }
    
    public final native void restartRenderLoop() /*-{
        this.restartRenderLoop();
    }-*/;
    
    /**
     * 
     * @param debug 
     */
    public final native void setDebug(boolean debug) /*-{
        this.setDebug(debug);
    }-*/;
}
