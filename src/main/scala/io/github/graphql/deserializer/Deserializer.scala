package io.github.graphql.deserializer

trait Deserializer {

  def isPrimitive(entityClass: Class[_]): Boolean = {
    val primitiveTypes = Seq("Int", "Boolean", "String", "Short", "Byte", "Long", "Char", "Float")
    primitiveTypes.contains(entityClass.getSimpleName)
  }

}
