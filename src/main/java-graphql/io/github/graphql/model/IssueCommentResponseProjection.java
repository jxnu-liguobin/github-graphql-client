package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;

/**
 * Response projection for IssueComment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class IssueCommentResponseProjection extends GraphQLResponseProjection {

    public IssueCommentResponseProjection() {
    }

    @Override
    public IssueCommentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public IssueCommentResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueCommentResponseProjection.ActorResponseProjection.author", projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ActorResponseProjection.author", 0) + 1);
            this.author(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ActorResponseProjection.author", 0)));
        }
        this.authorAssociation();
        this.body();
        this.bodyHTML();
        this.bodyText();
        this.createdAt();
        this.createdViaEmail();
        this.databaseId();
        if (projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueCommentResponseProjection.ActorResponseProjection.editor", projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ActorResponseProjection.editor", 0) + 1);
            this.editor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ActorResponseProjection.editor", 0)));
        }
        this.id();
        this.includesCreatedEdit();
        this.isMinimized();
        if (projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueCommentResponseProjection.IssueResponseProjection.issue", projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.IssueResponseProjection.issue", 0) + 1);
            this.issue(new IssueResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.IssueResponseProjection.issue", 0)));
        }
        this.lastEditedAt();
        this.minimizedReason();
        this.publishedAt();
        if (projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueCommentResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1);
            this.reactionGroups(new ReactionGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueCommentResponseProjection.ReactionConnectionResponseProjection.reactions", projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1);
            this.reactions(new ReactionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueCommentResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.resourcePath();
        this.updatedAt();
        this.url();
        if (projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields.put("IssueCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1);
            this.userContentEdits(new UserContentEditConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)));
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

    public IssueCommentResponseProjection author(ActorResponseProjection subProjection) {
        return author(null, subProjection);
    }

    public IssueCommentResponseProjection author(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection));
        return this;
    }

    public IssueCommentResponseProjection authorAssociation() {
        return authorAssociation(null);
    }

    public IssueCommentResponseProjection authorAssociation(String alias) {
        fields.add(new GraphQLResponseField("authorAssociation").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection body() {
        return body(null);
    }

    public IssueCommentResponseProjection body(String alias) {
        fields.add(new GraphQLResponseField("body").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection bodyHTML() {
        return bodyHTML(null);
    }

    public IssueCommentResponseProjection bodyHTML(String alias) {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection bodyText() {
        return bodyText(null);
    }

    public IssueCommentResponseProjection bodyText(String alias) {
        fields.add(new GraphQLResponseField("bodyText").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection createdAt() {
        return createdAt(null);
    }

    public IssueCommentResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection createdViaEmail() {
        return createdViaEmail(null);
    }

    public IssueCommentResponseProjection createdViaEmail(String alias) {
        fields.add(new GraphQLResponseField("createdViaEmail").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection databaseId() {
        return databaseId(null);
    }

    public IssueCommentResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection editor(ActorResponseProjection subProjection) {
        return editor(null, subProjection);
    }

    public IssueCommentResponseProjection editor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("editor").alias(alias).projection(subProjection));
        return this;
    }

    public IssueCommentResponseProjection id() {
        return id(null);
    }

    public IssueCommentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection includesCreatedEdit() {
        return includesCreatedEdit(null);
    }

    public IssueCommentResponseProjection includesCreatedEdit(String alias) {
        fields.add(new GraphQLResponseField("includesCreatedEdit").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection isMinimized() {
        return isMinimized(null);
    }

    public IssueCommentResponseProjection isMinimized(String alias) {
        fields.add(new GraphQLResponseField("isMinimized").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection issue(IssueResponseProjection subProjection) {
        return issue(null, subProjection);
    }

    public IssueCommentResponseProjection issue(String alias, IssueResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("issue").alias(alias).projection(subProjection));
        return this;
    }

    public IssueCommentResponseProjection lastEditedAt() {
        return lastEditedAt(null);
    }

    public IssueCommentResponseProjection lastEditedAt(String alias) {
        fields.add(new GraphQLResponseField("lastEditedAt").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection minimizedReason() {
        return minimizedReason(null);
    }

    public IssueCommentResponseProjection minimizedReason(String alias) {
        fields.add(new GraphQLResponseField("minimizedReason").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection publishedAt() {
        return publishedAt(null);
    }

    public IssueCommentResponseProjection publishedAt(String alias) {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public IssueCommentResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public IssueCommentResponseProjection reactionGroups(ReactionGroupResponseProjection subProjection) {
        return reactionGroups(null, subProjection);
    }

    public IssueCommentResponseProjection reactionGroups(String alias, ReactionGroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection));
        return this;
    }

    public IssueCommentResponseProjection reactions(ReactionConnectionResponseProjection subProjection) {
        return reactions((String)null, subProjection);
    }

    public IssueCommentResponseProjection reactions(String alias, ReactionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactions").alias(alias).projection(subProjection));
        return this;
    }

    public IssueCommentResponseProjection reactions(IssueCommentReactionsParametrizedInput input, ReactionConnectionResponseProjection subProjection) {
        return reactions(null, input, subProjection);
    }

    public IssueCommentResponseProjection reactions(String alias, IssueCommentReactionsParametrizedInput input, ReactionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public IssueCommentResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public IssueCommentResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public IssueCommentResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public IssueCommentResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public IssueCommentResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection url() {
        return url(null);
    }

    public IssueCommentResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection userContentEdits(UserContentEditConnectionResponseProjection subProjection) {
        return userContentEdits((String)null, subProjection);
    }

    public IssueCommentResponseProjection userContentEdits(String alias, UserContentEditConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection));
        return this;
    }

    public IssueCommentResponseProjection userContentEdits(IssueCommentUserContentEditsParametrizedInput input, UserContentEditConnectionResponseProjection subProjection) {
        return userContentEdits(null, input, subProjection);
    }

    public IssueCommentResponseProjection userContentEdits(String alias, IssueCommentUserContentEditsParametrizedInput input, UserContentEditConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public IssueCommentResponseProjection viewerCanDelete() {
        return viewerCanDelete(null);
    }

    public IssueCommentResponseProjection viewerCanDelete(String alias) {
        fields.add(new GraphQLResponseField("viewerCanDelete").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection viewerCanMinimize() {
        return viewerCanMinimize(null);
    }

    public IssueCommentResponseProjection viewerCanMinimize(String alias) {
        fields.add(new GraphQLResponseField("viewerCanMinimize").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection viewerCanReact() {
        return viewerCanReact(null);
    }

    public IssueCommentResponseProjection viewerCanReact(String alias) {
        fields.add(new GraphQLResponseField("viewerCanReact").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection viewerCanUpdate() {
        return viewerCanUpdate(null);
    }

    public IssueCommentResponseProjection viewerCanUpdate(String alias) {
        fields.add(new GraphQLResponseField("viewerCanUpdate").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection viewerCannotUpdateReasons() {
        return viewerCannotUpdateReasons(null);
    }

    public IssueCommentResponseProjection viewerCannotUpdateReasons(String alias) {
        fields.add(new GraphQLResponseField("viewerCannotUpdateReasons").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection viewerDidAuthor() {
        return viewerDidAuthor(null);
    }

    public IssueCommentResponseProjection viewerDidAuthor(String alias) {
        fields.add(new GraphQLResponseField("viewerDidAuthor").alias(alias));
        return this;
    }

    public IssueCommentResponseProjection typename() {
        return typename(null);
    }

    public IssueCommentResponseProjection typename(String alias) {
        fields.add(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }


}
