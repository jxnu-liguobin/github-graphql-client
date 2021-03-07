package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class IssueTO implements java.io.Serializable, IssueOrPullRequestTO, ReferencedSubjectTO, SearchResultItemTO, RenamedTitleSubjectTO, ProjectCardItemTO, MilestoneItemTO, SubscribableTO, UniformResourceLocatableTO, UpdatableCommentTO, ClosableTO, LockableTO, NodeTO, LabelableTO, ReactableTO, RepositoryNodeTO, AssignableTO, CommentTO, UpdatableTO {

    private LockReasonTO activeLockReason;
    private ActorTO author;
    @javax.validation.constraints.NotNull
    private CommentAuthorAssociationTO authorAssociation;
    @javax.validation.constraints.NotNull
    private String body;
    @javax.validation.constraints.NotNull
    private String bodyHTML;
    @javax.validation.constraints.NotNull
    private String bodyText;
    private boolean closed;
    private String closedAt;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private boolean createdViaEmail;
    private Integer databaseId;
    private ActorTO editor;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean includesCreatedEdit;
    private String lastEditedAt;
    private boolean locked;
    private MilestoneTO milestone;
    private int number;
    private String publishedAt;
    @javax.validation.constraints.NotNull
    private java.util.List<ReactionGroupTO> reactionGroups;
    @javax.validation.constraints.NotNull
    private RepositoryTO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private IssueStateTO state;
    @javax.validation.constraints.NotNull
    private String title;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    private boolean viewerCanReact;
    private boolean viewerCanSubscribe;
    private boolean viewerCanUpdate;
    @javax.validation.constraints.NotNull
    private java.util.List<CommentCannotUpdateReasonTO> viewerCannotUpdateReasons;
    private boolean viewerDidAuthor;
    private SubscriptionStateTO viewerSubscription;

    public IssueTO() {
    }

    public IssueTO(LockReasonTO activeLockReason, ActorTO author, CommentAuthorAssociationTO authorAssociation, String body, String bodyHTML, String bodyText, boolean closed, String closedAt, String createdAt, boolean createdViaEmail, Integer databaseId, ActorTO editor, String id, boolean includesCreatedEdit, String lastEditedAt, boolean locked, MilestoneTO milestone, int number, String publishedAt, java.util.List<ReactionGroupTO> reactionGroups, RepositoryTO repository, String resourcePath, IssueStateTO state, String title, String updatedAt, String url, boolean viewerCanReact, boolean viewerCanSubscribe, boolean viewerCanUpdate, java.util.List<CommentCannotUpdateReasonTO> viewerCannotUpdateReasons, boolean viewerDidAuthor, SubscriptionStateTO viewerSubscription) {
        this.activeLockReason = activeLockReason;
        this.author = author;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.bodyText = bodyText;
        this.closed = closed;
        this.closedAt = closedAt;
        this.createdAt = createdAt;
        this.createdViaEmail = createdViaEmail;
        this.databaseId = databaseId;
        this.editor = editor;
        this.id = id;
        this.includesCreatedEdit = includesCreatedEdit;
        this.lastEditedAt = lastEditedAt;
        this.locked = locked;
        this.milestone = milestone;
        this.number = number;
        this.publishedAt = publishedAt;
        this.reactionGroups = reactionGroups;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.state = state;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerCanReact = viewerCanReact;
        this.viewerCanSubscribe = viewerCanSubscribe;
        this.viewerCanUpdate = viewerCanUpdate;
        this.viewerCannotUpdateReasons = viewerCannotUpdateReasons;
        this.viewerDidAuthor = viewerDidAuthor;
        this.viewerSubscription = viewerSubscription;
    }

    public LockReasonTO getActiveLockReason() {
        return activeLockReason;
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

    public boolean getClosed() {
        return closed;
    }

    public String getClosedAt() {
        return closedAt;
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

    public boolean getLocked() {
        return locked;
    }

    public MilestoneTO getMilestone() {
        return milestone;
    }

    public int getNumber() {
        return number;
    }

    public String getPublishedAt() {
        return publishedAt;
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

    public IssueStateTO getState() {
        return state;
    }

    public String getTitle() {
        return title;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public String getUrl() {
        return url;
    }

    public boolean getViewerCanReact() {
        return viewerCanReact;
    }

    public boolean getViewerCanSubscribe() {
        return viewerCanSubscribe;
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

    public SubscriptionStateTO getViewerSubscription() {
        return viewerSubscription;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (activeLockReason != null) {
            joiner.add("activeLockReason: " + GraphQLRequestSerializer.getEntry(activeLockReason));
        }
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
        joiner.add("closed: " + GraphQLRequestSerializer.getEntry(closed));
        if (closedAt != null) {
            joiner.add("closedAt: " + GraphQLRequestSerializer.getEntry(closedAt));
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
        joiner.add("locked: " + GraphQLRequestSerializer.getEntry(locked));
        if (milestone != null) {
            joiner.add("milestone: " + GraphQLRequestSerializer.getEntry(milestone));
        }
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number));
        if (publishedAt != null) {
            joiner.add("publishedAt: " + GraphQLRequestSerializer.getEntry(publishedAt));
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
        if (title != null) {
            joiner.add("title: " + GraphQLRequestSerializer.getEntry(title));
        }
        if (updatedAt != null) {
            joiner.add("updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        joiner.add("viewerCanReact: " + GraphQLRequestSerializer.getEntry(viewerCanReact));
        joiner.add("viewerCanSubscribe: " + GraphQLRequestSerializer.getEntry(viewerCanSubscribe));
        joiner.add("viewerCanUpdate: " + GraphQLRequestSerializer.getEntry(viewerCanUpdate));
        if (viewerCannotUpdateReasons != null) {
            joiner.add("viewerCannotUpdateReasons: " + GraphQLRequestSerializer.getEntry(viewerCannotUpdateReasons));
        }
        joiner.add("viewerDidAuthor: " + GraphQLRequestSerializer.getEntry(viewerDidAuthor));
        if (viewerSubscription != null) {
            joiner.add("viewerSubscription: " + GraphQLRequestSerializer.getEntry(viewerSubscription));
        }
        return joiner.toString();
    }

    public static IssueTO.Builder builder() {
        return new IssueTO.Builder();
    }

    public static class Builder {

        private LockReasonTO activeLockReason;
        private ActorTO author;
        private CommentAuthorAssociationTO authorAssociation;
        private String body;
        private String bodyHTML;
        private String bodyText;
        private boolean closed;
        private String closedAt;
        private String createdAt;
        private boolean createdViaEmail;
        private Integer databaseId;
        private ActorTO editor;
        private String id;
        private boolean includesCreatedEdit;
        private String lastEditedAt;
        private boolean locked;
        private MilestoneTO milestone;
        private int number;
        private String publishedAt;
        private java.util.List<ReactionGroupTO> reactionGroups;
        private RepositoryTO repository;
        private String resourcePath;
        private IssueStateTO state;
        private String title;
        private String updatedAt;
        private String url;
        private boolean viewerCanReact;
        private boolean viewerCanSubscribe;
        private boolean viewerCanUpdate;
        private java.util.List<CommentCannotUpdateReasonTO> viewerCannotUpdateReasons;
        private boolean viewerDidAuthor;
        private SubscriptionStateTO viewerSubscription;

        public Builder() {
        }

        public Builder setActiveLockReason(LockReasonTO activeLockReason) {
            this.activeLockReason = activeLockReason;
            return this;
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

        public Builder setClosed(boolean closed) {
            this.closed = closed;
            return this;
        }

        public Builder setClosedAt(String closedAt) {
            this.closedAt = closedAt;
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

        public Builder setLocked(boolean locked) {
            this.locked = locked;
            return this;
        }

        public Builder setMilestone(MilestoneTO milestone) {
            this.milestone = milestone;
            return this;
        }

        public Builder setNumber(int number) {
            this.number = number;
            return this;
        }

        public Builder setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
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

        public Builder setState(IssueStateTO state) {
            this.state = state;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
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

        public Builder setViewerCanReact(boolean viewerCanReact) {
            this.viewerCanReact = viewerCanReact;
            return this;
        }

        public Builder setViewerCanSubscribe(boolean viewerCanSubscribe) {
            this.viewerCanSubscribe = viewerCanSubscribe;
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

        public Builder setViewerSubscription(SubscriptionStateTO viewerSubscription) {
            this.viewerSubscription = viewerSubscription;
            return this;
        }


        public IssueTO build() {
            return new IssueTO(activeLockReason, author, authorAssociation, body, bodyHTML, bodyText, closed, closedAt, createdAt, createdViaEmail, databaseId, editor, id, includesCreatedEdit, lastEditedAt, locked, milestone, number, publishedAt, reactionGroups, repository, resourcePath, state, title, updatedAt, url, viewerCanReact, viewerCanSubscribe, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor, viewerSubscription);
        }

    }
}
