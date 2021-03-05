package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class GistTO(
    val createdAt: String,
    val description: String?,
    override
    val id: String,
    val isFork: Boolean,
    val isPublic: Boolean,
    val name: String,
    val owner: RepositoryOwnerTO?,
    val pushedAt: String?,
    override
    val resourcePath: String,
    val updatedAt: String,
    override
    val url: String,
    override
    val viewerHasStarred: Boolean
) : PinnableItemTO, StarrableTO, UniformResourceLocatableTO, NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("isFork: " + GraphQLRequestSerializer.getEntry(isFork))
        joiner.add("isPublic: " + GraphQLRequestSerializer.getEntry(isPublic))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        if (owner != null) {
            joiner.add("owner: " + GraphQLRequestSerializer.getEntry(owner))
        }
        if (pushedAt != null) {
            joiner.add("pushedAt: " + GraphQLRequestSerializer.getEntry(pushedAt))
        }
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("viewerHasStarred: " + GraphQLRequestSerializer.getEntry(viewerHasStarred))
        return joiner.toString()
    }
}
