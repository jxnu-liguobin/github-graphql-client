package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class StatusContextTO(
    val commit: CommitTO?,
    val context: String,
    val createdAt: String,
    val creator: ActorTO?,
    val description: String?,
    override
    val id: String,
    val state: StatusStateTO,
    val targetUrl: String?
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (commit != null) {
            joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit))
        }
        joiner.add("context: " + GraphQLRequestSerializer.getEntry(context))
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (creator != null) {
            joiner.add("creator: " + GraphQLRequestSerializer.getEntry(creator))
        }
        if (description != null) {
            joiner.add("description: " + GraphQLRequestSerializer.getEntry(description))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("state: " + GraphQLRequestSerializer.getEntry(state))
        if (targetUrl != null) {
            joiner.add("targetUrl: " + GraphQLRequestSerializer.getEntry(targetUrl))
        }
        return joiner.toString()
    }
}
