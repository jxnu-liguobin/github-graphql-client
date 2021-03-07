package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UpdateTopicsMutationResponse : GraphQLResult<MutableMap<String, UpdateTopicsPayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "updateTopics"
    }

    fun updateTopics(): UpdateTopicsPayloadTO? {
        val data: MutableMap<String, UpdateTopicsPayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
