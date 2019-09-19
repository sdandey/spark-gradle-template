package com.ubs.ds2.spark.helpers

import org.scalatest.FunSuite

class ConfigUtilsTest extends FunSuite {

  test("check property configuration") {
    val config = ConfigUtils.readConfigFile("reference.conf")
    println(config.entrySet())
    println("Hello From Test")
  }
}
