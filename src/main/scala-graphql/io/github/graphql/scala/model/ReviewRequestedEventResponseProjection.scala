package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ReviewRequestedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ReviewRequestedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReviewRequestedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReviewRequestedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0) + 1)
            this.requestedReviewer(new RequestedReviewerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): ReviewRequestedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): ReviewRequestedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): ReviewRequestedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): ReviewRequestedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): ReviewRequestedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ReviewRequestedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): ReviewRequestedEventResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): ReviewRequestedEventResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def requestedReviewer(subProjection: RequestedReviewerResponseProjection): ReviewRequestedEventResponseProjection = {
        requestedReviewer(null.asInstanceOf[String], subProjection)
    }

    def requestedReviewer(alias: String, subProjection: RequestedReviewerResponseProjection): ReviewRequestedEventResponseProjection = {
        fields.add(new GraphQLResponseField("requestedReviewer").alias(alias).projection(subProjection))
        this
    }

    def typename(): ReviewRequestedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReviewRequestedEventResponseProjection = {
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
        val that = obj.asInstanceOf[ReviewRequestedEventResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
