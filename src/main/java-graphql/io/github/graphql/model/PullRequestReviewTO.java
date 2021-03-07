package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:48+0800"
)
public class PullRequestReviewTO implements java.io.Serializable, PullRequestTimelineItemsTO, PullRequestTimelineItemTO, DeletableTO, UpdatableCommentTO, NodeTO, ReactableTO, RepositoryNodeTO, CommentTO, UpdatableTO {

    private ActorTO author;
    @javax.validation.constraints.NotNull
    private CommentAuthorAssociationTO authorAssociation;
    @javax.validation.constraints.NotNull
    private String body;
    @javax.validation.constraints.NotNull
    private String bodyHTML;
    @javax.validation.constraints.NotNull
    private String bodyText;
    private CommitTO commit;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private boolean createdViaEmail;
    private Integer databaseId;
    private ActorTO editor;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean includesCreatedEdit;
    private String lastEditedAt;
    private String publishedAt;
    @javax.validation.constraints.NotNull
    private PullRequestTO pullRequest;
    @javax.validation.constraints.NotNull
    private java.util.List<ReactionGroupTO> reactionGroups;
    @javax.validation.constraints.NotNull
    private RepositoryTO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private PullRequestReviewStateTO state;
    private String submittedAt;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    private boolean viewerCanDelete;
    private boolean viewerCanReact;
    private boolean viewerCanUpdate;
    @javax.validation.constraints.NotNull
    private java.util.List<CommentCannotUpdateReasonTO> viewerCannotUpdateReasons;
    private boolean viewerDidAuthor;

    public PullRequestReviewTO() {
    }

