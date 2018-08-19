package org.olcesium.linker;

import com.google.gwt.core.ext.LinkerContext;
import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.linker.AbstractLinker;
import com.google.gwt.core.ext.linker.ArtifactSet;
import com.google.gwt.core.ext.linker.EmittedArtifact;
import com.google.gwt.core.ext.linker.LinkerOrder;

import java.util.Set;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
@LinkerOrder(LinkerOrder.Order.PRE)
public class OLCesiumLinker extends AbstractLinker {
    @Override
    public String getDescription() {
        return "OpenLayers";
    }

    @Override
    public ArtifactSet link(TreeLogger logger, LinkerContext context, ArtifactSet artifacts) throws UnableToCompleteException {
        ArtifactSet toReturn = new ArtifactSet(artifacts);

        Set<EmittedArtifact> emittedArtifacts = artifacts.find(EmittedArtifact.class);
        for (EmittedArtifact emittedArtifact : emittedArtifacts) {
            String partialPath = emittedArtifact.getPartialPath();
            // Add to Cesium.js file, path, where Cesium/Cesium.js stored.
            // It need for inject css files for example - Viewer
            if (partialPath.endsWith("/olcesium.js")) {
                String contents = OLCesiumLinkerUtils.getContents(emittedArtifact, logger);
                StringBuffer sb = new StringBuffer(contents);
                sb.insert(0, "window.OpenLayersPath = '" + context.getModuleName() + "/js/';\n");
                toReturn.remove(emittedArtifact);
                toReturn.add(emitString(logger, sb.toString(), partialPath));
            }
        }
        return toReturn;
    }
}
