package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestReviewCommentConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PullRequestReviewCommentConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestReviewCommentConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestReviewCommentConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentEdgeResponseProjection.edges", 0) + 1)
            this.edges(new PullRequestReviewCommentEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentResponseProjection.nodes", 0) + 1)
            this.nodes(new PullRequestReviewCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: PullRequestReviewCommentEdgeResponseProjection): PullRequestReviewCommentConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: PullRequestReviewCommentEdgeResponseProjection): PullRequestReviewCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: PullRequestReviewCommentResponseProjection): PullRequestReviewCommentConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: PullRequestReviewCommentResponseProjection): PullRequestReviewCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): PullRequestReviewCommentConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): PullRequestReviewCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): PullRequestReviewCommentConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): PullRequestReviewCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): PullRequestReviewCommentConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestReviewCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
