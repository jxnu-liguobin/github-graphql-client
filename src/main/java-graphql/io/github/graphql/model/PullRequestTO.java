package io.github.graphql.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-06T19:47:47+0800"
)
public class PullRequestTO implements java.io.Serializable, CloserTO, IssueOrPullRequestTO, ReferencedSubjectTO, SearchResultItemTO, RenamedTitleSubjectTO, ProjectCardItemTO, MilestoneItemTO, SubscribableTO, UniformResourceLocatableTO, UpdatableCommentTO, ClosableTO, LockableTO, NodeTO, LabelableTO, ReactableTO, RepositoryNodeTO, AssignableTO, CommentTO, UpdatableTO {

    private LockReasonTO activeLockReason;
    private int additions;
    private ActorTO author;
    @javax.validation.constraints.NotNull
    private CommentAuthorAssociationTO authorAssociation;
    private RefTO baseRef;
    @javax.validation.constraints.NotNull
    private String baseRefName;
    @javax.validation.constraints.NotNull
    private String baseRefOid;
    private RepositoryTO baseRepository;
    @javax.validation.constraints.NotNull
    private String body;
    @javax.validation.constraints.NotNull
    private String bodyHTML;
    @javax.validation.constraints.NotNull
    private String bodyText;
    private int changedFiles;
    private boolean closed;
    private String closedAt;
    @javax.validation.constraints.NotNull
    private String createdAt;
    private boolean createdViaEmail;
    private Integer databaseId;
    private int deletions;
    private ActorTO editor;
    private RefTO headRef;
    @javax.validation.constraints.NotNull
    private String headRefName;
    @javax.validation.constraints.NotNull
    private String headRefOid;
    private RepositoryTO headRepository;
    private RepositoryOwnerTO headRepositoryOwner;
    @javax.validation.constraints.NotNull
    private String id;
    private boolean includesCreatedEdit;
    private boolean isCrossRepository;
    private String lastEditedAt;
    private boolean locked;
    private boolean maintainerCanModify;
    private CommitTO mergeCommit;
    @javax.validation.constraints.NotNull
    private MergeableStateTO mergeable;
    private boolean merged;
    private String mergedAt;
    private ActorTO mergedBy;
    private MilestoneTO milestone;
    private int number;
    @javax.validation.constraints.NotNull
    private String permalink;
    private CommitTO potentialMergeCommit;
    private String publishedAt;
    @javax.validation.constraints.NotNull
    private java.util.List<ReactionGroupTO> reactionGroups;
    @javax.validation.constraints.NotNull
    private RepositoryTO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    @javax.validation.constraints.NotNull
    private String revertResourcePath;
    @javax.validation.constraints.NotNull
    private String revertUrl;
    @javax.validation.constraints.NotNull
    private PullRequestStateTO state;
    @javax.validation.constraints.NotNull
    private java.util.List<SuggestedReviewerTO> suggestedReviewers;
    @javax.validation.constraints.NotNull
    private String title;
    @javax.validation.constraints.NotNull
    private String updatedAt;
    @javax.validation.constraints.NotNull
    private String url;
    private boolean viewerCanApplySuggestion;
    private boolean viewerCanReact;
    private boolean viewerCanSubscribe;
    private boolean viewerCanUpdate;
    @javax.validation.constraints.NotNull
    private java.util.List<CommentCannotUpdateReasonTO> viewerCannotUpdateReasons;
    private boolean viewerDidAuthor;
    private SubscriptionStateTO viewerSubscription;

    public PullRequestTO() {
    }

