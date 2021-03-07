package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ReviewRequest
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ReviewRequestResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReviewRequestResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReviewRequestResponseProjection {
        this.databaseId()
        this.id()
        if (projectionDepthOnFields.getOrDefault("ReviewRequestResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewRequestResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("ReviewRequestResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReviewRequestResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewRequestResponseProjection.RequestedReviewerResponseProjection.requestedReviewer"] = projectionDepthOnFields.getOrDefault("ReviewRequestResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0) + 1
            this.requestedReviewer(RequestedReviewerResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestResponseProjection.RequestedReviewerResponseProjection.requestedReviewer", 0)))
        }
        this.typename()
        return this
    }

    fun databaseId(): ReviewRequestResponseProjection = databaseId(null)

    fun databaseId(alias: String?): ReviewRequestResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun id(): ReviewRequestResponseProjection = id(null)

    fun id(alias: String?): ReviewRequestResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): ReviewRequestResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): ReviewRequestResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun requestedReviewer(subProjection: RequestedReviewerResponseProjection): ReviewRequestResponseProjection = requestedReviewer(null, subProjection)

    fun requestedReviewer(alias: String?, subProjection: RequestedReviewerResponseProjection): ReviewRequestResponseProjection {
        fields.add(GraphQLResponseField("requestedReviewer").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ReviewRequestResponseProjection = typename(null)

    fun typename(alias: String?): ReviewRequestResponseProjection {
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
        val that = other as ReviewRequestResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
