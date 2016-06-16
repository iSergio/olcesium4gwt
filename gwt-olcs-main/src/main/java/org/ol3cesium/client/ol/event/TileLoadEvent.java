/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ol3cesium.client.ol.event;

/**
 *
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TileLoadEvent extends Event {
    public static enum Type {TILELOADSTART, TILELOADEND, TILELOADERROR, UNKNOWN};
    
    protected TileLoadEvent() {
        //
    }
    
    public final Type getType() {
        String type = getNativeType();
        if (type.equalsIgnoreCase("tileloadstart")) {
            return Type.TILELOADSTART;
        }
        else if (type.equals("tileloadend")) {
            return Type.TILELOADEND;
        }
        else if (type.equals("tileloaderror")) {
            return Type.TILELOADERROR;
        } else {
            return Type.UNKNOWN;
        }
    }
}
