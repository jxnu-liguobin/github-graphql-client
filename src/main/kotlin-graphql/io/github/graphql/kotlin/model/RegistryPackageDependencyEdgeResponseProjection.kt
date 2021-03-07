package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RegistryPackageDependencyEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RegistryPackageDependencyEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageDependencyEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageDependencyEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RegistryPackageDependencyEdgeResponseProjection.RegistryPackageDependencyResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageDependencyEdgeResponseProjection.RegistryPackageDependencyResponseProjection.node"] = projectionDepthOnFields.getOrDefault("RegistryPackageDependencyEdgeResponseProjection.RegistryPackageDependencyResponseProjection.node", 0) + 1
            this.node(RegistryPackageDependencyResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageDependencyEdgeResponseProjection.RegistryPackageDependencyResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): RegistryPackageDependencyEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): RegistryPackageDependencyEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: RegistryPackageDependencyResponseProjection): RegistryPackageDependencyEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: RegistryPackageDependencyResponseProjection): RegistryPackageDependencyEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RegistryPackageDependencyEdgeResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageDependencyEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as RegistryPackageDependencyEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
