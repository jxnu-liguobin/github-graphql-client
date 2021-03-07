package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for Comment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CommentResponseProjection extends GraphQLResponseProjection {

    public CommentResponseProjection() {
    }

    @Override
    public CommentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CommentResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommentResponseProjection.ActorResponseProjection.author", projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.author", 0) + 1);
            this.author(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.author", 0)));
        }
        this.authorAssociation();
        this.body();
        this.bodyHTML();
        this.bodyText();
        this.createdAt();
        this.createdViaEmail();
        if (projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommentResponseProjection.ActorResponseProjection.editor", projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.editor", 0) + 1);
            this.editor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.editor", 0)));
        }
        this.id();
        this.includesCreatedEdit();
        this.lastEditedAt();
        this.publishedAt();
        this.updatedAt();
        if (projectionDepthOnFields.getOrDefault("CommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", projectionDepthOnFields.getOrDefault("CommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1);
            this.userContentEdits(new UserContentEditConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)));
        }
        this.viewerDidAuthor();
        this.typename();
        return this;
    }

    public CommentResponseProjection author(ActorResponseProjection subProjection) {
        return author(null, subProjection);
    }

    public CommentResponseProjection author(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection));
        return this;
    }

    public CommentResponseProjection authorAssociation() {
        return authorAssociation(null);
    }

    public CommentResponseProjection authorAssociation(String alias) {
        fields.add(new GraphQLResponseField("authorAssociation").alias(alias));
        return this;
    }

    public CommentResponseProjection body() {
        return body(null);
    }

    public CommentResponseProjection body(String alias) {
        fields.add(new GraphQLResponseField("body").alias(alias));
        return this;
    }

    public CommentResponseProjection bodyHTML() {
        return bodyHTML(null);
    }

    public CommentResponseProjection bodyHTML(String alias) {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias));
        return this;
    }

    public CommentResponseProjection bodyText() {
        return bodyText(null);
    }

    public CommentResponseProjection bodyText(String alias) {
        fields.add(new GraphQLResponseField("bodyText").alias(alias));
        return this;
    }

    public CommentResponseProjection createdAt() {
        return createdAt(null);
    }

    public CommentResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public CommentResponseProjection createdViaEmail() {
        return createdViaEmail(null);
    }

    public CommentResponseProjection createdViaEmail(String alias) {
        fields.add(new GraphQLResponseField("createdViaEmail").alias(alias));
        return this;
    }

    public CommentResponseProjection editor(ActorResponseProjection subProjection) {
        return editor(null, subProjection);
    }

    public CommentResponseProjection editor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("editor").alias(alias).projection(subProjection));
        return this;
    }

    public CommentResponseProjection id() {
        return id(null);
    }

    public CommentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CommentResponseProjection includesCreatedEdit() {
        return includesCreatedEdit(null);
    }

    public CommentResponseProjection includesCreatedEdit(String alias) {
        fields.add(new GraphQLResponseField("includesCreatedEdit").alias(alias));
        return this;
    }

    public CommentResponseProjection lastEditedAt() {
        return lastEditedAt(null);
    }

    public CommentResponseProjection lastEditedAt(String alias) {
        fields.add(new GraphQLResponseField("lastEditedAt").alias(alias));
        return this;
    }

    public CommentResponseProjection publishedAt() {
        return publishedAt(null);
    }

    public CommentResponseProjection publishedAt(String alias) {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias));
        return this;
    }

    public CommentResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public CommentResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public CommentResponseProjection userContentEdits(UserContentEditConnectionResponseProjection subProjection) {
        return userContentEdits((String)null, subProjection);
    }

    public CommentResponseProjection userContentEdits(String alias, UserContentEditConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection));
        return this;
    }

    public CommentResponseProjection userContentEdits(CommentUserContentEditsParametrizedInput input, UserContentEditConnectionResponseProjection subProjection) {
        return userContentEdits(null, input, subProjection);
    }

    public CommentResponseProjection userContentEdits(String alias, CommentUserContentEditsParametrizedInput input, UserContentEditConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CommentResponseProjection viewerDidAuthor() {
        return viewerDidAuthor(null);
    }

    public CommentResponseProjection viewerDidAuthor(String alias) {
        fields.add(new GraphQLResponseField("viewerDidAuthor").alias(alias));
        return this;
    }

    public CommentResponseProjection onPullRequestReviewComment(PullRequestReviewCommentResponseProjection subProjection) {
        return onPullRequestReviewComment(null, subProjection);
    }

    public CommentResponseProjection onPullRequestReviewComment(String alias, PullRequestReviewCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection));
        return this;
    }

    public CommentResponseProjection onIssue(IssueResponseProjection subProjection) {
        return onIssue(null, subProjection);
    }

    public CommentResponseProjection onIssue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection));
        return this;
    }

    public CommentResponseProjection onPullRequestReview(PullRequestReviewResponseProjection subProjection) {
        return onPullRequestReview(null, subProjection);
    }

    public CommentResponseProjection onPullRequestReview(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public CommentResponseProjection onPullRequest(PullRequestResponseProjection subProjection) {
        return onPullRequest(null, subProjection);
    }

    public CommentResponseProjection onPullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public CommentResponseProjection onCommitComment(CommitCommentResponseProjection subProjection) {
        return onCommitComment(null, subProjection);
    }

    public CommentResponseProjection onCommitComment(String alias, CommitCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection));
        return this;
    }

    public CommentResponseProjection onIssueComment(IssueCommentResponseProjection subProjection) {
        return onIssueComment(null, subProjection);
    }

    public CommentResponseProjection onIssueComment(String alias, IssueCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection));
        return this;
    }

    public CommentResponseProjection onGistComment(GistCommentResponseProjection subProjection) {
        return onGistComment(null, subProjection);
    }

    public CommentResponseProjection onGistComment(String alias, GistCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("...on GistComment").alias(alias).projection(subProjection));
        return this;
    }

    public CommentResponseProjection typename() {
        return typename(null);
    }

    public CommentResponseProjection typename(String alias) {
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
        final CommentResponseProjection that = (CommentResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
