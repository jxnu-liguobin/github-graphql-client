package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for Bot
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class BotResponseProjection extends GraphQLResponseProjection {

    public BotResponseProjection() {
    }

    @Override
    public BotResponseProjection all$() {
        return all$(3);
    }

    @Override
    public BotResponseProjection all$(int maxDepth) {
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

    public BotResponseProjection avatarUrl() {
        return avatarUrl((String)null);
    }

    public BotResponseProjection avatarUrl(String alias) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias));
        return this;
    }

    public BotResponseProjection avatarUrl(BotAvatarUrlParametrizedInput input) {
        return avatarUrl(null, input);
    }

    public BotResponseProjection avatarUrl(String alias, BotAvatarUrlParametrizedInput input) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input));
        return this;
    }

    public BotResponseProjection createdAt() {
        return createdAt(null);
    }

    public BotResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public BotResponseProjection databaseId() {
        return databaseId(null);
    }

    public BotResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public BotResponseProjection id() {
        return id(null);
    }

    public BotResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public BotResponseProjection login() {
        return login(null);
    }

    public BotResponseProjection login(String alias) {
        fields.add(new GraphQLResponseField("login").alias(alias));
        return this;
    }

    public BotResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public BotResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public BotResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public BotResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public BotResponseProjection url() {
        return url(null);
    }

    public BotResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public BotResponseProjection typename() {
        return typename(null);
    }

    public BotResponseProjection typename(String alias) {
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
        final BotResponseProjection that = (BotResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
