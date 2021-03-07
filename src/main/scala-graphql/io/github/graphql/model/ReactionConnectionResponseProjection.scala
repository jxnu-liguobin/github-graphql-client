package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReactionConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ReactionConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReactionConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReactionConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactionConnectionResponseProjection.ReactionEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionEdgeResponseProjection.edges", 0) + 1)
            this.edges(new ReactionEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactionConnectionResponseProjection.ReactionResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionResponseProjection.nodes", 0) + 1)
            this.nodes(new ReactionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.ReactionResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.viewerHasReacted()
        this.typename()
        this
    }

    def edges(subProjection: ReactionEdgeResponseProjection): ReactionConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: ReactionEdgeResponseProjection): ReactionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: ReactionResponseProjection): ReactionConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: ReactionResponseProjection): ReactionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): ReactionConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): ReactionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): ReactionConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): ReactionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def viewerHasReacted(): ReactionConnectionResponseProjection = {
        viewerHasReacted(null.asInstanceOf[String])
    }

    def viewerHasReacted(alias: String): ReactionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("viewerHasReacted").alias(alias))
        this
    }

    def typename(): ReactionConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReactionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
