package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ReviewDismissalAllowanceConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ReviewDismissalAllowanceConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReviewDismissalAllowanceConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReviewDismissalAllowanceConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceEdgeResponseProjection.edges", 0) + 1)
            this.edges(new ReviewDismissalAllowanceEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceResponseProjection.nodes", 0) + 1)
            this.nodes(new ReviewDismissalAllowanceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.ReviewDismissalAllowanceResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissalAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissalAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: ReviewDismissalAllowanceEdgeResponseProjection): ReviewDismissalAllowanceConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: ReviewDismissalAllowanceEdgeResponseProjection): ReviewDismissalAllowanceConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: ReviewDismissalAllowanceResponseProjection): ReviewDismissalAllowanceConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: ReviewDismissalAllowanceResponseProjection): ReviewDismissalAllowanceConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): ReviewDismissalAllowanceConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): ReviewDismissalAllowanceConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): ReviewDismissalAllowanceConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): ReviewDismissalAllowanceConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): ReviewDismissalAllowanceConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReviewDismissalAllowanceConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[ReviewDismissalAllowanceConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
