package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestChangedFileEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PullRequestChangedFileEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestChangedFileEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestChangedFileEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PullRequestChangedFileEdgeResponseProjection.PullRequestChangedFileResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestChangedFileEdgeResponseProjection.PullRequestChangedFileResponseProjection.node", projectionDepthOnFields.getOrDefault("PullRequestChangedFileEdgeResponseProjection.PullRequestChangedFileResponseProjection.node", 0) + 1)
            this.node(new PullRequestChangedFileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestChangedFileEdgeResponseProjection.PullRequestChangedFileResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): PullRequestChangedFileEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): PullRequestChangedFileEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: PullRequestChangedFileResponseProjection): PullRequestChangedFileEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: PullRequestChangedFileResponseProjection): PullRequestChangedFileEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): PullRequestChangedFileEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestChangedFileEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
