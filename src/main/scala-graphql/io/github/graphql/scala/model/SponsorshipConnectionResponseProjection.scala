package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for SponsorshipConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class SponsorshipConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): SponsorshipConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): SponsorshipConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("SponsorshipConnectionResponseProjection.SponsorshipEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipEdgeResponseProjection.edges", 0) + 1)
            this.edges(new SponsorshipEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("SponsorshipConnectionResponseProjection.SponsorshipResponseProjection.nodes", projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipResponseProjection.nodes", 0) + 1)
            this.nodes(new SponsorshipResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.SponsorshipResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("SponsorshipConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SponsorshipConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: SponsorshipEdgeResponseProjection): SponsorshipConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: SponsorshipEdgeResponseProjection): SponsorshipConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: SponsorshipResponseProjection): SponsorshipConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: SponsorshipResponseProjection): SponsorshipConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): SponsorshipConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): SponsorshipConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): SponsorshipConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): SponsorshipConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): SponsorshipConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SponsorshipConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[SponsorshipConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
