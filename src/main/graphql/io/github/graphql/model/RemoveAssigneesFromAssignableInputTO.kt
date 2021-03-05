package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RemoveAssigneesFromAssignableInputTO(
    val assignableId: String,
    val assigneeIds: List<String>,
    val clientMutationId: String?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("assignableId: " + GraphQLRequestSerializer.getEntry(assignableId))
        joiner.add("assigneeIds: " + GraphQLRequestSerializer.getEntry(assigneeIds))
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        return joiner.toString()
    }
}
