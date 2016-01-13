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
package org.ol3cesium.client.ol.event;

import org.ol3cesium.client.ol.Collection;
import org.ol3cesium.client.ol.Coordinate;
import org.ol3cesium.client.ol.Feature;

/**
 * Events emitted by ol.interaction.Translate instances are instances of this type.
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class TranslateInteractionEvent extends Event {
    public static enum Type {TRANSLATION_END, TRANSLATION_START, TRANSLATING, UNKNOWN};
    
    protected TranslateInteractionEvent() {
        //
    }
    
    /**
     * 
     * @return The coordinate of the drag event.
     */
    public final native Coordinate getCoordinate() /*-{
        return this.coordinate;
    }-*/;
    
    /**
     * 
     * @return The features being translated.
     */
    public final native Collection<Feature> getFeatures() /*-{
        return this.features;
    }-*/;
    
    public final Type getType() {
        String type = getNativeType();
        if (type.equals("translationend")) {
            return Type.TRANSLATION_END;
        }
        else if (type.equals("translationtart")) {
            return Type.TRANSLATION_START;
        }
        else if (type.equals("translating")) {
            return Type.TRANSLATING;
        }else {
            return Type.UNKNOWN;
        }
    }
}
