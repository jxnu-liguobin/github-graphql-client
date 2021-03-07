package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for LabeledEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class LabeledEventResponseProjection extends GraphQLResponseProjection {

    public LabeledEventResponseProjection() {
    }

    @Override
    public LabeledEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public LabeledEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabeledEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.id();
        if (projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelResponseProjection.label", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabeledEventResponseProjection.LabelResponseProjection.label", projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelResponseProjection.label", 0) + 1);
            this.label(new LabelResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelResponseProjection.label", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelableResponseProjection.labelable", 0) <= maxDepth) {
            projectionDepthOnFields.put("LabeledEventResponseProjection.LabelableResponseProjection.labelable", projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelableResponseProjection.labelable", 0) + 1);
            this.labelable(new LabelableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("LabeledEventResponseProjection.LabelableResponseProjection.labelable", 0)));
        }
        this.typename();
        return this;
    }

    public LabeledEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public LabeledEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public LabeledEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public LabeledEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public LabeledEventResponseProjection id() {
        return id(null);
    }

    public LabeledEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public LabeledEventResponseProjection label(LabelResponseProjection subProjection) {
        return label(null, subProjection);
    }

    public LabeledEventResponseProjection label(String alias, LabelResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("label").alias(alias).projection(subProjection));
        return this;
    }

    public LabeledEventResponseProjection labelable(LabelableResponseProjection subProjection) {
        return labelable(null, subProjection);
    }

    public LabeledEventResponseProjection labelable(String alias, LabelableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("labelable").alias(alias).projection(subProjection));
        return this;
    }

    public LabeledEventResponseProjection typename() {
        return typename(null);
    }

    public LabeledEventResponseProjection typename(String alias) {
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
        final LabeledEventResponseProjection that = (LabeledEventResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
