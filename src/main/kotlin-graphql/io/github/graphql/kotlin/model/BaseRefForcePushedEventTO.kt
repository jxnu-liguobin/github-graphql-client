package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class BaseRefForcePushedEventTO(
    val actor: ActorTO?,
    val afterCommit: CommitTO?,
    val beforeCommit: CommitTO?,
    val createdAt: String,
    override
    val id: String,
    val pullRequest: PullRequestTO,
    val ref: RefTO?
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
        if (afterCommit != null) {
            joiner.add("afterCommit: " + GraphQLRequestSerializer.getEntry(afterCommit))
        }
        if (beforeCommit != null) {
            joiner.add("beforeCommit: " + GraphQLRequestSerializer.getEntry(beforeCommit))
        }
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        if (ref != null) {
            joiner.add("ref: " + GraphQLRequestSerializer.getEntry(ref))
        }
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as BaseRefForcePushedEventTO
        return Objects.equals(actor, that.actor)
                && Objects.equals(afterCommit, that.afterCommit)
                && Objects.equals(beforeCommit, that.beforeCommit)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(id, that.id)
                && Objects.equals(pullRequest, that.pullRequest)
                && Objects.equals(ref, that.ref)

    }

    override fun hashCode(): Int = {
        return Objects.hash(actor, afterCommit, beforeCommit, createdAt, id, pullRequest, ref)
    }

    class Builder {

        private var actor: ActorTO? = null
        private var afterCommit: CommitTO? = null
        private var beforeCommit: CommitTO? = null
        private lateinit var createdAt: String
        private lateinit var id: String
        private lateinit var pullRequest: PullRequestTO
        private var ref: RefTO? = null

        fun setActor(actor: ActorTO?): Builder {
            this.actor = actor
            return this
        }

        fun setAfterCommit(afterCommit: CommitTO?): Builder {
            this.afterCommit = afterCommit
            return this
        }

        fun setBeforeCommit(beforeCommit: CommitTO?): Builder {
            this.beforeCommit = beforeCommit
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

        fun setRef(ref: RefTO?): Builder {
            this.ref = ref
            return this
        }

        fun build(): BaseRefForcePushedEventTO {
            return BaseRefForcePushedEventTO(actor, afterCommit, beforeCommit, createdAt, id, pullRequest, ref)
        }
    }
}
