package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class DeclineTopicSuggestionMutationResponse extends GraphQLResult[JMap[String, DeclineTopicSuggestionPayloadTO]] {

    def declineTopicSuggestion(): DeclineTopicSuggestionPayloadTO = {
        val data: JMap[String, DeclineTopicSuggestionPayloadTO] = getData
        if (data != null) data.get(DeclineTopicSuggestionMutationResponse.OPERATION_NAME) else null
    }

}

object DeclineTopicSuggestionMutationResponse {

    private final val OPERATION_NAME: String = "declineTopicSuggestion"

}
