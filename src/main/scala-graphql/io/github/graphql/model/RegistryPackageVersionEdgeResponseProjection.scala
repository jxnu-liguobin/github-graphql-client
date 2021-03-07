package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageVersionEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class RegistryPackageVersionEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): RegistryPackageVersionEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): RegistryPackageVersionEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionEdgeResponseProjection.RegistryPackageVersionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageVersionEdgeResponseProjection.RegistryPackageVersionResponseProjection.node", projectionDepthOnFields.getOrDefault("RegistryPackageVersionEdgeResponseProjection.RegistryPackageVersionResponseProjection.node", 0) + 1)
            this.node(new RegistryPackageVersionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionEdgeResponseProjection.RegistryPackageVersionResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): RegistryPackageVersionEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): RegistryPackageVersionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: RegistryPackageVersionResponseProjection): RegistryPackageVersionEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageVersionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): RegistryPackageVersionEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RegistryPackageVersionEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
