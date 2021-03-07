package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RegistryPackageConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): RegistryPackageConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): RegistryPackageConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageConnectionResponseProjection.RegistryPackageEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageEdgeResponseProjection.edges", 0) + 1)
            this.edges(new RegistryPackageEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageConnectionResponseProjection.RegistryPackageResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageResponseProjection.nodes", 0) + 1)
            this.nodes(new RegistryPackageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.RegistryPackageResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: RegistryPackageEdgeResponseProjection): RegistryPackageConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: RegistryPackageEdgeResponseProjection): RegistryPackageConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: RegistryPackageResponseProjection): RegistryPackageConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: RegistryPackageResponseProjection): RegistryPackageConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): RegistryPackageConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): RegistryPackageConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): RegistryPackageConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): RegistryPackageConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): RegistryPackageConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RegistryPackageConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
