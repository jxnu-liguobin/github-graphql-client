package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ProjectOwner
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class ProjectOwnerResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ProjectOwnerResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ProjectOwnerResponseProjection {
        this.id()
        if (projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectOwnerResponseProjection.ProjectResponseProjection.project"] = projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectResponseProjection.project", 0) + 1
            this.project(ProjectResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectResponseProjection.project", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectConnectionResponseProjection.projects", 0) <= maxDepth) {
            projectionDepthOnFields["ProjectOwnerResponseProjection.ProjectConnectionResponseProjection.projects"] = projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectConnectionResponseProjection.projects", 0) + 1
            this.projects(ProjectConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectConnectionResponseProjection.projects", 0)))
        }
        this.projectsResourcePath()
        this.projectsUrl()
        this.viewerCanCreateProjects()
        this.typename()
        return this
    }

    fun id(): ProjectOwnerResponseProjection = id(null)

    fun id(alias: String?): ProjectOwnerResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun project(subProjection: ProjectResponseProjection): ProjectOwnerResponseProjection = project(null, subProjection)

    fun project(alias: String?, subProjection: ProjectResponseProjection): ProjectOwnerResponseProjection {
        fields.add(GraphQLResponseField("project").alias(alias).projection(subProjection))
        return this
    }

    fun project(input: ProjectOwnerProjectParametrizedInput, subProjection: ProjectResponseProjection): ProjectOwnerResponseProjection = project(null, input, subProjection)

    fun project(alias: String?, input: ProjectOwnerProjectParametrizedInput, subProjection: ProjectResponseProjection): ProjectOwnerResponseProjection {
        fields.add(GraphQLResponseField("project").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun projects(subProjection: ProjectConnectionResponseProjection): ProjectOwnerResponseProjection = projects(null, subProjection)

    fun projects(alias: String?, subProjection: ProjectConnectionResponseProjection): ProjectOwnerResponseProjection {
        fields.add(GraphQLResponseField("projects").alias(alias).projection(subProjection))
        return this
    }

    fun projects(input: ProjectOwnerProjectsParametrizedInput, subProjection: ProjectConnectionResponseProjection): ProjectOwnerResponseProjection = projects(null, input, subProjection)

    fun projects(alias: String?, input: ProjectOwnerProjectsParametrizedInput, subProjection: ProjectConnectionResponseProjection): ProjectOwnerResponseProjection {
        fields.add(GraphQLResponseField("projects").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun projectsResourcePath(): ProjectOwnerResponseProjection = projectsResourcePath(null)

    fun projectsResourcePath(alias: String?): ProjectOwnerResponseProjection {
        fields.add(GraphQLResponseField("projectsResourcePath").alias(alias))
        return this
    }

    fun projectsUrl(): ProjectOwnerResponseProjection = projectsUrl(null)

    fun projectsUrl(alias: String?): ProjectOwnerResponseProjection {
        fields.add(GraphQLResponseField("projectsUrl").alias(alias))
        return this
    }

    fun viewerCanCreateProjects(): ProjectOwnerResponseProjection = viewerCanCreateProjects(null)

    fun viewerCanCreateProjects(alias: String?): ProjectOwnerResponseProjection {
        fields.add(GraphQLResponseField("viewerCanCreateProjects").alias(alias))
        return this
    }

    fun onRepository(subProjection: RepositoryResponseProjection): ProjectOwnerResponseProjection = onRepository(null, subProjection)

    fun onRepository(alias: String?, subProjection: RepositoryResponseProjection): ProjectOwnerResponseProjection {
        fields.add(GraphQLResponseField("...on Repository").alias(alias).projection(subProjection))
        return this
    }

    fun onOrganization(subProjection: OrganizationResponseProjection): ProjectOwnerResponseProjection = onOrganization(null, subProjection)

    fun onOrganization(alias: String?, subProjection: OrganizationResponseProjection): ProjectOwnerResponseProjection {
        fields.add(GraphQLResponseField("...on Organization").alias(alias).projection(subProjection))
        return this
    }

    fun onUser(subProjection: UserResponseProjection): ProjectOwnerResponseProjection = onUser(null, subProjection)

    fun onUser(alias: String?, subProjection: UserResponseProjection): ProjectOwnerResponseProjection {
        fields.add(GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ProjectOwnerResponseProjection = typename(null)

    fun typename(alias: String?): ProjectOwnerResponseProjection {
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
        val that = other as ProjectOwnerResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
