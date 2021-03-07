package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RequestReviewsPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RequestReviewsPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): RequestReviewsPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): RequestReviewsPayloadResponseProjection = {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("RequestReviewsPayloadResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.UserEdgeResponseProjection.requestedReviewersEdge", 0) <= maxDepth) {
            projectionDepthOnFields.put("RequestReviewsPayloadResponseProjection.UserEdgeResponseProjection.requestedReviewersEdge", projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.UserEdgeResponseProjection.requestedReviewersEdge", 0) + 1)
            this.requestedReviewersEdge(new UserEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RequestReviewsPayloadResponseProjection.UserEdgeResponseProjection.requestedReviewersEdge", 0)))
        }
        this.typename()
        this
    }

    def clientMutationId(): RequestReviewsPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): RequestReviewsPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): RequestReviewsPayloadResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): RequestReviewsPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def requestedReviewersEdge(subProjection: UserEdgeResponseProjection): RequestReviewsPayloadResponseProjection = {
        requestedReviewersEdge(null.asInstanceOf[String], subProjection)
    }

    def requestedReviewersEdge(alias: String, subProjection: UserEdgeResponseProjection): RequestReviewsPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("requestedReviewersEdge").alias(alias).projection(subProjection))
        this
    }

    def typename(): RequestReviewsPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RequestReviewsPayloadResponseProjection = {
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
        val that = obj.asInstanceOf[RequestReviewsPayloadResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
