package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CreatePullRequestInputTO(
    val baseRefName: String,
    val body: String?,
    val clientMutationId: String?,
    val headRefName: String,
    val maintainerCanModify: Boolean? = true,
    val repositoryId: String,
    val title: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("baseRefName: " + GraphQLRequestSerializer.getEntry(baseRefName))
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        joiner.add("headRefName: " + GraphQLRequestSerializer.getEntry(headRefName))
        if (maintainerCanModify != null) {
            joiner.add("maintainerCanModify: " + GraphQLRequestSerializer.getEntry(maintainerCanModify))
        }
        joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
        joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        return joiner.toString()
    }
}
