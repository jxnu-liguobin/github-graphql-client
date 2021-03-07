package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for Commit
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class CommitResponseProjection extends GraphQLResponseProjection {

    public CommitResponseProjection() {
    }

    @Override
    public CommitResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CommitResponseProjection all$(int maxDepth) {
        this.abbreviatedOid();
        this.additions();
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", projectionDepthOnFields.getOrDefault("CommitResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0) + 1);
            this.associatedPullRequests(new PullRequestConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.GitActorResponseProjection.author", projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.author", 0) + 1);
            this.author(new GitActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.author", 0)));
        }
        this.authoredByCommitter();
        this.authoredDate();
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.BlameResponseProjection.blame", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.BlameResponseProjection.blame", projectionDepthOnFields.getOrDefault("CommitResponseProjection.BlameResponseProjection.blame", 0) + 1);
            this.blame(new BlameResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.BlameResponseProjection.blame", 0)));
        }
        this.changedFiles();
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.CommitCommentConnectionResponseProjection.comments", projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) + 1);
            this.comments(new CommitCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitCommentConnectionResponseProjection.comments", 0)));
        }
        this.commitResourcePath();
        this.commitUrl();
        this.committedDate();
        this.committedViaWeb();
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.committer", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.GitActorResponseProjection.committer", projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.committer", 0) + 1);
            this.committer(new GitActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.committer", 0)));
        }
        this.deletions();
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.DeploymentConnectionResponseProjection.deployments", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.DeploymentConnectionResponseProjection.deployments", projectionDepthOnFields.getOrDefault("CommitResponseProjection.DeploymentConnectionResponseProjection.deployments", 0) + 1);
            this.deployments(new DeploymentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.DeploymentConnectionResponseProjection.deployments", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitHistoryConnectionResponseProjection.history", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.CommitHistoryConnectionResponseProjection.history", projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitHistoryConnectionResponseProjection.history", 0) + 1);
            this.history(new CommitHistoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitHistoryConnectionResponseProjection.history", 0)));
        }
        this.id();
        this.message();
        this.messageBody();
        this.messageBodyHTML();
        this.messageHeadline();
        this.messageHeadlineHTML();
        this.oid();
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitConnectionResponseProjection.parents", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.CommitConnectionResponseProjection.parents", projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitConnectionResponseProjection.parents", 0) + 1);
            this.parents(new CommitConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitConnectionResponseProjection.parents", 0)));
        }
        this.pushedDate();
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("CommitResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.resourcePath();
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitSignatureResponseProjection.signature", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.GitSignatureResponseProjection.signature", projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitSignatureResponseProjection.signature", 0) + 1);
            this.signature(new GitSignatureResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitSignatureResponseProjection.signature", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.StatusResponseProjection.status", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.StatusResponseProjection.status", projectionDepthOnFields.getOrDefault("CommitResponseProjection.StatusResponseProjection.status", 0) + 1);
            this.status(new StatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.StatusResponseProjection.status", 0)));
        }
        this.tarballUrl();
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.TreeResponseProjection.tree", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.TreeResponseProjection.tree", projectionDepthOnFields.getOrDefault("CommitResponseProjection.TreeResponseProjection.tree", 0) + 1);
            this.tree(new TreeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.TreeResponseProjection.tree", 0)));
        }
        this.treeResourcePath();
        this.treeUrl();
        this.url();
        this.viewerCanSubscribe();
        this.viewerSubscription();
        this.zipballUrl();
        this.typename();
        return this;
    }

    public CommitResponseProjection abbreviatedOid() {
        return abbreviatedOid(null);
    }

    public CommitResponseProjection abbreviatedOid(String alias) {
        fields.add(new GraphQLResponseField("abbreviatedOid").alias(alias));
        return this;
    }

    public CommitResponseProjection additions() {
        return additions(null);
    }

    public CommitResponseProjection additions(String alias) {
        fields.add(new GraphQLResponseField("additions").alias(alias));
        return this;
    }

    public CommitResponseProjection associatedPullRequests(PullRequestConnectionResponseProjection subProjection) {
        return associatedPullRequests((String)null, subProjection);
    }

    public CommitResponseProjection associatedPullRequests(String alias, PullRequestConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("associatedPullRequests").alias(alias).projection(subProjection));
        return this;
    }

    public CommitResponseProjection associatedPullRequests(CommitAssociatedPullRequestsParametrizedInput input, PullRequestConnectionResponseProjection subProjection) {
        return associatedPullRequests(null, input, subProjection);
    }

    public CommitResponseProjection associatedPullRequests(String alias, CommitAssociatedPullRequestsParametrizedInput input, PullRequestConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("associatedPullRequests").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CommitResponseProjection author(GitActorResponseProjection subProjection) {
        return author(null, subProjection);
    }

    public CommitResponseProjection author(String alias, GitActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection));
        return this;
    }

    public CommitResponseProjection authoredByCommitter() {
        return authoredByCommitter(null);
    }

    public CommitResponseProjection authoredByCommitter(String alias) {
        fields.add(new GraphQLResponseField("authoredByCommitter").alias(alias));
        return this;
    }

    public CommitResponseProjection authoredDate() {
        return authoredDate(null);
    }

    public CommitResponseProjection authoredDate(String alias) {
        fields.add(new GraphQLResponseField("authoredDate").alias(alias));
        return this;
    }

    public CommitResponseProjection blame(BlameResponseProjection subProjection) {
        return blame((String)null, subProjection);
    }

    public CommitResponseProjection blame(String alias, BlameResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("blame").alias(alias).projection(subProjection));
        return this;
    }

    public CommitResponseProjection blame(CommitBlameParametrizedInput input, BlameResponseProjection subProjection) {
        return blame(null, input, subProjection);
    }

    public CommitResponseProjection blame(String alias, CommitBlameParametrizedInput input, BlameResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("blame").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CommitResponseProjection changedFiles() {
        return changedFiles(null);
    }

    public CommitResponseProjection changedFiles(String alias) {
        fields.add(new GraphQLResponseField("changedFiles").alias(alias));
        return this;
    }

    public CommitResponseProjection comments(CommitCommentConnectionResponseProjection subProjection) {
        return comments((String)null, subProjection);
    }

    public CommitResponseProjection comments(String alias, CommitCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection));
        return this;
    }

    public CommitResponseProjection comments(CommitCommentsParametrizedInput input, CommitCommentConnectionResponseProjection subProjection) {
        return comments(null, input, subProjection);
    }

    public CommitResponseProjection comments(String alias, CommitCommentsParametrizedInput input, CommitCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CommitResponseProjection commitResourcePath() {
        return commitResourcePath(null);
    }

    public CommitResponseProjection commitResourcePath(String alias) {
        fields.add(new GraphQLResponseField("commitResourcePath").alias(alias));
        return this;
    }

    public CommitResponseProjection commitUrl() {
        return commitUrl(null);
    }

    public CommitResponseProjection commitUrl(String alias) {
        fields.add(new GraphQLResponseField("commitUrl").alias(alias));
        return this;
    }

    public CommitResponseProjection committedDate() {
        return committedDate(null);
    }

    public CommitResponseProjection committedDate(String alias) {
        fields.add(new GraphQLResponseField("committedDate").alias(alias));
        return this;
    }

    public CommitResponseProjection committedViaWeb() {
        return committedViaWeb(null);
    }

    public CommitResponseProjection committedViaWeb(String alias) {
        fields.add(new GraphQLResponseField("committedViaWeb").alias(alias));
        return this;
    }

    public CommitResponseProjection committer(GitActorResponseProjection subProjection) {
        return committer(null, subProjection);
    }

    public CommitResponseProjection committer(String alias, GitActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("committer").alias(alias).projection(subProjection));
        return this;
    }

    public CommitResponseProjection deletions() {
        return deletions(null);
    }

    public CommitResponseProjection deletions(String alias) {
        fields.add(new GraphQLResponseField("deletions").alias(alias));
        return this;
    }

    public CommitResponseProjection deployments(DeploymentConnectionResponseProjection subProjection) {
        return deployments((String)null, subProjection);
    }

    public CommitResponseProjection deployments(String alias, DeploymentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deployments").alias(alias).projection(subProjection));
        return this;
    }

    public CommitResponseProjection deployments(CommitDeploymentsParametrizedInput input, DeploymentConnectionResponseProjection subProjection) {
        return deployments(null, input, subProjection);
    }

    public CommitResponseProjection deployments(String alias, CommitDeploymentsParametrizedInput input, DeploymentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("deployments").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CommitResponseProjection history(CommitHistoryConnectionResponseProjection subProjection) {
        return history((String)null, subProjection);
    }

    public CommitResponseProjection history(String alias, CommitHistoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("history").alias(alias).projection(subProjection));
        return this;
    }

    public CommitResponseProjection history(CommitHistoryParametrizedInput input, CommitHistoryConnectionResponseProjection subProjection) {
        return history(null, input, subProjection);
    }

    public CommitResponseProjection history(String alias, CommitHistoryParametrizedInput input, CommitHistoryConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("history").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CommitResponseProjection id() {
        return id(null);
    }

    public CommitResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CommitResponseProjection message() {
        return message(null);
    }

    public CommitResponseProjection message(String alias) {
        fields.add(new GraphQLResponseField("message").alias(alias));
        return this;
    }

    public CommitResponseProjection messageBody() {
        return messageBody(null);
    }

    public CommitResponseProjection messageBody(String alias) {
        fields.add(new GraphQLResponseField("messageBody").alias(alias));
        return this;
    }

    public CommitResponseProjection messageBodyHTML() {
        return messageBodyHTML(null);
    }

    public CommitResponseProjection messageBodyHTML(String alias) {
        fields.add(new GraphQLResponseField("messageBodyHTML").alias(alias));
        return this;
    }

    public CommitResponseProjection messageHeadline() {
        return messageHeadline(null);
    }

    public CommitResponseProjection messageHeadline(String alias) {
        fields.add(new GraphQLResponseField("messageHeadline").alias(alias));
        return this;
    }

    public CommitResponseProjection messageHeadlineHTML() {
        return messageHeadlineHTML(null);
    }

    public CommitResponseProjection messageHeadlineHTML(String alias) {
        fields.add(new GraphQLResponseField("messageHeadlineHTML").alias(alias));
        return this;
    }

    public CommitResponseProjection oid() {
        return oid(null);
    }

    public CommitResponseProjection oid(String alias) {
        fields.add(new GraphQLResponseField("oid").alias(alias));
        return this;
    }

    public CommitResponseProjection parents(CommitConnectionResponseProjection subProjection) {
        return parents((String)null, subProjection);
    }

    public CommitResponseProjection parents(String alias, CommitConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parents").alias(alias).projection(subProjection));
        return this;
    }

    public CommitResponseProjection parents(CommitParentsParametrizedInput input, CommitConnectionResponseProjection subProjection) {
        return parents(null, input, subProjection);
    }

    public CommitResponseProjection parents(String alias, CommitParentsParametrizedInput input, CommitConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("parents").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CommitResponseProjection pushedDate() {
        return pushedDate(null);
    }

    public CommitResponseProjection pushedDate(String alias) {
        fields.add(new GraphQLResponseField("pushedDate").alias(alias));
        return this;
    }

    public CommitResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public CommitResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public CommitResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public CommitResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public CommitResponseProjection signature(GitSignatureResponseProjection subProjection) {
        return signature(null, subProjection);
    }

    public CommitResponseProjection signature(String alias, GitSignatureResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("signature").alias(alias).projection(subProjection));
        return this;
    }

    public CommitResponseProjection status(StatusResponseProjection subProjection) {
        return status(null, subProjection);
    }

    public CommitResponseProjection status(String alias, StatusResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("status").alias(alias).projection(subProjection));
        return this;
    }

    public CommitResponseProjection tarballUrl() {
        return tarballUrl(null);
    }

    public CommitResponseProjection tarballUrl(String alias) {
        fields.add(new GraphQLResponseField("tarballUrl").alias(alias));
        return this;
    }

    public CommitResponseProjection tree(TreeResponseProjection subProjection) {
        return tree(null, subProjection);
    }

    public CommitResponseProjection tree(String alias, TreeResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("tree").alias(alias).projection(subProjection));
        return this;
    }

    public CommitResponseProjection treeResourcePath() {
        return treeResourcePath(null);
    }

    public CommitResponseProjection treeResourcePath(String alias) {
        fields.add(new GraphQLResponseField("treeResourcePath").alias(alias));
        return this;
    }

    public CommitResponseProjection treeUrl() {
        return treeUrl(null);
    }

    public CommitResponseProjection treeUrl(String alias) {
        fields.add(new GraphQLResponseField("treeUrl").alias(alias));
        return this;
    }

    public CommitResponseProjection url() {
        return url(null);
    }

    public CommitResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public CommitResponseProjection viewerCanSubscribe() {
        return viewerCanSubscribe(null);
    }

    public CommitResponseProjection viewerCanSubscribe(String alias) {
        fields.add(new GraphQLResponseField("viewerCanSubscribe").alias(alias));
        return this;
    }

    public CommitResponseProjection viewerSubscription() {
        return viewerSubscription(null);
    }

    public CommitResponseProjection viewerSubscription(String alias) {
        fields.add(new GraphQLResponseField("viewerSubscription").alias(alias));
        return this;
    }

    public CommitResponseProjection zipballUrl() {
        return zipballUrl(null);
    }

    public CommitResponseProjection zipballUrl(String alias) {
        fields.add(new GraphQLResponseField("zipballUrl").alias(alias));
        return this;
    }

    public CommitResponseProjection typename() {
        return typename(null);
    }

    public CommitResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
