package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CommitCommentConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class CommitCommentConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): CommitCommentConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): CommitCommentConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentConnectionResponseProjection.CommitCommentEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentEdgeResponseProjection.edges", 0) + 1)
            this.edges(new CommitCommentEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentConnectionResponseProjection.CommitCommentResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentResponseProjection.nodes", 0) + 1)
            this.nodes(new CommitCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: CommitCommentEdgeResponseProjection): CommitCommentConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: CommitCommentEdgeResponseProjection): CommitCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: CommitCommentResponseProjection): CommitCommentConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: CommitCommentResponseProjection): CommitCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): CommitCommentConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): CommitCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): CommitCommentConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): CommitCommentConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): CommitCommentConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CommitCommentConnectionResponseProjection = {
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
        val that = obj.asInstanceOf[CommitCommentConnectionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
