package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for UserStatus
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UserStatusResponseProjection extends GraphQLResponseProjection {

    public UserStatusResponseProjection() {
    }

    @Override
    public UserStatusResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserStatusResponseProjection all$(int maxDepth) {
        this.createdAt();
        this.emoji();
        this.emojiHTML();
        this.expiresAt();
        this.id();
        this.indicatesLimitedAvailability();
        this.message();
        if (projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.OrganizationResponseProjection.organization", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserStatusResponseProjection.OrganizationResponseProjection.organization", projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.OrganizationResponseProjection.organization", 0) + 1);
            this.organization(new OrganizationResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.OrganizationResponseProjection.organization", 0)));
        }
        this.updatedAt();
        if (projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserStatusResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserStatusResponseProjection.UserResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public UserStatusResponseProjection createdAt() {
        return createdAt(null);
    }

    public UserStatusResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public UserStatusResponseProjection emoji() {
        return emoji(null);
    }

    public UserStatusResponseProjection emoji(String alias) {
        fields.add(new GraphQLResponseField("emoji").alias(alias));
        return this;
    }

    public UserStatusResponseProjection emojiHTML() {
        return emojiHTML(null);
    }

    public UserStatusResponseProjection emojiHTML(String alias) {
        fields.add(new GraphQLResponseField("emojiHTML").alias(alias));
        return this;
    }

    public UserStatusResponseProjection expiresAt() {
        return expiresAt(null);
    }

    public UserStatusResponseProjection expiresAt(String alias) {
        fields.add(new GraphQLResponseField("expiresAt").alias(alias));
        return this;
    }

    public UserStatusResponseProjection id() {
        return id(null);
    }

    public UserStatusResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UserStatusResponseProjection indicatesLimitedAvailability() {
        return indicatesLimitedAvailability(null);
    }

    public UserStatusResponseProjection indicatesLimitedAvailability(String alias) {
        fields.add(new GraphQLResponseField("indicatesLimitedAvailability").alias(alias));
        return this;
    }

    public UserStatusResponseProjection message() {
        return message(null);
    }

    public UserStatusResponseProjection message(String alias) {
        fields.add(new GraphQLResponseField("message").alias(alias));
        return this;
    }

    public UserStatusResponseProjection organization(OrganizationResponseProjection subProjection) {
        return organization(null, subProjection);
    }

    public UserStatusResponseProjection organization(String alias, OrganizationResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("organization").alias(alias).projection(subProjection));
        return this;
    }

    public UserStatusResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public UserStatusResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public UserStatusResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public UserStatusResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public UserStatusResponseProjection typename() {
        return typename(null);
    }

    public UserStatusResponseProjection typename(String alias) {
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
        final UserStatusResponseProjection that = (UserStatusResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
