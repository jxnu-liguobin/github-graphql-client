package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PinnableItemConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PinnableItemConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): PinnableItemConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): PinnableItemConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("PinnableItemConnectionResponseProjection.PinnableItemEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemEdgeResponseProjection.edges", 0) + 1)
            this.edges(new PinnableItemEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("PinnableItemConnectionResponseProjection.PinnableItemResponseProjection.nodes", projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemResponseProjection.nodes", 0) + 1)
            this.nodes(new PinnableItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PinnableItemResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PinnableItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PinnableItemConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: PinnableItemEdgeResponseProjection): PinnableItemConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: PinnableItemEdgeResponseProjection): PinnableItemConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: PinnableItemResponseProjection): PinnableItemConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: PinnableItemResponseProjection): PinnableItemConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): PinnableItemConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): PinnableItemConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): PinnableItemConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): PinnableItemConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): PinnableItemConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PinnableItemConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[PinnableItemConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
