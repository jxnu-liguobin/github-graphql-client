package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestCommitConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PullRequestCommitConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestCommitConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestCommitConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitConnectionResponseProjection.PullRequestCommitEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitEdgeResponseProjection.edges", 0) + 1)
            this.edges(new PullRequestCommitEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitConnectionResponseProjection.PullRequestCommitResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitResponseProjection.nodes", 0) + 1)
            this.nodes(new PullRequestCommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: PullRequestCommitEdgeResponseProjection): PullRequestCommitConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: PullRequestCommitEdgeResponseProjection): PullRequestCommitConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: PullRequestCommitResponseProjection): PullRequestCommitConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: PullRequestCommitResponseProjection): PullRequestCommitConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): PullRequestCommitConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): PullRequestCommitConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): PullRequestCommitConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): PullRequestCommitConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): PullRequestCommitConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestCommitConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
