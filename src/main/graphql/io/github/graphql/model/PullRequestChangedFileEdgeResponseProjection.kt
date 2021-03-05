package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestChangedFileEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class PullRequestChangedFileEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestChangedFileEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestChangedFileEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("PullRequestChangedFileEdgeResponseProjection.PullRequestChangedFileResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestChangedFileEdgeResponseProjection.PullRequestChangedFileResponseProjection.node"] = projectionDepthOnFields.getOrDefault("PullRequestChangedFileEdgeResponseProjection.PullRequestChangedFileResponseProjection.node", 0) + 1
            this.node(PullRequestChangedFileResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestChangedFileEdgeResponseProjection.PullRequestChangedFileResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): PullRequestChangedFileEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): PullRequestChangedFileEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: PullRequestChangedFileResponseProjection): PullRequestChangedFileEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: PullRequestChangedFileResponseProjection): PullRequestChangedFileEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PullRequestChangedFileEdgeResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestChangedFileEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
