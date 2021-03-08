package io.github.graphql.common

import org.json.{ JSONArray, JSONObject }

trait ResponseDeserializer {

  def deserialize(data: AnyRef, entityClazzName: String): Any = {
    val result = new java.util.ArrayList[Any]()
    val targetReturnClazz = Class.forName(entityClazzName)
    data match {
      case array: JSONArray =>
        for (i <- 0 until array.length()) {
          val e = Jackson.objectMapper.readValue(array.get(i).asInstanceOf[JSONObject].toString, targetReturnClazz)
          result.add(e)
        }
        result
      case _ =>
        Jackson.objectMapper.readValue(data.asInstanceOf[JSONObject].toString, targetReturnClazz)
    }
  }

}