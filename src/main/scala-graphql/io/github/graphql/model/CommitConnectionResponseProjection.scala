package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CommitConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CommitConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): CommitConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): CommitConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitConnectionResponseProjection.CommitEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0) + 1)
            this.edges(new CommitEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitConnectionResponseProjection.CommitResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitResponseProjection.nodes", 0) + 1)
            this.nodes(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: CommitEdgeResponseProjection): CommitConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: CommitEdgeResponseProjection): CommitConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: CommitResponseProjection): CommitConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: CommitResponseProjection): CommitConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): CommitConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): CommitConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): CommitConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): CommitConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): CommitConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CommitConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
