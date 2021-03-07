package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReviewRequestRemovedEvent
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ReviewRequestRemovedEventResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReviewRequestRemovedEventResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReviewRequestRemovedEventResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestRemovedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.ActorResponseProjection.actor", 0) + 1)
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestRemovedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestRemovedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0) + 1)
            this.requestedReviewer(new RequestedReviewerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0)))
        }
        this.typename()
        this
    }

    def actor(subProjection: ActorResponseProjection): ReviewRequestRemovedEventResponseProjection = {
        actor(null.asInstanceOf[String], subProjection)
    }

    def actor(alias: String, subProjection: ActorResponseProjection): ReviewRequestRemovedEventResponseProjection = {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): ReviewRequestRemovedEventResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): ReviewRequestRemovedEventResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def id(): ReviewRequestRemovedEventResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ReviewRequestRemovedEventResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): ReviewRequestRemovedEventResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): ReviewRequestRemovedEventResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def requestedReviewer(subProjection: RequestedReviewerResponseProjection): ReviewRequestRemovedEventResponseProjection = {
        requestedReviewer(null.asInstanceOf[String], subProjection)
    }

    def requestedReviewer(alias: String, subProjection: RequestedReviewerResponseProjection): ReviewRequestRemovedEventResponseProjection = {
        fields.add(new GraphQLResponseField("requestedReviewer").alias(alias).projection(subProjection))
        this
    }

    def typename(): ReviewRequestRemovedEventResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReviewRequestRemovedEventResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
