package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Reaction
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReactionResponseProjection extends GraphQLResponseProjection {

    public ReactionResponseProjection() {
    }

    @Override
    public ReactionResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReactionResponseProjection all$(int maxDepth) {
        this.content();
        this.createdAt();
        this.databaseId();
        this.id();
        if (projectionDepthOnFields.getOrDefault("ReactionResponseProjection.ReactableResponseProjection.reactable", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactionResponseProjection.ReactableResponseProjection.reactable", projectionDepthOnFields.getOrDefault("ReactionResponseProjection.ReactableResponseProjection.reactable", 0) + 1);
            this.reactable(new ReactableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactionResponseProjection.ReactableResponseProjection.reactable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReactionResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactionResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("ReactionResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactionResponseProjection.UserResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public ReactionResponseProjection content() {
        return content(null);
    }

    public ReactionResponseProjection content(String alias) {
        fields.add(new GraphQLResponseField("content").alias(alias));
        return this;
    }

    public ReactionResponseProjection createdAt() {
        return createdAt(null);
    }

    public ReactionResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ReactionResponseProjection databaseId() {
        return databaseId(null);
    }

    public ReactionResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public ReactionResponseProjection id() {
        return id(null);
    }

    public ReactionResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ReactionResponseProjection reactable(ReactableResponseProjection subProjection) {
        return reactable(null, subProjection);
    }

    public ReactionResponseProjection reactable(String alias, ReactableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactable").alias(alias).projection(subProjection));
        return this;
    }

    public ReactionResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public ReactionResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public ReactionResponseProjection typename() {
        return typename(null);
    }

    public ReactionResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
