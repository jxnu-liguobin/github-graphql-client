package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PublicKeyTO(
    val accessedAt: String?,
    val createdAt: String?,
    val fingerprint: String,
    override
    val id: String,
    val isReadOnly: Boolean?,
    val key: String,
    val updatedAt: String?
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (accessedAt != null) {
            joiner.add("accessedAt: " + GraphQLRequestSerializer.getEntry(accessedAt))
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        }
        joiner.add("fingerprint: " + GraphQLRequestSerializer.getEntry(fingerprint))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        if (isReadOnly != null) {
            joiner.add("isReadOnly: " + GraphQLRequestSerializer.getEntry(isReadOnly))
        }
        joiner.add("key: " + GraphQLRequestSerializer.getEntry(key))
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        }
        return joiner.toString()
    }
}
