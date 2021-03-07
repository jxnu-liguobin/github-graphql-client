package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for ReactionGroup
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReactionGroupResponseProjection extends GraphQLResponseProjection {

    public ReactionGroupResponseProjection() {
    }

    @Override
    public ReactionGroupResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReactionGroupResponseProjection all$(int maxDepth) {
        this.content();
        this.createdAt();
        if (projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactableResponseProjection.subject", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactionGroupResponseProjection.ReactableResponseProjection.subject", projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactableResponseProjection.subject", 0) + 1);
            this.subject(new ReactableResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactableResponseProjection.subject", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactingUserConnectionResponseProjection.users", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactionGroupResponseProjection.ReactingUserConnectionResponseProjection.users", projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactingUserConnectionResponseProjection.users", 0) + 1);
            this.users(new ReactingUserConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactionGroupResponseProjection.ReactingUserConnectionResponseProjection.users", 0)));
        }
        this.viewerHasReacted();
        this.typename();
        return this;
    }

    public ReactionGroupResponseProjection content() {
        return content(null);
    }

    public ReactionGroupResponseProjection content(String alias) {
        fields.add(new GraphQLResponseField("content").alias(alias));
        return this;
    }

    public ReactionGroupResponseProjection createdAt() {
        return createdAt(null);
    }

    public ReactionGroupResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ReactionGroupResponseProjection subject(ReactableResponseProjection subProjection) {
        return subject(null, subProjection);
    }

    public ReactionGroupResponseProjection subject(String alias, ReactableResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("subject").alias(alias).projection(subProjection));
        return this;
    }

    public ReactionGroupResponseProjection users(ReactingUserConnectionResponseProjection subProjection) {
        return users((String)null, subProjection);
    }

    public ReactionGroupResponseProjection users(String alias, ReactingUserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("users").alias(alias).projection(subProjection));
        return this;
    }

    public ReactionGroupResponseProjection users(ReactionGroupUsersParametrizedInput input, ReactingUserConnectionResponseProjection subProjection) {
        return users(null, input, subProjection);
    }

    public ReactionGroupResponseProjection users(String alias, ReactionGroupUsersParametrizedInput input, ReactingUserConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("users").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ReactionGroupResponseProjection viewerHasReacted() {
        return viewerHasReacted(null);
    }

    public ReactionGroupResponseProjection viewerHasReacted(String alias) {
        fields.add(new GraphQLResponseField("viewerHasReacted").alias(alias));
        return this;
    }

    public ReactionGroupResponseProjection typename() {
        return typename(null);
    }

    public ReactionGroupResponseProjection typename(String alias) {
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
        final ReactionGroupResponseProjection that = (ReactionGroupResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
