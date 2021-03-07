package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageDependencyEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RegistryPackageDependencyEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): RegistryPackageDependencyEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): RegistryPackageDependencyEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageDependencyEdgeResponseProjection.RegistryPackageDependencyResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RegistryPackageDependencyEdgeResponseProjection.RegistryPackageDependencyResponseProjection.node", projectionDepthOnFields.getOrDefault("RegistryPackageDependencyEdgeResponseProjection.RegistryPackageDependencyResponseProjection.node", 0) + 1)
            this.node(new RegistryPackageDependencyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageDependencyEdgeResponseProjection.RegistryPackageDependencyResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): RegistryPackageDependencyEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): RegistryPackageDependencyEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: RegistryPackageDependencyResponseProjection): RegistryPackageDependencyEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: RegistryPackageDependencyResponseProjection): RegistryPackageDependencyEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): RegistryPackageDependencyEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RegistryPackageDependencyEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
