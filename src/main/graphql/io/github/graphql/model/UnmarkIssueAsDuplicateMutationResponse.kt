package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UnmarkIssueAsDuplicateMutationResponse : GraphQLResult<MutableMap<String, UnmarkIssueAsDuplicatePayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "unmarkIssueAsDuplicate"
    }

    fun unmarkIssueAsDuplicate(): UnmarkIssueAsDuplicatePayloadTO? {
        val data: MutableMap<String, UnmarkIssueAsDuplicatePayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
