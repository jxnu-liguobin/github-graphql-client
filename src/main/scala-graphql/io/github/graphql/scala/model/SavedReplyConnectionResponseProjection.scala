package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for SavedReplyConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class SavedReplyConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): SavedReplyConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): SavedReplyConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("SavedReplyConnectionResponseProjection.SavedReplyEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyEdgeResponseProjection.edges", 0) + 1)
            this.edges(new SavedReplyEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("SavedReplyConnectionResponseProjection.SavedReplyResponseProjection.nodes", projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyResponseProjection.nodes", 0) + 1)
            this.nodes(new SavedReplyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.SavedReplyResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("SavedReplyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SavedReplyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: SavedReplyEdgeResponseProjection): SavedReplyConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: SavedReplyEdgeResponseProjection): SavedReplyConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: SavedReplyResponseProjection): SavedReplyConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: SavedReplyResponseProjection): SavedReplyConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): SavedReplyConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): SavedReplyConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): SavedReplyConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): SavedReplyConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): SavedReplyConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SavedReplyConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[SavedReplyConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
