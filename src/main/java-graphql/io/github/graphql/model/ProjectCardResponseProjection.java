package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProjectCard
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ProjectCardResponseProjection extends GraphQLResponseProjection {

    public ProjectCardResponseProjection() {
    }

    @Override
    public ProjectCardResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProjectCardResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectColumnResponseProjection.column", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectCardResponseProjection.ProjectColumnResponseProjection.column", projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectColumnResponseProjection.column", 0) + 1);
            this.column(new ProjectColumnResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectColumnResponseProjection.column", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectCardItemResponseProjection.content", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectCardResponseProjection.ProjectCardItemResponseProjection.content", projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectCardItemResponseProjection.content", 0) + 1);
            this.content(new ProjectCardItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectCardItemResponseProjection.content", 0)));
        }
        this.createdAt();
        if (projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectCardResponseProjection.ActorResponseProjection.creator", projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ActorResponseProjection.creator", 0) + 1);
            this.creator(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ActorResponseProjection.creator", 0)));
        }
        this.databaseId();
        this.id();
        this.isArchived();
        this.note();
        if (projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectCardResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectResponseProjection.project", 0) + 1);
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectCardResponseProjection.ProjectResponseProjection.project", 0)));
        }
        this.resourcePath();
        this.state();
        this.updatedAt();
        this.url();
        this.typename();
        return this;
    }

    public ProjectCardResponseProjection column(ProjectColumnResponseProjection subProjection) {
        return column(null, subProjection);
    }

    public ProjectCardResponseProjection column(String alias, ProjectColumnResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("column").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectCardResponseProjection content(ProjectCardItemResponseProjection subProjection) {
        return content(null, subProjection);
    }

    public ProjectCardResponseProjection content(String alias, ProjectCardItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("content").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectCardResponseProjection createdAt() {
        return createdAt(null);
    }

    public ProjectCardResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ProjectCardResponseProjection creator(ActorResponseProjection subProjection) {
        return creator(null, subProjection);
    }

    public ProjectCardResponseProjection creator(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("creator").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectCardResponseProjection databaseId() {
        return databaseId(null);
    }

    public ProjectCardResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public ProjectCardResponseProjection id() {
        return id(null);
    }

    public ProjectCardResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ProjectCardResponseProjection isArchived() {
        return isArchived(null);
    }

    public ProjectCardResponseProjection isArchived(String alias) {
        fields.add(new GraphQLResponseField("isArchived").alias(alias));
        return this;
    }

    public ProjectCardResponseProjection note() {
        return note(null);
    }

    public ProjectCardResponseProjection note(String alias) {
        fields.add(new GraphQLResponseField("note").alias(alias));
        return this;
    }

    public ProjectCardResponseProjection project(ProjectResponseProjection subProjection) {
        return project(null, subProjection);
    }

    public ProjectCardResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectCardResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public ProjectCardResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public ProjectCardResponseProjection state() {
        return state(null);
    }

    public ProjectCardResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public ProjectCardResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public ProjectCardResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public ProjectCardResponseProjection url() {
        return url(null);
    }

    public ProjectCardResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public ProjectCardResponseProjection typename() {
        return typename(null);
    }

    public ProjectCardResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
