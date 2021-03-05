package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ProjectTO(
    val body: String?,
    val bodyHTML: String,
    override
    val closed: Boolean,
    override
    val closedAt: String?,
    val createdAt: String,
    val creator: ActorTO?,
    val databaseId: Int?,
    override
    val id: String,
    val name: String,
    val number: Int,
    val owner: ProjectOwnerTO,
    val resourcePath: String,
    val state: ProjectStateTO,
    val updatedAt: String,
    val url: String,
    override
    val viewerCanUpdate: Boolean
) : ClosableTO, NodeTO, UpdatableTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        }
        joiner.add("bodyHTML: " + GraphQLRequestSerializer.getEntry(bodyHTML))
        joiner.add("closed: " + GraphQLRequestSerializer.getEntry(closed))
        if (closedAt != null) {
            joiner.add("closedAt: " + GraphQLRequestSerializer.getEntry(closedAt))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator))
        }
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number))
        joiner.add("owner: " + GraphQLRequestSerializer.getEntry(owner))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("viewerCanUpdate: " + GraphQLRequestSerializer.getEntry(viewerCanUpdate))
        return joiner.toString()
    }
}
