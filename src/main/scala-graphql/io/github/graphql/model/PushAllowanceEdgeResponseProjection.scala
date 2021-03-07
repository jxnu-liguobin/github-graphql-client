package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PushAllowanceEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PushAllowanceEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): PushAllowanceEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): PushAllowanceEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PushAllowanceEdgeResponseProjection.PushAllowanceResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PushAllowanceEdgeResponseProjection.PushAllowanceResponseProjection.node", projectionDepthOnFields.getOrDefault("PushAllowanceEdgeResponseProjection.PushAllowanceResponseProjection.node", 0) + 1)
            this.node(new PushAllowanceResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PushAllowanceEdgeResponseProjection.PushAllowanceResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): PushAllowanceEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): PushAllowanceEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: PushAllowanceResponseProjection): PushAllowanceEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: PushAllowanceResponseProjection): PushAllowanceEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): PushAllowanceEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PushAllowanceEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
