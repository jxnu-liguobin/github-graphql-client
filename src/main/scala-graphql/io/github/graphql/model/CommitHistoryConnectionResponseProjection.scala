package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CommitHistoryConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CommitHistoryConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): CommitHistoryConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): CommitHistoryConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitHistoryConnectionResponseProjection.CommitEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0) + 1)
            this.edges(new CommitEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitHistoryConnectionResponseProjection.CommitResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitResponseProjection.nodes", 0) + 1)
            this.nodes(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitHistoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: CommitEdgeResponseProjection): CommitHistoryConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: CommitEdgeResponseProjection): CommitHistoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: CommitResponseProjection): CommitHistoryConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: CommitResponseProjection): CommitHistoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): CommitHistoryConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): CommitHistoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): CommitHistoryConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): CommitHistoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): CommitHistoryConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CommitHistoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
