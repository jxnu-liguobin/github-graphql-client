package io.github.graphql.deserializer

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequest
import io.github.graphql.{ ExecuteException, Jackson }
import okhttp3.Response
import org.json.JSONObject

trait ScalaDeserializer extends Deserializer {

  protected def deserialize[Out: Manifest](isCollection: Boolean, data: String): Any = {
    if (data == null) return null
    if (isPrimitive(manifest[Out].runtimeClass)) return data
    try {
      if (isCollection) Jackson.objectMapper.readValue[List[Out]](data)
      else Jackson.objectMapper.readValue[Out](data)
    } catch {
      case e: Exception =>
        throw ExecuteException("deserialize data failed: ", e.getLocalizedMessage, e)
    }
  }

  def extractData[Out: Manifest](response: Response, isCollection: Boolean, request: GraphQLRequest): Any = {
    if (response.isSuccessful) {
      val jsonObject = new JSONObject(response.body().string())
      if (!jsonObject.isNull("errors")) {
        throw ExecuteException("found errors in response: ", jsonObject.get("errors").toString)
      } else {
        val dataJSON = jsonObject.getJSONObject("data")
        val data = dataJSON.get(request.getRequest.getOperationName)
        deserialize[Out](isCollection, data.toString)
      }
    } else {
      null
    }

  }

}
