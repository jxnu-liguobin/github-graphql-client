package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for UnlockedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class UnlockedEventResponseProjection extends GraphQLResponseProjection {

    public UnlockedEventResponseProjection() {
    }

    @Override
    public UnlockedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UnlockedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnlockedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.id();
        if (projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.LockableResponseProjection.lockable", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnlockedEventResponseProjection.LockableResponseProjection.lockable", projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.LockableResponseProjection.lockable", 0) + 1);
            this.lockable(new LockableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnlockedEventResponseProjection.LockableResponseProjection.lockable", 0)));
        }
        this.typename();
        return this;
    }

    public UnlockedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public UnlockedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public UnlockedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public UnlockedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public UnlockedEventResponseProjection id() {
        return id(null);
    }

    public UnlockedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UnlockedEventResponseProjection lockable(LockableResponseProjection subProjection) {
        return lockable(null, subProjection);
    }

    public UnlockedEventResponseProjection lockable(String alias, LockableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("lockable").alias(alias).projection(subProjection));
        return this;
    }

    public UnlockedEventResponseProjection typename() {
        return typename(null);
    }

    public UnlockedEventResponseProjection typename(String alias) {
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
        final UnlockedEventResponseProjection that = (UnlockedEventResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
