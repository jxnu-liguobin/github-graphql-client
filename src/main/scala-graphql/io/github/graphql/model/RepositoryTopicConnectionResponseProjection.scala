package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RepositoryTopicConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RepositoryTopicConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): RepositoryTopicConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): RepositoryTopicConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryTopicConnectionResponseProjection.RepositoryTopicEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicEdgeResponseProjection.edges", 0) + 1)
            this.edges(new RepositoryTopicEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryTopicConnectionResponseProjection.RepositoryTopicResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicResponseProjection.nodes", 0) + 1)
            this.nodes(new RepositoryTopicResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.RepositoryTopicResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryTopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryTopicConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        this
    }

    def edges(subProjection: RepositoryTopicEdgeResponseProjection): RepositoryTopicConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: RepositoryTopicEdgeResponseProjection): RepositoryTopicConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: RepositoryTopicResponseProjection): RepositoryTopicConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: RepositoryTopicResponseProjection): RepositoryTopicConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): RepositoryTopicConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): RepositoryTopicConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): RepositoryTopicConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): RepositoryTopicConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def typename(): RepositoryTopicConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RepositoryTopicConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
