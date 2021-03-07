package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PushAllowanceConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PushAllowanceConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PushAllowanceConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PushAllowanceConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["PushAllowanceConnectionResponseProjection.PushAllowanceEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceEdgeResponseProjection.edges", 0) + 1
            this.edges(PushAllowanceEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["PushAllowanceConnectionResponseProjection.PushAllowanceResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceResponseProjection.nodes", 0) + 1
            this.nodes(PushAllowanceResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PushAllowanceResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["PushAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: PushAllowanceEdgeResponseProjection): PushAllowanceConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: PushAllowanceEdgeResponseProjection): PushAllowanceConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: PushAllowanceResponseProjection): PushAllowanceConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: PushAllowanceResponseProjection): PushAllowanceConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): PushAllowanceConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): PushAllowanceConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): PushAllowanceConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): PushAllowanceConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): PushAllowanceConnectionResponseProjection = typename(null)

    fun typename(alias: String?): PushAllowanceConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
