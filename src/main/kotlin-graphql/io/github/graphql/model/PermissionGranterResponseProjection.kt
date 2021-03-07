package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PermissionGranter
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class PermissionGranterResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PermissionGranterResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PermissionGranterResponseProjection {
        this.typename()
        return this
    }

    fun onRepository(subProjection: RepositoryResponseProjection): PermissionGranterResponseProjection = onRepository(null, subProjection)

    fun onRepository(alias: String?, subProjection: RepositoryResponseProjection): PermissionGranterResponseProjection {
        fields.add(GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        return this
    }

    fun onOrganization(subProjection: OrganizationResponseProjection): PermissionGranterResponseProjection = onOrganization(null, subProjection)

    fun onOrganization(alias: String?, subProjection: OrganizationResponseProjection): PermissionGranterResponseProjection {
        fields.add(GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        return this
    }

    fun onTeam(subProjection: TeamResponseProjection): PermissionGranterResponseProjection = onTeam(null, subProjection)

    fun onTeam(alias: String?, subProjection: TeamResponseProjection): PermissionGranterResponseProjection {
        fields.add(GraphQLResponseField("...on Team").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): PermissionGranterResponseProjection = typename(null)

    fun typename(alias: String?): PermissionGranterResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
