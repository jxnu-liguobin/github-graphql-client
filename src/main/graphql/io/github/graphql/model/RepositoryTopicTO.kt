package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RepositoryTopicTO(
    override
    val id: String,
    override
    val resourcePath: String,
    val topic: TopicTO,
    override
    val url: String
) : UniformResourceLocatableTO, NodeTO {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("topic: " + GraphQLRequestSerializer.getEntry(topic))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }
}
