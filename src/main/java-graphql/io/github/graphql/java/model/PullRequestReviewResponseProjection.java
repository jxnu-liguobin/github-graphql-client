package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for PullRequestReview
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestReviewResponseProjection extends GraphQLResponseProjection {

    public PullRequestReviewResponseProjection() {
    }

    @Override
    public PullRequestReviewResponseProjection all$() {
        return all$(3);
    }

    @Override
    public PullRequestReviewResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.ActorResponseProjection.author", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.author", 0) + 1);
            this.author(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.author", 0)));
        }
        this.authorAssociation();
        this.body();
        this.bodyHTML();
        this.bodyText();
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0) + 1);
            this.comments(new PullRequestReviewCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.CommitResponseProjection.commit", 0) + 1);
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.CommitResponseProjection.commit", 0)));
        }
        this.createdAt();
        this.createdViaEmail();
        this.databaseId();
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.ActorResponseProjection.editor", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.editor", 0) + 1);
            this.editor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.editor", 0)));
        }
        this.id();
        this.includesCreatedEdit();
        this.lastEditedAt();
        this.publishedAt();
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1);
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestResponseProjection.pullRequest", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.ReactionGroupResponseProjection.reactionGroups", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1);
            this.reactionGroups(new ReactionGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.ReactionConnectionResponseProjection.reactions", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1);
            this.reactions(new ReactionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionConnectionResponseProjection.reactions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.resourcePath();
        this.state();
        this.submittedAt();
        this.updatedAt();
        this.url();
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1);
            this.userContentEdits(new UserContentEditConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)));
        }
        this.viewerCanDelete();
        this.viewerCanReact();
        this.viewerCanUpdate();
        this.viewerCannotUpdateReasons();
        this.viewerDidAuthor();
        this.typename();
        return this;
    }

    public PullRequestReviewResponseProjection author(ActorResponseProjection subProjection) {
        return author(null, subProjection);
    }

    public PullRequestReviewResponseProjection author(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewResponseProjection authorAssociation() {
        return authorAssociation(null);
    }

    public PullRequestReviewResponseProjection authorAssociation(String alias) {
        fields.add(new GraphQLResponseField("authorAssociation").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection body() {
        return body(null);
    }

    public PullRequestReviewResponseProjection body(String alias) {
        fields.add(new GraphQLResponseField("body").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection bodyHTML() {
        return bodyHTML(null);
    }

    public PullRequestReviewResponseProjection bodyHTML(String alias) {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection bodyText() {
        return bodyText(null);
    }

    public PullRequestReviewResponseProjection bodyText(String alias) {
        fields.add(new GraphQLResponseField("bodyText").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection comments(PullRequestReviewCommentConnectionResponseProjection subProjection) {
        return comments((String)null, subProjection);
    }

    public PullRequestReviewResponseProjection comments(String alias, PullRequestReviewCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewResponseProjection comments(PullRequestReviewCommentsParametrizedInput input, PullRequestReviewCommentConnectionResponseProjection subProjection) {
        return comments(null, input, subProjection);
    }

    public PullRequestReviewResponseProjection comments(String alias, PullRequestReviewCommentsParametrizedInput input, PullRequestReviewCommentConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestReviewResponseProjection commit(CommitResponseProjection subProjection) {
        return commit(null, subProjection);
    }

    public PullRequestReviewResponseProjection commit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewResponseProjection createdAt() {
        return createdAt(null);
    }

    public PullRequestReviewResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection createdViaEmail() {
        return createdViaEmail(null);
    }

    public PullRequestReviewResponseProjection createdViaEmail(String alias) {
        fields.add(new GraphQLResponseField("createdViaEmail").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection databaseId() {
        return databaseId(null);
    }

    public PullRequestReviewResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection editor(ActorResponseProjection subProjection) {
        return editor(null, subProjection);
    }

    public PullRequestReviewResponseProjection editor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("editor").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewResponseProjection id() {
        return id(null);
    }

    public PullRequestReviewResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection includesCreatedEdit() {
        return includesCreatedEdit(null);
    }

    public PullRequestReviewResponseProjection includesCreatedEdit(String alias) {
        fields.add(new GraphQLResponseField("includesCreatedEdit").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection lastEditedAt() {
        return lastEditedAt(null);
    }

    public PullRequestReviewResponseProjection lastEditedAt(String alias) {
        fields.add(new GraphQLResponseField("lastEditedAt").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection onBehalfOf(TeamConnectionResponseProjection subProjection) {
        return onBehalfOf((String)null, subProjection);
    }

    public PullRequestReviewResponseProjection onBehalfOf(String alias, TeamConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("onBehalfOf").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewResponseProjection onBehalfOf(PullRequestReviewOnBehalfOfParametrizedInput input, TeamConnectionResponseProjection subProjection) {
        return onBehalfOf(null, input, subProjection);
    }

    public PullRequestReviewResponseProjection onBehalfOf(String alias, PullRequestReviewOnBehalfOfParametrizedInput input, TeamConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("onBehalfOf").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestReviewResponseProjection publishedAt() {
        return publishedAt(null);
    }

    public PullRequestReviewResponseProjection publishedAt(String alias) {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection pullRequest(PullRequestResponseProjection subProjection) {
        return pullRequest(null, subProjection);
    }

    public PullRequestReviewResponseProjection pullRequest(String alias, PullRequestResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewResponseProjection reactionGroups(ReactionGroupResponseProjection subProjection) {
        return reactionGroups(null, subProjection);
    }

    public PullRequestReviewResponseProjection reactionGroups(String alias, ReactionGroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewResponseProjection reactions(ReactionConnectionResponseProjection subProjection) {
        return reactions((String)null, subProjection);
    }

    public PullRequestReviewResponseProjection reactions(String alias, ReactionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactions").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewResponseProjection reactions(PullRequestReviewReactionsParametrizedInput input, ReactionConnectionResponseProjection subProjection) {
        return reactions(null, input, subProjection);
    }

    public PullRequestReviewResponseProjection reactions(String alias, PullRequestReviewReactionsParametrizedInput input, ReactionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestReviewResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public PullRequestReviewResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public PullRequestReviewResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection state() {
        return state(null);
    }

    public PullRequestReviewResponseProjection state(String alias) {
        fields.add(new GraphQLResponseField("state").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection submittedAt() {
        return submittedAt(null);
    }

    public PullRequestReviewResponseProjection submittedAt(String alias) {
        fields.add(new GraphQLResponseField("submittedAt").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public PullRequestReviewResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection url() {
        return url(null);
    }

    public PullRequestReviewResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection userContentEdits(UserContentEditConnectionResponseProjection subProjection) {
        return userContentEdits((String)null, subProjection);
    }

    public PullRequestReviewResponseProjection userContentEdits(String alias, UserContentEditConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection));
        return this;
    }

    public PullRequestReviewResponseProjection userContentEdits(PullRequestReviewUserContentEditsParametrizedInput input, UserContentEditConnectionResponseProjection subProjection) {
        return userContentEdits(null, input, subProjection);
    }

    public PullRequestReviewResponseProjection userContentEdits(String alias, PullRequestReviewUserContentEditsParametrizedInput input, UserContentEditConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public PullRequestReviewResponseProjection viewerCanDelete() {
        return viewerCanDelete(null);
    }

    public PullRequestReviewResponseProjection viewerCanDelete(String alias) {
        fields.add(new GraphQLResponseField("viewerCanDelete").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection viewerCanReact() {
        return viewerCanReact(null);
    }

    public PullRequestReviewResponseProjection viewerCanReact(String alias) {
        fields.add(new GraphQLResponseField("viewerCanReact").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection viewerCanUpdate() {
        return viewerCanUpdate(null);
    }

    public PullRequestReviewResponseProjection viewerCanUpdate(String alias) {
        fields.add(new GraphQLResponseField("viewerCanUpdate").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection viewerCannotUpdateReasons() {
        return viewerCannotUpdateReasons(null);
    }

    public PullRequestReviewResponseProjection viewerCannotUpdateReasons(String alias) {
        fields.add(new GraphQLResponseField("viewerCannotUpdateReasons").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection viewerDidAuthor() {
        return viewerDidAuthor(null);
    }

    public PullRequestReviewResponseProjection viewerDidAuthor(String alias) {
        fields.add(new GraphQLResponseField("viewerDidAuthor").alias(alias));
        return this;
    }

    public PullRequestReviewResponseProjection typename() {
        return typename(null);
    }

    public PullRequestReviewResponseProjection typename(String alias) {
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
        final PullRequestReviewResponseProjection that = (PullRequestReviewResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
