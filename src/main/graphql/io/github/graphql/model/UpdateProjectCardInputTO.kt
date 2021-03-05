package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UpdateProjectCardInputTO(
    val clientMutationId: String?,
    val isArchived: Boolean?,
    val note: String?,
    val projectCardId: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (isArchived != null) {
            joiner.add("isArchived: " + GraphQLRequestSerializer.getEntry(isArchived))
        }
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note))
        }
        joiner.add("projectCardId: " + GraphQLRequestSerializer.getEntry(projectCardId))
        return joiner.toString()
    }
}
