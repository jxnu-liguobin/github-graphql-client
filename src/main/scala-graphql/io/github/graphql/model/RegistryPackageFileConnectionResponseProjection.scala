package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageFileConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class RegistryPackageFileConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): RegistryPackageFileConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): RegistryPackageFileConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileEdgeResponseProjection.edges", 0) + 1)
            this.edges(new RegistryPackageFileEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileResponseProjection.nodes", 0) + 1)
            this.nodes(new RegistryPackageFileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.RegistryPackageFileResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageFileConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: RegistryPackageFileEdgeResponseProjection): RegistryPackageFileConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: RegistryPackageFileEdgeResponseProjection): RegistryPackageFileConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: RegistryPackageFileResponseProjection): RegistryPackageFileConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: RegistryPackageFileResponseProjection): RegistryPackageFileConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): RegistryPackageFileConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): RegistryPackageFileConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): RegistryPackageFileConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): RegistryPackageFileConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): RegistryPackageFileConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RegistryPackageFileConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
