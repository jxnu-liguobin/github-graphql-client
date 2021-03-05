package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for TopicEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class TopicEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): TopicEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): TopicEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("TopicEdgeResponseProjection.TopicResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["TopicEdgeResponseProjection.TopicResponseProjection.node"] = projectionDepthOnFields.getOrDefault("TopicEdgeResponseProjection.TopicResponseProjection.node", 0) + 1
            this.node(TopicResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("TopicEdgeResponseProjection.TopicResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): TopicEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): TopicEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: TopicResponseProjection): TopicEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: TopicResponseProjection): TopicEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): TopicEdgeResponseProjection = typename(null)

    fun typename(alias: String?): TopicEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
