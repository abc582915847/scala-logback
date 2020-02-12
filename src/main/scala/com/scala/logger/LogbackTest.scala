package com.scala.logger

import com.typesafe.scalalogging.Logger

object LogbackTest {

  val LOGGER = "LOGGER-BASIC"
  lazy val logger = Logger(org.slf4j.LoggerFactory.getLogger(LOGGER))

  // logback dynamic file path
  // vmoptions ==> -Dlogback.home=/Users/Tao/tao/temp/logs2
  //
  def main(args: Array[String]): Unit = {

//    System.setProperty("logback.home", System.getProperty("logback.home", "logs"))

    // logback default value test ==> value:-defaultValue
    println(System.getProperty("logback.home"))

    println("starting print log >>>")
    for (a <- 0 to 10) {
      logger.debug("hello logback debug")
      logger.info("hello logback info {}", a)
    }

    println("print log finish <<< ")
  }
}
