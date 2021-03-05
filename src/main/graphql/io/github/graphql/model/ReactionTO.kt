package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ReactionTO(
    val content: ReactionContentTO,
    val createdAt: String,
    val databaseId: Int?,
    override
    val id: String,
    val reactable: ReactableTO,
    val user: UserTO?
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("content: " + GraphQLRequestSerializer.getEntry(content))
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("reactable: " + GraphQLRequestSerializer.getEntry(reactable))
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user))
        }
        return joiner.toString()
    }
}
