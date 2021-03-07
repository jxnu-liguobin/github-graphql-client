package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class PullRequestReviewCommentTO implements java.io.Serializable, PullRequestTimelineItemTO, DeletableTO, UpdatableCommentTO, NodeTO, ReactableTO, RepositoryNodeTO, CommentTO, UpdatableTO {

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
    private CommitTO commit;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private boolean createdViaEmail;
    private Integer databaseId;
    @javax.validation.constraints.NotNull
    private String diffHunk;
    @javax.validation.constraints.NotNull
    private String draftedAt;
    private ActorTO editor;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean includesCreatedEdit;
    private boolean isMinimized;
    private String lastEditedAt;
    private String minimizedReason;
    private CommitTO originalCommit;
    private int originalPosition;
    private boolean outdated;
    @javax.validation.constraints.NotNull
    private String path;
    private Integer position;
    private String publishedAt;
    @javax.validation.constraints.NotNull
    private PullRequestTO pullRequest;
    private PullRequestReviewTO pullRequestReview;
    @javax.validation.constraints.NotNull
    private java.util.List<ReactionGroupTO> reactionGroups;
    private PullRequestReviewCommentTO replyTo;
    @javax.validation.constraints.NotNull
    private RepositoryTO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private PullRequestReviewCommentStateTO state;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    private boolean viewerCanDelete;
    private boolean viewerCanMinimize;
    private boolean viewerCanReact;
    private boolean viewerCanUpdate;
    @javax.validation.constraints.NotNull
    private java.util.List<CommentCannotUpdateReasonTO> viewerCannotUpdateReasons;
    private boolean viewerDidAuthor;

    public PullRequestReviewCommentTO() {
    }

    public PullRequestReviewCommentTO(ActorTO author, CommentAuthorAssociationTO authorAssociation, String body, String bodyHTML, String bodyText, CommitTO commit, String createdAt, boolean createdViaEmail, Integer databaseId, String diffHunk, String draftedAt, ActorTO editor, String id, boolean includesCreatedEdit, boolean isMinimized, String lastEditedAt, String minimizedReason, CommitTO originalCommit, int originalPosition, boolean outdated, String path, Integer position, String publishedAt, PullRequestTO pullRequest, PullRequestReviewTO pullRequestReview, java.util.List<ReactionGroupTO> reactionGroups, PullRequestReviewCommentTO replyTo, RepositoryTO repository, String resourcePath, PullRequestReviewCommentStateTO state, String updatedAt, String url, boolean viewerCanDelete, boolean viewerCanMinimize, boolean viewerCanReact, boolean viewerCanUpdate, java.util.List<CommentCannotUpdateReasonTO> viewerCannotUpdateReasons, boolean viewerDidAuthor) {
        this.author = author;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.bodyText = bodyText;
        this.commit = commit;
        this.createdAt = createdAt;
        this.createdViaEmail = createdViaEmail;
        this.databaseId = databaseId;
        this.diffHunk = diffHunk;
        this.draftedAt = draftedAt;
        this.editor = editor;
        this.id = id;
        this.includesCreatedEdit = includesCreatedEdit;
        this.isMinimized = isMinimized;
        this.lastEditedAt = lastEditedAt;
        this.minimizedReason = minimizedReason;
        this.originalCommit = originalCommit;
        this.originalPosition = originalPosition;
        this.outdated = outdated;
        this.path = path;
        this.position = position;
        this.publishedAt = publishedAt;
        this.pullRequest = pullRequest;
        this.pullRequestReview = pullRequestReview;
        this.reactionGroups = reactionGroups;
        this.replyTo = replyTo;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.state = state;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerCanDelete = viewerCanDelete;
        this.viewerCanMinimize = viewerCanMinimize;
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

    public String getDiffHunk() {
        return diffHunk;
    }

    public String getDraftedAt() {
        return draftedAt;
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

    public boolean getIsMinimized() {
        return isMinimized;
    }

    public String getLastEditedAt() {
        return lastEditedAt;
    }

    public String getMinimizedReason() {
        return minimizedReason;
    }

    public CommitTO getOriginalCommit() {
        return originalCommit;
    }

    public int getOriginalPosition() {
        return originalPosition;
    }

    public boolean getOutdated() {
        return outdated;
    }

    public String getPath() {
        return path;
    }

    public Integer getPosition() {
        return position;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public PullRequestTO getPullRequest() {
        return pullRequest;
    }

    public PullRequestReviewTO getPullRequestReview() {
        return pullRequestReview;
    }

    public java.util.List<ReactionGroupTO> getReactionGroups() {
        return reactionGroups;
    }

    public PullRequestReviewCommentTO getReplyTo() {
        return replyTo;
    }

    public RepositoryTO getRepository() {
        return repository;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public PullRequestReviewCommentStateTO getState() {
        return state;
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

    public boolean getViewerCanMinimize() {
        return viewerCanMinimize;
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
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final PullRequestReviewCommentTO that = (PullRequestReviewCommentTO) obj;
        return Objects.equals(author, that.author)
            && Objects.equals(authorAssociation, that.authorAssociation)
            && Objects.equals(body, that.body)
            && Objects.equals(bodyHTML, that.bodyHTML)
            && Objects.equals(bodyText, that.bodyText)
            && Objects.equals(commit, that.commit)
            && Objects.equals(createdAt, that.createdAt)
            && Objects.equals(createdViaEmail, that.createdViaEmail)
            && Objects.equals(databaseId, that.databaseId)
            && Objects.equals(diffHunk, that.diffHunk)
            && Objects.equals(draftedAt, that.draftedAt)
            && Objects.equals(editor, that.editor)
            && Objects.equals(id, that.id)
            && Objects.equals(includesCreatedEdit, that.includesCreatedEdit)
            && Objects.equals(isMinimized, that.isMinimized)
            && Objects.equals(lastEditedAt, that.lastEditedAt)
            && Objects.equals(minimizedReason, that.minimizedReason)
            && Objects.equals(originalCommit, that.originalCommit)
            && Objects.equals(originalPosition, that.originalPosition)
            && Objects.equals(outdated, that.outdated)
            && Objects.equals(path, that.path)
            && Objects.equals(position, that.position)
            && Objects.equals(publishedAt, that.publishedAt)
            && Objects.equals(pullRequest, that.pullRequest)
            && Objects.equals(pullRequestReview, that.pullRequestReview)
            && Objects.equals(reactionGroups, that.reactionGroups)
            && Objects.equals(replyTo, that.replyTo)
            && Objects.equals(repository, that.repository)
            && Objects.equals(resourcePath, that.resourcePath)
            && Objects.equals(state, that.state)
            && Objects.equals(updatedAt, that.updatedAt)
            && Objects.equals(url, that.url)
            && Objects.equals(viewerCanDelete, that.viewerCanDelete)
            && Objects.equals(viewerCanMinimize, that.viewerCanMinimize)
            && Objects.equals(viewerCanReact, that.viewerCanReact)
            && Objects.equals(viewerCanUpdate, that.viewerCanUpdate)
            && Objects.equals(viewerCannotUpdateReasons, that.viewerCannotUpdateReasons)
            && Objects.equals(viewerDidAuthor, that.viewerDidAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, authorAssociation, body, bodyHTML, bodyText, commit, createdAt, createdViaEmail, databaseId, diffHunk, draftedAt, editor, id, includesCreatedEdit, isMinimized, lastEditedAt, minimizedReason, originalCommit, originalPosition, outdated, path, position, publishedAt, pullRequest, pullRequestReview, reactionGroups, replyTo, repository, resourcePath, state, updatedAt, url, viewerCanDelete, viewerCanMinimize, viewerCanReact, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor);
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
        if (diffHunk != null) {
            joiner.add("diffHunk: " + GraphQLRequestSerializer.getEntry(diffHunk));
        }
        if (draftedAt != null) {
            joiner.add("draftedAt: " + GraphQLRequestSerializer.getEntry(draftedAt));
        }
        if (editor != null) {
            joiner.add("editor: " + GraphQLRequestSerializer.getEntry(editor));
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
        if (originalCommit != null) {
            joiner.add("originalCommit: " + GraphQLRequestSerializer.getEntry(originalCommit));
        }
        joiner.add("originalPosition: " + GraphQLRequestSerializer.getEntry(originalPosition));
        joiner.add("outdated: " + GraphQLRequestSerializer.getEntry(outdated));
        if (path != null) {
            joiner.add("path: " + GraphQLRequestSerializer.getEntry(path));
        }
        if (position != null) {
            joiner.add("position: " + GraphQLRequestSerializer.getEntry(position));
        }
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt));
        }
        if (pullRequest != null) {
            joiner.add("pullRequest: " + GraphQLRequestSerializer.getEntry(pullRequest));
        }
        if (pullRequestReview != null) {
            joiner.add("pullRequestReview: " + GraphQLRequestSerializer.getEntry(pullRequestReview));
        }
        if (reactionGroups != null) {
            joiner.add("reactionGroups: " + GraphQLRequestSerializer.getEntry(reactionGroups));
        }
        if (replyTo != null) {
            joiner.add("replyTo: " + GraphQLRequestSerializer.getEntry(replyTo));
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
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        joiner.add("viewerCanDelete: " + GraphQLRequestSerializer.getEntry(viewerCanDelete));
        joiner.add("viewerCanMinimize: " + GraphQLRequestSerializer.getEntry(viewerCanMinimize));
        joiner.add("viewerCanReact: " + GraphQLRequestSerializer.getEntry(viewerCanReact));
        joiner.add("viewerCanUpdate: " + GraphQLRequestSerializer.getEntry(viewerCanUpdate));
        if (viewerCannotUpdateReasons != null) {
            joiner.add("viewerCannotUpdateReasons: " + GraphQLRequestSerializer.getEntry(viewerCannotUpdateReasons));
        }
        joiner.add("viewerDidAuthor: " + GraphQLRequestSerializer.getEntry(viewerDidAuthor));
        return joiner.toString();
    }

    public static PullRequestReviewCommentTO.Builder builder() {
        return new PullRequestReviewCommentTO.Builder();
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
        private String diffHunk;
        private String draftedAt;
        private ActorTO editor;
        private String id;
        private boolean includesCreatedEdit;
        private boolean isMinimized;
        private String lastEditedAt;
        private String minimizedReason;
        private CommitTO originalCommit;
        private int originalPosition;
        private boolean outdated;
        private String path;
        private Integer position;
        private String publishedAt;
        private PullRequestTO pullRequest;
        private PullRequestReviewTO pullRequestReview;
        private java.util.List<ReactionGroupTO> reactionGroups;
        private PullRequestReviewCommentTO replyTo;
        private RepositoryTO repository;
        private String resourcePath;
        private PullRequestReviewCommentStateTO state;
        private String updatedAt;
        private String url;
        private boolean viewerCanDelete;
        private boolean viewerCanMinimize;
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

        public Builder setDiffHunk(String diffHunk) {
            this.diffHunk = diffHunk;
            return this;
        }

        public Builder setDraftedAt(String draftedAt) {
            this.draftedAt = draftedAt;
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

        public Builder setOriginalCommit(CommitTO originalCommit) {
            this.originalCommit = originalCommit;
            return this;
        }

        public Builder setOriginalPosition(int originalPosition) {
            this.originalPosition = originalPosition;
            return this;
        }

        public Builder setOutdated(boolean outdated) {
            this.outdated = outdated;
            return this;
        }

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        public Builder setPosition(Integer position) {
            this.position = position;
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

        public Builder setPullRequestReview(PullRequestReviewTO pullRequestReview) {
            this.pullRequestReview = pullRequestReview;
            return this;
        }

        public Builder setReactionGroups(java.util.List<ReactionGroupTO> reactionGroups) {
            this.reactionGroups = reactionGroups;
            return this;
        }

        public Builder setReplyTo(PullRequestReviewCommentTO replyTo) {
            this.replyTo = replyTo;
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

        public Builder setState(PullRequestReviewCommentStateTO state) {
            this.state = state;
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

        public Builder setViewerCanMinimize(boolean viewerCanMinimize) {
            this.viewerCanMinimize = viewerCanMinimize;
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


        public PullRequestReviewCommentTO build() {
            return new PullRequestReviewCommentTO(author, authorAssociation, body, bodyHTML, bodyText, commit, createdAt, createdViaEmail, databaseId, diffHunk, draftedAt, editor, id, includesCreatedEdit, isMinimized, lastEditedAt, minimizedReason, originalCommit, originalPosition, outdated, path, position, publishedAt, pullRequest, pullRequestReview, reactionGroups, replyTo, repository, resourcePath, state, updatedAt, url, viewerCanDelete, viewerCanMinimize, viewerCanReact, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor);
        }

    }
}
