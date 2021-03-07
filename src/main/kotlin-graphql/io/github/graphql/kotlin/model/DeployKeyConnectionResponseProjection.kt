package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for DeployKeyConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class DeployKeyConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeployKeyConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeployKeyConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["DeployKeyConnectionResponseProjection.DeployKeyEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyEdgeResponseProjection.edges", 0) + 1
            this.edges(DeployKeyEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["DeployKeyConnectionResponseProjection.DeployKeyResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyResponseProjection.nodes", 0) + 1
            this.nodes(DeployKeyResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.DeployKeyResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["DeployKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("DeployKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: DeployKeyEdgeResponseProjection): DeployKeyConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: DeployKeyEdgeResponseProjection): DeployKeyConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: DeployKeyResponseProjection): DeployKeyConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: DeployKeyResponseProjection): DeployKeyConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): DeployKeyConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): DeployKeyConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): DeployKeyConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): DeployKeyConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): DeployKeyConnectionResponseProjection = typename(null)

    fun typename(alias: String?): DeployKeyConnectionResponseProjection {
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
        val that = other as DeployKeyConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
