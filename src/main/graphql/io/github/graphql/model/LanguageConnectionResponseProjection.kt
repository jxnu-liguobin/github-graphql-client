package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for LanguageConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class LanguageConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): LanguageConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): LanguageConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["LanguageConnectionResponseProjection.LanguageEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageEdgeResponseProjection.edges", 0) + 1
            this.edges(LanguageEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["LanguageConnectionResponseProjection.LanguageResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageResponseProjection.nodes", 0) + 1
            this.nodes(LanguageResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.LanguageResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["LanguageConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("LanguageConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.totalSize()
        this.typename()
        return this
    }

    fun edges(subProjection: LanguageEdgeResponseProjection): LanguageConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: LanguageEdgeResponseProjection): LanguageConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: LanguageResponseProjection): LanguageConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: LanguageResponseProjection): LanguageConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): LanguageConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): LanguageConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): LanguageConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): LanguageConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun totalSize(): LanguageConnectionResponseProjection = totalSize(null)

    fun totalSize(alias: String?): LanguageConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalSize").alias(alias))
        return this
    }

    fun typename(): LanguageConnectionResponseProjection = typename(null)

    fun typename(alias: String?): LanguageConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
