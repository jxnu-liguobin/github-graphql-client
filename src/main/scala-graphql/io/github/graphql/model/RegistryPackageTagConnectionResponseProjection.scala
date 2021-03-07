package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageTagConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RegistryPackageTagConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): RegistryPackageTagConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): RegistryPackageTagConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagEdgeResponseProjection.edges", 0) + 1)
            this.edges(new RegistryPackageTagEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagResponseProjection.nodes", 0) + 1)
            this.nodes(new RegistryPackageTagResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageTagConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: RegistryPackageTagEdgeResponseProjection): RegistryPackageTagConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: RegistryPackageTagEdgeResponseProjection): RegistryPackageTagConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: RegistryPackageTagResponseProjection): RegistryPackageTagConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: RegistryPackageTagResponseProjection): RegistryPackageTagConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): RegistryPackageTagConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): RegistryPackageTagConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): RegistryPackageTagConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): RegistryPackageTagConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): RegistryPackageTagConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RegistryPackageTagConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
