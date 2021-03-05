package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for TopicConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class TopicConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): TopicConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): TopicConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["TopicConnectionResponseProjection.TopicEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicEdgeResponseProjection.edges", 0) + 1
            this.edges(TopicEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["TopicConnectionResponseProjection.TopicResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicResponseProjection.nodes", 0) + 1
            this.nodes(TopicResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["TopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: TopicEdgeResponseProjection): TopicConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: TopicEdgeResponseProjection): TopicConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: TopicResponseProjection): TopicConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: TopicResponseProjection): TopicConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): TopicConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): TopicConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): TopicConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): TopicConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): TopicConnectionResponseProjection = typename(null)

    fun typename(alias: String?): TopicConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
