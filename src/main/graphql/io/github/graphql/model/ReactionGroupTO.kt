package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ReactionGroupTO(
    val content: ReactionContentTO,
    val createdAt: String?,
    val subject: ReactableTO,
    val viewerHasReacted: Boolean
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("content: " + GraphQLRequestSerializer.getEntry(content))
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        }
        joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject))
        joiner.add("viewerHasReacted: " + GraphQLRequestSerializer.getEntry(viewerHasReacted))
        return joiner.toString()
    }
}
