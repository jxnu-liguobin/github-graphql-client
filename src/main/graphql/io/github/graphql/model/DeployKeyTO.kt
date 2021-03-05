package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class DeployKeyTO(
    val createdAt: String,
    override
    val id: String,
    val key: String,
    val readOnly: Boolean,
    val title: String,
    val verified: Boolean
) : NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("key: " + GraphQLRequestSerializer.getEntry(key))
        joiner.add("readOnly: " + GraphQLRequestSerializer.getEntry(readOnly))
        joiner.add("title: " + GraphQLRequestSerializer.getEntry(title))
        joiner.add("verified: " + GraphQLRequestSerializer.getEntry(verified))
        return joiner.toString()
    }
}
