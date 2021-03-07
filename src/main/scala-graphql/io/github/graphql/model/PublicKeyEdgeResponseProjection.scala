package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PublicKeyEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class PublicKeyEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): PublicKeyEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): PublicKeyEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PublicKeyEdgeResponseProjection.PublicKeyResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PublicKeyEdgeResponseProjection.PublicKeyResponseProjection.node", projectionDepthOnFields.getOrDefault("PublicKeyEdgeResponseProjection.PublicKeyResponseProjection.node", 0) + 1)
            this.node(new PublicKeyResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PublicKeyEdgeResponseProjection.PublicKeyResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): PublicKeyEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): PublicKeyEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: PublicKeyResponseProjection): PublicKeyEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: PublicKeyResponseProjection): PublicKeyEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): PublicKeyEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PublicKeyEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
