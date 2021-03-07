package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PullRequestEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PullRequestEdgeResponseProjection.PullRequestResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestEdgeResponseProjection.PullRequestResponseProjection.node", projectionDepthOnFields.getOrDefault("PullRequestEdgeResponseProjection.PullRequestResponseProjection.node", 0) + 1)
            this.node(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestEdgeResponseProjection.PullRequestResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): PullRequestEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): PullRequestEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: PullRequestResponseProjection): PullRequestEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: PullRequestResponseProjection): PullRequestEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): PullRequestEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
