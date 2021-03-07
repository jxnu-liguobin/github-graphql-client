package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CreatedPullRequestReviewContributionConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class CreatedPullRequestReviewContributionConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreatedPullRequestReviewContributionConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreatedPullRequestReviewContributionConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionEdgeResponseProjection.edges", 0) + 1)
            this.edges(new CreatedPullRequestReviewContributionEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionResponseProjection.nodes", 0) + 1)
            this.nodes(new CreatedPullRequestReviewContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.CreatedPullRequestReviewContributionResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestReviewContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestReviewContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: CreatedPullRequestReviewContributionEdgeResponseProjection): CreatedPullRequestReviewContributionConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: CreatedPullRequestReviewContributionEdgeResponseProjection): CreatedPullRequestReviewContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: CreatedPullRequestReviewContributionResponseProjection): CreatedPullRequestReviewContributionConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: CreatedPullRequestReviewContributionResponseProjection): CreatedPullRequestReviewContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): CreatedPullRequestReviewContributionConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): CreatedPullRequestReviewContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): CreatedPullRequestReviewContributionConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): CreatedPullRequestReviewContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): CreatedPullRequestReviewContributionConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreatedPullRequestReviewContributionConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[CreatedPullRequestReviewContributionConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
