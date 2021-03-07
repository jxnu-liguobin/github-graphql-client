package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for StarredRepositoryConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class StarredRepositoryConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): StarredRepositoryConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): StarredRepositoryConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.StarredRepositoryEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["StarredRepositoryConnectionResponseProjection.StarredRepositoryEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.StarredRepositoryEdgeResponseProjection.edges", 0) + 1
            this.edges(StarredRepositoryEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.StarredRepositoryEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["StarredRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0) + 1
            this.nodes(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.RepositoryResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["StarredRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("StarredRepositoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: StarredRepositoryEdgeResponseProjection): StarredRepositoryConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: StarredRepositoryEdgeResponseProjection): StarredRepositoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: RepositoryResponseProjection): StarredRepositoryConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: RepositoryResponseProjection): StarredRepositoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): StarredRepositoryConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): StarredRepositoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): StarredRepositoryConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): StarredRepositoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): StarredRepositoryConnectionResponseProjection = typename(null)

    fun typename(alias: String?): StarredRepositoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as StarredRepositoryConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
