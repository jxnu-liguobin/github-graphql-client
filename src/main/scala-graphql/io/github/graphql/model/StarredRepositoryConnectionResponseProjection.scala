package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for StarredRepositoryConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class StarredRepositoryConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): StarredRepositoryConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): StarredRepositoryConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.StarredRepositoryEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("StarredRepositoryConnectionResponseProjection.StarredRepositoryEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.StarredRepositoryEdgeResponseProjection.edges", 0) + 1)
            this.edges(new StarredRepositoryEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.StarredRepositoryEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("StarredRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0) + 1)
            this.nodes(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("StarredRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: StarredRepositoryEdgeResponseProjection): StarredRepositoryConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: StarredRepositoryEdgeResponseProjection): StarredRepositoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: RepositoryResponseProjection): StarredRepositoryConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: RepositoryResponseProjection): StarredRepositoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): StarredRepositoryConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): StarredRepositoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): StarredRepositoryConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): StarredRepositoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): StarredRepositoryConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): StarredRepositoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
