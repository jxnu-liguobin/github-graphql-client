package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ReferencedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReferencedEventResponseProjection extends GraphQLResponseProjection {

    public ReferencedEventResponseProjection() {
    }

    @Override
    public ReferencedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReferencedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReferencedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReferencedEventResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.CommitResponseProjection.commit", 0) + 1);
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.CommitResponseProjection.commit", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.RepositoryResponseProjection.commitRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReferencedEventResponseProjection.RepositoryResponseProjection.commitRepository", projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.RepositoryResponseProjection.commitRepository", 0) + 1);
            this.commitRepository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.RepositoryResponseProjection.commitRepository", 0)));
        }
        this.createdAt();
        this.id();
        this.isCrossRepository();
        this.isDirectReference();
        if (projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ReferencedSubjectResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReferencedEventResponseProjection.ReferencedSubjectResponseProjection.subject", projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ReferencedSubjectResponseProjection.subject", 0) + 1);
            this.subject(new ReferencedSubjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReferencedEventResponseProjection.ReferencedSubjectResponseProjection.subject", 0)));
        }
        this.typename();
        return this;
    }

    public ReferencedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public ReferencedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public ReferencedEventResponseProjection commit(CommitResponseProjection subProjection) {
        return commit(null, subProjection);
    }

    public ReferencedEventResponseProjection commit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection));
        return this;
    }

    public ReferencedEventResponseProjection commitRepository(RepositoryResponseProjection subProjection) {
        return commitRepository(null, subProjection);
    }

    public ReferencedEventResponseProjection commitRepository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commitRepository").alias(alias).projection(subProjection));
        return this;
    }

    public ReferencedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public ReferencedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ReferencedEventResponseProjection id() {
        return id(null);
    }

    public ReferencedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ReferencedEventResponseProjection isCrossRepository() {
        return isCrossRepository(null);
    }

    public ReferencedEventResponseProjection isCrossRepository(String alias) {
        fields.add(new GraphQLResponseField("isCrossRepository").alias(alias));
        return this;
    }

    public ReferencedEventResponseProjection isDirectReference() {
        return isDirectReference(null);
    }

    public ReferencedEventResponseProjection isDirectReference(String alias) {
        fields.add(new GraphQLResponseField("isDirectReference").alias(alias));
        return this;
    }

    public ReferencedEventResponseProjection subject(ReferencedSubjectResponseProjection subProjection) {
        return subject(null, subProjection);
    }

    public ReferencedEventResponseProjection subject(String alias, ReferencedSubjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection));
        return this;
    }

    public ReferencedEventResponseProjection typename() {
        return typename(null);
    }

    public ReferencedEventResponseProjection typename(String alias) {
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
        final ReferencedEventResponseProjection that = (ReferencedEventResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
