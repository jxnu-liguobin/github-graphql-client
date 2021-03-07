package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for AssignedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class AssignedEventResponseProjection extends GraphQLResponseProjection {

    public AssignedEventResponseProjection() {
    }

    @Override
    public AssignedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public AssignedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("AssignedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssignableResponseProjection.assignable", 0) <= maxDepth) {
            projectionDepthOnFields.put("AssignedEventResponseProjection.AssignableResponseProjection.assignable", projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssignableResponseProjection.assignable", 0) + 1);
            this.assignable(new AssignableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssignableResponseProjection.assignable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssigneeResponseProjection.assignee", 0) <= maxDepth) {
            projectionDepthOnFields.put("AssignedEventResponseProjection.AssigneeResponseProjection.assignee", projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssigneeResponseProjection.assignee", 0) + 1);
            this.assignee(new AssigneeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.AssigneeResponseProjection.assignee", 0)));
        }
        this.createdAt();
        this.id();
        if (projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.UserResponseProjection.user", 0) <= maxDepth) {
            projectionDepthOnFields.put("AssignedEventResponseProjection.UserResponseProjection.user", projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.UserResponseProjection.user", 0) + 1);
            this.user(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("AssignedEventResponseProjection.UserResponseProjection.user", 0)));
        }
        this.typename();
        return this;
    }

    public AssignedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public AssignedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public AssignedEventResponseProjection assignable(AssignableResponseProjection subProjection) {
        return assignable(null, subProjection);
    }

    public AssignedEventResponseProjection assignable(String alias, AssignableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assignable").alias(alias).projection(subProjection));
        return this;
    }

    public AssignedEventResponseProjection assignee(AssigneeResponseProjection subProjection) {
        return assignee(null, subProjection);
    }

    public AssignedEventResponseProjection assignee(String alias, AssigneeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("assignee").alias(alias).projection(subProjection));
        return this;
    }

    public AssignedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public AssignedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public AssignedEventResponseProjection id() {
        return id(null);
    }

    public AssignedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    @Deprecated
    public AssignedEventResponseProjection user(UserResponseProjection subProjection) {
        return user(null, subProjection);
    }

    public AssignedEventResponseProjection user(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("user").alias(alias).projection(subProjection));
        return this;
    }

    public AssignedEventResponseProjection typename() {
        return typename(null);
    }

    public AssignedEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
