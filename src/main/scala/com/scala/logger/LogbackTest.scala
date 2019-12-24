package com.scala.logger

import com.typesafe.scalalogging.Logger

object LogbackTest {

  val LOGGER = "LOGGER-BASIC"
  lazy val logger = Logger(org.slf4j.LoggerFactory.getLogger(LOGGER))

  def main(args: Array[String]): Unit = {

    println("starting print log >>>")
    for (a <- 0 to 10) {
      logger.debug("hello logback debug")
      logger.info("hello logback info {}", a)
    }

    println("print log finish <<< ")
  }
}
