package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestReviewThreadEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PullRequestReviewThreadEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestReviewThreadEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestReviewThreadEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadEdgeResponseProjection.PullRequestReviewThreadResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewThreadEdgeResponseProjection.PullRequestReviewThreadResponseProjection.node", projectionDepthOnFields.getOrDefault("PullRequestReviewThreadEdgeResponseProjection.PullRequestReviewThreadResponseProjection.node", 0) + 1)
            this.node(new PullRequestReviewThreadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadEdgeResponseProjection.PullRequestReviewThreadResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): PullRequestReviewThreadEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): PullRequestReviewThreadEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: PullRequestReviewThreadResponseProjection): PullRequestReviewThreadEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: PullRequestReviewThreadResponseProjection): PullRequestReviewThreadEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): PullRequestReviewThreadEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestReviewThreadEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
