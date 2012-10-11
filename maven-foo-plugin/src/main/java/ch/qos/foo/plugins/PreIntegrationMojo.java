package ch.qos.foo.plugins;

import ch.qos.person.Person;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Blah blah
 *
 * @phase pre-integration-test
 * @goal run
*/
public class PreIntegrationMojo extends AbstractMojo {


  public void execute() throws MojoExecutionException, MojoFailureException {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    System.out.println("LoggerFactory type is: "+LoggerFactory.getILoggerFactory());
    logger.info("hello world from PreIntegrationMojo");
    new Person().sayHello();

  }


}
