package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ReviewDismissedEventTO(
    val actor: ActorTO?,
    val createdAt: String,
    val databaseId: Int?,
    val dismissalMessage: String?,
    val dismissalMessageHTML: String?,
    override
    val id: String,
    val previousReviewState: PullRequestReviewStateTO,
    val pullRequest: PullRequestTO,
    val pullRequestCommit: PullRequestCommitTO?,
    override
    val resourcePath: String,
    val review: PullRequestReviewTO?,
    override
    val url: String
) : PullRequestTimelineItemsTO, PullRequestTimelineItemTO, UniformResourceLocatableTO, NodeTO {

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
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId))
        }
        if (dismissalMessage != null) {
            joiner.add("dismissalMessage: " + GraphQLRequestSerializer.getEntry(dismissalMessage))
        }
        if (dismissalMessageHTML != null) {
            joiner.add("dismissalMessageHTML: " + GraphQLRequestSerializer.getEntry(dismissalMessageHTML))
        }
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("previousReviewState: " + GraphQLRequestSerializer.getEntry(previousReviewState))
        joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest))
        if (pullRequestCommit != null) {
            joiner.add("pullRequestCommit: " + GraphQLRequestSerializer.getEntry(pullRequestCommit))
        }
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        if (review != null) {
            joiner.add("review: " + GraphQLRequestSerializer.getEntry(review))
        }
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
        val that = other as ReviewDismissedEventTO
        return Objects.equals(actor, that.actor)
                && Objects.equals(createdAt, that.createdAt)
                && Objects.equals(databaseId, that.databaseId)
                && Objects.equals(dismissalMessage, that.dismissalMessage)
                && Objects.equals(dismissalMessageHTML, that.dismissalMessageHTML)
                && Objects.equals(id, that.id)
                && Objects.equals(previousReviewState, that.previousReviewState)
                && Objects.equals(pullRequest, that.pullRequest)
                && Objects.equals(pullRequestCommit, that.pullRequestCommit)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(review, that.review)
                && Objects.equals(url, that.url)

    }

    override fun hashCode(): Int = {
        return Objects.hash(actor, createdAt, databaseId, dismissalMessage, dismissalMessageHTML, id, previousReviewState, pullRequest, pullRequestCommit, resourcePath, review, url)
    }

    class Builder {

        private var actor: ActorTO? = null
        private lateinit var createdAt: String
        private var databaseId: Int? = null
        private var dismissalMessage: String? = null
        private var dismissalMessageHTML: String? = null
        private lateinit var id: String
        private lateinit var previousReviewState: PullRequestReviewStateTO
        private lateinit var pullRequest: PullRequestTO
        private var pullRequestCommit: PullRequestCommitTO? = null
        private lateinit var resourcePath: String
        private var review: PullRequestReviewTO? = null
        private lateinit var url: String

        fun setActor(actor: ActorTO?): Builder {
            this.actor = actor
            return this
        }

        fun setCreatedAt(createdAt: String): Builder {
            this.createdAt = createdAt
            return this
        }

        fun setDatabaseId(databaseId: Int?): Builder {
            this.databaseId = databaseId
            return this
        }

        fun setDismissalMessage(dismissalMessage: String?): Builder {
            this.dismissalMessage = dismissalMessage
            return this
        }

        fun setDismissalMessageHTML(dismissalMessageHTML: String?): Builder {
            this.dismissalMessageHTML = dismissalMessageHTML
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setPreviousReviewState(previousReviewState: PullRequestReviewStateTO): Builder {
            this.previousReviewState = previousReviewState
            return this
        }

        fun setPullRequest(pullRequest: PullRequestTO): Builder {
            this.pullRequest = pullRequest
            return this
        }

        fun setPullRequestCommit(pullRequestCommit: PullRequestCommitTO?): Builder {
            this.pullRequestCommit = pullRequestCommit
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setReview(review: PullRequestReviewTO?): Builder {
            this.review = review
            return this
        }

        fun setUrl(url: String): Builder {
            this.url = url
            return this
        }

        fun build(): ReviewDismissedEventTO {
            return ReviewDismissedEventTO(actor, createdAt, databaseId, dismissalMessage, dismissalMessageHTML, id, previousReviewState, pullRequest, pullRequestCommit, resourcePath, review, url)
        }
    }
}
