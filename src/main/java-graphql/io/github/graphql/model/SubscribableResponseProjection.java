package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Subscribable
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class SubscribableResponseProjection extends GraphQLResponseProjection {

    public SubscribableResponseProjection() {
    }

    @Override
    public SubscribableResponseProjection all$() {
        return all$(3);
    }

    @Override
    public SubscribableResponseProjection all$(int maxDepth) {
        this.id();
        this.viewerCanSubscribe();
        this.viewerSubscription();
        this.typename();
        return this;
    }

    public SubscribableResponseProjection id() {
        return id(null);
    }

    public SubscribableResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public SubscribableResponseProjection viewerCanSubscribe() {
        return viewerCanSubscribe(null);
    }

    public SubscribableResponseProjection viewerCanSubscribe(String alias) {
        fields.add(new GraphQLResponseField("viewerCanSubscribe").alias(alias));
        return this;
    }

    public SubscribableResponseProjection viewerSubscription() {
        return viewerSubscription(null);
    }

    public SubscribableResponseProjection viewerSubscription(String alias) {
        fields.add(new GraphQLResponseField("viewerSubscription").alias(alias));
        return this;
    }

    public SubscribableResponseProjection onRepository(RepositoryResponseProjection subProjection) {
        return onRepository(null, subProjection);
    }

    public SubscribableResponseProjection onRepository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Repository").alias(alias).projection(subProjection));
        return this;
    }

    public SubscribableResponseProjection onIssue(IssueResponseProjection subProjection) {
        return onIssue(null, subProjection);
    }

    public SubscribableResponseProjection onIssue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection));
        return this;
    }

    public SubscribableResponseProjection onCommit(CommitResponseProjection subProjection) {
        return onCommit(null, subProjection);
    }

    public SubscribableResponseProjection onCommit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Commit").alias(alias).projection(subProjection));
        return this;
    }

    public SubscribableResponseProjection onPullRequest(PullRequestResponseProjection subProjection) {
        return onPullRequest(null, subProjection);
    }

    public SubscribableResponseProjection onPullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public SubscribableResponseProjection onTeam(TeamResponseProjection subProjection) {
        return onTeam(null, subProjection);
    }

    public SubscribableResponseProjection onTeam(String alias, TeamResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Team").alias(alias).projection(subProjection));
        return this;
    }

    public SubscribableResponseProjection typename() {
        return typename(null);
    }

    public SubscribableResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
