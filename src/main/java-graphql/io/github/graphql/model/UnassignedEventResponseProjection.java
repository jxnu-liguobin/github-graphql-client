package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UnassignedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class UnassignedEventResponseProjection extends GraphQLResponseProjection {

    public UnassignedEventResponseProjection() {
    }

    @Override
    public UnassignedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UnassignedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnassignedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssignableResponseProjection.assignable", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnassignedEventResponseProjection.AssignableResponseProjection.assignable", projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssignableResponseProjection.assignable", 0) + 1);
            this.assignable(new AssignableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssignableResponseProjection.assignable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssigneeResponseProjection.assignee", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnassignedEventResponseProjection.AssigneeResponseProjection.assignee", projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssigneeResponseProjection.assignee", 0) + 1);
            this.assignee(new AssigneeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.AssigneeResponseProjection.assignee", 0)));
        }
        this.createdAt();
        this.id();
        if (projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnassignedEventResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnassignedEventResponseProjection.UserResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public UnassignedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public UnassignedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public UnassignedEventResponseProjection assignable(AssignableResponseProjection subProjection) {
        return assignable(null, subProjection);
    }

    public UnassignedEventResponseProjection assignable(String alias, AssignableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assignable").alias(alias).projection(subProjection));
        return this;
    }

    public UnassignedEventResponseProjection assignee(AssigneeResponseProjection subProjection) {
        return assignee(null, subProjection);
    }

    public UnassignedEventResponseProjection assignee(String alias, AssigneeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assignee").alias(alias).projection(subProjection));
        return this;
    }

    public UnassignedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public UnassignedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public UnassignedEventResponseProjection id() {
        return id(null);
    }

    public UnassignedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    @Deprecated
    public UnassignedEventResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public UnassignedEventResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public UnassignedEventResponseProjection typename() {
        return typename(null);
    }

    public UnassignedEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
