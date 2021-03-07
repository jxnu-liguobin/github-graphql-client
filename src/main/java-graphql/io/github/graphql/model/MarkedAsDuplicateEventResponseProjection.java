package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for MarkedAsDuplicateEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class MarkedAsDuplicateEventResponseProjection extends GraphQLResponseProjection {

    public MarkedAsDuplicateEventResponseProjection() {
    }

    @Override
    public MarkedAsDuplicateEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MarkedAsDuplicateEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("MarkedAsDuplicateEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("MarkedAsDuplicateEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("MarkedAsDuplicateEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MarkedAsDuplicateEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.id();
        this.typename();
        return this;
    }

    public MarkedAsDuplicateEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public MarkedAsDuplicateEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public MarkedAsDuplicateEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public MarkedAsDuplicateEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public MarkedAsDuplicateEventResponseProjection id() {
        return id(null);
    }

    public MarkedAsDuplicateEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public MarkedAsDuplicateEventResponseProjection typename() {
        return typename(null);
    }

    public MarkedAsDuplicateEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
