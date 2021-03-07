package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for Status
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class StatusResponseProjection extends GraphQLResponseProjection {

    public StatusResponseProjection() {
    }

    @Override
    public StatusResponseProjection all$() {
        return all$(3);
    }

    @Override
    public StatusResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("StatusResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("StatusResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("StatusResponseProjection.CommitResponseProjection.commit", 0) + 1);
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StatusResponseProjection.CommitResponseProjection.commit", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.context", 0) <= maxDepth) {
            projectionDepthOnFields.put("StatusResponseProjection.StatusContextResponseProjection.context", projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.context", 0) + 1);
            this.context(new StatusContextResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.context", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.contexts", 0) <= maxDepth) {
            projectionDepthOnFields.put("StatusResponseProjection.StatusContextResponseProjection.contexts", projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.contexts", 0) + 1);
            this.contexts(new StatusContextResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("StatusResponseProjection.StatusContextResponseProjection.contexts", 0)));
        }
        this.id();
        this.state();
        this.typename();
        return this;
    }

    public StatusResponseProjection commit(CommitResponseProjection subProjection) {
        return commit(null, subProjection);
    }

    public StatusResponseProjection commit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection));
        return this;
    }

    public StatusResponseProjection context(StatusContextResponseProjection subProjection) {
        return context((String)null, subProjection);
    }

    public StatusResponseProjection context(String alias, StatusContextResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("context").alias(alias).projection(subProjection));
        return this;
    }

    public StatusResponseProjection context(StatusContextParametrizedInput input, StatusContextResponseProjection subProjection) {
        return context(null, input, subProjection);
    }

    public StatusResponseProjection context(String alias, StatusContextParametrizedInput input, StatusContextResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("context").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public StatusResponseProjection contexts(StatusContextResponseProjection subProjection) {
        return contexts(null, subProjection);
    }

    public StatusResponseProjection contexts(String alias, StatusContextResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("contexts").alias(alias).projection(subProjection));
        return this;
    }

    public StatusResponseProjection id() {
        return id(null);
    }

    public StatusResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public StatusResponseProjection state() {
        return state(null);
    }

    public StatusResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public StatusResponseProjection typename() {
        return typename(null);
    }

    public StatusResponseProjection typename(String alias) {
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
        final StatusResponseProjection that = (StatusResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
