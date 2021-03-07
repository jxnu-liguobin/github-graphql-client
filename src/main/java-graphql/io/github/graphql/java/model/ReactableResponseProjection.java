package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for Reactable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class ReactableResponseProjection extends GraphQLResponseProjection {

    public ReactableResponseProjection() {
    }

    @Override
    public ReactableResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReactableResponseProjection all$(int maxDepth) {
        this.databaseId();
        this.id();
        if (projectionDepthOnFields.getOrDefault("ReactableResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactableResponseProjection.ReactionGroupResponseProjection.reactionGroups", projectionDepthOnFields.getOrDefault("ReactableResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1);
            this.reactionGroups(new ReactionGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactableResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReactableResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReactableResponseProjection.ReactionConnectionResponseProjection.reactions", projectionDepthOnFields.getOrDefault("ReactableResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1);
            this.reactions(new ReactionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReactableResponseProjection.ReactionConnectionResponseProjection.reactions", 0)));
        }
        this.viewerCanReact();
        this.typename();
        return this;
    }

    public ReactableResponseProjection databaseId() {
        return databaseId(null);
    }

    public ReactableResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public ReactableResponseProjection id() {
        return id(null);
    }

    public ReactableResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ReactableResponseProjection reactionGroups(ReactionGroupResponseProjection subProjection) {
        return reactionGroups(null, subProjection);
    }

    public ReactableResponseProjection reactionGroups(String alias, ReactionGroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection));
        return this;
    }

    public ReactableResponseProjection reactions(ReactionConnectionResponseProjection subProjection) {
        return reactions((String)null, subProjection);
    }

    public ReactableResponseProjection reactions(String alias, ReactionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactions").alias(alias).projection(subProjection));
        return this;
    }

    public ReactableResponseProjection reactions(ReactableReactionsParametrizedInput input, ReactionConnectionResponseProjection subProjection) {
        return reactions(null, input, subProjection);
    }

    public ReactableResponseProjection reactions(String alias, ReactableReactionsParametrizedInput input, ReactionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public ReactableResponseProjection viewerCanReact() {
        return viewerCanReact(null);
    }

    public ReactableResponseProjection viewerCanReact(String alias) {
        fields.add(new GraphQLResponseField("viewerCanReact").alias(alias));
        return this;
    }

    public ReactableResponseProjection onPullRequestReviewComment(PullRequestReviewCommentResponseProjection subProjection) {
        return onPullRequestReviewComment(null, subProjection);
    }

    public ReactableResponseProjection onPullRequestReviewComment(String alias, PullRequestReviewCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection));
        return this;
    }

    public ReactableResponseProjection onIssue(IssueResponseProjection subProjection) {
        return onIssue(null, subProjection);
    }

    public ReactableResponseProjection onIssue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection));
        return this;
    }

    public ReactableResponseProjection onPullRequestReview(PullRequestReviewResponseProjection subProjection) {
        return onPullRequestReview(null, subProjection);
    }

    public ReactableResponseProjection onPullRequestReview(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public ReactableResponseProjection onPullRequest(PullRequestResponseProjection subProjection) {
        return onPullRequest(null, subProjection);
    }

    public ReactableResponseProjection onPullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public ReactableResponseProjection onCommitComment(CommitCommentResponseProjection subProjection) {
        return onCommitComment(null, subProjection);
    }

    public ReactableResponseProjection onCommitComment(String alias, CommitCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection));
        return this;
    }

    public ReactableResponseProjection onIssueComment(IssueCommentResponseProjection subProjection) {
        return onIssueComment(null, subProjection);
    }

    public ReactableResponseProjection onIssueComment(String alias, IssueCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection));
        return this;
    }

    public ReactableResponseProjection typename() {
        return typename(null);
    }

    public ReactableResponseProjection typename(String alias) {
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
        final ReactableResponseProjection that = (ReactableResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
