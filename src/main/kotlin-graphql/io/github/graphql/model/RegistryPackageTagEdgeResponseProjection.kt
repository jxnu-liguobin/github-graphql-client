package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageTagEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class RegistryPackageTagEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageTagEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageTagEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageTagEdgeResponseProjection.RegistryPackageTagResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageTagEdgeResponseProjection.RegistryPackageTagResponseProjection.node"] = projectionDepthOnFields.getOrDefault("RegistryPackageTagEdgeResponseProjection.RegistryPackageTagResponseProjection.node", 0) + 1
            this.node(RegistryPackageTagResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageTagEdgeResponseProjection.RegistryPackageTagResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): RegistryPackageTagEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): RegistryPackageTagEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: RegistryPackageTagResponseProjection): RegistryPackageTagEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: RegistryPackageTagResponseProjection): RegistryPackageTagEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RegistryPackageTagEdgeResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageTagEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
