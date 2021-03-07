package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestReviewThreadConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PullRequestReviewThreadConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestReviewThreadConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestReviewThreadConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadEdgeResponseProjection.edges", 0) + 1
            this.edges(PullRequestReviewThreadEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadResponseProjection.nodes", 0) + 1
            this.nodes(PullRequestReviewThreadResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PullRequestReviewThreadResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewThreadConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewThreadConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: PullRequestReviewThreadEdgeResponseProjection): PullRequestReviewThreadConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: PullRequestReviewThreadEdgeResponseProjection): PullRequestReviewThreadConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: PullRequestReviewThreadResponseProjection): PullRequestReviewThreadConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: PullRequestReviewThreadResponseProjection): PullRequestReviewThreadConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): PullRequestReviewThreadConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): PullRequestReviewThreadConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): PullRequestReviewThreadConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): PullRequestReviewThreadConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): PullRequestReviewThreadConnectionResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestReviewThreadConnectionResponseProjection {
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
        val that = other as PullRequestReviewThreadConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
