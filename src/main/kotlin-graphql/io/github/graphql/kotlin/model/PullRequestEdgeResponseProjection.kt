package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PullRequestEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PullRequestEdgeResponseProjection.PullRequestResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestEdgeResponseProjection.PullRequestResponseProjection.node"] = projectionDepthOnFields.getOrDefault("PullRequestEdgeResponseProjection.PullRequestResponseProjection.node", 0) + 1
            this.node(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestEdgeResponseProjection.PullRequestResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): PullRequestEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): PullRequestEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: PullRequestResponseProjection): PullRequestEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: PullRequestResponseProjection): PullRequestEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PullRequestEdgeResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestEdgeResponseProjection {
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
        val that = other as PullRequestEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
