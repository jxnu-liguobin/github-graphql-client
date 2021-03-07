package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for PullRequestReviewComment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PullRequestReviewCommentResponseProjection extends GraphQLResponseProjection {

    public PullRequestReviewCommentResponseProjection() {
    }

    @Override
    public PullRequestReviewCommentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestReviewCommentResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.ActorResponseProjection.author", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.author", 0) + 1);
            this.author(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.author", 0)));
        }
        this.authorAssociation();
        this.body();
        this.bodyHTML();
        this.bodyText();
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.commit", 0) + 1);
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.commit", 0)));
        }
        this.createdAt();
        this.createdViaEmail();
        this.databaseId();
        this.diffHunk();
        this.draftedAt();
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.ActorResponseProjection.editor", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.editor", 0) + 1);
            this.editor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.editor", 0)));
        }
        this.id();
        this.includesCreatedEdit();
        this.isMinimized();
        this.lastEditedAt();
        this.minimizedReason();
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.originalCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.CommitResponseProjection.originalCommit", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.originalCommit", 0) + 1);
            this.originalCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.originalCommit", 0)));
        }
        this.originalPosition();
        this.outdated();
        this.path();
        this.position();
        this.publishedAt();
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1);
            this.pullRequestReview(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1);
            this.reactionGroups(new ReactionGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.ReactionConnectionResponseProjection.reactions", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1);
            this.reactions(new ReactionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewCommentResponseProjection.replyTo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.PullRequestReviewCommentResponseProjection.replyTo", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewCommentResponseProjection.replyTo", 0) + 1);
            this.replyTo(new PullRequestReviewCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewCommentResponseProjection.replyTo", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.resourcePath();
        this.state();
        this.updatedAt();
        this.url();
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1);
            this.userContentEdits(new UserContentEditConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)));
        }
        this.viewerCanDelete();
        this.viewerCanMinimize();
        this.viewerCanReact();
        this.viewerCanUpdate();
        this.viewerCannotUpdateReasons();
        this.viewerDidAuthor();
        this.typename();
        return this;
    }

    public PullRequestReviewCommentResponseProjection author(ActorResponseProjection subProjection) {
        return author(null, subProjection);
    }

    public PullRequestReviewCommentResponseProjection author(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewCommentResponseProjection authorAssociation() {
        return authorAssociation(null);
    }

    public PullRequestReviewCommentResponseProjection authorAssociation(String alias) {
        fields.add(new GraphQLResponseField("authorAssociation").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection body() {
        return body(null);
    }

    public PullRequestReviewCommentResponseProjection body(String alias) {
        fields.add(new GraphQLResponseField("body").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection bodyHTML() {
        return bodyHTML(null);
    }

    public PullRequestReviewCommentResponseProjection bodyHTML(String alias) {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection bodyText() {
        return bodyText(null);
    }

    public PullRequestReviewCommentResponseProjection bodyText(String alias) {
        fields.add(new GraphQLResponseField("bodyText").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection commit(CommitResponseProjection subProjection) {
        return commit(null, subProjection);
    }

    public PullRequestReviewCommentResponseProjection commit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewCommentResponseProjection createdAt() {
        return createdAt(null);
    }

    public PullRequestReviewCommentResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection createdViaEmail() {
        return createdViaEmail(null);
    }

    public PullRequestReviewCommentResponseProjection createdViaEmail(String alias) {
        fields.add(new GraphQLResponseField("createdViaEmail").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection databaseId() {
        return databaseId(null);
    }

    public PullRequestReviewCommentResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection diffHunk() {
        return diffHunk(null);
    }

    public PullRequestReviewCommentResponseProjection diffHunk(String alias) {
        fields.add(new GraphQLResponseField("diffHunk").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection draftedAt() {
        return draftedAt(null);
    }

    public PullRequestReviewCommentResponseProjection draftedAt(String alias) {
        fields.add(new GraphQLResponseField("draftedAt").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection editor(ActorResponseProjection subProjection) {
        return editor(null, subProjection);
    }

    public PullRequestReviewCommentResponseProjection editor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("editor").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewCommentResponseProjection id() {
        return id(null);
    }

    public PullRequestReviewCommentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection includesCreatedEdit() {
        return includesCreatedEdit(null);
    }

    public PullRequestReviewCommentResponseProjection includesCreatedEdit(String alias) {
        fields.add(new GraphQLResponseField("includesCreatedEdit").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection isMinimized() {
        return isMinimized(null);
    }

    public PullRequestReviewCommentResponseProjection isMinimized(String alias) {
        fields.add(new GraphQLResponseField("isMinimized").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection lastEditedAt() {
        return lastEditedAt(null);
    }

    public PullRequestReviewCommentResponseProjection lastEditedAt(String alias) {
        fields.add(new GraphQLResponseField("lastEditedAt").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection minimizedReason() {
        return minimizedReason(null);
    }

    public PullRequestReviewCommentResponseProjection minimizedReason(String alias) {
        fields.add(new GraphQLResponseField("minimizedReason").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection originalCommit(CommitResponseProjection subProjection) {
        return originalCommit(null, subProjection);
    }

    public PullRequestReviewCommentResponseProjection originalCommit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("originalCommit").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewCommentResponseProjection originalPosition() {
        return originalPosition(null);
    }

    public PullRequestReviewCommentResponseProjection originalPosition(String alias) {
        fields.add(new GraphQLResponseField("originalPosition").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection outdated() {
        return outdated(null);
    }

    public PullRequestReviewCommentResponseProjection outdated(String alias) {
        fields.add(new GraphQLResponseField("outdated").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection path() {
        return path(null);
    }

    public PullRequestReviewCommentResponseProjection path(String alias) {
        fields.add(new GraphQLResponseField("path").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection position() {
        return position(null);
    }

    public PullRequestReviewCommentResponseProjection position(String alias) {
        fields.add(new GraphQLResponseField("position").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection publishedAt() {
        return publishedAt(null);
    }

    public PullRequestReviewCommentResponseProjection publishedAt(String alias) {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public PullRequestReviewCommentResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewCommentResponseProjection pullRequestReview(PullRequestReviewResponseProjection subProjection) {
        return pullRequestReview(null, subProjection);
    }

    public PullRequestReviewCommentResponseProjection pullRequestReview(String alias, PullRequestReviewResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewCommentResponseProjection reactionGroups(ReactionGroupResponseProjection subProjection) {
        return reactionGroups(null, subProjection);
    }

    public PullRequestReviewCommentResponseProjection reactionGroups(String alias, ReactionGroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewCommentResponseProjection reactions(ReactionConnectionResponseProjection subProjection) {
        return reactions((String)null, subProjection);
    }

    public PullRequestReviewCommentResponseProjection reactions(String alias, ReactionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactions").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewCommentResponseProjection reactions(PullRequestReviewCommentReactionsParametrizedInput input, ReactionConnectionResponseProjection subProjection) {
        return reactions(null, input, subProjection);
    }

    public PullRequestReviewCommentResponseProjection reactions(String alias, PullRequestReviewCommentReactionsParametrizedInput input, ReactionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestReviewCommentResponseProjection replyTo(PullRequestReviewCommentResponseProjection subProjection) {
        return replyTo(null, subProjection);
    }

    public PullRequestReviewCommentResponseProjection replyTo(String alias, PullRequestReviewCommentResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("replyTo").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewCommentResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public PullRequestReviewCommentResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewCommentResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public PullRequestReviewCommentResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection state() {
        return state(null);
    }

    public PullRequestReviewCommentResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public PullRequestReviewCommentResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection url() {
        return url(null);
    }

    public PullRequestReviewCommentResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection userContentEdits(UserContentEditConnectionResponseProjection subProjection) {
        return userContentEdits((String)null, subProjection);
    }

    public PullRequestReviewCommentResponseProjection userContentEdits(String alias, UserContentEditConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewCommentResponseProjection userContentEdits(PullRequestReviewCommentUserContentEditsParametrizedInput input, UserContentEditConnectionResponseProjection subProjection) {
        return userContentEdits(null, input, subProjection);
    }

    public PullRequestReviewCommentResponseProjection userContentEdits(String alias, PullRequestReviewCommentUserContentEditsParametrizedInput input, UserContentEditConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestReviewCommentResponseProjection viewerCanDelete() {
        return viewerCanDelete(null);
    }

    public PullRequestReviewCommentResponseProjection viewerCanDelete(String alias) {
        fields.add(new GraphQLResponseField("viewerCanDelete").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection viewerCanMinimize() {
        return viewerCanMinimize(null);
    }

    public PullRequestReviewCommentResponseProjection viewerCanMinimize(String alias) {
        fields.add(new GraphQLResponseField("viewerCanMinimize").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection viewerCanReact() {
        return viewerCanReact(null);
    }

    public PullRequestReviewCommentResponseProjection viewerCanReact(String alias) {
        fields.add(new GraphQLResponseField("viewerCanReact").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection viewerCanUpdate() {
        return viewerCanUpdate(null);
    }

    public PullRequestReviewCommentResponseProjection viewerCanUpdate(String alias) {
        fields.add(new GraphQLResponseField("viewerCanUpdate").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection viewerCannotUpdateReasons() {
        return viewerCannotUpdateReasons(null);
    }

    public PullRequestReviewCommentResponseProjection viewerCannotUpdateReasons(String alias) {
        fields.add(new GraphQLResponseField("viewerCannotUpdateReasons").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection viewerDidAuthor() {
        return viewerDidAuthor(null);
    }

    public PullRequestReviewCommentResponseProjection viewerDidAuthor(String alias) {
        fields.add(new GraphQLResponseField("viewerDidAuthor").alias(alias));
        return this;
    }

    public PullRequestReviewCommentResponseProjection typename() {
        return typename(null);
    }

    public PullRequestReviewCommentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
