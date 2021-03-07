package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for SecurityAdvisoryConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class SecurityAdvisoryConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): SecurityAdvisoryConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): SecurityAdvisoryConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryEdgeResponseProjection.edges", 0) + 1
            this.edges(SecurityAdvisoryEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryResponseProjection.nodes", 0) + 1
            this.nodes(SecurityAdvisoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.SecurityAdvisoryResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["SecurityAdvisoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("SecurityAdvisoryConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: SecurityAdvisoryEdgeResponseProjection): SecurityAdvisoryConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: SecurityAdvisoryEdgeResponseProjection): SecurityAdvisoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: SecurityAdvisoryResponseProjection): SecurityAdvisoryConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: SecurityAdvisoryResponseProjection): SecurityAdvisoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): SecurityAdvisoryConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): SecurityAdvisoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): SecurityAdvisoryConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): SecurityAdvisoryConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): SecurityAdvisoryConnectionResponseProjection = typename(null)

    fun typename(alias: String?): SecurityAdvisoryConnectionResponseProjection {
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
        val that = other as SecurityAdvisoryConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
