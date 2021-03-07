package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PermissionSource
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PermissionSourceResponseProjection extends GraphQLResponseProjection {

    override def all$(): PermissionSourceResponseProjection = all$(3)

    override def all$(maxDepth: Int): PermissionSourceResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields.put("PermissionSourceResponseProjection.OrganizationResponseProjection.organization", projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.OrganizationResponseProjection.organization", 0) + 1)
            this.organization(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.OrganizationResponseProjection.organization", 0)))
        }
        this.permission()
        if (projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.PermissionGranterResponseProjection.source", 0) <= maxDepth) {
            projectionDepthOnFields.put("PermissionSourceResponseProjection.PermissionGranterResponseProjection.source", projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.PermissionGranterResponseProjection.source", 0) + 1)
            this.source(new PermissionGranterResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PermissionSourceResponseProjection.PermissionGranterResponseProjection.source", 0)))
        }
        this.typename()
        this
    }

    def organization(subProjection: OrganizationResponseProjection): PermissionSourceResponseProjection = {
        organization(null.asInstanceOf[String], subProjection)
    }

    def organization(alias: String, subProjection: OrganizationResponseProjection): PermissionSourceResponseProjection = {
        fields.add(new GraphQLResponseField("organization").alias(alias).projection(subProjection))
        this
    }

    def permission(): PermissionSourceResponseProjection = {
        permission(null.asInstanceOf[String])
    }

    def permission(alias: String): PermissionSourceResponseProjection = {
        fields.add(new GraphQLResponseField("permission").alias(alias))
        this
    }

    def source(subProjection: PermissionGranterResponseProjection): PermissionSourceResponseProjection = {
        source(null.asInstanceOf[String], subProjection)
    }

    def source(alias: String, subProjection: PermissionGranterResponseProjection): PermissionSourceResponseProjection = {
        fields.add(new GraphQLResponseField("source").alias(alias).projection(subProjection))
        this
    }

    def typename(): PermissionSourceResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PermissionSourceResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
