package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for StarredRepositoryEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class StarredRepositoryEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): StarredRepositoryEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): StarredRepositoryEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("StarredRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("StarredRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", projectionDepthOnFields.getOrDefault("StarredRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) + 1)
            this.node(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StarredRepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0)))
        }
        this.starredAt()
        this.typename()
        this
    }

    def cursor(): StarredRepositoryEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): StarredRepositoryEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: RepositoryResponseProjection): StarredRepositoryEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: RepositoryResponseProjection): StarredRepositoryEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def starredAt(): StarredRepositoryEdgeResponseProjection = {
        starredAt(null.asInstanceOf[String])
    }

    def starredAt(alias: String): StarredRepositoryEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("starredAt").alias(alias))
        this
    }

    def typename(): StarredRepositoryEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): StarredRepositoryEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
