package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PermissionSource
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PermissionSourceResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PermissionSourceResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PermissionSourceResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields["PermissionSourceResponseProjection.OrganizationResponseProjection.organization"] = projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.OrganizationResponseProjection.organization", 0) + 1
            this.organization(OrganizationResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.OrganizationResponseProjection.organization", 0)))
        }
        this.permission()
        if (projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.PermissionGranterResponseProjection.source", 0) <= maxDepth) {
            projectionDepthOnFields["PermissionSourceResponseProjection.PermissionGranterResponseProjection.source"] = projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.PermissionGranterResponseProjection.source", 0) + 1
            this.source(PermissionGranterResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.PermissionGranterResponseProjection.source", 0)))
        }
        this.typename()
        return this
    }

    fun organization(subProjection: OrganizationResponseProjection): PermissionSourceResponseProjection = organization(null, subProjection)

    fun organization(alias: String?, subProjection: OrganizationResponseProjection): PermissionSourceResponseProjection {
        fields.add(GraphQLResponseField("organization").alias(alias).projection(subProjection))
        return this
    }

    fun permission(): PermissionSourceResponseProjection = permission(null)

    fun permission(alias: String?): PermissionSourceResponseProjection {
        fields.add(GraphQLResponseField("permission").alias(alias))
        return this
    }

    fun source(subProjection: PermissionGranterResponseProjection): PermissionSourceResponseProjection = source(null, subProjection)

    fun source(alias: String?, subProjection: PermissionGranterResponseProjection): PermissionSourceResponseProjection {
        fields.add(GraphQLResponseField("source").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PermissionSourceResponseProjection = typename(null)

    fun typename(alias: String?): PermissionSourceResponseProjection {
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
        val that = other as PermissionSourceResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
