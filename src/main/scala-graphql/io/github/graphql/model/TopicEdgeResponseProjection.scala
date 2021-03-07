package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for TopicEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class TopicEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): TopicEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): TopicEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("TopicEdgeResponseProjection.TopicResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("TopicEdgeResponseProjection.TopicResponseProjection.node", projectionDepthOnFields.getOrDefault("TopicEdgeResponseProjection.TopicResponseProjection.node", 0) + 1)
            this.node(new TopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TopicEdgeResponseProjection.TopicResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): TopicEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): TopicEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: TopicResponseProjection): TopicEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: TopicResponseProjection): TopicEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): TopicEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): TopicEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
