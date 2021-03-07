package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ProjectColumn
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ProjectColumnResponseProjection extends GraphQLResponseProjection {

    public ProjectColumnResponseProjection() {
    }

    @Override
    public ProjectColumnResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProjectColumnResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectCardConnectionResponseProjection.cards", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectColumnResponseProjection.ProjectCardConnectionResponseProjection.cards", projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectCardConnectionResponseProjection.cards", 0) + 1);
            this.cards(new ProjectCardConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectCardConnectionResponseProjection.cards", 0)));
        }
        this.createdAt();
        this.databaseId();
        this.id();
        this.name();
        if (projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectResponseProjection.project", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectColumnResponseProjection.ProjectResponseProjection.project", projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectResponseProjection.project", 0) + 1);
            this.project(new ProjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectColumnResponseProjection.ProjectResponseProjection.project", 0)));
        }
        this.purpose();
        this.resourcePath();
        this.updatedAt();
        this.url();
        this.typename();
        return this;
    }

    public ProjectColumnResponseProjection cards(ProjectCardConnectionResponseProjection subProjection) {
        return cards((String)null, subProjection);
    }

    public ProjectColumnResponseProjection cards(String alias, ProjectCardConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("cards").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectColumnResponseProjection cards(ProjectColumnCardsParametrizedInput input, ProjectCardConnectionResponseProjection subProjection) {
        return cards(null, input, subProjection);
    }

    public ProjectColumnResponseProjection cards(String alias, ProjectColumnCardsParametrizedInput input, ProjectCardConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("cards").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProjectColumnResponseProjection createdAt() {
        return createdAt(null);
    }

    public ProjectColumnResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ProjectColumnResponseProjection databaseId() {
        return databaseId(null);
    }

    public ProjectColumnResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public ProjectColumnResponseProjection id() {
        return id(null);
    }

    public ProjectColumnResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ProjectColumnResponseProjection name() {
        return name(null);
    }

    public ProjectColumnResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ProjectColumnResponseProjection project(ProjectResponseProjection subProjection) {
        return project(null, subProjection);
    }

    public ProjectColumnResponseProjection project(String alias, ProjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("project").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectColumnResponseProjection purpose() {
        return purpose(null);
    }

    public ProjectColumnResponseProjection purpose(String alias) {
        fields.add(new GraphQLResponseField("purpose").alias(alias));
        return this;
    }

    public ProjectColumnResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public ProjectColumnResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public ProjectColumnResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public ProjectColumnResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public ProjectColumnResponseProjection url() {
        return url(null);
    }

    public ProjectColumnResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public ProjectColumnResponseProjection typename() {
        return typename(null);
    }

    public ProjectColumnResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
