package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CommitHistoryConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class CommitHistoryConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CommitHistoryConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CommitHistoryConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["CommitHistoryConnectionResponseProjection.CommitEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0) + 1
            this.edges(CommitEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["CommitHistoryConnectionResponseProjection.CommitResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitResponseProjection.nodes", 0) + 1
            this.nodes(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.CommitResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["CommitHistoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitHistoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: CommitEdgeResponseProjection): CommitHistoryConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: CommitEdgeResponseProjection): CommitHistoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: CommitResponseProjection): CommitHistoryConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: CommitResponseProjection): CommitHistoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): CommitHistoryConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): CommitHistoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): CommitHistoryConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): CommitHistoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): CommitHistoryConnectionResponseProjection = typename(null)

    fun typename(alias: String?): CommitHistoryConnectionResponseProjection {
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
        val that = other as CommitHistoryConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
