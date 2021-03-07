package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ExternalIdentityEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ExternalIdentityEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): ExternalIdentityEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): ExternalIdentityEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ExternalIdentityEdgeResponseProjection.ExternalIdentityResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ExternalIdentityEdgeResponseProjection.ExternalIdentityResponseProjection.node", projectionDepthOnFields.getOrDefault("ExternalIdentityEdgeResponseProjection.ExternalIdentityResponseProjection.node", 0) + 1)
            this.node(new ExternalIdentityResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ExternalIdentityEdgeResponseProjection.ExternalIdentityResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): ExternalIdentityEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): ExternalIdentityEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: ExternalIdentityResponseProjection): ExternalIdentityEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: ExternalIdentityResponseProjection): ExternalIdentityEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): ExternalIdentityEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ExternalIdentityEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
