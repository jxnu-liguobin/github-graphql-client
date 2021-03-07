package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for LanguageConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class LanguageConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): LanguageConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): LanguageConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("LanguageConnectionResponseProjection.LanguageEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageEdgeResponseProjection.edges", 0) + 1)
            this.edges(new LanguageEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("LanguageConnectionResponseProjection.LanguageResponseProjection.nodes", projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageResponseProjection.nodes", 0) + 1)
            this.nodes(new LanguageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("LanguageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.totalSize()
        this.typename()
        this
    }

    def edges(subProjection: LanguageEdgeResponseProjection): LanguageConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: LanguageEdgeResponseProjection): LanguageConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: LanguageResponseProjection): LanguageConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: LanguageResponseProjection): LanguageConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): LanguageConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): LanguageConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): LanguageConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): LanguageConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def totalSize(): LanguageConnectionResponseProjection = {
        totalSize(null.asInstanceOf[String])
    }

    def totalSize(alias: String): LanguageConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalSize").alias(alias))
        this
    }

    def typename(): LanguageConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): LanguageConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[LanguageConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
