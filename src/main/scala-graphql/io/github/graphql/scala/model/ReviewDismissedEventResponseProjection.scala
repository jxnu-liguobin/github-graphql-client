package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ReviewDismissedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ReviewDismissedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReviewDismissedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReviewDismissedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.databaseId()
        this.dismissalMessage()
        this.dismissalMessageHTML()
        this.id()
        this.previousReviewState()
        if (projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestCommitResponseProjection.pullRequestCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissedEventResponseProjection.PullRequestCommitResponseProjection.pullRequestCommit", projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestCommitResponseProjection.pullRequestCommit", 0) + 1)
            this.pullRequestCommit(new PullRequestCommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestCommitResponseProjection.pullRequestCommit", 0)))
        }
        this.resourcePath()
        if (projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestReviewResponseProjection.review", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissedEventResponseProjection.PullRequestReviewResponseProjection.review", projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestReviewResponseProjection.review", 0) + 1)
            this.review(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestReviewResponseProjection.review", 0)))
        }
        this.url()
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): ReviewDismissedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): ReviewDismissedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): ReviewDismissedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): ReviewDismissedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def databaseId(): ReviewDismissedEventResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): ReviewDismissedEventResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def dismissalMessage(): ReviewDismissedEventResponseProjection = {
        dismissalMessage(null.asInstanceOf[String])
    }

    def dismissalMessage(alias: String): ReviewDismissedEventResponseProjection = {
        fields.add(new GraphQLResponseField("dismissalMessage").alias(alias))
        this
    }

    def dismissalMessageHTML(): ReviewDismissedEventResponseProjection = {
        dismissalMessageHTML(null.asInstanceOf[String])
    }

    def dismissalMessageHTML(alias: String): ReviewDismissedEventResponseProjection = {
        fields.add(new GraphQLResponseField("dismissalMessageHTML").alias(alias))
        this
    }

    def id(): ReviewDismissedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ReviewDismissedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def previousReviewState(): ReviewDismissedEventResponseProjection = {
        previousReviewState(null.asInstanceOf[String])
    }

    def previousReviewState(alias: String): ReviewDismissedEventResponseProjection = {
        fields.add(new GraphQLResponseField("previousReviewState").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): ReviewDismissedEventResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): ReviewDismissedEventResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def pullRequestCommit(subProjection: PullRequestCommitResponseProjection): ReviewDismissedEventResponseProjection = {
        pullRequestCommit(null.asInstanceOf[String], subProjection)
    }

    def pullRequestCommit(alias: String, subProjection: PullRequestCommitResponseProjection): ReviewDismissedEventResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequestCommit").alias(alias).projection(subProjection))
        this
    }

    def resourcePath(): ReviewDismissedEventResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): ReviewDismissedEventResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def review(subProjection: PullRequestReviewResponseProjection): ReviewDismissedEventResponseProjection = {
        review(null.asInstanceOf[String], subProjection)
    }

    def review(alias: String, subProjection: PullRequestReviewResponseProjection): ReviewDismissedEventResponseProjection = {
        fields.add(new GraphQLResponseField("review").alias(alias).projection(subProjection))
        this
    }

    def url(): ReviewDismissedEventResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): ReviewDismissedEventResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def typename(): ReviewDismissedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReviewDismissedEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ReviewDismissedEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
