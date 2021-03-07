package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class AcceptTopicSuggestionMutationResponse extends GraphQLResult[JMap[String, AcceptTopicSuggestionPayloadTO]] {

    def acceptTopicSuggestion(): AcceptTopicSuggestionPayloadTO = {
        val data: JMap[String, AcceptTopicSuggestionPayloadTO] = getData
        if (data != null) data.get(AcceptTopicSuggestionMutationResponse.OPERATION_NAME) else null
    }

}

object AcceptTopicSuggestionMutationResponse {

    private final val OPERATION_NAME: String = "acceptTopicSuggestion"

}
