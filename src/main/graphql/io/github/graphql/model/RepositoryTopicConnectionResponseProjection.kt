package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RepositoryTopicConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RepositoryTopicConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RepositoryTopicConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RepositoryTopicConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryTopicConnectionResponseProjection.RepositoryTopicEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicEdgeResponseProjection.edges", 0) + 1
            this.edges(RepositoryTopicEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryTopicConnectionResponseProjection.RepositoryTopicResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicResponseProjection.nodes", 0) + 1
            this.nodes(RepositoryTopicResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryTopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: RepositoryTopicEdgeResponseProjection): RepositoryTopicConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: RepositoryTopicEdgeResponseProjection): RepositoryTopicConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: RepositoryTopicResponseProjection): RepositoryTopicConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: RepositoryTopicResponseProjection): RepositoryTopicConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): RepositoryTopicConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): RepositoryTopicConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): RepositoryTopicConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): RepositoryTopicConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): RepositoryTopicConnectionResponseProjection = typename(null)

    fun typename(alias: String?): RepositoryTopicConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
