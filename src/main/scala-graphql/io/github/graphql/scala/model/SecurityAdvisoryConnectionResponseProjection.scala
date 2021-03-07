package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for SecurityAdvisoryConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class SecurityAdvisoryConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): SecurityAdvisoryConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): SecurityAdvisoryConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryEdgeResponseProjection.edges", 0) + 1)
            this.edges(new SecurityAdvisoryEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryResponseProjection.nodes", projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryResponseProjection.nodes", 0) + 1)
            this.nodes(new SecurityAdvisoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("SecurityAdvisoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: SecurityAdvisoryEdgeResponseProjection): SecurityAdvisoryConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: SecurityAdvisoryEdgeResponseProjection): SecurityAdvisoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: SecurityAdvisoryResponseProjection): SecurityAdvisoryConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: SecurityAdvisoryResponseProjection): SecurityAdvisoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): SecurityAdvisoryConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): SecurityAdvisoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): SecurityAdvisoryConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): SecurityAdvisoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): SecurityAdvisoryConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SecurityAdvisoryConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[SecurityAdvisoryConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
