package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class DeleteProjectCardPayloadTO(
    val clientMutationId: String?,
    val column: ProjectColumnTO?,
    val deletedCardId: String?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (column != null) {
            joiner.add("column: " + GraphQLRequestSerializer.getEntry(column))
        }
        if (deletedCardId != null) {
            joiner.add("deletedCardId: " + GraphQLRequestSerializer.getEntry(deletedCardId))
        }
        return joiner.toString()
    }
}
