package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReleaseConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ReleaseConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReleaseConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReleaseConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseConnectionResponseProjection.ReleaseEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseEdgeResponseProjection.edges", 0) + 1)
            this.edges(new ReleaseEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseConnectionResponseProjection.ReleaseResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseResponseProjection.nodes", 0) + 1)
            this.nodes(new ReleaseResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.ReleaseResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReleaseConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReleaseConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: ReleaseEdgeResponseProjection): ReleaseConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: ReleaseEdgeResponseProjection): ReleaseConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: ReleaseResponseProjection): ReleaseConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: ReleaseResponseProjection): ReleaseConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): ReleaseConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): ReleaseConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): ReleaseConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): ReleaseConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): ReleaseConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReleaseConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
