package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageFileEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class RegistryPackageFileEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageFileEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageFileEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageFileEdgeResponseProjection.RegistryPackageFileResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageFileEdgeResponseProjection.RegistryPackageFileResponseProjection.node"] = projectionDepthOnFields.getOrDefault("RegistryPackageFileEdgeResponseProjection.RegistryPackageFileResponseProjection.node", 0) + 1
            this.node(RegistryPackageFileResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageFileEdgeResponseProjection.RegistryPackageFileResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): RegistryPackageFileEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): RegistryPackageFileEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: RegistryPackageFileResponseProjection): RegistryPackageFileEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: RegistryPackageFileResponseProjection): RegistryPackageFileEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RegistryPackageFileEdgeResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageFileEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
