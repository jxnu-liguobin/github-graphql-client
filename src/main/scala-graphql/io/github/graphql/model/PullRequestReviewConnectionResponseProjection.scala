package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestReviewConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PullRequestReviewConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestReviewConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestReviewConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewConnectionResponseProjection.PullRequestReviewEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewEdgeResponseProjection.edges", 0) + 1)
            this.edges(new PullRequestReviewEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewConnectionResponseProjection.PullRequestReviewResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewResponseProjection.nodes", 0) + 1)
            this.nodes(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PullRequestReviewResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: PullRequestReviewEdgeResponseProjection): PullRequestReviewConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: PullRequestReviewEdgeResponseProjection): PullRequestReviewConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: PullRequestReviewResponseProjection): PullRequestReviewConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: PullRequestReviewResponseProjection): PullRequestReviewConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): PullRequestReviewConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): PullRequestReviewConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): PullRequestReviewConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): PullRequestReviewConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): PullRequestReviewConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestReviewConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
