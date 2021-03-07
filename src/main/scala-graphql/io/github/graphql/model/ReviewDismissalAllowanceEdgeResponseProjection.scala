package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReviewDismissalAllowanceEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ReviewDismissalAllowanceEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReviewDismissalAllowanceEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReviewDismissalAllowanceEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceEdgeResponseProjection.ReviewDismissalAllowanceResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissalAllowanceEdgeResponseProjection.ReviewDismissalAllowanceResponseProjection.node", projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceEdgeResponseProjection.ReviewDismissalAllowanceResponseProjection.node", 0) + 1)
            this.node(new ReviewDismissalAllowanceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceEdgeResponseProjection.ReviewDismissalAllowanceResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): ReviewDismissalAllowanceEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): ReviewDismissalAllowanceEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: ReviewDismissalAllowanceResponseProjection): ReviewDismissalAllowanceEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: ReviewDismissalAllowanceResponseProjection): ReviewDismissalAllowanceEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): ReviewDismissalAllowanceEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReviewDismissalAllowanceEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
