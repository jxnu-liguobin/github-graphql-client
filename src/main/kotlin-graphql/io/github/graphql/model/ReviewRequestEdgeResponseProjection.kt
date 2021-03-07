package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReviewRequestEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ReviewRequestEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReviewRequestEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReviewRequestEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ReviewRequestEdgeResponseProjection.ReviewRequestResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["ReviewRequestEdgeResponseProjection.ReviewRequestResponseProjection.node"] = projectionDepthOnFields.getOrDefault("ReviewRequestEdgeResponseProjection.ReviewRequestResponseProjection.node", 0) + 1
            this.node(ReviewRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestEdgeResponseProjection.ReviewRequestResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): ReviewRequestEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): ReviewRequestEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: ReviewRequestResponseProjection): ReviewRequestEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: ReviewRequestResponseProjection): ReviewRequestEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ReviewRequestEdgeResponseProjection = typename(null)

    fun typename(alias: String?): ReviewRequestEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
