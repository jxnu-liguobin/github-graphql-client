package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestReviewEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PullRequestReviewEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestReviewEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestReviewEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewEdgeResponseProjection.PullRequestReviewResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewEdgeResponseProjection.PullRequestReviewResponseProjection.node", projectionDepthOnFields.getOrDefault("PullRequestReviewEdgeResponseProjection.PullRequestReviewResponseProjection.node", 0) + 1)
            this.node(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewEdgeResponseProjection.PullRequestReviewResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): PullRequestReviewEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): PullRequestReviewEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: PullRequestReviewResponseProjection): PullRequestReviewEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: PullRequestReviewResponseProjection): PullRequestReviewEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): PullRequestReviewEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestReviewEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
