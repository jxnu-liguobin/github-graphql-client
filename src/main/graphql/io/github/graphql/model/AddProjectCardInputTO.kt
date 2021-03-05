package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class AddProjectCardInputTO(
    val clientMutationId: String?,
    val contentId: String?,
    val note: String?,
    val projectColumnId: String
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (contentId != null) {
            joiner.add("contentId: " + GraphQLRequestSerializer.getEntry(contentId))
        }
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note))
        }
        joiner.add("projectColumnId: " + GraphQLRequestSerializer.getEntry(projectColumnId))
        return joiner.toString()
    }
}
