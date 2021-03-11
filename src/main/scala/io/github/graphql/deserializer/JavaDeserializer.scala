package io.github.graphql.deserializer

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest
import io.github.graphql.{ ExecuteException, Jackson }
import okhttp3.Response
import org.json.{ JSONArray, JSONObject }

trait JavaDeserializer extends Deserializer {

  def extractData(response: Response, isCollection: Boolean, request: GraphQLRequest, entityClassName: String): Any = {
    if (response.isSuccessful) {
      val jsonObject = new JSONObject(response.body().string())
      val dataJSON = jsonObject.getJSONObject("data")
      if (!dataJSON.isNull("errors")) {
        throw ExecuteException("found errors in response: ", dataJSON.getJSONObject("errors").toString)
      } else {
        val data = dataJSON.get(request.getRequest.getOperationName)
        deserialize(isCollection, data, entityClassName)
      }
    } else {
      throw ExecuteException("response is fail", response.body().string())
    }

  }

  protected def deserialize(isCollection: Boolean, data: AnyRef, entityClazzName: String): Any = {
    if (data == null) return null
    if (isPrimitive(entityClazzName)) return data
    val result = new java.util.ArrayList[Any]()
    val targetClass = Class.forName(entityClazzName)
    try {
      data match {
        case array: JSONArray if isCollection =>
          for (i <- 0 until array.length()) {
            val e = Jackson.objectMapper.readValue(array.get(i).asInstanceOf[JSONObject].toString, targetClass)
            result.add(e)
          }
          result
        case _ =>
          Jackson.objectMapper.readValue(data.asInstanceOf[JSONObject].toString, targetClass)
      }
    } catch {
      case e: Exception =>
        throw ExecuteException("deserialize data failed: ", e.getLocalizedMessage, e)

    }
  }

}