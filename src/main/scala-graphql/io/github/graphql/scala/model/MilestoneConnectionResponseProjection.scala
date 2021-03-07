package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for MilestoneConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class MilestoneConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): MilestoneConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): MilestoneConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestoneConnectionResponseProjection.MilestoneEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneEdgeResponseProjection.edges", 0) + 1)
            this.edges(new MilestoneEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestoneConnectionResponseProjection.MilestoneResponseProjection.nodes", projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneResponseProjection.nodes", 0) + 1)
            this.nodes(new MilestoneResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.MilestoneResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestoneConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestoneConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: MilestoneEdgeResponseProjection): MilestoneConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: MilestoneEdgeResponseProjection): MilestoneConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: MilestoneResponseProjection): MilestoneConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: MilestoneResponseProjection): MilestoneConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): MilestoneConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): MilestoneConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): MilestoneConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): MilestoneConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): MilestoneConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): MilestoneConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[MilestoneConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
