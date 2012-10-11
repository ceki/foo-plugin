/*
 * Copyright (c) 2009 QOS.ch All rights reserved.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS  IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package ch.qos.foo.plugins;

import ch.qos.person.Person;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Bla bla
 *
 * @goal verify
 * @phase verify
 * @requiresProject true
 * @requiresDependencyResolution
 */
public class VerifyMojo extends AbstractMojo {


  public void execute() throws MojoExecutionException, MojoFailureException {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    System.out.println("LoggerFactory type is: " + LoggerFactory.getILoggerFactory());
    logger.info("hello world from VerifyMojo");
    new Person().sayHello();

  }


}