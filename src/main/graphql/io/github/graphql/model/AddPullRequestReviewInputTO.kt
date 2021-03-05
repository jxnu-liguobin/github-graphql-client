package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class AddPullRequestReviewInputTO(
    val body: String?,
    val clientMutationId: String?,
    val comments: List<DraftPullRequestReviewCommentTO?>?,
    val commitOID: String?,
    val event: PullRequestReviewEventTO?,
    val pullRequestId: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (comments != null) {
            joiner.add("comments: " + GraphQLRequestSerializer.getEntry(comments))
        }
        if (commitOID != null) {
            joiner.add("commitOID: " + GraphQLRequestSerializer.getEntry(commitOID))
        }
        if (event != null) {
            joiner.add("event: " + GraphQLRequestSerializer.getEntry(event))
        }
        joiner.add("pullRequestId: " + GraphQLRequestSerializer.getEntry(pullRequestId))
        return joiner.toString()
    }
}
