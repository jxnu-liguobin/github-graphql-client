package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SavedReplyTO(
    val body: String,
    val bodyHTML: String,
    val databaseId: Int?,
    override
    val id: String,
    val title: String,
    val user: ActorTO?
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("body: " + GraphQLRequestSerializer.getEntry(body))
        joiner.add("bodyHTML: " + GraphQLRequestSerializer.getEntry(bodyHTML))
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        if (user != null) {
            joiner.add("user: " + GraphQLRequestSerializer.getEntry(user))
        }
        return joiner.toString()
    }
}
