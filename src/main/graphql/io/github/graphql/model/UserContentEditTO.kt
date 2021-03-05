package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UserContentEditTO(
    val createdAt: String,
    val deletedAt: String?,
    val deletedBy: ActorTO?,
    val diff: String?,
    val editedAt: String,
    val editor: ActorTO?,
    override
    val id: String,
    val updatedAt: String
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (deletedAt != null) {
            joiner.add("deletedAt: " + GraphQLRequestSerializer.getEntry(deletedAt))
        }
        if (deletedBy != null) {
            joiner.add("deletedBy: " + GraphQLRequestSerializer.getEntry(deletedBy))
        }
        if (diff != null) {
            joiner.add("diff: " + GraphQLRequestSerializer.getEntry(diff))
        }
        joiner.add("editedAt: " + GraphQLRequestSerializer.getEntry(editedAt))
        if (editor != null) {
            joiner.add("editor: " + GraphQLRequestSerializer.getEntry(editor))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        return joiner.toString()
    }
}
