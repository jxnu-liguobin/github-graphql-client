package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Gist
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class GistResponseProjection extends GraphQLResponseProjection {

    public GistResponseProjection() {
    }

    @Override
    public GistResponseProjection all$() {
        return all$(3);
    }

    @Override
    public GistResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("GistResponseProjection.GistCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistResponseProjection.GistCommentConnectionResponseProjection.comments", projectionDepthOnFields.getOrDefault("GistResponseProjection.GistCommentConnectionResponseProjection.comments", 0) + 1);
            this.comments(new GistCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistResponseProjection.GistCommentConnectionResponseProjection.comments", 0)));
        }
        this.createdAt();
        this.description();
        if (projectionDepthOnFields.getOrDefault("GistResponseProjection.GistFileResponseProjection.files", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistResponseProjection.GistFileResponseProjection.files", projectionDepthOnFields.getOrDefault("GistResponseProjection.GistFileResponseProjection.files", 0) + 1);
            this.files(new GistFileResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistResponseProjection.GistFileResponseProjection.files", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GistResponseProjection.GistConnectionResponseProjection.forks", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistResponseProjection.GistConnectionResponseProjection.forks", projectionDepthOnFields.getOrDefault("GistResponseProjection.GistConnectionResponseProjection.forks", 0) + 1);
            this.forks(new GistConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistResponseProjection.GistConnectionResponseProjection.forks", 0)));
        }
        this.id();
        this.isFork();
        this.isPublic();
        this.name();
        if (projectionDepthOnFields.getOrDefault("GistResponseProjection.RepositoryOwnerResponseProjection.owner", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistResponseProjection.RepositoryOwnerResponseProjection.owner", projectionDepthOnFields.getOrDefault("GistResponseProjection.RepositoryOwnerResponseProjection.owner", 0) + 1);
            this.owner(new RepositoryOwnerResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistResponseProjection.RepositoryOwnerResponseProjection.owner", 0)));
        }
        this.pushedAt();
        this.resourcePath();
        if (projectionDepthOnFields.getOrDefault("GistResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistResponseProjection.StargazerConnectionResponseProjection.stargazers", projectionDepthOnFields.getOrDefault("GistResponseProjection.StargazerConnectionResponseProjection.stargazers", 0) + 1);
            this.stargazers(new StargazerConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistResponseProjection.StargazerConnectionResponseProjection.stargazers", 0)));
        }
        this.updatedAt();
        this.url();
        this.viewerHasStarred();
        this.typename();
        return this;
    }

    public GistResponseProjection comments(GistCommentConnectionResponseProjection subProjection) {
        return comments((String)null, subProjection);
    }

    public GistResponseProjection comments(String alias, GistCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection));
        return this;
    }

    public GistResponseProjection comments(GistCommentsParametrizedInput input, GistCommentConnectionResponseProjection subProjection) {
        return comments(null, input, subProjection);
    }

    public GistResponseProjection comments(String alias, GistCommentsParametrizedInput input, GistCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public GistResponseProjection createdAt() {
        return createdAt(null);
    }

    public GistResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public GistResponseProjection description() {
        return description(null);
    }

    public GistResponseProjection description(String alias) {
        fields.add(new GraphQLResponseField("description").alias(alias));
        return this;
    }

    public GistResponseProjection files(GistFileResponseProjection subProjection) {
        return files((String)null, subProjection);
    }

    public GistResponseProjection files(String alias, GistFileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("files").alias(alias).projection(subProjection));
        return this;
    }

    public GistResponseProjection files(GistFilesParametrizedInput input, GistFileResponseProjection subProjection) {
        return files(null, input, subProjection);
    }

    public GistResponseProjection files(String alias, GistFilesParametrizedInput input, GistFileResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("files").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public GistResponseProjection forks(GistConnectionResponseProjection subProjection) {
        return forks((String)null, subProjection);
    }

    public GistResponseProjection forks(String alias, GistConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("forks").alias(alias).projection(subProjection));
        return this;
    }

    public GistResponseProjection forks(GistForksParametrizedInput input, GistConnectionResponseProjection subProjection) {
        return forks(null, input, subProjection);
    }

    public GistResponseProjection forks(String alias, GistForksParametrizedInput input, GistConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("forks").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public GistResponseProjection id() {
        return id(null);
    }

    public GistResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public GistResponseProjection isFork() {
        return isFork(null);
    }

    public GistResponseProjection isFork(String alias) {
        fields.add(new GraphQLResponseField("isFork").alias(alias));
        return this;
    }

    public GistResponseProjection isPublic() {
        return isPublic(null);
    }

    public GistResponseProjection isPublic(String alias) {
        fields.add(new GraphQLResponseField("isPublic").alias(alias));
        return this;
    }

    public GistResponseProjection name() {
        return name(null);
    }

    public GistResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public GistResponseProjection owner(RepositoryOwnerResponseProjection subProjection) {
        return owner(null, subProjection);
    }

    public GistResponseProjection owner(String alias, RepositoryOwnerResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("owner").alias(alias).projection(subProjection));
        return this;
    }

    public GistResponseProjection pushedAt() {
        return pushedAt(null);
    }

    public GistResponseProjection pushedAt(String alias) {
        fields.add(new GraphQLResponseField("pushedAt").alias(alias));
        return this;
    }

    public GistResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public GistResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public GistResponseProjection stargazers(StargazerConnectionResponseProjection subProjection) {
        return stargazers((String)null, subProjection);
    }

    public GistResponseProjection stargazers(String alias, StargazerConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("stargazers").alias(alias).projection(subProjection));
        return this;
    }

    public GistResponseProjection stargazers(GistStargazersParametrizedInput input, StargazerConnectionResponseProjection subProjection) {
        return stargazers(null, input, subProjection);
    }

    public GistResponseProjection stargazers(String alias, GistStargazersParametrizedInput input, StargazerConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("stargazers").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public GistResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public GistResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public GistResponseProjection url() {
        return url(null);
    }

    public GistResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public GistResponseProjection viewerHasStarred() {
        return viewerHasStarred(null);
    }

    public GistResponseProjection viewerHasStarred(String alias) {
        fields.add(new GraphQLResponseField("viewerHasStarred").alias(alias));
        return this;
    }

    public GistResponseProjection typename() {
        return typename(null);
    }

    public GistResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
