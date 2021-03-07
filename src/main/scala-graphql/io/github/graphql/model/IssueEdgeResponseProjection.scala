package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class IssueEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): IssueEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): IssueEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("IssueEdgeResponseProjection.IssueResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueEdgeResponseProjection.IssueResponseProjection.node", projectionDepthOnFields.getOrDefault("IssueEdgeResponseProjection.IssueResponseProjection.node", 0) + 1)
            this.node(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueEdgeResponseProjection.IssueResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): IssueEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): IssueEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: IssueResponseProjection): IssueEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: IssueResponseProjection): IssueEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): IssueEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): IssueEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
