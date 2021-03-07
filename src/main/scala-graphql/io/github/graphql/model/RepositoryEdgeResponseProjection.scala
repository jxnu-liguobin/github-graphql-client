package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RepositoryEdge
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RepositoryEdgeResponseProjection extends GraphQLResponseProjection {

    override def all$(): RepositoryEdgeResponseProjection = all$(3)

    override def all$(maxDepth: Int): RepositoryEdgeResponseProjection = {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryEdgeResponseProjection.RepositoryResponseProjection.node", projectionDepthOnFields.getOrDefault("RepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0) + 1)
            this.node(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryEdgeResponseProjection.RepositoryResponseProjection.node", 0)))
        }
        this.typename()
        this
    }

    def cursor(): RepositoryEdgeResponseProjection = {
        cursor(null.asInstanceOf[String])
    }

    def cursor(alias: String): RepositoryEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("cursor").alias(alias))
        this
    }

    def node(subProjection: RepositoryResponseProjection): RepositoryEdgeResponseProjection = {
        node(null.asInstanceOf[String], subProjection)
    }

    def node(alias: String, subProjection: RepositoryResponseProjection): RepositoryEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("node").alias(alias).projection(subProjection))
        this
    }

    def typename(): RepositoryEdgeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RepositoryEdgeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
