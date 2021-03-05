package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RegistryPackageEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageEdgeResponseProjection.RegistryPackageResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageEdgeResponseProjection.RegistryPackageResponseProjection.node"] = projectionDepthOnFields.getOrDefault("RegistryPackageEdgeResponseProjection.RegistryPackageResponseProjection.node", 0) + 1
            this.node(RegistryPackageResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageEdgeResponseProjection.RegistryPackageResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): RegistryPackageEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): RegistryPackageEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: RegistryPackageResponseProjection): RegistryPackageEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: RegistryPackageResponseProjection): RegistryPackageEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RegistryPackageEdgeResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
