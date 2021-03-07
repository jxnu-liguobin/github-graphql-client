package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueCommentEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class IssueCommentEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): IssueCommentEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): IssueCommentEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("IssueCommentEdgeResponseProjection.IssueCommentResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["IssueCommentEdgeResponseProjection.IssueCommentResponseProjection.node"] = projectionDepthOnFields.getOrDefault("IssueCommentEdgeResponseProjection.IssueCommentResponseProjection.node", 0) + 1
            this.node(IssueCommentResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentEdgeResponseProjection.IssueCommentResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): IssueCommentEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): IssueCommentEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: IssueCommentResponseProjection): IssueCommentEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: IssueCommentResponseProjection): IssueCommentEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): IssueCommentEdgeResponseProjection = typename(null)

    fun typename(alias: String?): IssueCommentEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
