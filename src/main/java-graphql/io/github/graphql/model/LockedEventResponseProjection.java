package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for LockedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class LockedEventResponseProjection extends GraphQLResponseProjection {

    public LockedEventResponseProjection() {
    }

    @Override
    public LockedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LockedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("LockedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.id();
        this.lockReason();
        if (projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.LockableResponseProjection.lockable", 0) <= maxDepth) {
            projectionDepthOnFields.put("LockedEventResponseProjection.LockableResponseProjection.lockable", projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.LockableResponseProjection.lockable", 0) + 1);
            this.lockable(new LockableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LockedEventResponseProjection.LockableResponseProjection.lockable", 0)));
        }
        this.typename();
        return this;
    }

    public LockedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public LockedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public LockedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public LockedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public LockedEventResponseProjection id() {
        return id(null);
    }

    public LockedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public LockedEventResponseProjection lockReason() {
        return lockReason(null);
    }

    public LockedEventResponseProjection lockReason(String alias) {
        fields.add(new GraphQLResponseField("lockReason").alias(alias));
        return this;
    }

    public LockedEventResponseProjection lockable(LockableResponseProjection subProjection) {
        return lockable(null, subProjection);
    }

    public LockedEventResponseProjection lockable(String alias, LockableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("lockable").alias(alias).projection(subProjection));
        return this;
    }

    public LockedEventResponseProjection typename() {
        return typename(null);
    }

    public LockedEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
