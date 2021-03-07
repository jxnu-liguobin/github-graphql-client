package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CommitCommentConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CommitCommentConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CommitCommentConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CommitCommentConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["CommitCommentConnectionResponseProjection.CommitCommentEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentEdgeResponseProjection.edges", 0) + 1
            this.edges(CommitCommentEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["CommitCommentConnectionResponseProjection.CommitCommentResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentResponseProjection.nodes", 0) + 1
            this.nodes(CommitCommentResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.CommitCommentResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["CommitCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: CommitCommentEdgeResponseProjection): CommitCommentConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: CommitCommentEdgeResponseProjection): CommitCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: CommitCommentResponseProjection): CommitCommentConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: CommitCommentResponseProjection): CommitCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): CommitCommentConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): CommitCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): CommitCommentConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): CommitCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): CommitCommentConnectionResponseProjection = typename(null)

    fun typename(alias: String?): CommitCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
