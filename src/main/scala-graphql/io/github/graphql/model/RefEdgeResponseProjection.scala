package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RefEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RefEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): RefEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): RefEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RefEdgeResponseProjection.RefResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RefEdgeResponseProjection.RefResponseProjection.node", projectionDepthOnFields.getOrDefault("RefEdgeResponseProjection.RefResponseProjection.node", 0) + 1)
            this.node(new RefResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RefEdgeResponseProjection.RefResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): RefEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): RefEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: RefResponseProjection): RefEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: RefResponseProjection): RefEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): RefEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RefEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
