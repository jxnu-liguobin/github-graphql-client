package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for Project
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ProjectResponseProjection extends GraphQLResponseProjection {

    public ProjectResponseProjection() {
    }

    @Override
    public ProjectResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ProjectResponseProjection all$(int maxDepth) {
        this.body();
        this.bodyHTML();
        this.closed();
        this.closedAt();
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectColumnConnectionResponseProjection.columns", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectResponseProjection.ProjectColumnConnectionResponseProjection.columns", projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectColumnConnectionResponseProjection.columns", 0) + 1);
            this.columns(new ProjectColumnConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectColumnConnectionResponseProjection.columns", 0)));
        }
        this.createdAt();
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ActorResponseProjection.creator", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectResponseProjection.ActorResponseProjection.creator", projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ActorResponseProjection.creator", 0) + 1);
            this.creator(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ActorResponseProjection.creator", 0)));
        }
        this.databaseId();
        this.id();
        this.name();
        this.number();
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectOwnerResponseProjection.owner", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectResponseProjection.ProjectOwnerResponseProjection.owner", projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectOwnerResponseProjection.owner", 0) + 1);
            this.owner(new ProjectOwnerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectOwnerResponseProjection.owner", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectCardConnectionResponseProjection.pendingCards", 0) <= maxDepth) {
            projectionDepthOnFields.put("ProjectResponseProjection.ProjectCardConnectionResponseProjection.pendingCards", projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectCardConnectionResponseProjection.pendingCards", 0) + 1);
            this.pendingCards(new ProjectCardConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ProjectResponseProjection.ProjectCardConnectionResponseProjection.pendingCards", 0)));
        }
        this.resourcePath();
        this.state();
        this.updatedAt();
        this.url();
        this.viewerCanUpdate();
        this.typename();
        return this;
    }

    public ProjectResponseProjection body() {
        return body(null);
    }

    public ProjectResponseProjection body(String alias) {
        fields.add(new GraphQLResponseField("body").alias(alias));
        return this;
    }

    public ProjectResponseProjection bodyHTML() {
        return bodyHTML(null);
    }

    public ProjectResponseProjection bodyHTML(String alias) {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias));
        return this;
    }

    public ProjectResponseProjection closed() {
        return closed(null);
    }

    public ProjectResponseProjection closed(String alias) {
        fields.add(new GraphQLResponseField("closed").alias(alias));
        return this;
    }

    public ProjectResponseProjection closedAt() {
        return closedAt(null);
    }

    public ProjectResponseProjection closedAt(String alias) {
        fields.add(new GraphQLResponseField("closedAt").alias(alias));
        return this;
    }

    public ProjectResponseProjection columns(ProjectColumnConnectionResponseProjection subProjection) {
        return columns((String)null, subProjection);
    }

    public ProjectResponseProjection columns(String alias, ProjectColumnConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("columns").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection columns(ProjectColumnsParametrizedInput input, ProjectColumnConnectionResponseProjection subProjection) {
        return columns(null, input, subProjection);
    }

    public ProjectResponseProjection columns(String alias, ProjectColumnsParametrizedInput input, ProjectColumnConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("columns").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection createdAt() {
        return createdAt(null);
    }

    public ProjectResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ProjectResponseProjection creator(ActorResponseProjection subProjection) {
        return creator(null, subProjection);
    }

    public ProjectResponseProjection creator(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("creator").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection databaseId() {
        return databaseId(null);
    }

    public ProjectResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public ProjectResponseProjection id() {
        return id(null);
    }

    public ProjectResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ProjectResponseProjection name() {
        return name(null);
    }

    public ProjectResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public ProjectResponseProjection number() {
        return number(null);
    }

    public ProjectResponseProjection number(String alias) {
        fields.add(new GraphQLResponseField("number").alias(alias));
        return this;
    }

    public ProjectResponseProjection owner(ProjectOwnerResponseProjection subProjection) {
        return owner(null, subProjection);
    }

    public ProjectResponseProjection owner(String alias, ProjectOwnerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("owner").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection pendingCards(ProjectCardConnectionResponseProjection subProjection) {
        return pendingCards((String)null, subProjection);
    }

    public ProjectResponseProjection pendingCards(String alias, ProjectCardConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pendingCards").alias(alias).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection pendingCards(ProjectPendingCardsParametrizedInput input, ProjectCardConnectionResponseProjection subProjection) {
        return pendingCards(null, input, subProjection);
    }

    public ProjectResponseProjection pendingCards(String alias, ProjectPendingCardsParametrizedInput input, ProjectCardConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pendingCards").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ProjectResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public ProjectResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public ProjectResponseProjection state() {
        return state(null);
    }

    public ProjectResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public ProjectResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public ProjectResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public ProjectResponseProjection url() {
        return url(null);
    }

    public ProjectResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public ProjectResponseProjection viewerCanUpdate() {
        return viewerCanUpdate(null);
    }

    public ProjectResponseProjection viewerCanUpdate(String alias) {
        fields.add(new GraphQLResponseField("viewerCanUpdate").alias(alias));
        return this;
    }

    public ProjectResponseProjection typename() {
        return typename(null);
    }

    public ProjectResponseProjection typename(String alias) {
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
        final ProjectResponseProjection that = (ProjectResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
