package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RequestReviewsPayloadTO(
    val clientMutationId: String?,
    val pullRequest: PullRequestTO?,
    val requestedReviewersEdge: UserEdgeTO?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (pullRequest != null) {
            joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        }
        if (requestedReviewersEdge != null) {
            joiner.add("requestedReviewersEdge: " + GraphQLRequestSerializer.getEntry(requestedReviewersEdge))
        }
        return joiner.toString()
    }
}
