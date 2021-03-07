package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CommitCommentEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CommitCommentEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): CommitCommentEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): CommitCommentEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("CommitCommentEdgeResponseProjection.CommitCommentResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentEdgeResponseProjection.CommitCommentResponseProjection.node", projectionDepthOnFields.getOrDefault("CommitCommentEdgeResponseProjection.CommitCommentResponseProjection.node", 0) + 1)
            this.node(new CommitCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentEdgeResponseProjection.CommitCommentResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): CommitCommentEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): CommitCommentEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: CommitCommentResponseProjection): CommitCommentEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: CommitCommentResponseProjection): CommitCommentEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): CommitCommentEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CommitCommentEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
