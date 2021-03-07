package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedPullRequestContributionEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class CreatedPullRequestContributionEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CreatedPullRequestContributionEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CreatedPullRequestContributionEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionEdgeResponseProjection.CreatedPullRequestContributionResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["CreatedPullRequestContributionEdgeResponseProjection.CreatedPullRequestContributionResponseProjection.node"] = projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionEdgeResponseProjection.CreatedPullRequestContributionResponseProjection.node", 0) + 1
            this.node(CreatedPullRequestContributionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionEdgeResponseProjection.CreatedPullRequestContributionResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): CreatedPullRequestContributionEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): CreatedPullRequestContributionEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: CreatedPullRequestContributionResponseProjection): CreatedPullRequestContributionEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: CreatedPullRequestContributionResponseProjection): CreatedPullRequestContributionEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CreatedPullRequestContributionEdgeResponseProjection = typename(null)

    fun typename(alias: String?): CreatedPullRequestContributionEdgeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
