package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UserBlockedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UserBlockedEventResponseProjection extends GraphQLResponseProjection {

    public UserBlockedEventResponseProjection() {
    }

    @Override
    public UserBlockedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UserBlockedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserBlockedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.blockDuration();
        this.createdAt();
        this.id();
        if (projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.UserResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("UserBlockedEventResponseProjection.UserResponseProjection.subject", projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.UserResponseProjection.subject", 0) + 1);
            this.subject(new UserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UserBlockedEventResponseProjection.UserResponseProjection.subject", 0)));
        }
        this.typename();
        return this;
    }

    public UserBlockedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public UserBlockedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public UserBlockedEventResponseProjection blockDuration() {
        return blockDuration(null);
    }

    public UserBlockedEventResponseProjection blockDuration(String alias) {
        fields.add(new GraphQLResponseField("blockDuration").alias(alias));
        return this;
    }

    public UserBlockedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public UserBlockedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public UserBlockedEventResponseProjection id() {
        return id(null);
    }

    public UserBlockedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UserBlockedEventResponseProjection subject(UserResponseProjection subProjection) {
        return subject(null, subProjection);
    }

    public UserBlockedEventResponseProjection subject(String alias, UserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection));
        return this;
    }

    public UserBlockedEventResponseProjection typename() {
        return typename(null);
    }

    public UserBlockedEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
