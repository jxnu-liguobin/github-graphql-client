package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class AppTO(
    val createdAt: String,
    val databaseId: Int?,
    val description: String?,
    override
    val id: String,
    val logoBackgroundColor: String,
    val name: String,
    val slug: String,
    val updatedAt: String,
    val url: String
) : SearchResultItemTO, NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("logoBackgroundColor: " + GraphQLRequestSerializer.getEntry(logoBackgroundColor))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("slug: " + GraphQLRequestSerializer.getEntry(slug))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }
}
