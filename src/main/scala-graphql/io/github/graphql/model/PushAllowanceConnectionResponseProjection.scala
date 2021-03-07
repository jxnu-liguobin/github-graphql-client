package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PushAllowanceConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PushAllowanceConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): PushAllowanceConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): PushAllowanceConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PushAllowanceConnectionResponseProjection.PushAllowanceEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceEdgeResponseProjection.edges", 0) + 1)
            this.edges(new PushAllowanceEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PushAllowanceConnectionResponseProjection.PushAllowanceResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceResponseProjection.nodes", 0) + 1)
            this.nodes(new PushAllowanceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PushAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: PushAllowanceEdgeResponseProjection): PushAllowanceConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: PushAllowanceEdgeResponseProjection): PushAllowanceConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: PushAllowanceResponseProjection): PushAllowanceConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: PushAllowanceResponseProjection): PushAllowanceConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): PushAllowanceConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): PushAllowanceConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): PushAllowanceConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): PushAllowanceConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): PushAllowanceConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PushAllowanceConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
