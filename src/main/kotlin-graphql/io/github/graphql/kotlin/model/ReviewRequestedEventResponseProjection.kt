package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ReviewRequestedEvent
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ReviewRequestedEventResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReviewRequestedEventResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReviewRequestedEventResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewRequestedEventResponseProjection.ActorResponseProjection.actor"] = projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.ActorResponseProjection.actor", 0) + 1
            this.actor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.ActorResponseProjection.actor", 0)))
        }
        this.createdAt()
        this.id()
        if (projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewRequestedEventResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewRequestedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer"] = projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0) + 1
            this.requestedReviewer(RequestedReviewerResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestedEventResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0)))
        }
        this.typename()
        return this
    }

    fun actor(subProjection: ActorResponseProjection): ReviewRequestedEventResponseProjection = actor(null, subProjection)

    fun actor(alias: String?, subProjection: ActorResponseProjection): ReviewRequestedEventResponseProjection {
        fields.add(GraphQLResponseField("actor").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): ReviewRequestedEventResponseProjection = createdAt(null)

    fun createdAt(alias: String?): ReviewRequestedEventResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun id(): ReviewRequestedEventResponseProjection = id(null)

    fun id(alias: String?): ReviewRequestedEventResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): ReviewRequestedEventResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): ReviewRequestedEventResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun requestedReviewer(subProjection: RequestedReviewerResponseProjection): ReviewRequestedEventResponseProjection = requestedReviewer(null, subProjection)

    fun requestedReviewer(alias: String?, subProjection: RequestedReviewerResponseProjection): ReviewRequestedEventResponseProjection {
        fields.add(GraphQLResponseField("requestedReviewer").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ReviewRequestedEventResponseProjection = typename(null)

    fun typename(alias: String?): ReviewRequestedEventResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ReviewRequestedEventResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
