package org.ol3cesium.olcs;

import com.google.gwt.dom.client.Element;
import com.google.gwt.event.logical.shared.AttachEvent;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import org.ol3cesium.olcs.options.OLCesiumOptions;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OLCesiumPanel extends SimplePanel {
    private final OLCesium olCesium;

    public OLCesiumPanel(OLCesiumOptions options) {
        super();
        final Element element = getElement();
        // Some strange, but ol-cesium set style for div's elements to absolute. Fix this.
        element.getStyle().setProperty("position", "relative");
        options.target = element;
        RootPanel.getBodyElement().appendChild(element);
        olCesium = new OLCesium(options);
        super.addAttachHandler(new AttachEvent.Handler() {
            @Override
            public void onAttachOrDetach(AttachEvent attachEvent) {
                if (!attachEvent.isAttached()) {
                    element.removeAllChildren();
                    element.removeFromParent();
                }
            }
        });
    }

    public OLCesium getOlCesium() {
        return olCesium;
    }
}
