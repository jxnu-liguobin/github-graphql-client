package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestTimelineItemEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PullRequestTimelineItemEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestTimelineItemEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestTimelineItemEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PullRequestTimelineItemEdgeResponseProjection.PullRequestTimelineItemResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestTimelineItemEdgeResponseProjection.PullRequestTimelineItemResponseProjection.node", projectionDepthOnFields.getOrDefault("PullRequestTimelineItemEdgeResponseProjection.PullRequestTimelineItemResponseProjection.node", 0) + 1)
            this.node(new PullRequestTimelineItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestTimelineItemEdgeResponseProjection.PullRequestTimelineItemResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): PullRequestTimelineItemEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): PullRequestTimelineItemEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: PullRequestTimelineItemResponseProjection): PullRequestTimelineItemEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: PullRequestTimelineItemResponseProjection): PullRequestTimelineItemEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): PullRequestTimelineItemEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestTimelineItemEdgeResponseProjection = {
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
        val that = obj.asInstanceOf[PullRequestTimelineItemEdgeResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
