package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CloneProjectInputTO(
    val body: String?,
    val clientMutationId: String?,
    val includeWorkflows: Boolean,
    val name: String,
    val public: Boolean?,
    val sourceId: String,
    val targetOwnerId: String
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
        joiner.add("includeWorkflows: " + GraphQLRequestSerializer.getEntry(includeWorkflows))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        if (public != null) {
            joiner.add("public: " + GraphQLRequestSerializer.getEntry(public))
        }
        joiner.add("sourceId: " + GraphQLRequestSerializer.getEntry(sourceId))
        joiner.add("targetOwnerId: " + GraphQLRequestSerializer.getEntry(targetOwnerId))
        return joiner.toString()
    }
}
