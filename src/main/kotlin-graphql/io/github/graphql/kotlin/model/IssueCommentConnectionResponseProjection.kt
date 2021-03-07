package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for IssueCommentConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class IssueCommentConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): IssueCommentConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): IssueCommentConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["IssueCommentConnectionResponseProjection.IssueCommentEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentEdgeResponseProjection.edges", 0) + 1
            this.edges(IssueCommentEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["IssueCommentConnectionResponseProjection.IssueCommentResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentResponseProjection.nodes", 0) + 1
            this.nodes(IssueCommentResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.IssueCommentResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["IssueCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: IssueCommentEdgeResponseProjection): IssueCommentConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: IssueCommentEdgeResponseProjection): IssueCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: IssueCommentResponseProjection): IssueCommentConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: IssueCommentResponseProjection): IssueCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): IssueCommentConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): IssueCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): IssueCommentConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): IssueCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): IssueCommentConnectionResponseProjection = typename(null)

    fun typename(alias: String?): IssueCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as IssueCommentConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
