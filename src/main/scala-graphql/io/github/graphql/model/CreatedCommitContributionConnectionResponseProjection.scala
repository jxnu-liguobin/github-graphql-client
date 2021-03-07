package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedCommitContributionConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreatedCommitContributionConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreatedCommitContributionConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreatedCommitContributionConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionEdgeResponseProjection.edges", 0) + 1)
            this.edges(new CreatedCommitContributionEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionResponseProjection.nodes", 0) + 1)
            this.nodes(new CreatedCommitContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.CreatedCommitContributionResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedCommitContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedCommitContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: CreatedCommitContributionEdgeResponseProjection): CreatedCommitContributionConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: CreatedCommitContributionEdgeResponseProjection): CreatedCommitContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: CreatedCommitContributionResponseProjection): CreatedCommitContributionConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: CreatedCommitContributionResponseProjection): CreatedCommitContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): CreatedCommitContributionConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): CreatedCommitContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): CreatedCommitContributionConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): CreatedCommitContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): CreatedCommitContributionConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreatedCommitContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
