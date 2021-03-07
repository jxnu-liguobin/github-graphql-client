package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ReviewRequestEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ReviewRequestEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReviewRequestEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReviewRequestEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("ReviewRequestEdgeResponseProjection.ReviewRequestResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewRequestEdgeResponseProjection.ReviewRequestResponseProjection.node", projectionDepthOnFields.getOrDefault("ReviewRequestEdgeResponseProjection.ReviewRequestResponseProjection.node", 0) + 1)
            this.node(new ReviewRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewRequestEdgeResponseProjection.ReviewRequestResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): ReviewRequestEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): ReviewRequestEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: ReviewRequestResponseProjection): ReviewRequestEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: ReviewRequestResponseProjection): ReviewRequestEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): ReviewRequestEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReviewRequestEdgeResponseProjection = {
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
        val that = obj.asInstanceOf[ReviewRequestEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
