package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UnlinkRepositoryFromProjectPayloadTO(
    val clientMutationId: String?,
    val project: ProjectTO?,
    val repository: RepositoryTO?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (project != null) {
            joiner.add("project: " + GraphQLRequestSerializer.getEntry(project))
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        }
        return joiner.toString()
    }
}
