package com.ubs.ds2.spark.helpers

import com.typesafe.config._
object ConfigUtils {

  def readConfigFile(config: String) :Config = {
    val config = ConfigFactory.load("reference.conf")
    config
  }

}
