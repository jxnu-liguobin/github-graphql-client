package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RefConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RefConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): RefConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): RefConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefConnectionResponseProjection.RefEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefEdgeResponseProjection.edges", 0) + 1)
            this.edges(new RefEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefConnectionResponseProjection.RefResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefResponseProjection.nodes", 0) + 1)
            this.nodes(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: RefEdgeResponseProjection): RefConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: RefEdgeResponseProjection): RefConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: RefResponseProjection): RefConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: RefResponseProjection): RefConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): RefConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): RefConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): RefConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): RefConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): RefConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RefConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[RefConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
