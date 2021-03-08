package io.github.graphql

import scala.jdk.CollectionConverters._

class ServerConfig private(val serverHost: String, val headers: Map[String, String], val responseProjectionMaxDepth: Int) {
  override def toString = s"ServerConfig($serverHost, $headers, $responseProjectionMaxDepth)"
}

object ServerConfig {
  def apply(serverHost: String, headers: java.util.Map[String, String], responseProjectionMaxDepth: Int): ServerConfig = {
    new ServerConfig(serverHost, headers.asScala.toMap, responseProjectionMaxDepth)
  }

  def apply(serverHost: String, headers: Map[String, String] = Map.empty, responseProjectionMaxDepth: Int = 3): ServerConfig = {
    new ServerConfig(serverHost, headers, responseProjectionMaxDepth)
  }
}

