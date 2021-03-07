package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueCommentEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class IssueCommentEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): IssueCommentEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): IssueCommentEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("IssueCommentEdgeResponseProjection.IssueCommentResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueCommentEdgeResponseProjection.IssueCommentResponseProjection.node", projectionDepthOnFields.getOrDefault("IssueCommentEdgeResponseProjection.IssueCommentResponseProjection.node", 0) + 1)
            this.node(new IssueCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentEdgeResponseProjection.IssueCommentResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): IssueCommentEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): IssueCommentEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: IssueCommentResponseProjection): IssueCommentEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: IssueCommentResponseProjection): IssueCommentEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): IssueCommentEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): IssueCommentEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
