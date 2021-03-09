package io.github.graphql.deserializer

trait Deserializer {

  def isPrimitive(entityClazzName: String): Boolean = {
    val primitiveTypes = Seq("Int", "Boolean", "String", "Short", "Byte", "Long", "Char", "Float")
    primitiveTypes.contains(entityClazzName)
  }

}
