package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RefConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class RefConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RefConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RefConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["RefConnectionResponseProjection.RefEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefEdgeResponseProjection.edges", 0) + 1
            this.edges(RefEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["RefConnectionResponseProjection.RefResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefResponseProjection.nodes", 0) + 1
            this.nodes(RefResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.RefResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["RefConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RefConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: RefEdgeResponseProjection): RefConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: RefEdgeResponseProjection): RefConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: RefResponseProjection): RefConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: RefResponseProjection): RefConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): RefConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): RefConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): RefConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): RefConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): RefConnectionResponseProjection = typename(null)

    fun typename(alias: String?): RefConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
