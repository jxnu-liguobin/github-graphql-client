package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for ReviewDismissedEvent
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class ReviewDismissedEventResponseProjection extends GraphQLResponseProjection {

    public ReviewDismissedEventResponseProjection() {
    }

    @Override
    public ReviewDismissedEventResponseProjection all$() {
        return all$(3);
    }

    @Override
    public ReviewDismissedEventResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.ActorResponseProjection.actor", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissedEventResponseProjection.ActorResponseProjection.actor", projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.ActorResponseProjection.actor", 0) + 1);
            this.actor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.ActorResponseProjection.actor", 0)));
        }
        this.createdAt();
        this.databaseId();
        this.dismissalMessage();
        this.dismissalMessageHTML();
        this.id();
        this.previousReviewState();
        if (projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissedEventResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestCommitResponseProjection.pullRequestCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissedEventResponseProjection.PullRequestCommitResponseProjection.pullRequestCommit", projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestCommitResponseProjection.pullRequestCommit", 0) + 1);
            this.pullRequestCommit(new PullRequestCommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestCommitResponseProjection.pullRequestCommit", 0)));
        }
        this.resourcePath();
        if (projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestReviewResponseProjection.review", 0) <= maxDepth) {
            projectionDepthOnFields.put("ReviewDismissedEventResponseProjection.PullRequestReviewResponseProjection.review", projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestReviewResponseProjection.review", 0) + 1);
            this.review(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("ReviewDismissedEventResponseProjection.PullRequestReviewResponseProjection.review", 0)));
        }
        this.url();
        this.typename();
        return this;
    }

    public ReviewDismissedEventResponseProjection actor(ActorResponseProjection subProjection) {
        return actor(null, subProjection);
    }

    public ReviewDismissedEventResponseProjection actor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("actor").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewDismissedEventResponseProjection createdAt() {
        return createdAt(null);
    }

    public ReviewDismissedEventResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public ReviewDismissedEventResponseProjection databaseId() {
        return databaseId(null);
    }

    public ReviewDismissedEventResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public ReviewDismissedEventResponseProjection dismissalMessage() {
        return dismissalMessage(null);
    }

    public ReviewDismissedEventResponseProjection dismissalMessage(String alias) {
        fields.add(new GraphQLResponseField("dismissalMessage").alias(alias));
        return this;
    }

    public ReviewDismissedEventResponseProjection dismissalMessageHTML() {
        return dismissalMessageHTML(null);
    }

    public ReviewDismissedEventResponseProjection dismissalMessageHTML(String alias) {
        fields.add(new GraphQLResponseField("dismissalMessageHTML").alias(alias));
        return this;
    }

    public ReviewDismissedEventResponseProjection id() {
        return id(null);
    }

    public ReviewDismissedEventResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public ReviewDismissedEventResponseProjection previousReviewState() {
        return previousReviewState(null);
    }

    public ReviewDismissedEventResponseProjection previousReviewState(String alias) {
        fields.add(new GraphQLResponseField("previousReviewState").alias(alias));
        return this;
    }

    public ReviewDismissedEventResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public ReviewDismissedEventResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewDismissedEventResponseProjection pullRequestCommit(PullRequestCommitResponseProjection subProjection) {
        return pullRequestCommit(null, subProjection);
    }

    public ReviewDismissedEventResponseProjection pullRequestCommit(String alias, PullRequestCommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequestCommit").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewDismissedEventResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public ReviewDismissedEventResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public ReviewDismissedEventResponseProjection review(PullRequestReviewResponseProjection subProjection) {
        return review(null, subProjection);
    }

    public ReviewDismissedEventResponseProjection review(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("review").alias(alias).projection(subProjection));
        return this;
    }

    public ReviewDismissedEventResponseProjection url() {
        return url(null);
    }

    public ReviewDismissedEventResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public ReviewDismissedEventResponseProjection typename() {
        return typename(null);
    }

    public ReviewDismissedEventResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
