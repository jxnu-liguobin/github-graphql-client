package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CommitConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class CommitConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CommitConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CommitConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["CommitConnectionResponseProjection.CommitEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0) + 1
            this.edges(CommitEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["CommitConnectionResponseProjection.CommitResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitResponseProjection.nodes", 0) + 1
            this.nodes(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.CommitResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["CommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: CommitEdgeResponseProjection): CommitConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: CommitEdgeResponseProjection): CommitConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: CommitResponseProjection): CommitConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: CommitResponseProjection): CommitConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): CommitConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): CommitConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): CommitConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): CommitConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): CommitConnectionResponseProjection = typename(null)

    fun typename(alias: String?): CommitConnectionResponseProjection {
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
        val that = other as CommitConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
