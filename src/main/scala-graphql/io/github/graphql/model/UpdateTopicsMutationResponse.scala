package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
