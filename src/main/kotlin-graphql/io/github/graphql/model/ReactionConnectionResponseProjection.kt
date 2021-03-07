package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReactionConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ReactionConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReactionConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReactionConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["ReactionConnectionResponseProjection.ReactionEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionEdgeResponseProjection.edges", 0) + 1
            this.edges(ReactionEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["ReactionConnectionResponseProjection.ReactionResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionResponseProjection.nodes", 0) + 1
            this.nodes(ReactionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["ReactionConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.viewerHasReacted()
        this.typename()
        return this
    }

    fun edges(subProjection: ReactionEdgeResponseProjection): ReactionConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: ReactionEdgeResponseProjection): ReactionConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: ReactionResponseProjection): ReactionConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: ReactionResponseProjection): ReactionConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): ReactionConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): ReactionConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): ReactionConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): ReactionConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun viewerHasReacted(): ReactionConnectionResponseProjection = viewerHasReacted(null)

    fun viewerHasReacted(alias: String?): ReactionConnectionResponseProjection {
        fields.add(GraphQLResponseField("viewerHasReacted").alias(alias))
        return this
    }

    fun typename(): ReactionConnectionResponseProjection = typename(null)

    fun typename(alias: String?): ReactionConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
