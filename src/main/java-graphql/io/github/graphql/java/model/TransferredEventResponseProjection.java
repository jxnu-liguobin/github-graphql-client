package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for TransferredEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class TransferredEventResponseProjection extends GraphQLResponseProjection {

    public TransferredEventResponseProjection() {
    }

    @Override
    public TransferredEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public TransferredEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("TransferredEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        if (projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.RepositoryResponseProjection.fromRepository", 0) <= maxDepth) {
            projectionDepthOnFields.put("TransferredEventResponseProjection.RepositoryResponseProjection.fromRepository", projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.RepositoryResponseProjection.fromRepository", 0) + 1);
            this.fromRepository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.RepositoryResponseProjection.fromRepository", 0)));
        }
        this.id();
        if (projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields.put("TransferredEventResponseProjection.IssueResponseProjection.issue", projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.IssueResponseProjection.issue", 0) + 1);
            this.issue(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("TransferredEventResponseProjection.IssueResponseProjection.issue", 0)));
        }
        this.typename();
        return this;
    }

    public TransferredEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public TransferredEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public TransferredEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public TransferredEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public TransferredEventResponseProjection fromRepository(RepositoryResponseProjection subProjection) {
        return fromRepository(null, subProjection);
    }

    public TransferredEventResponseProjection fromRepository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("fromRepository").alias(alias).projection(subProjection));
        return this;
    }

    public TransferredEventResponseProjection id() {
        return id(null);
    }

    public TransferredEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public TransferredEventResponseProjection issue(IssueResponseProjection subProjection) {
        return issue(null, subProjection);
    }

    public TransferredEventResponseProjection issue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issue").alias(alias).projection(subProjection));
        return this;
    }

    public TransferredEventResponseProjection typename() {
        return typename(null);
    }

    public TransferredEventResponseProjection typename(String alias) {
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
        final TransferredEventResponseProjection that = (TransferredEventResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
