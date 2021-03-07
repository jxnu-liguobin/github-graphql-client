package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ConvertProjectCardNoteToIssueMutationResponse : GraphQLResult<MutableMap<String, ConvertProjectCardNoteToIssuePayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "convertProjectCardNoteToIssue"
    }

    fun convertProjectCardNoteToIssue(): ConvertProjectCardNoteToIssuePayloadTO? {
        val data: MutableMap<String, ConvertProjectCardNoteToIssuePayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
