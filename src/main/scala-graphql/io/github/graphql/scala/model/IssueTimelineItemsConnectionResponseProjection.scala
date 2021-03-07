package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for IssueTimelineItemsConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class IssueTimelineItemsConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): IssueTimelineItemsConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): IssueTimelineItemsConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsEdgeResponseProjection.edges", 0) + 1)
            this.edges(new IssueTimelineItemsEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsEdgeResponseProjection.edges", 0)))
        }
        this.filteredCount()
        if (projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsResponseProjection.nodes", projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsResponseProjection.nodes", 0) + 1)
            this.nodes(new IssueTimelineItemsResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.IssueTimelineItemsResponseProjection.nodes", 0)))
        }
        this.pageCount()
        if (projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueTimelineItemsConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.updatedAt()
        this.typename()
        this
    }

    def edges(subProjection: IssueTimelineItemsEdgeResponseProjection): IssueTimelineItemsConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: IssueTimelineItemsEdgeResponseProjection): IssueTimelineItemsConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def filteredCount(): IssueTimelineItemsConnectionResponseProjection = {
        filteredCount(null.asInstanceOf[String])
    }

    def filteredCount(alias: String): IssueTimelineItemsConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("filteredCount").alias(alias))
        this
    }

    def nodes(subProjection: IssueTimelineItemsResponseProjection): IssueTimelineItemsConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: IssueTimelineItemsResponseProjection): IssueTimelineItemsConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageCount(): IssueTimelineItemsConnectionResponseProjection = {
        pageCount(null.asInstanceOf[String])
    }

    def pageCount(alias: String): IssueTimelineItemsConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageCount").alias(alias))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): IssueTimelineItemsConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): IssueTimelineItemsConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): IssueTimelineItemsConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): IssueTimelineItemsConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def updatedAt(): IssueTimelineItemsConnectionResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): IssueTimelineItemsConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def typename(): IssueTimelineItemsConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): IssueTimelineItemsConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[IssueTimelineItemsConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
