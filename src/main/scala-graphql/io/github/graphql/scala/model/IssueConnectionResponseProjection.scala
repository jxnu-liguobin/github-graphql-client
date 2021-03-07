package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for IssueConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class IssueConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): IssueConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): IssueConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueConnectionResponseProjection.IssueEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueEdgeResponseProjection.edges", 0) + 1)
            this.edges(new IssueEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueConnectionResponseProjection.IssueResponseProjection.nodes", projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueResponseProjection.nodes", 0) + 1)
            this.nodes(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.IssueResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: IssueEdgeResponseProjection): IssueConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: IssueEdgeResponseProjection): IssueConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: IssueResponseProjection): IssueConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: IssueResponseProjection): IssueConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): IssueConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): IssueConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): IssueConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): IssueConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): IssueConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): IssueConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[IssueConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
