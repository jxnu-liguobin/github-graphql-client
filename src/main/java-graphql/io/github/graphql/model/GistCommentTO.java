package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class GistCommentTO implements java.io.Serializable, DeletableTO, UpdatableCommentTO, NodeTO, CommentTO, UpdatableTO {

    private ActorTO author;
    @javax.validation.constraints.NotNull
    private CommentAuthorAssociationTO authorAssociation;
    @javax.validation.constraints.NotNull
    private String body;
    @javax.validation.constraints.NotNull
    private String bodyHTML;
    @javax.validation.constraints.NotNull
    private String bodyText;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private boolean createdViaEmail;
    private Integer databaseId;
    private ActorTO editor;
    @javax.validation.constraints.NotNull
    private GistTO gist;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean includesCreatedEdit;
    private boolean isMinimized;
    private String lastEditedAt;
    private String minimizedReason;
    private String publishedAt;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    private boolean viewerCanDelete;
    private boolean viewerCanMinimize;
    private boolean viewerCanUpdate;
    @javax.validation.constraints.NotNull
    private java.util.List<CommentCannotUpdateReasonTO> viewerCannotUpdateReasons;
    private boolean viewerDidAuthor;

    public GistCommentTO() {
    }

    public GistCommentTO(ActorTO author, CommentAuthorAssociationTO authorAssociation, String body, String bodyHTML, String bodyText, String createdAt, boolean createdViaEmail, Integer databaseId, ActorTO editor, GistTO gist, String id, boolean includesCreatedEdit, boolean isMinimized, String lastEditedAt, String minimizedReason, String publishedAt, String updatedAt, boolean viewerCanDelete, boolean viewerCanMinimize, boolean viewerCanUpdate, java.util.List<CommentCannotUpdateReasonTO> viewerCannotUpdateReasons, boolean viewerDidAuthor) {
        this.author = author;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.bodyText = bodyText;
        this.createdAt = createdAt;
        this.createdViaEmail = createdViaEmail;
        this.databaseId = databaseId;
        this.editor = editor;
        this.gist = gist;
        this.id = id;
        this.includesCreatedEdit = includesCreatedEdit;
        this.isMinimized = isMinimized;
        this.lastEditedAt = lastEditedAt;
        this.minimizedReason = minimizedReason;
        this.publishedAt = publishedAt;
        this.updatedAt = updatedAt;
        this.viewerCanDelete = viewerCanDelete;
        this.viewerCanMinimize = viewerCanMinimize;
        this.viewerCanUpdate = viewerCanUpdate;
        this.viewerCannotUpdateReasons = viewerCannotUpdateReasons;
        this.viewerDidAuthor = viewerDidAuthor;
    }

    public ActorTO getAuthor() {
        return author;
    }

    public CommentAuthorAssociationTO getAuthorAssociation() {
        return authorAssociation;
    }

    public String getBody() {
        return body;
    }

    public String getBodyHTML() {
        return bodyHTML;
    }

    public String getBodyText() {
        return bodyText;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public boolean getCreatedViaEmail() {
        return createdViaEmail;
    }

    public Integer getDatabaseId() {
        return databaseId;
    }

    public ActorTO getEditor() {
        return editor;
    }

    public GistTO getGist() {
        return gist;
    }

    public String getId() {
        return id;
    }

    public boolean getIncludesCreatedEdit() {
        return includesCreatedEdit;
    }

    public boolean getIsMinimized() {
        return isMinimized;
    }

    public String getLastEditedAt() {
        return lastEditedAt;
    }

    public String getMinimizedReason() {
        return minimizedReason;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public boolean getViewerCanDelete() {
        return viewerCanDelete;
    }

    public boolean getViewerCanMinimize() {
        return viewerCanMinimize;
    }

    public boolean getViewerCanUpdate() {
        return viewerCanUpdate;
    }

    public java.util.List<CommentCannotUpdateReasonTO> getViewerCannotUpdateReasons() {
        return viewerCannotUpdateReasons;
    }

    public boolean getViewerDidAuthor() {
        return viewerDidAuthor;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author));
        }
        if (authorAssociation != null) {
            joiner.add("authorAssociation: " + GraphQLRequestSerializer.getEntry(authorAssociation));
        }
        if (body != null) {
            joiner.add("body: " + GraphQLRequestSerializer.getEntry(body));
        }
        if (bodyHTML != null) {
            joiner.add("bodyHTML: " + GraphQLRequestSerializer.getEntry(bodyHTML));
        }
        if (bodyText != null) {
            joiner.add("bodyText: " + GraphQLRequestSerializer.getEntry(bodyText));
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + GraphQLRequestSerializer.getEntry(createdAt));
        }
        joiner.add("createdViaEmail: " + GraphQLRequestSerializer.getEntry(createdViaEmail));
        if (databaseId != null) {
            joiner.add("databaseId: " + GraphQLRequestSerializer.getEntry(databaseId));
        }
        if (editor != null) {
            joiner.add("editor: " + GraphQLRequestSerializer.getEntry(editor));
        }
        if (gist != null) {
            joiner.add("gist: " + GraphQLRequestSerializer.getEntry(gist));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("includesCreatedEdit: " + GraphQLRequestSerializer.getEntry(includesCreatedEdit));
        joiner.add("isMinimized: " + GraphQLRequestSerializer.getEntry(isMinimized));
        if (lastEditedAt != null) {
            joiner.add("lastEditedAt: " + GraphQLRequestSerializer.getEntry(lastEditedAt));
        }
        if (minimizedReason != null) {
            joiner.add("minimizedReason: " + GraphQLRequestSerializer.getEntry(minimizedReason));
        }
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        joiner.add("viewerCanDelete: " + GraphQLRequestSerializer.getEntry(viewerCanDelete));
        joiner.add("viewerCanMinimize: " + GraphQLRequestSerializer.getEntry(viewerCanMinimize));
        joiner.add("viewerCanUpdate: " + GraphQLRequestSerializer.getEntry(viewerCanUpdate));
        if (viewerCannotUpdateReasons != null) {
            joiner.add("viewerCannotUpdateReasons: " + GraphQLRequestSerializer.getEntry(viewerCannotUpdateReasons));
        }
        joiner.add("viewerDidAuthor: " + GraphQLRequestSerializer.getEntry(viewerDidAuthor));
        return joiner.toString();
    }

    public static GistCommentTO.Builder builder() {
        return new GistCommentTO.Builder();
    }

    public static class Builder {

        private ActorTO author;
        private CommentAuthorAssociationTO authorAssociation;
        private String body;
        private String bodyHTML;
        private String bodyText;
        private String createdAt;
        private boolean createdViaEmail;
        private Integer databaseId;
        private ActorTO editor;
        private GistTO gist;
        private String id;
        private boolean includesCreatedEdit;
        private boolean isMinimized;
        private String lastEditedAt;
        private String minimizedReason;
        private String publishedAt;
        private String updatedAt;
        private boolean viewerCanDelete;
        private boolean viewerCanMinimize;
        private boolean viewerCanUpdate;
        private java.util.List<CommentCannotUpdateReasonTO> viewerCannotUpdateReasons;
        private boolean viewerDidAuthor;

        public Builder() {
        }

        public Builder setAuthor(ActorTO author) {
            this.author = author;
            return this;
        }

        public Builder setAuthorAssociation(CommentAuthorAssociationTO authorAssociation) {
            this.authorAssociation = authorAssociation;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setBodyHTML(String bodyHTML) {
            this.bodyHTML = bodyHTML;
            return this;
        }

        public Builder setBodyText(String bodyText) {
            this.bodyText = bodyText;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreatedViaEmail(boolean createdViaEmail) {
            this.createdViaEmail = createdViaEmail;
            return this;
        }

        public Builder setDatabaseId(Integer databaseId) {
            this.databaseId = databaseId;
            return this;
        }

        public Builder setEditor(ActorTO editor) {
            this.editor = editor;
            return this;
        }

        public Builder setGist(GistTO gist) {
            this.gist = gist;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIncludesCreatedEdit(boolean includesCreatedEdit) {
            this.includesCreatedEdit = includesCreatedEdit;
            return this;
        }

        public Builder setIsMinimized(boolean isMinimized) {
            this.isMinimized = isMinimized;
            return this;
        }

        public Builder setLastEditedAt(String lastEditedAt) {
            this.lastEditedAt = lastEditedAt;
            return this;
        }

        public Builder setMinimizedReason(String minimizedReason) {
            this.minimizedReason = minimizedReason;
            return this;
        }

        public Builder setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setViewerCanDelete(boolean viewerCanDelete) {
            this.viewerCanDelete = viewerCanDelete;
            return this;
        }

        public Builder setViewerCanMinimize(boolean viewerCanMinimize) {
            this.viewerCanMinimize = viewerCanMinimize;
            return this;
        }

        public Builder setViewerCanUpdate(boolean viewerCanUpdate) {
            this.viewerCanUpdate = viewerCanUpdate;
            return this;
        }

        public Builder setViewerCannotUpdateReasons(java.util.List<CommentCannotUpdateReasonTO> viewerCannotUpdateReasons) {
            this.viewerCannotUpdateReasons = viewerCannotUpdateReasons;
            return this;
        }

        public Builder setViewerDidAuthor(boolean viewerDidAuthor) {
            this.viewerDidAuthor = viewerDidAuthor;
            return this;
        }


        public GistCommentTO build() {
            return new GistCommentTO(author, authorAssociation, body, bodyHTML, bodyText, createdAt, createdViaEmail, databaseId, editor, gist, id, includesCreatedEdit, isMinimized, lastEditedAt, minimizedReason, publishedAt, updatedAt, viewerCanDelete, viewerCanMinimize, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor);
        }

    }
}
