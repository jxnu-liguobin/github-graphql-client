package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReviewRequestRemovedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ReviewRequestRemovedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReviewRequestRemovedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReviewRequestRemovedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewRequestRemovedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewRequestRemovedEventResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewRequestRemovedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer"] = projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0) + 1
            this.requestedReviewer(RequestedReviewerResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestRemovedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): ReviewRequestRemovedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): ReviewRequestRemovedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): ReviewRequestRemovedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): ReviewRequestRemovedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): ReviewRequestRemovedEventResponseProjection = id(null)

    fun id(alias: String?): ReviewRequestRemovedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): ReviewRequestRemovedEventResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): ReviewRequestRemovedEventResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun requestedReviewer(subProjection: RequestedReviewerResponseProjection): ReviewRequestRemovedEventResponseProjection = requestedReviewer(null, subProjection)

    fun requestedReviewer(alias: String?, subProjection: RequestedReviewerResponseProjection): ReviewRequestRemovedEventResponseProjection {
        fields.add(GraphQLResponseField("requestedReviewer").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ReviewRequestRemovedEventResponseProjection = typename(null)

    fun typename(alias: String?): ReviewRequestRemovedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
