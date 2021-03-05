package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageVersionEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RegistryPackageVersionEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageVersionEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageVersionEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageVersionEdgeResponseProjection.RegistryPackageVersionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageVersionEdgeResponseProjection.RegistryPackageVersionResponseProjection.node"] = projectionDepthOnFields.getOrDefault("RegistryPackageVersionEdgeResponseProjection.RegistryPackageVersionResponseProjection.node", 0) + 1
            this.node(RegistryPackageVersionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageVersionEdgeResponseProjection.RegistryPackageVersionResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): RegistryPackageVersionEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): RegistryPackageVersionEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: RegistryPackageVersionResponseProjection): RegistryPackageVersionEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: RegistryPackageVersionResponseProjection): RegistryPackageVersionEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RegistryPackageVersionEdgeResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageVersionEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
