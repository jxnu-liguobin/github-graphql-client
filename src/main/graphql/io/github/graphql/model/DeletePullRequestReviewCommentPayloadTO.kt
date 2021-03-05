package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class DeletePullRequestReviewCommentPayloadTO(
    val clientMutationId: String?,
    val pullRequestReview: PullRequestReviewTO?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (pullRequestReview != null) {
            joiner.add("pullRequestReview: " + GraphQLRequestSerializer.getEntry(pullRequestReview))
        }
        return joiner.toString()
    }
}
