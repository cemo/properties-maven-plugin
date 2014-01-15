package org.codehaus.mojo.properties;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import java.util.Properties;

/**
 * Writes project properties to a file.
 *
 * @author C.Koc
 * @goal write-custom-properties
 */
public class WriteCustomProperties extends AbstractWritePropertiesMojo {

   /**
    * The custom properties to set.
    *
    * @parameter
    * @required
    */
   private Properties properties;

   public void execute() throws MojoExecutionException, MojoFailureException {
      validateOutputFile();
      writeProperties(properties, outputFile);
   }
}
