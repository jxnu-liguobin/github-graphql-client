package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ProjectOwner
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class ProjectOwnerResponseProjection extends GraphQLResponseProjection {

    override def all$(): ProjectOwnerResponseProjection = all$(3)

    override def all$(maxDepth: Int): ProjectOwnerResponseProjection = {
        this.id()
        if (projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectOwnerResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectResponseProjection.project", 0) + 1)
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectResponseProjection.project", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectConnectionResponseProjection.projects", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectOwnerResponseProjection.ProjectConnectionResponseProjection.projects", projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectConnectionResponseProjection.projects", 0) + 1)
            this.projects(new ProjectConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectConnectionResponseProjection.projects", 0)))
        }
        this.projectsResourcePath()
        this.projectsUrl()
        this.viewerCanCreateProjects()
        this.typename()
        this
    }

    def id(): ProjectOwnerResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): ProjectOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def project(subProjection: ProjectResponseProjection): ProjectOwnerResponseProjection = {
        project(null.asInstanceOf[String], subProjection)
    }

    def project(alias: String, subProjection: ProjectResponseProjection): ProjectOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection))
        this
    }

    def project(input: ProjectOwnerProjectParametrizedInput,subProjection: ProjectResponseProjection): ProjectOwnerResponseProjection = {
        project(null.asInstanceOf[String], input, subProjection)
    }

    def project(alias: String, input: ProjectOwnerProjectParametrizedInput , subProjection: ProjectResponseProjection): ProjectOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("project").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def projects(subProjection: ProjectConnectionResponseProjection): ProjectOwnerResponseProjection = {
        projects(null.asInstanceOf[String], subProjection)
    }

    def projects(alias: String, subProjection: ProjectConnectionResponseProjection): ProjectOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("projects").alias(alias).projection(subProjection))
        this
    }

    def projects(input: ProjectOwnerProjectsParametrizedInput,subProjection: ProjectConnectionResponseProjection): ProjectOwnerResponseProjection = {
        projects(null.asInstanceOf[String], input, subProjection)
    }

    def projects(alias: String, input: ProjectOwnerProjectsParametrizedInput , subProjection: ProjectConnectionResponseProjection): ProjectOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("projects").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def projectsResourcePath(): ProjectOwnerResponseProjection = {
        projectsResourcePath(null.asInstanceOf[String])
    }

    def projectsResourcePath(alias: String): ProjectOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("projectsResourcePath").alias(alias))
        this
    }

    def projectsUrl(): ProjectOwnerResponseProjection = {
        projectsUrl(null.asInstanceOf[String])
    }

    def projectsUrl(alias: String): ProjectOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("projectsUrl").alias(alias))
        this
    }

    def viewerCanCreateProjects(): ProjectOwnerResponseProjection = {
        viewerCanCreateProjects(null.asInstanceOf[String])
    }

    def viewerCanCreateProjects(alias: String): ProjectOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanCreateProjects").alias(alias))
        this
    }

    def onRepository(subProjection: RepositoryResponseProjection): ProjectOwnerResponseProjection = {
        onRepository(null.asInstanceOf[String], subProjection)
    }

    def onRepository(alias: String, subProjection: RepositoryResponseProjection): ProjectOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        this
    }

    def onOrganization(subProjection: OrganizationResponseProjection): ProjectOwnerResponseProjection = {
        onOrganization(null.asInstanceOf[String], subProjection)
    }

    def onOrganization(alias: String, subProjection: OrganizationResponseProjection): ProjectOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        this
    }

    def onUser(subProjection: UserResponseProjection): ProjectOwnerResponseProjection = {
        onUser(null.asInstanceOf[String], subProjection)
    }

    def onUser(alias: String, subProjection: UserResponseProjection): ProjectOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        this
    }

    def typename(): ProjectOwnerResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): ProjectOwnerResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
