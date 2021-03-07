package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for LabelEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class LabelEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): LabelEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): LabelEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("LabelEdgeResponseProjection.LabelResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabelEdgeResponseProjection.LabelResponseProjection.node", projectionDepthOnFields.getOrDefault("LabelEdgeResponseProjection.LabelResponseProjection.node", 0) + 1)
            this.node(new LabelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabelEdgeResponseProjection.LabelResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): LabelEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): LabelEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: LabelResponseProjection): LabelEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: LabelResponseProjection): LabelEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): LabelEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): LabelEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
