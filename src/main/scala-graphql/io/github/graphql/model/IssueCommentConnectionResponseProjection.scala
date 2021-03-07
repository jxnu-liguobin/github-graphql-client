package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueCommentConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class IssueCommentConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): IssueCommentConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): IssueCommentConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueCommentConnectionResponseProjection.IssueCommentEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentEdgeResponseProjection.edges", 0) + 1)
            this.edges(new IssueCommentEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueCommentConnectionResponseProjection.IssueCommentResponseProjection.nodes", projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentResponseProjection.nodes", 0) + 1)
            this.nodes(new IssueCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: IssueCommentEdgeResponseProjection): IssueCommentConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: IssueCommentEdgeResponseProjection): IssueCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: IssueCommentResponseProjection): IssueCommentConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: IssueCommentResponseProjection): IssueCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): IssueCommentConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): IssueCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): IssueCommentConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): IssueCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): IssueCommentConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): IssueCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
