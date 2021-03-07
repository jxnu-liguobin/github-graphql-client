package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class UpdateTopicsMutationResponse extends GraphQLResult[JMap[String, UpdateTopicsPayloadTO]] {

    def updateTopics(): UpdateTopicsPayloadTO = {
        val data: JMap[String, UpdateTopicsPayloadTO] = getData
        if (data != null) data.get(UpdateTopicsMutationResponse.OPERATION_NAME) else null
    }

}

object UpdateTopicsMutationResponse {

    private final val OPERATION_NAME: String = "updateTopics"

}
