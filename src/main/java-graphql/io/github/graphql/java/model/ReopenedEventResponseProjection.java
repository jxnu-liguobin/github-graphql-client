package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ReopenedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReopenedEventResponseProjection extends GraphQLResponseProjection {

    public ReopenedEventResponseProjection() {
    }

    @Override
    public ReopenedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReopenedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReopenedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ClosableResponseProjection.closable", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReopenedEventResponseProjection.ClosableResponseProjection.closable", projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ClosableResponseProjection.closable", 0) + 1);
            this.closable(new ClosableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReopenedEventResponseProjection.ClosableResponseProjection.closable", 0)));
        }
        this.createdAt();
        this.id();
        this.typename();
        return this;
    }

    public ReopenedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public ReopenedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public ReopenedEventResponseProjection closable(ClosableResponseProjection subProjection) {
        return closable(null, subProjection);
    }

    public ReopenedEventResponseProjection closable(String alias, ClosableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("closable").alias(alias).projection(subProjection));
        return this;
    }

    public ReopenedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public ReopenedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ReopenedEventResponseProjection id() {
        return id(null);
    }

    public ReopenedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ReopenedEventResponseProjection typename() {
        return typename(null);
    }

    public ReopenedEventResponseProjection typename(String alias) {
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
        final ReopenedEventResponseProjection that = (ReopenedEventResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
