package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for CommitComment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CommitCommentResponseProjection extends GraphQLResponseProjection {

    public CommitCommentResponseProjection() {
    }

    @Override
    public CommitCommentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public CommitCommentResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentResponseProjection.ActorResponseProjection.author", projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.author", 0) + 1);
            this.author(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.author", 0)));
        }
        this.authorAssociation();
        this.body();
        this.bodyHTML();
        this.bodyText();
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.CommitResponseProjection.commit", 0) + 1);
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.CommitResponseProjection.commit", 0)));
        }
        this.createdAt();
        this.createdViaEmail();
        this.databaseId();
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentResponseProjection.ActorResponseProjection.editor", projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.editor", 0) + 1);
            this.editor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.editor", 0)));
        }
        this.id();
        this.includesCreatedEdit();
        this.isMinimized();
        this.lastEditedAt();
        this.minimizedReason();
        this.path();
        this.position();
        this.publishedAt();
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1);
            this.reactionGroups(new ReactionGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentResponseProjection.ReactionConnectionResponseProjection.reactions", projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1);
            this.reactions(new ReactionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.RepositoryResponseProjection.repository", 0) + 1);
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.RepositoryResponseProjection.repository", 0)));
        }
        this.resourcePath();
        this.updatedAt();
        this.url();
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1);
            this.userContentEdits(new UserContentEditConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)));
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

    public CommitCommentResponseProjection author(ActorResponseProjection subProjection) {
        return author(null, subProjection);
    }

    public CommitCommentResponseProjection author(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection));
        return this;
    }

    public CommitCommentResponseProjection authorAssociation() {
        return authorAssociation(null);
    }

    public CommitCommentResponseProjection authorAssociation(String alias) {
        fields.add(new GraphQLResponseField("authorAssociation").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection body() {
        return body(null);
    }

    public CommitCommentResponseProjection body(String alias) {
        fields.add(new GraphQLResponseField("body").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection bodyHTML() {
        return bodyHTML(null);
    }

    public CommitCommentResponseProjection bodyHTML(String alias) {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection bodyText() {
        return bodyText(null);
    }

    public CommitCommentResponseProjection bodyText(String alias) {
        fields.add(new GraphQLResponseField("bodyText").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection commit(CommitResponseProjection subProjection) {
        return commit(null, subProjection);
    }

    public CommitCommentResponseProjection commit(String alias, CommitResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection));
        return this;
    }

    public CommitCommentResponseProjection createdAt() {
        return createdAt(null);
    }

    public CommitCommentResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection createdViaEmail() {
        return createdViaEmail(null);
    }

    public CommitCommentResponseProjection createdViaEmail(String alias) {
        fields.add(new GraphQLResponseField("createdViaEmail").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection databaseId() {
        return databaseId(null);
    }

    public CommitCommentResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection editor(ActorResponseProjection subProjection) {
        return editor(null, subProjection);
    }

    public CommitCommentResponseProjection editor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("editor").alias(alias).projection(subProjection));
        return this;
    }

    public CommitCommentResponseProjection id() {
        return id(null);
    }

    public CommitCommentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection includesCreatedEdit() {
        return includesCreatedEdit(null);
    }

    public CommitCommentResponseProjection includesCreatedEdit(String alias) {
        fields.add(new GraphQLResponseField("includesCreatedEdit").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection isMinimized() {
        return isMinimized(null);
    }

    public CommitCommentResponseProjection isMinimized(String alias) {
        fields.add(new GraphQLResponseField("isMinimized").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection lastEditedAt() {
        return lastEditedAt(null);
    }

    public CommitCommentResponseProjection lastEditedAt(String alias) {
        fields.add(new GraphQLResponseField("lastEditedAt").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection minimizedReason() {
        return minimizedReason(null);
    }

    public CommitCommentResponseProjection minimizedReason(String alias) {
        fields.add(new GraphQLResponseField("minimizedReason").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection path() {
        return path(null);
    }

    public CommitCommentResponseProjection path(String alias) {
        fields.add(new GraphQLResponseField("path").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection position() {
        return position(null);
    }

    public CommitCommentResponseProjection position(String alias) {
        fields.add(new GraphQLResponseField("position").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection publishedAt() {
        return publishedAt(null);
    }

    public CommitCommentResponseProjection publishedAt(String alias) {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection reactionGroups(ReactionGroupResponseProjection subProjection) {
        return reactionGroups(null, subProjection);
    }

    public CommitCommentResponseProjection reactionGroups(String alias, ReactionGroupResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection));
        return this;
    }

    public CommitCommentResponseProjection reactions(ReactionConnectionResponseProjection subProjection) {
        return reactions((String)null, subProjection);
    }

    public CommitCommentResponseProjection reactions(String alias, ReactionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactions").alias(alias).projection(subProjection));
        return this;
    }

    public CommitCommentResponseProjection reactions(CommitCommentReactionsParametrizedInput input, ReactionConnectionResponseProjection subProjection) {
        return reactions(null, input, subProjection);
    }

    public CommitCommentResponseProjection reactions(String alias, CommitCommentReactionsParametrizedInput input, ReactionConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CommitCommentResponseProjection repository(RepositoryResponseProjection subProjection) {
        return repository(null, subProjection);
    }

    public CommitCommentResponseProjection repository(String alias, RepositoryResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection));
        return this;
    }

    public CommitCommentResponseProjection resourcePath() {
        return resourcePath(null);
    }

    public CommitCommentResponseProjection resourcePath(String alias) {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public CommitCommentResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection url() {
        return url(null);
    }

    public CommitCommentResponseProjection url(String alias) {
        fields.add(new GraphQLResponseField("url").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection userContentEdits(UserContentEditConnectionResponseProjection subProjection) {
        return userContentEdits((String)null, subProjection);
    }

    public CommitCommentResponseProjection userContentEdits(String alias, UserContentEditConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection));
        return this;
    }

    public CommitCommentResponseProjection userContentEdits(CommitCommentUserContentEditsParametrizedInput input, UserContentEditConnectionResponseProjection subProjection) {
        return userContentEdits(null, input, subProjection);
    }

    public CommitCommentResponseProjection userContentEdits(String alias, CommitCommentUserContentEditsParametrizedInput input, UserContentEditConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public CommitCommentResponseProjection viewerCanDelete() {
        return viewerCanDelete(null);
    }

    public CommitCommentResponseProjection viewerCanDelete(String alias) {
        fields.add(new GraphQLResponseField("viewerCanDelete").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection viewerCanMinimize() {
        return viewerCanMinimize(null);
    }

    public CommitCommentResponseProjection viewerCanMinimize(String alias) {
        fields.add(new GraphQLResponseField("viewerCanMinimize").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection viewerCanReact() {
        return viewerCanReact(null);
    }

    public CommitCommentResponseProjection viewerCanReact(String alias) {
        fields.add(new GraphQLResponseField("viewerCanReact").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection viewerCanUpdate() {
        return viewerCanUpdate(null);
    }

    public CommitCommentResponseProjection viewerCanUpdate(String alias) {
        fields.add(new GraphQLResponseField("viewerCanUpdate").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection viewerCannotUpdateReasons() {
        return viewerCannotUpdateReasons(null);
    }

    public CommitCommentResponseProjection viewerCannotUpdateReasons(String alias) {
        fields.add(new GraphQLResponseField("viewerCannotUpdateReasons").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection viewerDidAuthor() {
        return viewerDidAuthor(null);
    }

    public CommitCommentResponseProjection viewerDidAuthor(String alias) {
        fields.add(new GraphQLResponseField("viewerDidAuthor").alias(alias));
        return this;
    }

    public CommitCommentResponseProjection typename() {
        return typename(null);
    }

    public CommitCommentResponseProjection typename(String alias) {
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
        final CommitCommentResponseProjection that = (CommitCommentResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
