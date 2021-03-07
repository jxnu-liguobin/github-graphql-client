package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import PullRequestReviewStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ReviewDismissedEventTO(
    actor: ActorTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    databaseId: Option[Int],
    dismissalMessage: String,
    dismissalMessageHTML: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    previousReviewState: PullRequestReviewStateTO,
    @javax.validation.constraints.NotNull
    pullRequest: PullRequestTO,
    pullRequestCommit: PullRequestCommitTO,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    review: PullRequestReviewTO,
    @javax.validation.constraints.NotNull
    override val url: String
) extends PullRequestTimelineItemsTO with PullRequestTimelineItemTO with UniformResourceLocatableTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (dismissalMessage != null) "dismissalMessage: " + GraphQLRequestSerializer.getEntry(dismissalMessage) else "",
            if (dismissalMessageHTML != null) "dismissalMessageHTML: " + GraphQLRequestSerializer.getEntry(dismissalMessageHTML) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (previousReviewState != null) "previousReviewState: " + GraphQLRequestSerializer.getEntry(previousReviewState) else "",
            if (pullRequest != null) "pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest) else "",
            if (pullRequestCommit != null) "pullRequestCommit: " + GraphQLRequestSerializer.getEntry(pullRequestCommit) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (review != null) "review: " + GraphQLRequestSerializer.getEntry(review) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object ReviewDismissedEventTO {

    def builder(): ReviewDismissedEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var createdAt: String = _
        private var databaseId: Option[Int] = _
        private var dismissalMessage: String = _
        private var dismissalMessageHTML: String = _
        private var id: String = _
        private var previousReviewState: PullRequestReviewStateTO = _
        private var pullRequest: PullRequestTO = _
        private var pullRequestCommit: PullRequestCommitTO = _
        private var resourcePath: String = _
        private var review: PullRequestReviewTO = _
        private var url: String = _

        def setActor(actor: ActorTO): Builder = {
            this.actor = actor
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setDatabaseId(databaseId: Option[Int]): Builder = {
            this.databaseId = databaseId
            this
        }

        def setDismissalMessage(dismissalMessage: String): Builder = {
            this.dismissalMessage = dismissalMessage
            this
        }

        def setDismissalMessageHTML(dismissalMessageHTML: String): Builder = {
            this.dismissalMessageHTML = dismissalMessageHTML
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setPreviousReviewState(previousReviewState: PullRequestReviewStateTO): Builder = {
            this.previousReviewState = previousReviewState
            this
        }

        def setPullRequest(pullRequest: PullRequestTO): Builder = {
            this.pullRequest = pullRequest
            this
        }

        def setPullRequestCommit(pullRequestCommit: PullRequestCommitTO): Builder = {
            this.pullRequestCommit = pullRequestCommit
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setReview(review: PullRequestReviewTO): Builder = {
            this.review = review
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def build(): ReviewDismissedEventTO = new ReviewDismissedEventTO(actor, createdAt, databaseId, dismissalMessage, dismissalMessageHTML, id, previousReviewState, pullRequest, pullRequestCommit, resourcePath, review, url)

    }
}
