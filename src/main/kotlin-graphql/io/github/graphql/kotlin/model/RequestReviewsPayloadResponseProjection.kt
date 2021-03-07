package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RequestReviewsPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RequestReviewsPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RequestReviewsPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RequestReviewsPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["RequestReviewsPayloadResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.UserEdgeResponseProjection.requestedReviewersEdge", 0) <= maxDepth) {
            projectionDepthOnFields["RequestReviewsPayloadResponseProjection.UserEdgeResponseProjection.requestedReviewersEdge"] = projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.UserEdgeResponseProjection.requestedReviewersEdge", 0) + 1
            this.requestedReviewersEdge(UserEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.UserEdgeResponseProjection.requestedReviewersEdge", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): RequestReviewsPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): RequestReviewsPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): RequestReviewsPayloadResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): RequestReviewsPayloadResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun requestedReviewersEdge(subProjection: UserEdgeResponseProjection): RequestReviewsPayloadResponseProjection = requestedReviewersEdge(null, subProjection)

    fun requestedReviewersEdge(alias: String?, subProjection: UserEdgeResponseProjection): RequestReviewsPayloadResponseProjection {
        fields.add(GraphQLResponseField("requestedReviewersEdge").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RequestReviewsPayloadResponseProjection = typename(null)

    fun typename(alias: String?): RequestReviewsPayloadResponseProjection {
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
        val that = other as RequestReviewsPayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
