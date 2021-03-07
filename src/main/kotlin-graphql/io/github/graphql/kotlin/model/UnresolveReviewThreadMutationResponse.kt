package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class UnresolveReviewThreadMutationResponse : GraphQLResult<MutableMap<String, UnresolveReviewThreadPayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "unresolveReviewThread"
    }

    fun unresolveReviewThread(): UnresolveReviewThreadPayloadTO? {
        val data: MutableMap<String, UnresolveReviewThreadPayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
