package org.olcesium.linker;

import com.google.gwt.core.ext.TreeLogger;
import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.linker.EmittedArtifact;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Serge Silaev aka iSergio <s.serge.b@gmail.com>
 */
public class OLCesiumLinkerUtils {
    static String getContents(EmittedArtifact emittedArtifact, TreeLogger logger) throws UnableToCompleteException {
        InputStream in = emittedArtifact.getContents(logger);
        BufferedInputStream bis = new BufferedInputStream(in);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        try {
            int result = bis.read();
            while (result != -1) {
                byte b = (byte) result;
                buf.write(b);
                result = bis.read();

            }
        } catch (IOException e) {
            logger.log(TreeLogger.ERROR, "Unable to read resource", e);
            throw new UnableToCompleteException();
        }
        return buf.toString();
    }
}
