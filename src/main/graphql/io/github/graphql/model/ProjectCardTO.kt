package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ProjectCardTO(
    val column: ProjectColumnTO?,
    val content: ProjectCardItemTO?,
    val createdAt: String,
    val creator: ActorTO?,
    val databaseId: Int?,
    override
    val id: String,
    val isArchived: Boolean,
    val note: String?,
    val project: ProjectTO,
    val resourcePath: String,
    val state: ProjectCardStateTO?,
    val updatedAt: String,
    val url: String
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (column != null) {
            joiner.add("column: " + GraphQLRequestSerializer.getEntry(column))
        }
        if (content != null) {
            joiner.add("content: " + GraphQLRequestSerializer.getEntry(content))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator))
        }
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("isArchived: " + GraphQLRequestSerializer.getEntry(isArchived))
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note))
        }
        joiner.add("project: " + GraphQLRequestSerializer.getEntry(project))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        }
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }
}
