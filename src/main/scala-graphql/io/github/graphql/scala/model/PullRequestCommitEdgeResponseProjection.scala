package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestCommitEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PullRequestCommitEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestCommitEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestCommitEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitEdgeResponseProjection.PullRequestCommitResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestCommitEdgeResponseProjection.PullRequestCommitResponseProjection.node", projectionDepthOnFields.getOrDefault("PullRequestCommitEdgeResponseProjection.PullRequestCommitResponseProjection.node", 0) + 1)
            this.node(new PullRequestCommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitEdgeResponseProjection.PullRequestCommitResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): PullRequestCommitEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): PullRequestCommitEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: PullRequestCommitResponseProjection): PullRequestCommitEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: PullRequestCommitResponseProjection): PullRequestCommitEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): PullRequestCommitEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestCommitEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[PullRequestCommitEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
