package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
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

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("topic: " + GraphQLRequestSerializer.getEntry(topic))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }

    class Builder {

        private lateinit var id: String
        private lateinit var resourcePath: String
        private lateinit var topic: TopicTO
        private lateinit var url: String

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setTopic(topic: TopicTO): Builder {
            this.topic = topic
            return this
        }

        fun setUrl(url: String): Builder {
            this.url = url
            return this
        }

        fun build(): RepositoryTopicTO {
            return RepositoryTopicTO(id, resourcePath, topic, url)
        }
    }
}
