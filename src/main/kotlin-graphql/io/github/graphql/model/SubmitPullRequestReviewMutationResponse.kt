package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class SubmitPullRequestReviewMutationResponse : GraphQLResult<MutableMap<String, SubmitPullRequestReviewPayloadTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "submitPullRequestReview"
    }

    fun submitPullRequestReview(): SubmitPullRequestReviewPayloadTO? {
        val data: MutableMap<String, SubmitPullRequestReviewPayloadTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
