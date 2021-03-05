package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReviewDismissalAllowanceEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ReviewDismissalAllowanceEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReviewDismissalAllowanceEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReviewDismissalAllowanceEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceEdgeResponseProjection.ReviewDismissalAllowanceResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewDismissalAllowanceEdgeResponseProjection.ReviewDismissalAllowanceResponseProjection.node"] = projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceEdgeResponseProjection.ReviewDismissalAllowanceResponseProjection.node", 0) + 1
            this.node(ReviewDismissalAllowanceResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceEdgeResponseProjection.ReviewDismissalAllowanceResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): ReviewDismissalAllowanceEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): ReviewDismissalAllowanceEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: ReviewDismissalAllowanceResponseProjection): ReviewDismissalAllowanceEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: ReviewDismissalAllowanceResponseProjection): ReviewDismissalAllowanceEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ReviewDismissalAllowanceEdgeResponseProjection = typename(null)

    fun typename(alias: String?): ReviewDismissalAllowanceEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
