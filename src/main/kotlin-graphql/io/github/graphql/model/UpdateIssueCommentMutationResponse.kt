package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class UpdateIssueCommentMutationResponse : GraphQLResult<MutableMap<String, UpdateIssueCommentPayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "updateIssueComment"
    }

    fun updateIssueComment(): UpdateIssueCommentPayloadTO? {
        val data: MutableMap<String, UpdateIssueCommentPayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
