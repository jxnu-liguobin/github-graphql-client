package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class UpdatePullRequestReviewMutationResponse : GraphQLResult<MutableMap<String, UpdatePullRequestReviewPayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "updatePullRequestReview"
    }

    fun updatePullRequestReview(): UpdatePullRequestReviewPayloadTO? {
        val data: MutableMap<String, UpdatePullRequestReviewPayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
