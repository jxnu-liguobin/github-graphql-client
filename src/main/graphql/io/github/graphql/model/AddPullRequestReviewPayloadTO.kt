package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class AddPullRequestReviewPayloadTO(
    val clientMutationId: String?,
    val pullRequestReview: PullRequestReviewTO?,
    val reviewEdge: PullRequestReviewEdgeTO?
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
        if (reviewEdge != null) {
            joiner.add("reviewEdge: " + GraphQLRequestSerializer.getEntry(reviewEdge))
        }
        return joiner.toString()
    }
}
