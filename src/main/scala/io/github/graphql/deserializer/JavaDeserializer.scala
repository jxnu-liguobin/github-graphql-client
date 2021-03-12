package io.github.graphql.deserializer

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest
import io.github.graphql.{ ExecuteException, Jackson }
import okhttp3.Response
import org.json.{ JSONArray, JSONObject }

trait JavaDeserializer extends Deserializer {

  def extractData(response: Response, request: GraphQLRequest, entityClass: Class[_]): Any = {
    if (response.isSuccessful) {
      val jsonObject = new JSONObject(response.body().string())
      if (!jsonObject.isNull("errors")) {
        throw ExecuteException("found errors in response: ", jsonObject.get("errors").toString)
      } else {
        val dataJSON = jsonObject.getJSONObject("data")
        val data = dataJSON.get(request.getRequest.getOperationName)
        deserialize(data, entityClass)
      }
    } else {
      throw ExecuteException("response is fail", response.body().string())
    }

  }

  // TODO optimize it.
  protected def deserialize(data: AnyRef, entityClass: Class[_]): Any = {
    if (data == null) return null
    if (isPrimitive(entityClass)) return data
    val result = new java.util.ArrayList[Any]()
    try {
      data match {
        case array: JSONArray =>
          for (i <- 0 until array.length()) {
            val e = Jackson.objectMapper.readValue(array.get(i).asInstanceOf[JSONObject].toString, entityClass)
            result.add(e)
          }
          result
        case _ =>
          Jackson.objectMapper.readValue(data.asInstanceOf[JSONObject].toString, entityClass)
      }
    } catch {
      case e: Exception =>
        throw ExecuteException(s"deserialize data failed, class is ${entityClass.getTypeName}: ", e.getLocalizedMessage, e)

    }
  }

}