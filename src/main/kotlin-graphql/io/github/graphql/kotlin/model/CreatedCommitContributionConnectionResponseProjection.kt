package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CreatedCommitContributionConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class CreatedCommitContributionConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedCommitContributionConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedCommitContributionConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionEdgeResponseProjection.edges", 0) + 1
            this.edges(CreatedCommitContributionEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionResponseProjection.nodes", 0) + 1
            this.nodes(CreatedCommitContributionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedCommitContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: CreatedCommitContributionEdgeResponseProjection): CreatedCommitContributionConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: CreatedCommitContributionEdgeResponseProjection): CreatedCommitContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: CreatedCommitContributionResponseProjection): CreatedCommitContributionConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: CreatedCommitContributionResponseProjection): CreatedCommitContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): CreatedCommitContributionConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): CreatedCommitContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): CreatedCommitContributionConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): CreatedCommitContributionConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): CreatedCommitContributionConnectionResponseProjection = typename(null)

    fun typename(alias: String?): CreatedCommitContributionConnectionResponseProjection {
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
        val that = other as CreatedCommitContributionConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
