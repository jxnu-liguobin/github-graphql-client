package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UpdateProjectInputTO(
    val body: String?,
    val clientMutationId: String?,
    val name: String?,
    val projectId: String,
    val public: Boolean?,
    val state: ProjectStateTO?
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
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        }
        joiner.add("projectId: " + GraphQLRequestSerializer.getEntry(projectId))
        if (public != null) {
            joiner.add("public: " + GraphQLRequestSerializer.getEntry(public))
        }
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        }
        return joiner.toString()
    }
}
