package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RequestReviewsInputTO(
    val clientMutationId: String?,
    val pullRequestId: String,
    val teamIds: List<String>?,
    val union: Boolean?,
    val userIds: List<String>?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        joiner.add("pullRequestId: " + GraphQLRequestSerializer.getEntry(pullRequestId))
        if (teamIds != null) {
            joiner.add("teamIds: " + GraphQLRequestSerializer.getEntry(teamIds))
        }
        if (union != null) {
            joiner.add("union: " + GraphQLRequestSerializer.getEntry(union))
        }
        if (userIds != null) {
            joiner.add("userIds: " + GraphQLRequestSerializer.getEntry(userIds))
        }
        return joiner.toString()
    }
}
