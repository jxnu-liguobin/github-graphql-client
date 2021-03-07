package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ConvertedNoteToIssueEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ConvertedNoteToIssueEventResponseProjection extends GraphQLResponseProjection {

    public ConvertedNoteToIssueEventResponseProjection() {
    }

    @Override
    public ConvertedNoteToIssueEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ConvertedNoteToIssueEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ConvertedNoteToIssueEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("ConvertedNoteToIssueEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("ConvertedNoteToIssueEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ConvertedNoteToIssueEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.databaseId();
        this.id();
        this.typename();
        return this;
    }

    public ConvertedNoteToIssueEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public ConvertedNoteToIssueEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public ConvertedNoteToIssueEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public ConvertedNoteToIssueEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ConvertedNoteToIssueEventResponseProjection databaseId() {
        return databaseId(null);
    }

    public ConvertedNoteToIssueEventResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public ConvertedNoteToIssueEventResponseProjection id() {
        return id(null);
    }

    public ConvertedNoteToIssueEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ConvertedNoteToIssueEventResponseProjection typename() {
        return typename(null);
    }

    public ConvertedNoteToIssueEventResponseProjection typename(String alias) {
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
        final ConvertedNoteToIssueEventResponseProjection that = (ConvertedNoteToIssueEventResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
