package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RegistryPackageTagConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RegistryPackageTagConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RegistryPackageTagConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RegistryPackageTagConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageTagConnectionResponseProjection.RegistryPackageTagEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagEdgeResponseProjection.edges", 0) + 1
            this.edges(RegistryPackageTagEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageTagConnectionResponseProjection.RegistryPackageTagResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagResponseProjection.nodes", 0) + 1
            this.nodes(RegistryPackageTagResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.RegistryPackageTagResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["RegistryPackageTagConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RegistryPackageTagConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: RegistryPackageTagEdgeResponseProjection): RegistryPackageTagConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: RegistryPackageTagEdgeResponseProjection): RegistryPackageTagConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: RegistryPackageTagResponseProjection): RegistryPackageTagConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: RegistryPackageTagResponseProjection): RegistryPackageTagConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): RegistryPackageTagConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): RegistryPackageTagConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): RegistryPackageTagConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): RegistryPackageTagConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): RegistryPackageTagConnectionResponseProjection = typename(null)

    fun typename(alias: String?): RegistryPackageTagConnectionResponseProjection {
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
        val that = other as RegistryPackageTagConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
