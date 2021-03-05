package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UpdateIssueMutationResponse : GraphQLResult<MutableMap<String, UpdateIssuePayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "updateIssue"
    }

    fun updateIssue(): UpdateIssuePayloadTO? {
        val data: MutableMap<String, UpdateIssuePayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
