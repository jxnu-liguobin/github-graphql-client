package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for UnlabeledEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class UnlabeledEventResponseProjection extends GraphQLResponseProjection {

    public UnlabeledEventResponseProjection() {
    }

    @Override
    public UnlabeledEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public UnlabeledEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnlabeledEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.id();
        if (projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelResponseProjection.label", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnlabeledEventResponseProjection.LabelResponseProjection.label", projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelResponseProjection.label", 0) + 1);
            this.label(new LabelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelResponseProjection.label", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelableResponseProjection.labelable", 0) <= maxDepth) {
            projectionDepthOnFields.put("UnlabeledEventResponseProjection.LabelableResponseProjection.labelable", projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelableResponseProjection.labelable", 0) + 1);
            this.labelable(new LabelableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("UnlabeledEventResponseProjection.LabelableResponseProjection.labelable", 0)));
        }
        this.typename();
        return this;
    }

    public UnlabeledEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public UnlabeledEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public UnlabeledEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public UnlabeledEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public UnlabeledEventResponseProjection id() {
        return id(null);
    }

    public UnlabeledEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public UnlabeledEventResponseProjection label(LabelResponseProjection subProjection) {
        return label(null, subProjection);
    }

    public UnlabeledEventResponseProjection label(String alias, LabelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("label").alias(alias).projection(subProjection));
        return this;
    }

    public UnlabeledEventResponseProjection labelable(LabelableResponseProjection subProjection) {
        return labelable(null, subProjection);
    }

    public UnlabeledEventResponseProjection labelable(String alias, LabelableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("labelable").alias(alias).projection(subProjection));
        return this;
    }

    public UnlabeledEventResponseProjection typename() {
        return typename(null);
    }

    public UnlabeledEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
