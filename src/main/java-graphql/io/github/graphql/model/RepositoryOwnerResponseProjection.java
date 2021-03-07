package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for RepositoryOwner
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class RepositoryOwnerResponseProjection extends GraphQLResponseProjection {

    public RepositoryOwnerResponseProjection() {
    }

    @Override
    public RepositoryOwnerResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RepositoryOwnerResponseProjection all$(int maxDepth) {
        this.avatarUrl();
        this.id();
        this.login();
        if (projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0) + 1);
            this.pinnedRepositories(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.pinnedRepositories", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.repositories", projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.repositories", 0) + 1);
            this.repositories(new RepositoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryConnectionResponseProjection.repositories", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryOwnerResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryOwnerResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.resourcePath();
        this.url();
        this.typename();
        return this;
    }

    public RepositoryOwnerResponseProjection avatarUrl() {
        return avatarUrl((String)null);
    }

    public RepositoryOwnerResponseProjection avatarUrl(String alias) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias));
        return this;
    }

    public RepositoryOwnerResponseProjection avatarUrl(RepositoryOwnerAvatarUrlParametrizedInput input) {
        return avatarUrl(null, input);
    }

    public RepositoryOwnerResponseProjection avatarUrl(String alias, RepositoryOwnerAvatarUrlParametrizedInput input) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input));
        return this;
    }

    public RepositoryOwnerResponseProjection id() {
        return id(null);
    }

    public RepositoryOwnerResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RepositoryOwnerResponseProjection login() {
        return login(null);
    }

    public RepositoryOwnerResponseProjection login(String alias) {
        fields.add(new GraphQLResponseField("login").alias(alias));
        return this;
    }

    @Deprecated
    public RepositoryOwnerResponseProjection pinnedRepositories(RepositoryConnectionResponseProjection subProjection) {
        return pinnedRepositories((String)null, subProjection);
    }

    public RepositoryOwnerResponseProjection pinnedRepositories(String alias, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnedRepositories").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryOwnerResponseProjection pinnedRepositories(RepositoryOwnerPinnedRepositoriesParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        return pinnedRepositories(null, input, subProjection);
    }

    public RepositoryOwnerResponseProjection pinnedRepositories(String alias, RepositoryOwnerPinnedRepositoriesParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pinnedRepositories").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryOwnerResponseProjection repositories(RepositoryConnectionResponseProjection subProjection) {
        return repositories((String)null, subProjection);
    }

    public RepositoryOwnerResponseProjection repositories(String alias, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repositories").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryOwnerResponseProjection repositories(RepositoryOwnerRepositoriesParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        return repositories(null, input, subProjection);
    }

    public RepositoryOwnerResponseProjection repositories(String alias, RepositoryOwnerRepositoriesParametrizedInput input, RepositoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repositories").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryOwnerResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository((String)null, subProjection);
    }

    public RepositoryOwnerResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryOwnerResponseProjection repository(RepositoryOwnerRepositoryParametrizedInput input, RepositoryResponseProjection subProjection) {
        return repository(null, input, subProjection);
    }

    public RepositoryOwnerResponseProjection repository(String alias, RepositoryOwnerRepositoryParametrizedInput input, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public RepositoryOwnerResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public RepositoryOwnerResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public RepositoryOwnerResponseProjection url() {
        return url(null);
    }

    public RepositoryOwnerResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public RepositoryOwnerResponseProjection onOrganization(OrganizationResponseProjection subProjection) {
        return onOrganization(null, subProjection);
    }

    public RepositoryOwnerResponseProjection onOrganization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Organization").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryOwnerResponseProjection onUser(UserResponseProjection subProjection) {
        return onUser(null, subProjection);
    }

    public RepositoryOwnerResponseProjection onUser(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on User").alias(alias).projection(subProjection));
        return this;
    }

    public RepositoryOwnerResponseProjection typename() {
        return typename(null);
    }

    public RepositoryOwnerResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
