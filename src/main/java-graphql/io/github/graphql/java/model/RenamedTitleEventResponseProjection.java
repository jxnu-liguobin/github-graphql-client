package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for RenamedTitleEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class RenamedTitleEventResponseProjection extends GraphQLResponseProjection {

    public RenamedTitleEventResponseProjection() {
    }

    @Override
    public RenamedTitleEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public RenamedTitleEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("RenamedTitleEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.currentTitle();
        this.id();
        this.previousTitle();
        if (projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.RenamedTitleSubjectResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("RenamedTitleEventResponseProjection.RenamedTitleSubjectResponseProjection.subject", projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.RenamedTitleSubjectResponseProjection.subject", 0) + 1);
            this.subject(new RenamedTitleSubjectResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RenamedTitleEventResponseProjection.RenamedTitleSubjectResponseProjection.subject", 0)));
        }
        this.typename();
        return this;
    }

    public RenamedTitleEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public RenamedTitleEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public RenamedTitleEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public RenamedTitleEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public RenamedTitleEventResponseProjection currentTitle() {
        return currentTitle(null);
    }

    public RenamedTitleEventResponseProjection currentTitle(String alias) {
        fields.add(new GraphQLResponseField("currentTitle").alias(alias));
        return this;
    }

    public RenamedTitleEventResponseProjection id() {
        return id(null);
    }

    public RenamedTitleEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public RenamedTitleEventResponseProjection previousTitle() {
        return previousTitle(null);
    }

    public RenamedTitleEventResponseProjection previousTitle(String alias) {
        fields.add(new GraphQLResponseField("previousTitle").alias(alias));
        return this;
    }

    public RenamedTitleEventResponseProjection subject(RenamedTitleSubjectResponseProjection subProjection) {
        return subject(null, subProjection);
    }

    public RenamedTitleEventResponseProjection subject(String alias, RenamedTitleSubjectResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection));
        return this;
    }

    public RenamedTitleEventResponseProjection typename() {
        return typename(null);
    }

    public RenamedTitleEventResponseProjection typename(String alias) {
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
        final RenamedTitleEventResponseProjection that = (RenamedTitleEventResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
