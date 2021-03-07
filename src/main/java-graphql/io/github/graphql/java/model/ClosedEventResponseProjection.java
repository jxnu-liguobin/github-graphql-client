package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ClosedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ClosedEventResponseProjection extends GraphQLResponseProjection {

    public ClosedEventResponseProjection() {
    }

    @Override
    public ClosedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ClosedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("ClosedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ClosableResponseProjection.closable", 0) <= maxDepth) {
            projectionDepthOnFields.put("ClosedEventResponseProjection.ClosableResponseProjection.closable", projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ClosableResponseProjection.closable", 0) + 1);
            this.closable(new ClosableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.ClosableResponseProjection.closable", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.CloserResponseProjection.closer", 0) <= maxDepth) {
            projectionDepthOnFields.put("ClosedEventResponseProjection.CloserResponseProjection.closer", projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.CloserResponseProjection.closer", 0) + 1);
            this.closer(new CloserResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ClosedEventResponseProjection.CloserResponseProjection.closer", 0)));
        }
        this.createdAt();
        this.id();
        this.resourcePath();
        this.url();
        this.typename();
        return this;
    }

    public ClosedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public ClosedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public ClosedEventResponseProjection closable(ClosableResponseProjection subProjection) {
        return closable(null, subProjection);
    }

    public ClosedEventResponseProjection closable(String alias, ClosableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("closable").alias(alias).projection(subProjection));
        return this;
    }

    public ClosedEventResponseProjection closer(CloserResponseProjection subProjection) {
        return closer(null, subProjection);
    }

    public ClosedEventResponseProjection closer(String alias, CloserResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("closer").alias(alias).projection(subProjection));
        return this;
    }

    public ClosedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public ClosedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ClosedEventResponseProjection id() {
        return id(null);
    }

    public ClosedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ClosedEventResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public ClosedEventResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public ClosedEventResponseProjection url() {
        return url(null);
    }

    public ClosedEventResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public ClosedEventResponseProjection typename() {
        return typename(null);
    }

    public ClosedEventResponseProjection typename(String alias) {
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
        final ClosedEventResponseProjection that = (ClosedEventResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
