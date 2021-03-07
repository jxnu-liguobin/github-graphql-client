package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult
import java.util.{ Map => JMap }

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
