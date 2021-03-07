package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class HeadRefDeletedEventTO(
    val actor: ActorTO?,
    val createdAt: String,
    val headRef: RefTO?,
    val headRefName: String,
    override
    val id: String,
    val pullRequest: PullRequestTO
) : PullRequestTimelineItemsTO, PullRequestTimelineItemTO, NodeTO {

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
        if (headRef != null) {
            joiner.add("headRef: " + GraphQLRequestSerializer.getEntry(headRef))
        }
        joiner.add("headRefName: " + GraphQLRequestSerializer.getEntry(headRefName))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as HeadRefDeletedEventTO
        return Objects.equals(actor, that.actor)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(headRef, that.headRef)
                && Objects.equals(headRefName, that.headRefName)
                && Objects.equals(id, that.id)
                && Objects.equals(pullRequest, that.pullRequest)

    }

    override fun hashCode(): Int = {
        return Objects.hash(actor, createdAt, headRef, headRefName, id, pullRequest)
    }

    class Builder {

        private var actor: ActorTO? = null
        private lateinit var createdAt: String
        private var headRef: RefTO? = null
        private lateinit var headRefName: String
        private lateinit var id: String
        private lateinit var pullRequest: PullRequestTO

        fun setActor(actor: ActorTO?): Builder {
            this.actor = actor
            return this
        }

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setHeadRef(headRef: RefTO?): Builder {
            this.headRef = headRef
            return this
        }

        fun setHeadRefName(headRefName: String): Builder {
            this.headRefName = headRefName
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

        fun build(): HeadRefDeletedEventTO {
            return HeadRefDeletedEventTO(actor, createdAt, headRef, headRefName, id, pullRequest)
        }
    }
}
