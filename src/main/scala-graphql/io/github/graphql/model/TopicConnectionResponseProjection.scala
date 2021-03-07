package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for TopicConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class TopicConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): TopicConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): TopicConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("TopicConnectionResponseProjection.TopicEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicEdgeResponseProjection.edges", 0) + 1)
            this.edges(new TopicEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("TopicConnectionResponseProjection.TopicResponseProjection.nodes", projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicResponseProjection.nodes", 0) + 1)
            this.nodes(new TopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.TopicResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("TopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: TopicEdgeResponseProjection): TopicConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: TopicEdgeResponseProjection): TopicConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: TopicResponseProjection): TopicConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: TopicResponseProjection): TopicConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): TopicConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): TopicConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): TopicConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): TopicConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): TopicConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): TopicConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
