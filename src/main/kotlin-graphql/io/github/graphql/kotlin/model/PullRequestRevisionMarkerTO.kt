package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PullRequestRevisionMarkerTO(
    val createdAt: String,
    val lastSeenCommit: CommitTO,
    val pullRequest: PullRequestTO
) : PullRequestTimelineItemsTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt))
        joiner.add("lastSeenCommit: " + GraphQLRequestSerializer.getEntry(lastSeenCommit))
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
        val that = other as PullRequestRevisionMarkerTO
        return Objects.equals(createdAt, that.createdAt)
                && Objects.equals(lastSeenCommit, that.lastSeenCommit)
                && Objects.equals(pullRequest, that.pullRequest)

    }

    override fun hashCode(): Int = {
        return Objects.hash(createdAt, lastSeenCommit, pullRequest)
    }

    class Builder {

        private lateinit var createdAt: String
        private lateinit var lastSeenCommit: CommitTO
        private lateinit var pullRequest: PullRequestTO

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setLastSeenCommit(lastSeenCommit: CommitTO): Builder {
            this.lastSeenCommit = lastSeenCommit
            return this
        }

        fun setPullRequest(pullRequest: PullRequestTO): Builder {
            this.pullRequest = pullRequest
            return this
        }

        fun build(): PullRequestRevisionMarkerTO {
            return PullRequestRevisionMarkerTO(createdAt, lastSeenCommit, pullRequest)
        }
    }
}
