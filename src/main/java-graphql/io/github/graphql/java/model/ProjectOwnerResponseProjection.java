package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ProjectOwner
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ProjectOwnerResponseProjection extends GraphQLResponseProjection {

    public ProjectOwnerResponseProjection() {
    }

    @Override
    public ProjectOwnerResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProjectOwnerResponseProjection all$(int maxDepth) {
        this.id();
        if (projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectOwnerResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectResponseProjection.project", 0) + 1);
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectResponseProjection.project", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectConnectionResponseProjection.projects", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectOwnerResponseProjection.ProjectConnectionResponseProjection.projects", projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectConnectionResponseProjection.projects", 0) + 1);
            this.projects(new ProjectConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectOwnerResponseProjection.ProjectConnectionResponseProjection.projects", 0)));
        }
        this.projectsResourcePath();
        this.projectsUrl();
        this.viewerCanCreateProjects();
        this.typename();
        return this;
    }

    public ProjectOwnerResponseProjection id() {
        return id(null);
    }

    public ProjectOwnerResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ProjectOwnerResponseProjection project(ProjectResponseProjection subProjection) {
        return project((String)null, subProjection);
    }

    public ProjectOwnerResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectOwnerResponseProjection project(ProjectOwnerProjectParametrizedInput input, ProjectResponseProjection subProjection) {
        return project(null, input, subProjection);
    }

    public ProjectOwnerResponseProjection project(String alias, ProjectOwnerProjectParametrizedInput input, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProjectOwnerResponseProjection projects(ProjectConnectionResponseProjection subProjection) {
        return projects((String)null, subProjection);
    }

    public ProjectOwnerResponseProjection projects(String alias, ProjectConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projects").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectOwnerResponseProjection projects(ProjectOwnerProjectsParametrizedInput input, ProjectConnectionResponseProjection subProjection) {
        return projects(null, input, subProjection);
    }

    public ProjectOwnerResponseProjection projects(String alias, ProjectOwnerProjectsParametrizedInput input, ProjectConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("projects").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProjectOwnerResponseProjection projectsResourcePath() {
        return projectsResourcePath(null);
    }

    public ProjectOwnerResponseProjection projectsResourcePath(String alias) {
        fields.add(new GraphQLResponseField("projectsResourcePath").alias(alias));
        return this;
    }

    public ProjectOwnerResponseProjection projectsUrl() {
        return projectsUrl(null);
    }

    public ProjectOwnerResponseProjection projectsUrl(String alias) {
        fields.add(new GraphQLResponseField("projectsUrl").alias(alias));
        return this;
    }

    public ProjectOwnerResponseProjection viewerCanCreateProjects() {
        return viewerCanCreateProjects(null);
    }

    public ProjectOwnerResponseProjection viewerCanCreateProjects(String alias) {
        fields.add(new GraphQLResponseField("viewerCanCreateProjects").alias(alias));
        return this;
    }

    public ProjectOwnerResponseProjection onRepository(RepositoryResponseProjection subProjection) {
        return onRepository(null, subProjection);
    }

    public ProjectOwnerResponseProjection onRepository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectOwnerResponseProjection onOrganization(OrganizationResponseProjection subProjection) {
        return onOrganization(null, subProjection);
    }

    public ProjectOwnerResponseProjection onOrganization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectOwnerResponseProjection onUser(UserResponseProjection subProjection) {
        return onUser(null, subProjection);
    }

    public ProjectOwnerResponseProjection onUser(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectOwnerResponseProjection typename() {
        return typename(null);
    }

    public ProjectOwnerResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final ProjectOwnerResponseProjection that = (ProjectOwnerResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
