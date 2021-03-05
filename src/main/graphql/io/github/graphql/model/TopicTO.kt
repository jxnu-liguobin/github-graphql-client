package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class TopicTO(
    override
    val id: String,
    val name: String,
    override
    val viewerHasStarred: Boolean
) : StarrableTO, NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("viewerHasStarred: " + GraphQLRequestSerializer.getEntry(viewerHasStarred))
        return joiner.toString()
    }
}
