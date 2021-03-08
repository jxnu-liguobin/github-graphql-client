package io.github.graphql

case class ExecuteException(prefix: String, msg: String, e: Throwable = null) extends RuntimeException(msg, e)
