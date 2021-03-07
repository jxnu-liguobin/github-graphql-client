package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CrossReferencedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CrossReferencedEventResponseProjection extends GraphQLResponseProjection {

    public CrossReferencedEventResponseProjection() {
    }

    @Override
    public CrossReferencedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CrossReferencedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("CrossReferencedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.id();
        this.isCrossRepository();
        this.referencedAt();
        this.resourcePath();
        if (projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.source", 0) <= maxDepth) {
            projectionDepthOnFields.put("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.source", projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.source", 0) + 1);
            this.source(new ReferencedSubjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.source", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.target", 0) <= maxDepth) {
            projectionDepthOnFields.put("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.target", projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.target", 0) + 1);
            this.target(new ReferencedSubjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CrossReferencedEventResponseProjection.ReferencedSubjectResponseProjection.target", 0)));
        }
        this.url();
        this.willCloseTarget();
        this.typename();
        return this;
    }

    public CrossReferencedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public CrossReferencedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public CrossReferencedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public CrossReferencedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public CrossReferencedEventResponseProjection id() {
        return id(null);
    }

    public CrossReferencedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CrossReferencedEventResponseProjection isCrossRepository() {
        return isCrossRepository(null);
    }

    public CrossReferencedEventResponseProjection isCrossRepository(String alias) {
        fields.add(new GraphQLResponseField("isCrossRepository").alias(alias));
        return this;
    }

    public CrossReferencedEventResponseProjection referencedAt() {
        return referencedAt(null);
    }

    public CrossReferencedEventResponseProjection referencedAt(String alias) {
        fields.add(new GraphQLResponseField("referencedAt").alias(alias));
        return this;
    }

    public CrossReferencedEventResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public CrossReferencedEventResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public CrossReferencedEventResponseProjection source(ReferencedSubjectResponseProjection subProjection) {
        return source(null, subProjection);
    }

    public CrossReferencedEventResponseProjection source(String alias, ReferencedSubjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("source").alias(alias).projection(subProjection));
        return this;
    }

    public CrossReferencedEventResponseProjection target(ReferencedSubjectResponseProjection subProjection) {
        return target(null, subProjection);
    }

    public CrossReferencedEventResponseProjection target(String alias, ReferencedSubjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("target").alias(alias).projection(subProjection));
        return this;
    }

    public CrossReferencedEventResponseProjection url() {
        return url(null);
    }

    public CrossReferencedEventResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public CrossReferencedEventResponseProjection willCloseTarget() {
        return willCloseTarget(null);
    }

    public CrossReferencedEventResponseProjection willCloseTarget(String alias) {
        fields.add(new GraphQLResponseField("willCloseTarget").alias(alias));
        return this;
    }

    public CrossReferencedEventResponseProjection typename() {
        return typename(null);
    }

    public CrossReferencedEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
