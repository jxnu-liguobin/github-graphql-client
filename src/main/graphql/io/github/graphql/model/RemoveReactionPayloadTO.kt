package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RemoveReactionPayloadTO(
    val clientMutationId: String?,
    val reaction: ReactionTO?,
    val subject: ReactableTO?
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (reaction != null) {
            joiner.add("reaction: " + GraphQLRequestSerializer.getEntry(reaction))
        }
        if (subject != null) {
            joiner.add("subject: " + GraphQLRequestSerializer.getEntry(subject))
        }
        return joiner.toString()
    }
}
