package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CreatedIssueContributionConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class CreatedIssueContributionConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreatedIssueContributionConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreatedIssueContributionConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionEdgeResponseProjection.edges", 0) + 1)
            this.edges(new CreatedIssueContributionEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionResponseProjection.nodes", 0) + 1)
            this.nodes(new CreatedIssueContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.CreatedIssueContributionResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedIssueContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedIssueContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: CreatedIssueContributionEdgeResponseProjection): CreatedIssueContributionConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: CreatedIssueContributionEdgeResponseProjection): CreatedIssueContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: CreatedIssueContributionResponseProjection): CreatedIssueContributionConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: CreatedIssueContributionResponseProjection): CreatedIssueContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): CreatedIssueContributionConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): CreatedIssueContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): CreatedIssueContributionConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): CreatedIssueContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): CreatedIssueContributionConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreatedIssueContributionConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[CreatedIssueContributionConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
