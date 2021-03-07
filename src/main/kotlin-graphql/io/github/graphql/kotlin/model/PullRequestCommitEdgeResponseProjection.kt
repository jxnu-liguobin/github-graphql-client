package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestCommitEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PullRequestCommitEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestCommitEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestCommitEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PullRequestCommitEdgeResponseProjection.PullRequestCommitResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestCommitEdgeResponseProjection.PullRequestCommitResponseProjection.node"] = projectionDepthOnFields.getOrDefault("PullRequestCommitEdgeResponseProjection.PullRequestCommitResponseProjection.node", 0) + 1
            this.node(PullRequestCommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestCommitEdgeResponseProjection.PullRequestCommitResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): PullRequestCommitEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): PullRequestCommitEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: PullRequestCommitResponseProjection): PullRequestCommitEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: PullRequestCommitResponseProjection): PullRequestCommitEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PullRequestCommitEdgeResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestCommitEdgeResponseProjection {
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
        val that = other as PullRequestCommitEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
