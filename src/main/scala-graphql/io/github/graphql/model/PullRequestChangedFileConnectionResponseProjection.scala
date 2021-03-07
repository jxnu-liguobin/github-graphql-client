package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestChangedFileConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PullRequestChangedFileConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestChangedFileConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestChangedFileConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileEdgeResponseProjection.edges", 0) + 1)
            this.edges(new PullRequestChangedFileEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileResponseProjection.nodes", 0) + 1)
            this.nodes(new PullRequestChangedFileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PullRequestChangedFileResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestChangedFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestChangedFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: PullRequestChangedFileEdgeResponseProjection): PullRequestChangedFileConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: PullRequestChangedFileEdgeResponseProjection): PullRequestChangedFileConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: PullRequestChangedFileResponseProjection): PullRequestChangedFileConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: PullRequestChangedFileResponseProjection): PullRequestChangedFileConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): PullRequestChangedFileConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): PullRequestChangedFileConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): PullRequestChangedFileConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): PullRequestChangedFileConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): PullRequestChangedFileConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestChangedFileConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
