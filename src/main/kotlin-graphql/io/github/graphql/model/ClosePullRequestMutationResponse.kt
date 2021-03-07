package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ClosePullRequestMutationResponse : GraphQLResult<MutableMap<String, ClosePullRequestPayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "closePullRequest"
    }

    fun closePullRequest(): ClosePullRequestPayloadTO? {
        val data: MutableMap<String, ClosePullRequestPayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
