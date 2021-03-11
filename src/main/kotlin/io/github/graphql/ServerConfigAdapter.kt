package io.github.graphql

// Pseudo adaptation, avoiding the interdependence of three languages, using independent implementation.
data class ServerConfigAdapter(
        val serverHost: String,
        val headers: Map<String, String>
)

data class ExecuteExceptionAdapter(val prefix: String, val msg: String?, val e: Throwable?) : RuntimeException(msg, e)

