package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageVersionConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class RegistryPackageVersionConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): RegistryPackageVersionConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): RegistryPackageVersionConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionEdgeResponseProjection.edges", 0) + 1)
            this.edges(new RegistryPackageVersionEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionResponseProjection.nodes", 0) + 1)
            this.nodes(new RegistryPackageVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.RegistryPackageVersionResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: RegistryPackageVersionEdgeResponseProjection): RegistryPackageVersionConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: RegistryPackageVersionEdgeResponseProjection): RegistryPackageVersionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: RegistryPackageVersionResponseProjection): RegistryPackageVersionConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageVersionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): RegistryPackageVersionConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): RegistryPackageVersionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): RegistryPackageVersionConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): RegistryPackageVersionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): RegistryPackageVersionConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RegistryPackageVersionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
