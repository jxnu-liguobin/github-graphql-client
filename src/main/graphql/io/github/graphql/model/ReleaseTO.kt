package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ReleaseTO(
    val author: UserTO?,
    val createdAt: String,
    val description: String?,
    override
    val id: String,
    val isDraft: Boolean,
    val isPrerelease: Boolean,
    val name: String?,
    val publishedAt: String?,
    override
    val resourcePath: String,
    val tag: RefTO?,
    val tagName: String,
    val updatedAt: String,
    override
    val url: String
) : UniformResourceLocatableTO, NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("isDraft: " + GraphQLRequestSerializer.getEntry(isDraft))
        joiner.add("isPrerelease: " + GraphQLRequestSerializer.getEntry(isPrerelease))
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        }
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt))
        }
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        if (tag != null) {
            joiner.add("tag: " + GraphQLRequestSerializer.getEntry(tag))
        }
        joiner.add("tagName: " + GraphQLRequestSerializer.getEntry(tagName))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }
}
