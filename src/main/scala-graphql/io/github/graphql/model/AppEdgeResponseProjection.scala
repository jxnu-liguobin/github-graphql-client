package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for AppEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class AppEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): AppEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): AppEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("AppEdgeResponseProjection.AppResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("AppEdgeResponseProjection.AppResponseProjection.node", projectionDepthOnFields.getOrDefault("AppEdgeResponseProjection.AppResponseProjection.node", 0) + 1)
            this.node(new AppResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AppEdgeResponseProjection.AppResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): AppEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): AppEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: AppResponseProjection): AppEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: AppResponseProjection): AppEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): AppEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): AppEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
