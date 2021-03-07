package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageFileEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class RegistryPackageFileEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): RegistryPackageFileEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): RegistryPackageFileEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageFileEdgeResponseProjection.RegistryPackageFileResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageFileEdgeResponseProjection.RegistryPackageFileResponseProjection.node", projectionDepthOnFields.getOrDefault("RegistryPackageFileEdgeResponseProjection.RegistryPackageFileResponseProjection.node", 0) + 1)
            this.node(new RegistryPackageFileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageFileEdgeResponseProjection.RegistryPackageFileResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): RegistryPackageFileEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): RegistryPackageFileEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: RegistryPackageFileResponseProjection): RegistryPackageFileEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: RegistryPackageFileResponseProjection): RegistryPackageFileEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): RegistryPackageFileEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RegistryPackageFileEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
