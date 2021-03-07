package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestCommitConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PullRequestCommitConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestCommitConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestCommitConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestCommitConnectionResponseProjection.PullRequestCommitEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitEdgeResponseProjection.edges", 0) + 1
            this.edges(PullRequestCommitEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestCommitConnectionResponseProjection.PullRequestCommitResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitResponseProjection.nodes", 0) + 1
            this.nodes(PullRequestCommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PullRequestCommitResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestCommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: PullRequestCommitEdgeResponseProjection): PullRequestCommitConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: PullRequestCommitEdgeResponseProjection): PullRequestCommitConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: PullRequestCommitResponseProjection): PullRequestCommitConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: PullRequestCommitResponseProjection): PullRequestCommitConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): PullRequestCommitConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): PullRequestCommitConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): PullRequestCommitConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): PullRequestCommitConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): PullRequestCommitConnectionResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestCommitConnectionResponseProjection {
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
        val that = other as PullRequestCommitConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
