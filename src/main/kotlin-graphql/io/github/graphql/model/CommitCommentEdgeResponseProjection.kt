package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CommitCommentEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CommitCommentEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CommitCommentEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CommitCommentEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("CommitCommentEdgeResponseProjection.CommitCommentResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["CommitCommentEdgeResponseProjection.CommitCommentResponseProjection.node"] = projectionDepthOnFields.getOrDefault("CommitCommentEdgeResponseProjection.CommitCommentResponseProjection.node", 0) + 1
            this.node(CommitCommentResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentEdgeResponseProjection.CommitCommentResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): CommitCommentEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): CommitCommentEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: CommitCommentResponseProjection): CommitCommentEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: CommitCommentResponseProjection): CommitCommentEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CommitCommentEdgeResponseProjection = typename(null)

    fun typename(alias: String?): CommitCommentEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
