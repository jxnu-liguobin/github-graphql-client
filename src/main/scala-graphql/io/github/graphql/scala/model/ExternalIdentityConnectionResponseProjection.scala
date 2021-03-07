package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ExternalIdentityConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ExternalIdentityConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): ExternalIdentityConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): ExternalIdentityConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExternalIdentityConnectionResponseProjection.ExternalIdentityEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityEdgeResponseProjection.edges", 0) + 1)
            this.edges(new ExternalIdentityEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExternalIdentityConnectionResponseProjection.ExternalIdentityResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityResponseProjection.nodes", 0) + 1)
            this.nodes(new ExternalIdentityResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExternalIdentityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: ExternalIdentityEdgeResponseProjection): ExternalIdentityConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: ExternalIdentityEdgeResponseProjection): ExternalIdentityConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: ExternalIdentityResponseProjection): ExternalIdentityConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: ExternalIdentityResponseProjection): ExternalIdentityConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): ExternalIdentityConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): ExternalIdentityConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): ExternalIdentityConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): ExternalIdentityConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): ExternalIdentityConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ExternalIdentityConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[ExternalIdentityConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
