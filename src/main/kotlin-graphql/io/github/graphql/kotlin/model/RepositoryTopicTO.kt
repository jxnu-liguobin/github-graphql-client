package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as RepositoryTopicTO
        return Objects.equals(id, that.id)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(topic, that.topic)
                && Objects.equals(url, that.url)

    }

    override fun hashCode(): Int = {
        return Objects.hash(id, resourcePath, topic, url)
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
