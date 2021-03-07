package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CommitEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class CommitEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): CommitEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): CommitEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("CommitEdgeResponseProjection.CommitResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitEdgeResponseProjection.CommitResponseProjection.node", projectionDepthOnFields.getOrDefault("CommitEdgeResponseProjection.CommitResponseProjection.node", 0) + 1)
            this.node(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitEdgeResponseProjection.CommitResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): CommitEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): CommitEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: CommitResponseProjection): CommitEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: CommitResponseProjection): CommitEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): CommitEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CommitEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
