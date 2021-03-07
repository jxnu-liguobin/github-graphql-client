package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for SubscribedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class SubscribedEventResponseProjection extends GraphQLResponseProjection {

    public SubscribedEventResponseProjection() {
    }

    @Override
    public SubscribedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SubscribedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("SubscribedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.id();
        if (projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0) <= maxDepth) {
            projectionDepthOnFields.put("SubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0) + 1);
            this.subscribable(new SubscribableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("SubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0)));
        }
        this.typename();
        return this;
    }

    public SubscribedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public SubscribedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public SubscribedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public SubscribedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public SubscribedEventResponseProjection id() {
        return id(null);
    }

    public SubscribedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SubscribedEventResponseProjection subscribable(SubscribableResponseProjection subProjection) {
        return subscribable(null, subProjection);
    }

    public SubscribedEventResponseProjection subscribable(String alias, SubscribableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subscribable").alias(alias).projection(subProjection));
        return this;
    }

    public SubscribedEventResponseProjection typename() {
        return typename(null);
    }

    public SubscribedEventResponseProjection typename(String alias) {
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
        final SubscribedEventResponseProjection that = (SubscribedEventResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