    public PullRequestReviewTO(ActorTO author, CommentAuthorAssociationTO authorAssociation, String body, String bodyHTML, String bodyText, CommitTO commit, String createdAt, boolean createdViaEmail, Integer databaseId, ActorTO editor, String id, boolean includesCreatedEdit, String lastEditedAt, String publishedAt, PullRequestTO pullRequest, java.util.List<ReactionGroupTO> reactionGroups, RepositoryTO repository, String resourcePath, PullRequestReviewStateTO state, String submittedAt, String updatedAt, String url, boolean viewerCanDelete, boolean viewerCanReact, boolean viewerCanUpdate, java.util.List<CommentCannotUpdateReasonTO> viewerCannotUpdateReasons, boolean viewerDidAuthor) {
        this.author = author;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.bodyText = bodyText;
        this.commit = commit;
        this.createdAt = createdAt;
        this.createdViaEmail = createdViaEmail;
        this.databaseId = databaseId;
        this.editor = editor;
        this.id = id;
        this.includesCreatedEdit = includesCreatedEdit;
        this.lastEditedAt = lastEditedAt;
        this.publishedAt = publishedAt;
        this.pullRequest = pullRequest;
        this.reactionGroups = reactionGroups;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.state = state;
        this.submittedAt = submittedAt;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerCanDelete = viewerCanDelete;
        this.viewerCanReact = viewerCanReact;
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

    public CommitTO getCommit() {
        return commit;
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

    public String getId() {
        return id;
    }

    public boolean getIncludesCreatedEdit() {
        return includesCreatedEdit;
    }

    public String getLastEditedAt() {
        return lastEditedAt;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public PullRequestTO getPullRequest() {
        return pullRequest;
    }

    public java.util.List<ReactionGroupTO> getReactionGroups() {
        return reactionGroups;
    }

    public RepositoryTO getRepository() {
        return repository;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public PullRequestReviewStateTO getState() {
        return state;
    }

    public String getSubmittedAt() {
        return submittedAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getUrl() {
        return url;
    }

    public boolean getViewerCanDelete() {
        return viewerCanDelete;
    }

    public boolean getViewerCanReact() {
        return viewerCanReact;
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
        if (commit != null) {
            joiner.add("commit: " + GraphQLRequestSerializer.getEntry(commit));
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
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("includesCreatedEdit: " + GraphQLRequestSerializer.getEntry(includesCreatedEdit));
        if (lastEditedAt != null) {
            joiner.add("lastEditedAt: " + GraphQLRequestSerializer.getEntry(lastEditedAt));
        }
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt));
        }
        if (pullRequest != null) {
            joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest));
        }
        if (reactionGroups != null) {
            joiner.add("reactionGroups: " + GraphQLRequestSerializer.getEntry(reactionGroups));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
        }
        if (submittedAt != null) {
            joiner.add("submittedAt: " + GraphQLRequestSerializer.getEntry(submittedAt));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        joiner.add("viewerCanDelete: " + GraphQLRequestSerializer.getEntry(viewerCanDelete));
        joiner.add("viewerCanReact: " + GraphQLRequestSerializer.getEntry(viewerCanReact));
        joiner.add("viewerCanUpdate: " + GraphQLRequestSerializer.getEntry(viewerCanUpdate));
        if (viewerCannotUpdateReasons != null) {
            joiner.add("viewerCannotUpdateReasons: " + GraphQLRequestSerializer.getEntry(viewerCannotUpdateReasons));
        }
        joiner.add("viewerDidAuthor: " + GraphQLRequestSerializer.getEntry(viewerDidAuthor));
        return joiner.toString();
    }

    public static PullRequestReviewTO.Builder builder() {
        return new PullRequestReviewTO.Builder();
    }

    public static class Builder {

        private ActorTO author;
        private CommentAuthorAssociationTO authorAssociation;
        private String body;
        private String bodyHTML;
        private String bodyText;
        private CommitTO commit;
        private String createdAt;
        private boolean createdViaEmail;
        private Integer databaseId;
        private ActorTO editor;
        private String id;
        private boolean includesCreatedEdit;
        private String lastEditedAt;
        private String publishedAt;
        private PullRequestTO pullRequest;
        private java.util.List<ReactionGroupTO> reactionGroups;
        private RepositoryTO repository;
        private String resourcePath;
        private PullRequestReviewStateTO state;
        private String submittedAt;
        private String updatedAt;
        private String url;
        private boolean viewerCanDelete;
        private boolean viewerCanReact;
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

        public Builder setCommit(CommitTO commit) {
            this.commit = commit;
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

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setIncludesCreatedEdit(boolean includesCreatedEdit) {
            this.includesCreatedEdit = includesCreatedEdit;
            return this;
        }

        public Builder setLastEditedAt(String lastEditedAt) {
            this.lastEditedAt = lastEditedAt;
            return this;
        }

        public Builder setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
            return this;
        }

        public Builder setPullRequest(PullRequestTO pullRequest) {
            this.pullRequest = pullRequest;
            return this;
        }

        public Builder setReactionGroups(java.util.List<ReactionGroupTO> reactionGroups) {
            this.reactionGroups = reactionGroups;
            return this;
        }

        public Builder setRepository(RepositoryTO repository) {
            this.repository = repository;
            return this;
        }

        public Builder setResourcePath(String resourcePath) {
            this.resourcePath = resourcePath;
            return this;
        }

        public Builder setState(PullRequestReviewStateTO state) {
            this.state = state;
            return this;
        }

        public Builder setSubmittedAt(String submittedAt) {
            this.submittedAt = submittedAt;
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setViewerCanDelete(boolean viewerCanDelete) {
            this.viewerCanDelete = viewerCanDelete;
            return this;
        }

        public Builder setViewerCanReact(boolean viewerCanReact) {
            this.viewerCanReact = viewerCanReact;
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


        public PullRequestReviewTO build() {
            return new PullRequestReviewTO(author, authorAssociation, body, bodyHTML, bodyText, commit, createdAt, createdViaEmail, databaseId, editor, id, includesCreatedEdit, lastEditedAt, publishedAt, pullRequest, reactionGroups, repository, resourcePath, state, submittedAt, updatedAt, url, viewerCanDelete, viewerCanReact, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor);
        }

    }
}
