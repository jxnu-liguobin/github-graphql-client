package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for SecurityAdvisoryEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class SecurityAdvisoryEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): SecurityAdvisoryEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): SecurityAdvisoryEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryEdgeResponseProjection.SecurityAdvisoryResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("SecurityAdvisoryEdgeResponseProjection.SecurityAdvisoryResponseProjection.node", projectionDepthOnFields.getOrDefault("SecurityAdvisoryEdgeResponseProjection.SecurityAdvisoryResponseProjection.node", 0) + 1)
            this.node(new SecurityAdvisoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryEdgeResponseProjection.SecurityAdvisoryResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): SecurityAdvisoryEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): SecurityAdvisoryEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: SecurityAdvisoryResponseProjection): SecurityAdvisoryEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: SecurityAdvisoryResponseProjection): SecurityAdvisoryEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): SecurityAdvisoryEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): SecurityAdvisoryEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