    public PullRequestTO(LockReasonTO activeLockReason, int additions, ActorTO author, CommentAuthorAssociationTO authorAssociation, RefTO baseRef, String baseRefName, String baseRefOid, RepositoryTO baseRepository, String body, String bodyHTML, String bodyText, int changedFiles, boolean closed, String closedAt, String createdAt, boolean createdViaEmail, Integer databaseId, int deletions, ActorTO editor, RefTO headRef, String headRefName, String headRefOid, RepositoryTO headRepository, RepositoryOwnerTO headRepositoryOwner, String id, boolean includesCreatedEdit, boolean isCrossRepository, String lastEditedAt, boolean locked, boolean maintainerCanModify, CommitTO mergeCommit, MergeableStateTO mergeable, boolean merged, String mergedAt, ActorTO mergedBy, MilestoneTO milestone, int number, String permalink, CommitTO potentialMergeCommit, String publishedAt, java.util.List<ReactionGroupTO> reactionGroups, RepositoryTO repository, String resourcePath, String revertResourcePath, String revertUrl, PullRequestStateTO state, java.util.List<SuggestedReviewerTO> suggestedReviewers, String title, String updatedAt, String url, boolean viewerCanApplySuggestion, boolean viewerCanReact, boolean viewerCanSubscribe, boolean viewerCanUpdate, java.util.List<CommentCannotUpdateReasonTO> viewerCannotUpdateReasons, boolean viewerDidAuthor, SubscriptionStateTO viewerSubscription) {
        this.activeLockReason = activeLockReason;
        this.additions = additions;
        this.author = author;
        this.authorAssociation = authorAssociation;
        this.baseRef = baseRef;
        this.baseRefName = baseRefName;
        this.baseRefOid = baseRefOid;
        this.baseRepository = baseRepository;
        this.body = body;
        this.bodyHTML = bodyHTML;
        this.bodyText = bodyText;
        this.changedFiles = changedFiles;
        this.closed = closed;
        this.closedAt = closedAt;
        this.createdAt = createdAt;
        this.createdViaEmail = createdViaEmail;
        this.databaseId = databaseId;
        this.deletions = deletions;
        this.editor = editor;
        this.headRef = headRef;
        this.headRefName = headRefName;
        this.headRefOid = headRefOid;
        this.headRepository = headRepository;
        this.headRepositoryOwner = headRepositoryOwner;
        this.id = id;
        this.includesCreatedEdit = includesCreatedEdit;
        this.isCrossRepository = isCrossRepository;
        this.lastEditedAt = lastEditedAt;
        this.locked = locked;
        this.maintainerCanModify = maintainerCanModify;
        this.mergeCommit = mergeCommit;
        this.mergeable = mergeable;
        this.merged = merged;
        this.mergedAt = mergedAt;
        this.mergedBy = mergedBy;
        this.milestone = milestone;
        this.number = number;
        this.permalink = permalink;
        this.potentialMergeCommit = potentialMergeCommit;
        this.publishedAt = publishedAt;
        this.reactionGroups = reactionGroups;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.revertResourcePath = revertResourcePath;
        this.revertUrl = revertUrl;
        this.state = state;
        this.suggestedReviewers = suggestedReviewers;
        this.title = title;
        this.updatedAt = updatedAt;
        this.url = url;
        this.viewerCanApplySuggestion = viewerCanApplySuggestion;
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

    public int getAdditions() {
        return additions;
    }

    public ActorTO getAuthor() {
        return author;
    }

    public CommentAuthorAssociationTO getAuthorAssociation() {
        return authorAssociation;
    }

    public RefTO getBaseRef() {
        return baseRef;
    }

    public String getBaseRefName() {
        return baseRefName;
    }

    public String getBaseRefOid() {
        return baseRefOid;
    }

    public RepositoryTO getBaseRepository() {
        return baseRepository;
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

    public int getChangedFiles() {
        return changedFiles;
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

    public int getDeletions() {
        return deletions;
    }

    public ActorTO getEditor() {
        return editor;
    }

    public RefTO getHeadRef() {
        return headRef;
    }

    public String getHeadRefName() {
        return headRefName;
    }

    public String getHeadRefOid() {
        return headRefOid;
    }

    public RepositoryTO getHeadRepository() {
        return headRepository;
    }

    public RepositoryOwnerTO getHeadRepositoryOwner() {
        return headRepositoryOwner;
    }

    public String getId() {
        return id;
    }

    public boolean getIncludesCreatedEdit() {
        return includesCreatedEdit;
    }

    public boolean getIsCrossRepository() {
        return isCrossRepository;
    }

    public String getLastEditedAt() {
        return lastEditedAt;
    }

    public boolean getLocked() {
        return locked;
    }

    public boolean getMaintainerCanModify() {
        return maintainerCanModify;
    }

    public CommitTO getMergeCommit() {
        return mergeCommit;
    }

    public MergeableStateTO getMergeable() {
        return mergeable;
    }

    public boolean getMerged() {
        return merged;
    }

    public String getMergedAt() {
        return mergedAt;
    }

    public ActorTO getMergedBy() {
        return mergedBy;
    }

    public MilestoneTO getMilestone() {
        return milestone;
    }

    public int getNumber() {
        return number;
    }

    public String getPermalink() {
        return permalink;
    }

    public CommitTO getPotentialMergeCommit() {
        return potentialMergeCommit;
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

    public String getRevertResourcePath() {
        return revertResourcePath;
    }

    public String getRevertUrl() {
        return revertUrl;
    }

    public PullRequestStateTO getState() {
        return state;
    }

    public java.util.List<SuggestedReviewerTO> getSuggestedReviewers() {
        return suggestedReviewers;
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

    public boolean getViewerCanApplySuggestion() {
        return viewerCanApplySuggestion;
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
        joiner.add("additions: " + GraphQLRequestSerializer.getEntry(additions));
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author));
        }
        if (authorAssociation != null) {
            joiner.add("authorAssociation: " + GraphQLRequestSerializer.getEntry(authorAssociation));
        }
        if (baseRef != null) {
            joiner.add("baseRef: " + GraphQLRequestSerializer.getEntry(baseRef));
        }
        if (baseRefName != null) {
            joiner.add("baseRefName: " + GraphQLRequestSerializer.getEntry(baseRefName));
        }
        if (baseRefOid != null) {
            joiner.add("baseRefOid: " + GraphQLRequestSerializer.getEntry(baseRefOid));
        }
        if (baseRepository != null) {
            joiner.add("baseRepository: " + GraphQLRequestSerializer.getEntry(baseRepository));
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
        joiner.add("changedFiles: " + GraphQLRequestSerializer.getEntry(changedFiles));
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
        joiner.add("deletions: " + GraphQLRequestSerializer.getEntry(deletions));
        if (editor != null) {
            joiner.add("editor: " + GraphQLRequestSerializer.getEntry(editor));
        }
        if (headRef != null) {
            joiner.add("headRef: " + GraphQLRequestSerializer.getEntry(headRef));
        }
        if (headRefName != null) {
            joiner.add("headRefName: " + GraphQLRequestSerializer.getEntry(headRefName));
        }
        if (headRefOid != null) {
            joiner.add("headRefOid: " + GraphQLRequestSerializer.getEntry(headRefOid));
        }
        if (headRepository != null) {
            joiner.add("headRepository: " + GraphQLRequestSerializer.getEntry(headRepository));
        }
        if (headRepositoryOwner != null) {
            joiner.add("headRepositoryOwner: " + GraphQLRequestSerializer.getEntry(headRepositoryOwner));
        }
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        joiner.add("includesCreatedEdit: " + GraphQLRequestSerializer.getEntry(includesCreatedEdit));
        joiner.add("isCrossRepository: " + GraphQLRequestSerializer.getEntry(isCrossRepository));
        if (lastEditedAt != null) {
            joiner.add("lastEditedAt: " + GraphQLRequestSerializer.getEntry(lastEditedAt));
        }
        joiner.add("locked: " + GraphQLRequestSerializer.getEntry(locked));
        joiner.add("maintainerCanModify: " + GraphQLRequestSerializer.getEntry(maintainerCanModify));
        if (mergeCommit != null) {
            joiner.add("mergeCommit: " + GraphQLRequestSerializer.getEntry(mergeCommit));
        }
        if (mergeable != null) {
            joiner.add("mergeable: " + GraphQLRequestSerializer.getEntry(mergeable));
        }
        joiner.add("merged: " + GraphQLRequestSerializer.getEntry(merged));
        if (mergedAt != null) {
            joiner.add("mergedAt: " + GraphQLRequestSerializer.getEntry(mergedAt));
        }
        if (mergedBy != null) {
            joiner.add("mergedBy: " + GraphQLRequestSerializer.getEntry(mergedBy));
        }
        if (milestone != null) {
            joiner.add("milestone: " + GraphQLRequestSerializer.getEntry(milestone));
        }
        joiner.add("number: " + GraphQLRequestSerializer.getEntry(number));
        if (permalink != null) {
            joiner.add("permalink: " + GraphQLRequestSerializer.getEntry(permalink));
        }
        if (potentialMergeCommit != null) {
            joiner.add("potentialMergeCommit: " + GraphQLRequestSerializer.getEntry(potentialMergeCommit));
        }
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
        if (revertResourcePath != null) {
            joiner.add("revertResourcePath: " + GraphQLRequestSerializer.getEntry(revertResourcePath));
        }
        if (revertUrl != null) {
            joiner.add("revertUrl: " + GraphQLRequestSerializer.getEntry(revertUrl));
        }
        if (state != null) {
            joiner.add("state: " + GraphQLRequestSerializer.getEntry(state));
        }
        if (suggestedReviewers != null) {
            joiner.add("suggestedReviewers: " + GraphQLRequestSerializer.getEntry(suggestedReviewers));
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
        joiner.add("viewerCanApplySuggestion: " + GraphQLRequestSerializer.getEntry(viewerCanApplySuggestion));
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

    public static PullRequestTO.Builder builder() {
        return new PullRequestTO.Builder();
    }

    public static class Builder {

        private LockReasonTO activeLockReason;
        private int additions;
        private ActorTO author;
        private CommentAuthorAssociationTO authorAssociation;
        private RefTO baseRef;
        private String baseRefName;
        private String baseRefOid;
        private RepositoryTO baseRepository;
        private String body;
        private String bodyHTML;
        private String bodyText;
        private int changedFiles;
        private boolean closed;
        private String closedAt;
        private String createdAt;
        private boolean createdViaEmail;
        private Integer databaseId;
        private int deletions;
        private ActorTO editor;
        private RefTO headRef;
        private String headRefName;
        private String headRefOid;
        private RepositoryTO headRepository;
        private RepositoryOwnerTO headRepositoryOwner;
        private String id;
        private boolean includesCreatedEdit;
        private boolean isCrossRepository;
        private String lastEditedAt;
        private boolean locked;
        private boolean maintainerCanModify;
        private CommitTO mergeCommit;
        private MergeableStateTO mergeable;
        private boolean merged;
        private String mergedAt;
        private ActorTO mergedBy;
        private MilestoneTO milestone;
        private int number;
        private String permalink;
        private CommitTO potentialMergeCommit;
        private String publishedAt;
        private java.util.List<ReactionGroupTO> reactionGroups;
        private RepositoryTO repository;
        private String resourcePath;
        private String revertResourcePath;
        private String revertUrl;
        private PullRequestStateTO state;
        private java.util.List<SuggestedReviewerTO> suggestedReviewers;
        private String title;
        private String updatedAt;
        private String url;
        private boolean viewerCanApplySuggestion;
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

        public Builder setAdditions(int additions) {
            this.additions = additions;
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

        public Builder setBaseRef(RefTO baseRef) {
            this.baseRef = baseRef;
            return this;
        }

        public Builder setBaseRefName(String baseRefName) {
            this.baseRefName = baseRefName;
            return this;
        }

        public Builder setBaseRefOid(String baseRefOid) {
            this.baseRefOid = baseRefOid;
            return this;
        }

        public Builder setBaseRepository(RepositoryTO baseRepository) {
            this.baseRepository = baseRepository;
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

        public Builder setChangedFiles(int changedFiles) {
            this.changedFiles = changedFiles;
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

        public Builder setDeletions(int deletions) {
            this.deletions = deletions;
            return this;
        }

        public Builder setEditor(ActorTO editor) {
            this.editor = editor;
            return this;
        }

        public Builder setHeadRef(RefTO headRef) {
            this.headRef = headRef;
            return this;
        }

        public Builder setHeadRefName(String headRefName) {
            this.headRefName = headRefName;
            return this;
        }

        public Builder setHeadRefOid(String headRefOid) {
            this.headRefOid = headRefOid;
            return this;
        }

        public Builder setHeadRepository(RepositoryTO headRepository) {
            this.headRepository = headRepository;
            return this;
        }

        public Builder setHeadRepositoryOwner(RepositoryOwnerTO headRepositoryOwner) {
            this.headRepositoryOwner = headRepositoryOwner;
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

        public Builder setIsCrossRepository(boolean isCrossRepository) {
            this.isCrossRepository = isCrossRepository;
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

        public Builder setMaintainerCanModify(boolean maintainerCanModify) {
            this.maintainerCanModify = maintainerCanModify;
            return this;
        }

        public Builder setMergeCommit(CommitTO mergeCommit) {
            this.mergeCommit = mergeCommit;
            return this;
        }

        public Builder setMergeable(MergeableStateTO mergeable) {
            this.mergeable = mergeable;
            return this;
        }

        public Builder setMerged(boolean merged) {
            this.merged = merged;
            return this;
        }

        public Builder setMergedAt(String mergedAt) {
            this.mergedAt = mergedAt;
            return this;
        }

        public Builder setMergedBy(ActorTO mergedBy) {
            this.mergedBy = mergedBy;
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

        public Builder setPermalink(String permalink) {
            this.permalink = permalink;
            return this;
        }

        public Builder setPotentialMergeCommit(CommitTO potentialMergeCommit) {
            this.potentialMergeCommit = potentialMergeCommit;
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

        public Builder setRevertResourcePath(String revertResourcePath) {
            this.revertResourcePath = revertResourcePath;
            return this;
        }

        public Builder setRevertUrl(String revertUrl) {
            this.revertUrl = revertUrl;
            return this;
        }

        public Builder setState(PullRequestStateTO state) {
            this.state = state;
            return this;
        }

        public Builder setSuggestedReviewers(java.util.List<SuggestedReviewerTO> suggestedReviewers) {
            this.suggestedReviewers = suggestedReviewers;
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

        public Builder setViewerCanApplySuggestion(boolean viewerCanApplySuggestion) {
            this.viewerCanApplySuggestion = viewerCanApplySuggestion;
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


        public PullRequestTO build() {
            return new PullRequestTO(activeLockReason, additions, author, authorAssociation, baseRef, baseRefName, baseRefOid, baseRepository, body, bodyHTML, bodyText, changedFiles, closed, closedAt, createdAt, createdViaEmail, databaseId, deletions, editor, headRef, headRefName, headRefOid, headRepository, headRepositoryOwner, id, includesCreatedEdit, isCrossRepository, lastEditedAt, locked, maintainerCanModify, mergeCommit, mergeable, merged, mergedAt, mergedBy, milestone, number, permalink, potentialMergeCommit, publishedAt, reactionGroups, repository, resourcePath, revertResourcePath, revertUrl, state, suggestedReviewers, title, updatedAt, url, viewerCanApplySuggestion, viewerCanReact, viewerCanSubscribe, viewerCanUpdate, viewerCannotUpdateReasons, viewerDidAuthor, viewerSubscription);
        }

    }
}
