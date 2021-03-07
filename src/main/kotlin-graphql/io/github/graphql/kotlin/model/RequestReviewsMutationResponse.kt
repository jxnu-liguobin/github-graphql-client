package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class RequestReviewsMutationResponse : GraphQLResult<MutableMap<String, RequestReviewsPayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "requestReviews"
    }

    fun requestReviews(): RequestReviewsPayloadTO? {
        val data: MutableMap<String, RequestReviewsPayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
