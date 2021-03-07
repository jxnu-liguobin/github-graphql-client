package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Mannequin
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class MannequinResponseProjection extends GraphQLResponseProjection {

    public MannequinResponseProjection() {
    }

    @Override
    public MannequinResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MannequinResponseProjection all$(int maxDepth) {
        this.avatarUrl();
        this.createdAt();
        this.databaseId();
        this.id();
        this.login();
        this.resourcePath();
        this.updatedAt();
        this.url();
        this.typename();
        return this;
    }

    public MannequinResponseProjection avatarUrl() {
        return avatarUrl((String)null);
    }

    public MannequinResponseProjection avatarUrl(String alias) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias));
        return this;
    }

    public MannequinResponseProjection avatarUrl(MannequinAvatarUrlParametrizedInput input) {
        return avatarUrl(null, input);
    }

    public MannequinResponseProjection avatarUrl(String alias, MannequinAvatarUrlParametrizedInput input) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input));
        return this;
    }

    public MannequinResponseProjection createdAt() {
        return createdAt(null);
    }

    public MannequinResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public MannequinResponseProjection databaseId() {
        return databaseId(null);
    }

    public MannequinResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public MannequinResponseProjection id() {
        return id(null);
    }

    public MannequinResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public MannequinResponseProjection login() {
        return login(null);
    }

    public MannequinResponseProjection login(String alias) {
        fields.add(new GraphQLResponseField("login").alias(alias));
        return this;
    }

    public MannequinResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public MannequinResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public MannequinResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public MannequinResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public MannequinResponseProjection url() {
        return url(null);
    }

    public MannequinResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public MannequinResponseProjection typename() {
        return typename(null);
    }

    public MannequinResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
