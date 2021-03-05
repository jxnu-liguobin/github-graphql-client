package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class MergePullRequestInputTO(
    val clientMutationId: String?,
    val commitBody: String?,
    val commitHeadline: String?,
    val expectedHeadOid: String?,
    val pullRequestId: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (commitBody != null) {
            joiner.add("commitBody: " + GraphQLRequestSerializer.getEntry(commitBody))
        }
        if (commitHeadline != null) {
            joiner.add("commitHeadline: " + GraphQLRequestSerializer.getEntry(commitHeadline))
        }
        if (expectedHeadOid != null) {
            joiner.add("expectedHeadOid: " + GraphQLRequestSerializer.getEntry(expectedHeadOid))
        }
        joiner.add("pullRequestId: " + GraphQLRequestSerializer.getEntry(pullRequestId))
        return joiner.toString()
    }
}
