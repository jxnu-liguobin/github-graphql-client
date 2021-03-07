package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RepositoryConnection
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RepositoryConnectionResponseProjection extends GraphQLResponseProjection {

    override def all$(): RepositoryConnectionResponseProjection = all$(3)

    override def all$(maxDepth: Int): RepositoryConnectionResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryConnectionResponseProjection.RepositoryEdgeResponseProjection.edges", projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryEdgeResponseProjection.edges", 0) + 1)
            this.edges(new RepositoryEdgeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0) + 1)
            this.nodes(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1)
            this.pageInfo(new PageInfoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.totalDiskUsage()
        this.typename()
        this
    }

    def edges(subProjection: RepositoryEdgeResponseProjection): RepositoryConnectionResponseProjection = {
        edges(null.asInstanceOf[String], subProjection)
    }

    def edges(alias: String, subProjection: RepositoryEdgeResponseProjection): RepositoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("edges").alias(alias).projection(subProjection))
        this
    }

    def nodes(subProjection: RepositoryResponseProjection): RepositoryConnectionResponseProjection = {
        nodes(null.asInstanceOf[String], subProjection)
    }

    def nodes(alias: String, subProjection: RepositoryResponseProjection): RepositoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        this
    }

    def pageInfo(subProjection: PageInfoResponseProjection): RepositoryConnectionResponseProjection = {
        pageInfo(null.asInstanceOf[String], subProjection)
    }

    def pageInfo(alias: String, subProjection: PageInfoResponseProjection): RepositoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        this
    }

    def totalCount(): RepositoryConnectionResponseProjection = {
        totalCount(null.asInstanceOf[String])
    }

    def totalCount(alias: String): RepositoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalCount").alias(alias))
        this
    }

    def totalDiskUsage(): RepositoryConnectionResponseProjection = {
        totalDiskUsage(null.asInstanceOf[String])
    }

    def totalDiskUsage(alias: String): RepositoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("totalDiskUsage").alias(alias))
        this
    }

    def typename(): RepositoryConnectionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RepositoryConnectionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
