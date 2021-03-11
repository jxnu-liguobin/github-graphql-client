package io.github.graphql

import scala.jdk.CollectionConverters._

class ServerConfig private(val serverHost: String, val headers: Map[String, String]) {
  override def toString = s"ServerConfig($serverHost, $headers)"
}

object ServerConfig {
  def apply(serverHost: String, headers: java.util.Map[String, String]): ServerConfig = {
    new ServerConfig(serverHost, headers.asScala.toMap)
  }

  def apply(serverHost: String, headers: Map[String, String] = Map.empty): ServerConfig = {
    new ServerConfig(serverHost, headers)
  }
}

