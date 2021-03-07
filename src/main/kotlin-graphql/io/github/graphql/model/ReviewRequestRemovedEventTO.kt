package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ReviewRequestRemovedEventTO(
    val actor: ActorTO?,
    val createdAt: String,
    override
    val id: String,
    val pullRequest: PullRequestTO,
    val requestedReviewer: RequestedReviewerTO?
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
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        if (requestedReviewer != null) {
            joiner.add("requestedReviewer: " + GraphQLRequestSerializer.getEntry(requestedReviewer))
        }
        return joiner.toString()
    }

    class Builder {

        private var actor: ActorTO? = null
        private lateinit var createdAt: String
        private lateinit var id: String
        private lateinit var pullRequest: PullRequestTO
        private var requestedReviewer: RequestedReviewerTO? = null

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

        fun setRequestedReviewer(requestedReviewer: RequestedReviewerTO?): Builder {
            this.requestedReviewer = requestedReviewer
            return this
        }

        fun build(): ReviewRequestRemovedEventTO {
            return ReviewRequestRemovedEventTO(actor, createdAt, id, pullRequest, requestedReviewer)
        }
    }
}