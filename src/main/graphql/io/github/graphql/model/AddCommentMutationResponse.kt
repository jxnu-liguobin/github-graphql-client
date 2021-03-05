package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class AddCommentMutationResponse : GraphQLResult<MutableMap<String, AddCommentPayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "addComment"
    }

    fun addComment(): AddCommentPayloadTO? {
        val data: MutableMap<String, AddCommentPayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
