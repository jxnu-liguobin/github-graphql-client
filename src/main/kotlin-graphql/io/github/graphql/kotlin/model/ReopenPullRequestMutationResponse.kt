package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class ReopenPullRequestMutationResponse : GraphQLResult<MutableMap<String, ReopenPullRequestPayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "reopenPullRequest"
    }

    fun reopenPullRequest(): ReopenPullRequestPayloadTO? {
        val data: MutableMap<String, ReopenPullRequestPayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
