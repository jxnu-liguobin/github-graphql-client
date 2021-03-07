package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ReadyForReviewEventTO(
    val actor: ActorTO?,
    val createdAt: String,
    override
    val id: String,
    val pullRequest: PullRequestTO,
    override
    val resourcePath: String,
    override
    val url: String
) : PullRequestTimelineItemsTO, UniformResourceLocatableTO, NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (actor != null) {
            joiner.add("actor: " + GraphQLRequestSerializer.getEntry(actor))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
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
        val that = other as ReadyForReviewEventTO
        return Objects.equals(actor, that.actor)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(id, that.id)
                && Objects.equals(pullRequest, that.pullRequest)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(url, that.url)

    }

    override fun hashCode(): Int = {
        return Objects.hash(actor, createdAt, id, pullRequest, resourcePath, url)
    }

    class Builder {

        private var actor: ActorTO? = null
        private lateinit var createdAt: String
        private lateinit var id: String
        private lateinit var pullRequest: PullRequestTO
        private lateinit var resourcePath: String
        private lateinit var url: String

        fun setActor(actor: ActorTO?): Builder {
            this.actor = actor
            return this
        }

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setPullRequest(pullRequest: PullRequestTO): Builder {
            this.pullRequest = pullRequest
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setUrl(url: String): Builder {
            this.url = url
            return this
        }

        fun build(): ReadyForReviewEventTO {
            return ReadyForReviewEventTO(actor, createdAt, id, pullRequest, resourcePath, url)
        }
    }
}
