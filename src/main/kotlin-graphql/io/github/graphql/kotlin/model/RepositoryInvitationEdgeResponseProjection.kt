package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for RepositoryInvitationEdge
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class RepositoryInvitationEdgeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RepositoryInvitationEdgeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RepositoryInvitationEdgeResponseProjection {
        this.cursor()
        if (projectionDepthOnFields.getOrDefault("RepositoryInvitationEdgeResponseProjection.RepositoryInvitationResponseProjection.node", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryInvitationEdgeResponseProjection.RepositoryInvitationResponseProjection.node"] = projectionDepthOnFields.getOrDefault("RepositoryInvitationEdgeResponseProjection.RepositoryInvitationResponseProjection.node", 0) + 1
            this.node(RepositoryInvitationResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryInvitationEdgeResponseProjection.RepositoryInvitationResponseProjection.node", 0)))
        }
        this.typename()
        return this
    }

    fun cursor(): RepositoryInvitationEdgeResponseProjection = cursor(null)

    fun cursor(alias: String?): RepositoryInvitationEdgeResponseProjection {
        fields.add(GraphQLResponseField("cursor").alias(alias))
        return this
    }

    fun node(subProjection: RepositoryInvitationResponseProjection): RepositoryInvitationEdgeResponseProjection = node(null, subProjection)

    fun node(alias: String?, subProjection: RepositoryInvitationResponseProjection): RepositoryInvitationEdgeResponseProjection {
        fields.add(GraphQLResponseField("node").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RepositoryInvitationEdgeResponseProjection = typename(null)

    fun typename(alias: String?): RepositoryInvitationEdgeResponseProjection {
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
        val that = other as RepositoryInvitationEdgeResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
