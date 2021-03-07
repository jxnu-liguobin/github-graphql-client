package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class AcceptTopicSuggestionMutationResponse : GraphQLResult<MutableMap<String, AcceptTopicSuggestionPayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "acceptTopicSuggestion"
    }

    fun acceptTopicSuggestion(): AcceptTopicSuggestionPayloadTO? {
        val data: MutableMap<String, AcceptTopicSuggestionPayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
