package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for CommitCommentThread
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class CommitCommentThreadResponseProjection extends GraphQLResponseProjection {

    public CommitCommentThreadResponseProjection() {
    }

    @Override
    public CommitCommentThreadResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CommitCommentThreadResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) + 1);
            this.comments(new CommitCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitCommentConnectionResponseProjection.comments", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentThreadResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0) + 1);
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.CommitResponseProjection.commit", 0)));
        }
        this.id();
        this.path();
        this.position();
        if (projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentThreadResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.typename();
        return this;
    }

    public CommitCommentThreadResponseProjection comments(CommitCommentConnectionResponseProjection subProjection) {
        return comments((String)null, subProjection);
    }

    public CommitCommentThreadResponseProjection comments(String alias, CommitCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection));
        return this;
    }

    public CommitCommentThreadResponseProjection comments(CommitCommentThreadCommentsParametrizedInput input, CommitCommentConnectionResponseProjection subProjection) {
        return comments(null, input, subProjection);
    }

    public CommitCommentThreadResponseProjection comments(String alias, CommitCommentThreadCommentsParametrizedInput input, CommitCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CommitCommentThreadResponseProjection commit(CommitResponseProjection subProjection) {
        return commit(null, subProjection);
    }

    public CommitCommentThreadResponseProjection commit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection));
        return this;
    }

    public CommitCommentThreadResponseProjection id() {
        return id(null);
    }

    public CommitCommentThreadResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CommitCommentThreadResponseProjection path() {
        return path(null);
    }

    public CommitCommentThreadResponseProjection path(String alias) {
        fields.add(new GraphQLResponseField("path").alias(alias));
        return this;
    }

    public CommitCommentThreadResponseProjection position() {
        return position(null);
    }

    public CommitCommentThreadResponseProjection position(String alias) {
        fields.add(new GraphQLResponseField("position").alias(alias));
        return this;
    }

    public CommitCommentThreadResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public CommitCommentThreadResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public CommitCommentThreadResponseProjection typename() {
        return typename(null);
    }

    public CommitCommentThreadResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
