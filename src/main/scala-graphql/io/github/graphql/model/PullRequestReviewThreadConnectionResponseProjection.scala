package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestReviewThreadConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class PullRequestReviewThreadConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestReviewThreadConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestReviewThreadConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadEdgeResponseProjection.edges", 0) + 1)
            this.edges(new PullRequestReviewThreadEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadResponseProjection.nodes", 0) + 1)
            this.nodes(new PullRequestReviewThreadResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewThreadConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: PullRequestReviewThreadEdgeResponseProjection): PullRequestReviewThreadConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: PullRequestReviewThreadEdgeResponseProjection): PullRequestReviewThreadConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: PullRequestReviewThreadResponseProjection): PullRequestReviewThreadConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: PullRequestReviewThreadResponseProjection): PullRequestReviewThreadConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): PullRequestReviewThreadConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): PullRequestReviewThreadConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): PullRequestReviewThreadConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): PullRequestReviewThreadConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): PullRequestReviewThreadConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestReviewThreadConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
