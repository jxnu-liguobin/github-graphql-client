package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for OrganizationMemberConnection
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class OrganizationMemberConnectionResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): OrganizationMemberConnectionResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): OrganizationMemberConnectionResponseProjection {
        if (projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.OrganizationMemberEdgeResponseProjection.edges", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationMemberConnectionResponseProjection.OrganizationMemberEdgeResponseProjection.edges"] = projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.OrganizationMemberEdgeResponseProjection.edges", 0) + 1
            this.edges(OrganizationMemberEdgeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.OrganizationMemberEdgeResponseProjection.edges", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.UserResponseProjection.nodes", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationMemberConnectionResponseProjection.UserResponseProjection.nodes"] = projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.UserResponseProjection.nodes", 0) + 1
            this.nodes(UserResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.UserResponseProjection.nodes", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) <= maxDepth) {
            projectionDepthOnFields["OrganizationMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo"] = projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0) + 1
            this.pageInfo(PageInfoResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("OrganizationMemberConnectionResponseProjection.PageInfoResponseProjection.pageInfo", 0)))
        }
        this.totalCount()
        this.typename()
        return this
    }

    fun edges(subProjection: OrganizationMemberEdgeResponseProjection): OrganizationMemberConnectionResponseProjection = edges(null, subProjection)

    fun edges(alias: String?, subProjection: OrganizationMemberEdgeResponseProjection): OrganizationMemberConnectionResponseProjection {
        fields.add(GraphQLResponseField("edges").alias(alias).projection(subProjection))
        return this
    }

    fun nodes(subProjection: UserResponseProjection): OrganizationMemberConnectionResponseProjection = nodes(null, subProjection)

    fun nodes(alias: String?, subProjection: UserResponseProjection): OrganizationMemberConnectionResponseProjection {
        fields.add(GraphQLResponseField("nodes").alias(alias).projection(subProjection))
        return this
    }

    fun pageInfo(subProjection: PageInfoResponseProjection): OrganizationMemberConnectionResponseProjection = pageInfo(null, subProjection)

    fun pageInfo(alias: String?, subProjection: PageInfoResponseProjection): OrganizationMemberConnectionResponseProjection {
        fields.add(GraphQLResponseField("pageInfo").alias(alias).projection(subProjection))
        return this
    }

    fun totalCount(): OrganizationMemberConnectionResponseProjection = totalCount(null)

    fun totalCount(alias: String?): OrganizationMemberConnectionResponseProjection {
        fields.add(GraphQLResponseField("totalCount").alias(alias))
        return this
    }

    fun typename(): OrganizationMemberConnectionResponseProjection = typename(null)

    fun typename(alias: String?): OrganizationMemberConnectionResponseProjection {
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
        val that = other as OrganizationMemberConnectionResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
