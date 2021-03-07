package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReviewRequestConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ReviewRequestConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReviewRequestConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReviewRequestConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestConnectionResponseProjection.ReviewRequestEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestEdgeResponseProjection.edges", 0) + 1)
            this.edges(new ReviewRequestEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestConnectionResponseProjection.ReviewRequestResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestResponseProjection.nodes", 0) + 1)
            this.nodes(new ReviewRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.ReviewRequestResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: ReviewRequestEdgeResponseProjection): ReviewRequestConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: ReviewRequestEdgeResponseProjection): ReviewRequestConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: ReviewRequestResponseProjection): ReviewRequestConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: ReviewRequestResponseProjection): ReviewRequestConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): ReviewRequestConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): ReviewRequestConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): ReviewRequestConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): ReviewRequestConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): ReviewRequestConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReviewRequestConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
