package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.Objects;

/**
 * Response projection for GistComment
 */
@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class GistCommentResponseProjection extends GraphQLResponseProjection {

    public GistCommentResponseProjection() {
    }

    @Override
    public GistCommentResponseProjection all$() {
        return all$(3);
    }

    @Override
    public GistCommentResponseProjection all$(int maxDepth) {
        if (projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistCommentResponseProjection.ActorResponseProjection.author", projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.author", 0) + 1);
            this.author(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.author", 0)));
        }
        this.authorAssociation();
        this.body();
        this.bodyHTML();
        this.bodyText();
        this.createdAt();
        this.createdViaEmail();
        this.databaseId();
        if (projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistCommentResponseProjection.ActorResponseProjection.editor", projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.editor", 0) + 1);
            this.editor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.editor", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.GistResponseProjection.gist", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistCommentResponseProjection.GistResponseProjection.gist", projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.GistResponseProjection.gist", 0) + 1);
            this.gist(new GistResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.GistResponseProjection.gist", 0)));
        }
        this.id();
        this.includesCreatedEdit();
        this.isMinimized();
        this.lastEditedAt();
        this.minimizedReason();
        this.publishedAt();
        this.updatedAt();
        if (projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1);
            this.userContentEdits(new UserContentEditConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)));
        }
        this.viewerCanDelete();
        this.viewerCanMinimize();
        this.viewerCanUpdate();
        this.viewerCannotUpdateReasons();
        this.viewerDidAuthor();
        this.typename();
        return this;
    }

    public GistCommentResponseProjection author(ActorResponseProjection subProjection) {
        return author(null, subProjection);
    }

    public GistCommentResponseProjection author(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection));
        return this;
    }

    public GistCommentResponseProjection authorAssociation() {
        return authorAssociation(null);
    }

    public GistCommentResponseProjection authorAssociation(String alias) {
        fields.add(new GraphQLResponseField("authorAssociation").alias(alias));
        return this;
    }

    public GistCommentResponseProjection body() {
        return body(null);
    }

    public GistCommentResponseProjection body(String alias) {
        fields.add(new GraphQLResponseField("body").alias(alias));
        return this;
    }

    public GistCommentResponseProjection bodyHTML() {
        return bodyHTML(null);
    }

    public GistCommentResponseProjection bodyHTML(String alias) {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias));
        return this;
    }

    public GistCommentResponseProjection bodyText() {
        return bodyText(null);
    }

    public GistCommentResponseProjection bodyText(String alias) {
        fields.add(new GraphQLResponseField("bodyText").alias(alias));
        return this;
    }

    public GistCommentResponseProjection createdAt() {
        return createdAt(null);
    }

    public GistCommentResponseProjection createdAt(String alias) {
        fields.add(new GraphQLResponseField("createdAt").alias(alias));
        return this;
    }

    public GistCommentResponseProjection createdViaEmail() {
        return createdViaEmail(null);
    }

    public GistCommentResponseProjection createdViaEmail(String alias) {
        fields.add(new GraphQLResponseField("createdViaEmail").alias(alias));
        return this;
    }

    public GistCommentResponseProjection databaseId() {
        return databaseId(null);
    }

    public GistCommentResponseProjection databaseId(String alias) {
        fields.add(new GraphQLResponseField("databaseId").alias(alias));
        return this;
    }

    public GistCommentResponseProjection editor(ActorResponseProjection subProjection) {
        return editor(null, subProjection);
    }

    public GistCommentResponseProjection editor(String alias, ActorResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("editor").alias(alias).projection(subProjection));
        return this;
    }

    public GistCommentResponseProjection gist(GistResponseProjection subProjection) {
        return gist(null, subProjection);
    }

    public GistCommentResponseProjection gist(String alias, GistResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("gist").alias(alias).projection(subProjection));
        return this;
    }

    public GistCommentResponseProjection id() {
        return id(null);
    }

    public GistCommentResponseProjection id(String alias) {
        fields.add(new GraphQLResponseField("id").alias(alias));
        return this;
    }

    public GistCommentResponseProjection includesCreatedEdit() {
        return includesCreatedEdit(null);
    }

    public GistCommentResponseProjection includesCreatedEdit(String alias) {
        fields.add(new GraphQLResponseField("includesCreatedEdit").alias(alias));
        return this;
    }

    public GistCommentResponseProjection isMinimized() {
        return isMinimized(null);
    }

    public GistCommentResponseProjection isMinimized(String alias) {
        fields.add(new GraphQLResponseField("isMinimized").alias(alias));
        return this;
    }

    public GistCommentResponseProjection lastEditedAt() {
        return lastEditedAt(null);
    }

    public GistCommentResponseProjection lastEditedAt(String alias) {
        fields.add(new GraphQLResponseField("lastEditedAt").alias(alias));
        return this;
    }

    public GistCommentResponseProjection minimizedReason() {
        return minimizedReason(null);
    }

    public GistCommentResponseProjection minimizedReason(String alias) {
        fields.add(new GraphQLResponseField("minimizedReason").alias(alias));
        return this;
    }

    public GistCommentResponseProjection publishedAt() {
        return publishedAt(null);
    }

    public GistCommentResponseProjection publishedAt(String alias) {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias));
        return this;
    }

    public GistCommentResponseProjection updatedAt() {
        return updatedAt(null);
    }

    public GistCommentResponseProjection updatedAt(String alias) {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias));
        return this;
    }

    public GistCommentResponseProjection userContentEdits(UserContentEditConnectionResponseProjection subProjection) {
        return userContentEdits((String)null, subProjection);
    }

    public GistCommentResponseProjection userContentEdits(String alias, UserContentEditConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection));
        return this;
    }

    public GistCommentResponseProjection userContentEdits(GistCommentUserContentEditsParametrizedInput input, UserContentEditConnectionResponseProjection subProjection) {
        return userContentEdits(null, input, subProjection);
    }

    public GistCommentResponseProjection userContentEdits(String alias, GistCommentUserContentEditsParametrizedInput input, UserContentEditConnectionResponseProjection subProjection) {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public GistCommentResponseProjection viewerCanDelete() {
        return viewerCanDelete(null);
    }

    public GistCommentResponseProjection viewerCanDelete(String alias) {
        fields.add(new GraphQLResponseField("viewerCanDelete").alias(alias));
        return this;
    }

    public GistCommentResponseProjection viewerCanMinimize() {
        return viewerCanMinimize(null);
    }

    public GistCommentResponseProjection viewerCanMinimize(String alias) {
        fields.add(new GraphQLResponseField("viewerCanMinimize").alias(alias));
        return this;
    }

    public GistCommentResponseProjection viewerCanUpdate() {
        return viewerCanUpdate(null);
    }

    public GistCommentResponseProjection viewerCanUpdate(String alias) {
        fields.add(new GraphQLResponseField("viewerCanUpdate").alias(alias));
        return this;
    }

    public GistCommentResponseProjection viewerCannotUpdateReasons() {
        return viewerCannotUpdateReasons(null);
    }

    public GistCommentResponseProjection viewerCannotUpdateReasons(String alias) {
        fields.add(new GraphQLResponseField("viewerCannotUpdateReasons").alias(alias));
        return this;
    }

    public GistCommentResponseProjection viewerDidAuthor() {
        return viewerDidAuthor(null);
    }

    public GistCommentResponseProjection viewerDidAuthor(String alias) {
        fields.add(new GraphQLResponseField("viewerDidAuthor").alias(alias));
        return this;
    }

    public GistCommentResponseProjection typename() {
        return typename(null);
    }

    public GistCommentResponseProjection typename(String alias) {
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
        final GistCommentResponseProjection that = (GistCommentResponseProjection) obj;
        return Objects.equals(fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

}
