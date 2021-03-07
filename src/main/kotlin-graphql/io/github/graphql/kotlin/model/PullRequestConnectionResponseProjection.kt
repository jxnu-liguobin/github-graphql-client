package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PullRequestConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PullRequestEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestConnectionResponseProjection.PullRequestEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PullRequestEdgeResponseProjection.edges", 0) + 1
            this.edges(PullRequestEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PullRequestEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PullRequestResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestConnectionResponseProjection.PullRequestResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PullRequestResponseProjection.nodes", 0) + 1
            this.nodes(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PullRequestResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: PullRequestEdgeResponseProjection): PullRequestConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: PullRequestEdgeResponseProjection): PullRequestConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: PullRequestResponseProjection): PullRequestConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: PullRequestResponseProjection): PullRequestConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): PullRequestConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): PullRequestConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): PullRequestConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): PullRequestConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): PullRequestConnectionResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestConnectionResponseProjection {
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
        val that = other as PullRequestConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
