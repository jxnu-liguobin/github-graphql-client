package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ReactingUserConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class ReactingUserConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): ReactingUserConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): ReactingUserConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.ReactingUserEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactingUserConnectionResponseProjection.ReactingUserEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.ReactingUserEdgeResponseProjection.edges", 0) + 1)
            this.edges(new ReactingUserEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.ReactingUserEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactingUserConnectionResponseProjection.UserResponseProjection.nodes", projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1)
            this.nodes(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.UserResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactingUserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactingUserConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: ReactingUserEdgeResponseProjection): ReactingUserConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: ReactingUserEdgeResponseProjection): ReactingUserConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: UserResponseProjection): ReactingUserConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: UserResponseProjection): ReactingUserConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): ReactingUserConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): ReactingUserConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): ReactingUserConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): ReactingUserConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): ReactingUserConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ReactingUserConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
