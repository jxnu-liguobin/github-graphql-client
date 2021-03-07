package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestReviewCommentConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PullRequestReviewCommentConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestReviewCommentConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestReviewCommentConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentEdgeResponseProjection.edges", 0) + 1
            this.edges(PullRequestReviewCommentEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentResponseProjection.nodes", 0) + 1
            this.nodes(PullRequestReviewCommentResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PullRequestReviewCommentResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: PullRequestReviewCommentEdgeResponseProjection): PullRequestReviewCommentConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: PullRequestReviewCommentEdgeResponseProjection): PullRequestReviewCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: PullRequestReviewCommentResponseProjection): PullRequestReviewCommentConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: PullRequestReviewCommentResponseProjection): PullRequestReviewCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): PullRequestReviewCommentConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): PullRequestReviewCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): PullRequestReviewCommentConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): PullRequestReviewCommentConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): PullRequestReviewCommentConnectionResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestReviewCommentConnectionResponseProjection {
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
        val that = other as PullRequestReviewCommentConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
