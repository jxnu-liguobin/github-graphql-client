package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for StargazerConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class StargazerConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): StargazerConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): StargazerConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.StargazerEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("StargazerConnectionResponseProjection.StargazerEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.StargazerEdgeResponseProjection.edges", 0) + 1)
            this.edges(new StargazerEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.StargazerEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("StargazerConnectionResponseProjection.UserResponseProjection.nodes", projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1)
            this.nodes(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.UserResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("StargazerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StargazerConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: StargazerEdgeResponseProjection): StargazerConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: StargazerEdgeResponseProjection): StargazerConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: UserResponseProjection): StargazerConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: UserResponseProjection): StargazerConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): StargazerConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): StargazerConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): StargazerConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): StargazerConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): StargazerConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): StargazerConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
