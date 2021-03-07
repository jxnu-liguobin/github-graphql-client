package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UnsubscribedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UnsubscribedEventResponseProjection extends GraphQLResponseProjection {

    public UnsubscribedEventResponseProjection() {
    }

    @Override
    public UnsubscribedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UnsubscribedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnsubscribedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.id();
        if (projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnsubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0) + 1);
            this.subscribable(new SubscribableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnsubscribedEventResponseProjection.SubscribableResponseProjection.subscribable", 0)));
        }
        this.typename();
        return this;
    }

    public UnsubscribedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public UnsubscribedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public UnsubscribedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public UnsubscribedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public UnsubscribedEventResponseProjection id() {
        return id(null);
    }

    public UnsubscribedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UnsubscribedEventResponseProjection subscribable(SubscribableResponseProjection subProjection) {
        return subscribable(null, subProjection);
    }

    public UnsubscribedEventResponseProjection subscribable(String alias, SubscribableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subscribable").alias(alias).projection(subProjection));
        return this;
    }

    public UnsubscribedEventResponseProjection typename() {
        return typename(null);
    }

    public UnsubscribedEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
