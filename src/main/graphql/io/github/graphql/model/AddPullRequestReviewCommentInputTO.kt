package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class AddPullRequestReviewCommentInputTO(
    val body: String,
    val clientMutationId: String?,
    val commitOID: String?,
    val inReplyTo: String?,
    val path: String?,
    val position: Int?,
    val pullRequestReviewId: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (commitOID != null) {
            joiner.add("commitOID: " + GraphQLRequestSerializer.getEntry(commitOID))
        }
        if (inReplyTo != null) {
            joiner.add("inReplyTo: " + GraphQLRequestSerializer.getEntry(inReplyTo))
        }
        if (path != null) {
            joiner.add("path: " + GraphQLRequestSerializer.getEntry(path))
        }
        if (position != null) {
            joiner.add("position: " + GraphQLRequestSerializer.getEntry(position))
        }
        joiner.add("pullRequestReviewId: " + GraphQLRequestSerializer.getEntry(pullRequestReviewId))
        return joiner.toString()
    }
}
