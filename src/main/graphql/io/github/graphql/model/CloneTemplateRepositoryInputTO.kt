package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CloneTemplateRepositoryInputTO(
    val clientMutationId: String?,
    val description: String?,
    val name: String,
    val ownerId: String,
    val repositoryId: String,
    val visibility: RepositoryVisibilityTO
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("ownerId: " + GraphQLRequestSerializer.getEntry(ownerId))
        joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
        joiner.add("visibility: " + GraphQLRequestSerializer.getEntry(visibility))
        return joiner.toString()
    }
}
