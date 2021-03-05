package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class AddProjectCardPayloadTO(
    val cardEdge: ProjectCardEdgeTO?,
    val clientMutationId: String?,
    val projectColumn: ProjectColumnTO?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (cardEdge != null) {
            joiner.add("cardEdge: " + GraphQLRequestSerializer.getEntry(cardEdge))
        }
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (projectColumn != null) {
            joiner.add("projectColumn: " + GraphQLRequestSerializer.getEntry(projectColumn))
        }
        return joiner.toString()
    }
}
