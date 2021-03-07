package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestReviewCommentEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class PullRequestReviewCommentEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestReviewCommentEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestReviewCommentEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentEdgeResponseProjection.PullRequestReviewCommentResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentEdgeResponseProjection.PullRequestReviewCommentResponseProjection.node", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentEdgeResponseProjection.PullRequestReviewCommentResponseProjection.node", 0) + 1)
            this.node(new PullRequestReviewCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentEdgeResponseProjection.PullRequestReviewCommentResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): PullRequestReviewCommentEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): PullRequestReviewCommentEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: PullRequestReviewCommentResponseProjection): PullRequestReviewCommentEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: PullRequestReviewCommentResponseProjection): PullRequestReviewCommentEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): PullRequestReviewCommentEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestReviewCommentEdgeResponseProjection = {
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
        val that = obj.asInstanceOf[PullRequestReviewCommentEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
