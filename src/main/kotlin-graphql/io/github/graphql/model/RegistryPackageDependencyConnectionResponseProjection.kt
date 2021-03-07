package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RegistryPackageDependencyConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class RegistryPackageDependencyConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageDependencyConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageDependencyConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.RegistryPackageDependencyEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageDependencyConnectionResponseProjection.RegistryPackageDependencyEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.RegistryPackageDependencyEdgeResponseProjection.edges", 0) + 1
            this.edges(RegistryPackageDependencyEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.RegistryPackageDependencyEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.RegistryPackageDependencyResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageDependencyConnectionResponseProjection.RegistryPackageDependencyResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.RegistryPackageDependencyResponseProjection.nodes", 0) + 1
            this.nodes(RegistryPackageDependencyResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.RegistryPackageDependencyResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageDependencyConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageDependencyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: RegistryPackageDependencyEdgeResponseProjection): RegistryPackageDependencyConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: RegistryPackageDependencyEdgeResponseProjection): RegistryPackageDependencyConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: RegistryPackageDependencyResponseProjection): RegistryPackageDependencyConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: RegistryPackageDependencyResponseProjection): RegistryPackageDependencyConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): RegistryPackageDependencyConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): RegistryPackageDependencyConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): RegistryPackageDependencyConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): RegistryPackageDependencyConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): RegistryPackageDependencyConnectionResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageDependencyConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
