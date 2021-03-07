package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for MilestonedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class MilestonedEventResponseProjection extends GraphQLResponseProjection {

    public MilestonedEventResponseProjection() {
    }

    @Override
    public MilestonedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public MilestonedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestonedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.id();
        this.milestoneTitle();
        if (projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("MilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0) + 1);
            this.subject(new MilestoneItemResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("MilestonedEventResponseProjection.MilestoneItemResponseProjection.subject", 0)));
        }
        this.typename();
        return this;
    }

    public MilestonedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public MilestonedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public MilestonedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public MilestonedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public MilestonedEventResponseProjection id() {
        return id(null);
    }

    public MilestonedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public MilestonedEventResponseProjection milestoneTitle() {
        return milestoneTitle(null);
    }

    public MilestonedEventResponseProjection milestoneTitle(String alias) {
        fields.add(new GraphQLResponseField("milestoneTitle").alias(alias));
        return this;
    }

    public MilestonedEventResponseProjection subject(MilestoneItemResponseProjection subProjection) {
        return subject(null, subProjection);
    }

    public MilestonedEventResponseProjection subject(String alias, MilestoneItemResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection));
        return this;
    }

    public MilestonedEventResponseProjection typename() {
        return typename(null);
    }

    public MilestonedEventResponseProjection typename(String alias) {
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
        final MilestonedEventResponseProjection that = (MilestonedEventResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
