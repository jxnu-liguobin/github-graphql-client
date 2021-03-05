package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class AddPullRequestReviewCommentPayloadTO(
    val clientMutationId: String?,
    val comment: PullRequestReviewCommentTO?,
    val commentEdge: PullRequestReviewCommentEdgeTO?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (comment != null) {
            joiner.add("comment: " + GraphQLRequestSerializer.getEntry(comment))
        }
        if (commentEdge != null) {
            joiner.add("commentEdge: " + GraphQLRequestSerializer.getEntry(commentEdge))
        }
        return joiner.toString()
    }
}
