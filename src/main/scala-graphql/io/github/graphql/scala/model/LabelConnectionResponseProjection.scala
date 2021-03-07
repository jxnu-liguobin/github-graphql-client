package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for LabelConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class LabelConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): LabelConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): LabelConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabelConnectionResponseProjection.LabelEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelEdgeResponseProjection.edges", 0) + 1)
            this.edges(new LabelEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabelConnectionResponseProjection.LabelResponseProjection.nodes", projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelResponseProjection.nodes", 0) + 1)
            this.nodes(new LabelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.LabelResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabelConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: LabelEdgeResponseProjection): LabelConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: LabelEdgeResponseProjection): LabelConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: LabelResponseProjection): LabelConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: LabelResponseProjection): LabelConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): LabelConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): LabelConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): LabelConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): LabelConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): LabelConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): LabelConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[LabelConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
