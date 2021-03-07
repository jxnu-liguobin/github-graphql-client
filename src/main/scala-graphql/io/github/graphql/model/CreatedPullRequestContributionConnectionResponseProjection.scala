package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedPullRequestContributionConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class CreatedPullRequestContributionConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreatedPullRequestContributionConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreatedPullRequestContributionConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionEdgeResponseProjection.edges", 0) + 1)
            this.edges(new CreatedPullRequestContributionEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionResponseProjection.nodes", 0) + 1)
            this.nodes(new CreatedPullRequestContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.CreatedPullRequestContributionResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedPullRequestContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedPullRequestContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: CreatedPullRequestContributionEdgeResponseProjection): CreatedPullRequestContributionConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: CreatedPullRequestContributionEdgeResponseProjection): CreatedPullRequestContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: CreatedPullRequestContributionResponseProjection): CreatedPullRequestContributionConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: CreatedPullRequestContributionResponseProjection): CreatedPullRequestContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): CreatedPullRequestContributionConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): CreatedPullRequestContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): CreatedPullRequestContributionConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): CreatedPullRequestContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): CreatedPullRequestContributionConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreatedPullRequestContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
