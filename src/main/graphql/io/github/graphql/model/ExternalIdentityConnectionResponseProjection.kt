package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ExternalIdentityConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ExternalIdentityConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ExternalIdentityConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ExternalIdentityConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["ExternalIdentityConnectionResponseProjection.ExternalIdentityEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityEdgeResponseProjection.edges", 0) + 1
            this.edges(ExternalIdentityEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["ExternalIdentityConnectionResponseProjection.ExternalIdentityResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityResponseProjection.nodes", 0) + 1
            this.nodes(ExternalIdentityResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.ExternalIdentityResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["ExternalIdentityConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: ExternalIdentityEdgeResponseProjection): ExternalIdentityConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: ExternalIdentityEdgeResponseProjection): ExternalIdentityConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: ExternalIdentityResponseProjection): ExternalIdentityConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: ExternalIdentityResponseProjection): ExternalIdentityConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): ExternalIdentityConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): ExternalIdentityConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): ExternalIdentityConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): ExternalIdentityConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): ExternalIdentityConnectionResponseProjection = typename(null)

    fun typename(alias: String?): ExternalIdentityConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
