package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class RegistryPackageEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): RegistryPackageEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): RegistryPackageEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageEdgeResponseProjection.RegistryPackageResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageEdgeResponseProjection.RegistryPackageResponseProjection.node", projectionDepthOnFields.getOrDefault("RegistryPackageEdgeResponseProjection.RegistryPackageResponseProjection.node", 0) + 1)
            this.node(new RegistryPackageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageEdgeResponseProjection.RegistryPackageResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): RegistryPackageEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): RegistryPackageEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: RegistryPackageResponseProjection): RegistryPackageEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: RegistryPackageResponseProjection): RegistryPackageEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): RegistryPackageEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RegistryPackageEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
