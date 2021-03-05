package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class MergeBranchInputTO(
    val base: String,
    val clientMutationId: String?,
    val commitMessage: String?,
    val head: String,
    val repositoryId: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("base: " + GraphQLRequestSerializer.getEntry(base))
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (commitMessage != null) {
            joiner.add("commitMessage: " + GraphQLRequestSerializer.getEntry(commitMessage))
        }
        joiner.add("head: " + GraphQLRequestSerializer.getEntry(head))
        joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
        return joiner.toString()
    }
}
