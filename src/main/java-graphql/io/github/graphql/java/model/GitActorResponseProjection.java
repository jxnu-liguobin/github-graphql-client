package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for GitActor
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class GitActorResponseProjection extends GraphQLResponseProjection {

    public GitActorResponseProjection() {
    }

    @Override
    public GitActorResponseProjection all$() {
        return all$(3);
    }

    @Override
    public GitActorResponseProjection all$(int maxDepth) {
        this.avatarUrl();
        this.date();
        this.email();
        this.name();
        if (projectionDepthOnFields.getOrDefault("GitActorResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("GitActorResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("GitActorResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GitActorResponseProjection.UserResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public GitActorResponseProjection avatarUrl() {
        return avatarUrl((String)null);
    }

    public GitActorResponseProjection avatarUrl(String alias) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias));
        return this;
    }

    public GitActorResponseProjection avatarUrl(GitActorAvatarUrlParametrizedInput input) {
        return avatarUrl(null, input);
    }

    public GitActorResponseProjection avatarUrl(String alias, GitActorAvatarUrlParametrizedInput input) {
        fields.add(new GraphQLResponseField("avatarUrl").alias(alias).parameters(input));
        return this;
    }

    public GitActorResponseProjection date() {
        return date(null);
    }

    public GitActorResponseProjection date(String alias) {
        fields.add(new GraphQLResponseField("date").alias(alias));
        return this;
    }

    public GitActorResponseProjection email() {
        return email(null);
    }

    public GitActorResponseProjection email(String alias) {
        fields.add(new GraphQLResponseField("email").alias(alias));
        return this;
    }

    public GitActorResponseProjection name() {
        return name(null);
    }

    public GitActorResponseProjection name(String alias) {
        fields.add(new GraphQLResponseField("name").alias(alias));
        return this;
    }

    public GitActorResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public GitActorResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public GitActorResponseProjection typename() {
        return typename(null);
    }

    public GitActorResponseProjection typename(String alias) {
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
        final GitActorResponseProjection that = (GitActorResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
