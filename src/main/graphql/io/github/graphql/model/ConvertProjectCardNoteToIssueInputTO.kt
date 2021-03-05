package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ConvertProjectCardNoteToIssueInputTO(
    val body: String?,
    val clientMutationId: String?,
    val projectCardId: String,
    val repositoryId: String,
    val title: String?
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
        joiner.add("projectCardId: " + GraphQLRequestSerializer.getEntry(projectCardId))
        joiner.add("repositoryId: " + GraphQLRequestSerializer.getEntry(repositoryId))
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        }
        return joiner.toString()
    }
}
