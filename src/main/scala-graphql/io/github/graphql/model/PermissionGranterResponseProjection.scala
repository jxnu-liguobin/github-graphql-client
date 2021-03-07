package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PermissionGranter
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class PermissionGranterResponseProjection extends GraphQLResponseProjection {

    override def all$(): PermissionGranterResponseProjection = all$(3)

    override def all$(maxDepth: Int): PermissionGranterResponseProjection = {
        this.typename()
        this
    }

    def onRepository(subProjection: RepositoryResponseProjection): PermissionGranterResponseProjection = {
        onRepository(null.asInstanceOf[String], subProjection)
    }

    def onRepository(alias: String, subProjection: RepositoryResponseProjection): PermissionGranterResponseProjection = {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        this
    }

    def onOrganization(subProjection: OrganizationResponseProjection): PermissionGranterResponseProjection = {
        onOrganization(null.asInstanceOf[String], subProjection)
    }

    def onOrganization(alias: String, subProjection: OrganizationResponseProjection): PermissionGranterResponseProjection = {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        this
    }

    def onTeam(subProjection: TeamResponseProjection): PermissionGranterResponseProjection = {
        onTeam(null.asInstanceOf[String], subProjection)
    }

    def onTeam(alias: String, subProjection: TeamResponseProjection): PermissionGranterResponseProjection = {
        fields.add(new GraphQLResponseField("...on Team").alias(alias).projection(subProjection))
        this
    }

    def typename(): PermissionGranterResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PermissionGranterResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}