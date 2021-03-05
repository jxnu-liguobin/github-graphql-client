package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class MilestoneTO(
    override
    val closed: Boolean,
    override
    val closedAt: String?,
    val createdAt: String,
    val creator: ActorTO?,
    val description: String?,
    val dueOn: String?,
    override
    val id: String,
    val issuePrioritiesDebug: String,
    val number: Int,
    val repository: RepositoryTO,
    override
    val resourcePath: String,
    val state: MilestoneStateTO,
    val title: String,
    val updatedAt: String,
    override
    val url: String
) : UniformResourceLocatableTO, ClosableTO, NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("closed: " + GraphQLRequestSerializer.getEntry(closed))
        if (closedAt != null) {
            joiner.add("closedAt: " + GraphQLRequestSerializer.getEntry(closedAt))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator))
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        if (dueOn != null) {
            joiner.add("dueOn: " + GraphQLRequestSerializer.getEntry(dueOn))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("issuePrioritiesDebug: " + GraphQLRequestSerializer.getEntry(issuePrioritiesDebug))
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number))
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }
}
