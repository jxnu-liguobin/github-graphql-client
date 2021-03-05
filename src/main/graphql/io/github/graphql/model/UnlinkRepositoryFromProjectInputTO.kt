package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UnlinkRepositoryFromProjectInputTO(
    val clientMutationId: String?,
    val projectId: String,
    val repositoryId: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId))
        joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
        return joiner.toString()
    }
}
