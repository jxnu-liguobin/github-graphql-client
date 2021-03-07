package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CreatedRepositoryContributionConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CreatedRepositoryContributionConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreatedRepositoryContributionConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreatedRepositoryContributionConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionEdgeResponseProjection.edges", 0) + 1)
            this.edges(new CreatedRepositoryContributionEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionResponseProjection.nodes", projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionResponseProjection.nodes", 0) + 1)
            this.nodes(new CreatedRepositoryContributionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.CreatedRepositoryContributionResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("CreatedRepositoryContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CreatedRepositoryContributionConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: CreatedRepositoryContributionEdgeResponseProjection): CreatedRepositoryContributionConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: CreatedRepositoryContributionEdgeResponseProjection): CreatedRepositoryContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: CreatedRepositoryContributionResponseProjection): CreatedRepositoryContributionConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: CreatedRepositoryContributionResponseProjection): CreatedRepositoryContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): CreatedRepositoryContributionConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): CreatedRepositoryContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): CreatedRepositoryContributionConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): CreatedRepositoryContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): CreatedRepositoryContributionConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreatedRepositoryContributionConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
