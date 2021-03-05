package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PublicKeyConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PublicKeyConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PublicKeyConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PublicKeyConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["PublicKeyConnectionResponseProjection.PublicKeyEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyEdgeResponseProjection.edges", 0) + 1
            this.edges(PublicKeyEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["PublicKeyConnectionResponseProjection.PublicKeyResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyResponseProjection.nodes", 0) + 1
            this.nodes(PublicKeyResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PublicKeyResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["PublicKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PublicKeyConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: PublicKeyEdgeResponseProjection): PublicKeyConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: PublicKeyEdgeResponseProjection): PublicKeyConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: PublicKeyResponseProjection): PublicKeyConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: PublicKeyResponseProjection): PublicKeyConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): PublicKeyConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): PublicKeyConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): PublicKeyConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): PublicKeyConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): PublicKeyConnectionResponseProjection = typename(null)

    fun typename(alias: String?): PublicKeyConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
