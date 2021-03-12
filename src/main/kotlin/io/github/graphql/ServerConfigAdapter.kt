package io.github.graphql

// Pseudo adaptation, avoiding the interdependence of three languages, using independent implementation.
data class ServerConfigAdapter(
    val serverHost: String,
    val headers: Map<String, String>
)

data class ExecuteExceptionAdapter(val prefix: String, val msg: String?, val e: Throwable?) : RuntimeException(msg, e)

fun isPrimitive(entityClazzName: String?): Boolean {
    val primitiveTypes = listOf("Int", "Boolean", "String", "Short", "Byte", "Long", "Char", "Float")
    val optPrimitiveTypes = primitiveTypes.map { "$it?" }
    return primitiveTypes.contains(entityClazzName) || optPrimitiveTypes.contains(entityClazzName)
}
