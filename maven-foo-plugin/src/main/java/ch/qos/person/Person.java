package ch.qos.person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {

  Logger logger = LoggerFactory.getLogger(Person.class);

  public void sayHello() {
    logger.info("hello from person");
  }

}
