package io.github.graphql.java.model;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2021-03-07T19:46:14+0800"
)
public class CommitTO implements java.io.Serializable, CloserTO, IssueTimelineItemTO, PullRequestTimelineItemTO, GitObjectTO, SubscribableTO, UniformResourceLocatableTO, NodeTO {

    @javax.validation.constraints.NotNull
    private String abbreviatedOid;
    private int additions;
    private GitActorTO author;
    private boolean authoredByCommitter;
    @javax.validation.constraints.NotNull
    private String authoredDate;
    private int changedFiles;
    @javax.validation.constraints.NotNull
    private String commitResourcePath;
    @javax.validation.constraints.NotNull
    private String commitUrl;
    @javax.validation.constraints.NotNull
    private String committedDate;
    private boolean committedViaWeb;
    private GitActorTO committer;
    private int deletions;
    @javax.validation.constraints.NotNull
    private String id;
    @javax.validation.constraints.NotNull
    private String message;
    @javax.validation.constraints.NotNull
    private String messageBody;
    @javax.validation.constraints.NotNull
    private String messageBodyHTML;
    @javax.validation.constraints.NotNull
    private String messageHeadline;
    @javax.validation.constraints.NotNull
    private String messageHeadlineHTML;
    @javax.validation.constraints.NotNull
    private String oid;
    private String pushedDate;
    @javax.validation.constraints.NotNull
    private RepositoryTO repository;
    @javax.validation.constraints.NotNull
    private String resourcePath;
    private GitSignatureTO signature;
    private StatusTO status;
    @javax.validation.constraints.NotNull
    private String tarballUrl;
    @javax.validation.constraints.NotNull
    private TreeTO tree;
    @javax.validation.constraints.NotNull
    private String treeResourcePath;
    @javax.validation.constraints.NotNull
    private String treeUrl;
    @javax.validation.constraints.NotNull
    private String url;
    private boolean viewerCanSubscribe;
    private SubscriptionStateTO viewerSubscription;
    @javax.validation.constraints.NotNull
    private String zipballUrl;

    public CommitTO() {
    }

    public CommitTO(String abbreviatedOid, int additions, GitActorTO author, boolean authoredByCommitter, String authoredDate, int changedFiles, String commitResourcePath, String commitUrl, String committedDate, boolean committedViaWeb, GitActorTO committer, int deletions, String id, String message, String messageBody, String messageBodyHTML, String messageHeadline, String messageHeadlineHTML, String oid, String pushedDate, RepositoryTO repository, String resourcePath, GitSignatureTO signature, StatusTO status, String tarballUrl, TreeTO tree, String treeResourcePath, String treeUrl, String url, boolean viewerCanSubscribe, SubscriptionStateTO viewerSubscription, String zipballUrl) {
        this.abbreviatedOid = abbreviatedOid;
        this.additions = additions;
        this.author = author;
        this.authoredByCommitter = authoredByCommitter;
        this.authoredDate = authoredDate;
        this.changedFiles = changedFiles;
        this.commitResourcePath = commitResourcePath;
        this.commitUrl = commitUrl;
        this.committedDate = committedDate;
        this.committedViaWeb = committedViaWeb;
        this.committer = committer;
        this.deletions = deletions;
        this.id = id;
        this.message = message;
        this.messageBody = messageBody;
        this.messageBodyHTML = messageBodyHTML;
        this.messageHeadline = messageHeadline;
        this.messageHeadlineHTML = messageHeadlineHTML;
        this.oid = oid;
        this.pushedDate = pushedDate;
        this.repository = repository;
        this.resourcePath = resourcePath;
        this.signature = signature;
        this.status = status;
        this.tarballUrl = tarballUrl;
        this.tree = tree;
        this.treeResourcePath = treeResourcePath;
        this.treeUrl = treeUrl;
        this.url = url;
        this.viewerCanSubscribe = viewerCanSubscribe;
        this.viewerSubscription = viewerSubscription;
        this.zipballUrl = zipballUrl;
    }

    public String getAbbreviatedOid() {
        return abbreviatedOid;
    }

    public int getAdditions() {
        return additions;
    }

    public GitActorTO getAuthor() {
        return author;
    }

    public boolean getAuthoredByCommitter() {
        return authoredByCommitter;
    }

    public String getAuthoredDate() {
        return authoredDate;
    }

    public int getChangedFiles() {
        return changedFiles;
    }

    public String getCommitResourcePath() {
        return commitResourcePath;
    }

    public String getCommitUrl() {
        return commitUrl;
    }

    public String getCommittedDate() {
        return committedDate;
    }

    public boolean getCommittedViaWeb() {
        return committedViaWeb;
    }

    public GitActorTO getCommitter() {
        return committer;
    }

    public int getDeletions() {
        return deletions;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public String getMessageBodyHTML() {
        return messageBodyHTML;
    }

    public String getMessageHeadline() {
        return messageHeadline;
    }

    public String getMessageHeadlineHTML() {
        return messageHeadlineHTML;
    }

    public String getOid() {
        return oid;
    }

    public String getPushedDate() {
        return pushedDate;
    }

    public RepositoryTO getRepository() {
        return repository;
    }

    public String getResourcePath() {
        return resourcePath;
    }

    public GitSignatureTO getSignature() {
        return signature;
    }

    public StatusTO getStatus() {
        return status;
    }

    public String getTarballUrl() {
        return tarballUrl;
    }

    public TreeTO getTree() {
        return tree;
    }

    public String getTreeResourcePath() {
        return treeResourcePath;
    }

    public String getTreeUrl() {
        return treeUrl;
    }

    public String getUrl() {
        return url;
    }

    public boolean getViewerCanSubscribe() {
        return viewerCanSubscribe;
    }

    public SubscriptionStateTO getViewerSubscription() {
        return viewerSubscription;
    }

    public String getZipballUrl() {
        return zipballUrl;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final CommitTO that = (CommitTO) obj;
        return Objects.equals(abbreviatedOid, that.abbreviatedOid)
            && Objects.equals(additions, that.additions)
            && Objects.equals(author, that.author)
            && Objects.equals(authoredByCommitter, that.authoredByCommitter)
            && Objects.equals(authoredDate, that.authoredDate)
            && Objects.equals(changedFiles, that.changedFiles)
            && Objects.equals(commitResourcePath, that.commitResourcePath)
            && Objects.equals(commitUrl, that.commitUrl)
            && Objects.equals(committedDate, that.committedDate)
            && Objects.equals(committedViaWeb, that.committedViaWeb)
            && Objects.equals(committer, that.committer)
            && Objects.equals(deletions, that.deletions)
            && Objects.equals(id, that.id)
            && Objects.equals(message, that.message)
            && Objects.equals(messageBody, that.messageBody)
            && Objects.equals(messageBodyHTML, that.messageBodyHTML)
            && Objects.equals(messageHeadline, that.messageHeadline)
            && Objects.equals(messageHeadlineHTML, that.messageHeadlineHTML)
            && Objects.equals(oid, that.oid)
            && Objects.equals(pushedDate, that.pushedDate)
            && Objects.equals(repository, that.repository)
            && Objects.equals(resourcePath, that.resourcePath)
            && Objects.equals(signature, that.signature)
            && Objects.equals(status, that.status)
            && Objects.equals(tarballUrl, that.tarballUrl)
            && Objects.equals(tree, that.tree)
            && Objects.equals(treeResourcePath, that.treeResourcePath)
            && Objects.equals(treeUrl, that.treeUrl)
            && Objects.equals(url, that.url)
            && Objects.equals(viewerCanSubscribe, that.viewerCanSubscribe)
            && Objects.equals(viewerSubscription, that.viewerSubscription)
            && Objects.equals(zipballUrl, that.zipballUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abbreviatedOid, additions, author, authoredByCommitter, authoredDate, changedFiles, commitResourcePath, commitUrl, committedDate, committedViaWeb, committer, deletions, id, message, messageBody, messageBodyHTML, messageHeadline, messageHeadlineHTML, oid, pushedDate, repository, resourcePath, signature, status, tarballUrl, tree, treeResourcePath, treeUrl, url, viewerCanSubscribe, viewerSubscription, zipballUrl);
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (abbreviatedOid != null) {
            joiner.add("abbreviatedOid: " + GraphQLRequestSerializer.getEntry(abbreviatedOid));
        }
        joiner.add("additions: " + GraphQLRequestSerializer.getEntry(additions));
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author));
        }
        joiner.add("authoredByCommitter: " + GraphQLRequestSerializer.getEntry(authoredByCommitter));
        if (authoredDate != null) {
            joiner.add("authoredDate: " + GraphQLRequestSerializer.getEntry(authoredDate));
        }
        joiner.add("changedFiles: " + GraphQLRequestSerializer.getEntry(changedFiles));
        if (commitResourcePath != null) {
            joiner.add("commitResourcePath: " + GraphQLRequestSerializer.getEntry(commitResourcePath));
        }
        if (commitUrl != null) {
            joiner.add("commitUrl: " + GraphQLRequestSerializer.getEntry(commitUrl));
        }
        if (committedDate != null) {
            joiner.add("committedDate: " + GraphQLRequestSerializer.getEntry(committedDate));
        }
        joiner.add("committedViaWeb: " + GraphQLRequestSerializer.getEntry(committedViaWeb));
        if (committer != null) {
            joiner.add("committer: " + GraphQLRequestSerializer.getEntry(committer));
        }
        joiner.add("deletions: " + GraphQLRequestSerializer.getEntry(deletions));
        if (id != null) {
            joiner.add("id: " + GraphQLRequestSerializer.getEntry(id));
        }
        if (message != null) {
            joiner.add("message: " + GraphQLRequestSerializer.getEntry(message));
        }
        if (messageBody != null) {
            joiner.add("messageBody: " + GraphQLRequestSerializer.getEntry(messageBody));
        }
        if (messageBodyHTML != null) {
            joiner.add("messageBodyHTML: " + GraphQLRequestSerializer.getEntry(messageBodyHTML));
        }
        if (messageHeadline != null) {
            joiner.add("messageHeadline: " + GraphQLRequestSerializer.getEntry(messageHeadline));
        }
        if (messageHeadlineHTML != null) {
            joiner.add("messageHeadlineHTML: " + GraphQLRequestSerializer.getEntry(messageHeadlineHTML));
        }
        if (oid != null) {
            joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid));
        }
        if (pushedDate != null) {
            joiner.add("pushedDate: " + GraphQLRequestSerializer.getEntry(pushedDate));
        }
        if (repository != null) {
            joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository));
        }
        if (resourcePath != null) {
            joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath));
        }
        if (signature != null) {
            joiner.add("signature: " + GraphQLRequestSerializer.getEntry(signature));
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status));
        }
        if (tarballUrl != null) {
            joiner.add("tarballUrl: " + GraphQLRequestSerializer.getEntry(tarballUrl));
        }
        if (tree != null) {
            joiner.add("tree: " + GraphQLRequestSerializer.getEntry(tree));
        }
        if (treeResourcePath != null) {
            joiner.add("treeResourcePath: " + GraphQLRequestSerializer.getEntry(treeResourcePath));
        }
        if (treeUrl != null) {
            joiner.add("treeUrl: " + GraphQLRequestSerializer.getEntry(treeUrl));
        }
        if (url != null) {
            joiner.add("url: " + GraphQLRequestSerializer.getEntry(url));
        }
        joiner.add("viewerCanSubscribe: " + GraphQLRequestSerializer.getEntry(viewerCanSubscribe));
        if (viewerSubscription != null) {
            joiner.add("viewerSubscription: " + GraphQLRequestSerializer.getEntry(viewerSubscription));
        }
        if (zipballUrl != null) {
            joiner.add("zipballUrl: " + GraphQLRequestSerializer.getEntry(zipballUrl));
        }
        return joiner.toString();
    }

    public static CommitTO.Builder builder() {
        return new CommitTO.Builder();
    }

    public static class Builder {

        private String abbreviatedOid;
        private int additions;
        private GitActorTO author;
        private boolean authoredByCommitter;
        private String authoredDate;
        private int changedFiles;
        private String commitResourcePath;
        private String commitUrl;
        private String committedDate;
        private boolean committedViaWeb;
        private GitActorTO committer;
        private int deletions;
        private String id;
        private String message;
        private String messageBody;
        private String messageBodyHTML;
        private String messageHeadline;
        private String messageHeadlineHTML;
        private String oid;
        private String pushedDate;
        private RepositoryTO repository;
        private String resourcePath;
        private GitSignatureTO signature;
        private StatusTO status;
        private String tarballUrl;
        private TreeTO tree;
        private String treeResourcePath;
        private String treeUrl;
        private String url;
        private boolean viewerCanSubscribe;
        private SubscriptionStateTO viewerSubscription;
        private String zipballUrl;

        public Builder() {
        }

        public Builder setAbbreviatedOid(String abbreviatedOid) {
            this.abbreviatedOid = abbreviatedOid;
            return this;
        }

        public Builder setAdditions(int additions) {
            this.additions = additions;
            return this;
        }

        public Builder setAuthor(GitActorTO author) {
            this.author = author;
            return this;
        }

        public Builder setAuthoredByCommitter(boolean authoredByCommitter) {
            this.authoredByCommitter = authoredByCommitter;
            return this;
        }

        public Builder setAuthoredDate(String authoredDate) {
            this.authoredDate = authoredDate;
            return this;
        }

        public Builder setChangedFiles(int changedFiles) {
            this.changedFiles = changedFiles;
            return this;
        }

        public Builder setCommitResourcePath(String commitResourcePath) {
            this.commitResourcePath = commitResourcePath;
            return this;
        }

        public Builder setCommitUrl(String commitUrl) {
            this.commitUrl = commitUrl;
            return this;
        }

        public Builder setCommittedDate(String committedDate) {
            this.committedDate = committedDate;
            return this;
        }

        public Builder setCommittedViaWeb(boolean committedViaWeb) {
            this.committedViaWeb = committedViaWeb;
            return this;
        }

        public Builder setCommitter(GitActorTO committer) {
            this.committer = committer;
            return this;
        }

        public Builder setDeletions(int deletions) {
            this.deletions = deletions;
            return this;
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setMessageBody(String messageBody) {
            this.messageBody = messageBody;
            return this;
        }

        public Builder setMessageBodyHTML(String messageBodyHTML) {
            this.messageBodyHTML = messageBodyHTML;
            return this;
        }

        public Builder setMessageHeadline(String messageHeadline) {
            this.messageHeadline = messageHeadline;
            return this;
        }

        public Builder setMessageHeadlineHTML(String messageHeadlineHTML) {
            this.messageHeadlineHTML = messageHeadlineHTML;
            return this;
        }

        public Builder setOid(String oid) {
            this.oid = oid;
            return this;
        }

        public Builder setPushedDate(String pushedDate) {
            this.pushedDate = pushedDate;
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

        public Builder setSignature(GitSignatureTO signature) {
            this.signature = signature;
            return this;
        }

        public Builder setStatus(StatusTO status) {
            this.status = status;
            return this;
        }

        public Builder setTarballUrl(String tarballUrl) {
            this.tarballUrl = tarballUrl;
            return this;
        }

        public Builder setTree(TreeTO tree) {
            this.tree = tree;
            return this;
        }

        public Builder setTreeResourcePath(String treeResourcePath) {
            this.treeResourcePath = treeResourcePath;
            return this;
        }

        public Builder setTreeUrl(String treeUrl) {
            this.treeUrl = treeUrl;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setViewerCanSubscribe(boolean viewerCanSubscribe) {
            this.viewerCanSubscribe = viewerCanSubscribe;
            return this;
        }

        public Builder setViewerSubscription(SubscriptionStateTO viewerSubscription) {
            this.viewerSubscription = viewerSubscription;
            return this;
        }

        public Builder setZipballUrl(String zipballUrl) {
            this.zipballUrl = zipballUrl;
            return this;
        }


        public CommitTO build() {
            return new CommitTO(abbreviatedOid, additions, author, authoredByCommitter, authoredDate, changedFiles, commitResourcePath, commitUrl, committedDate, committedViaWeb, committer, deletions, id, message, messageBody, messageBodyHTML, messageHeadline, messageHeadlineHTML, oid, pushedDate, repository, resourcePath, signature, status, tarballUrl, tree, treeResourcePath, treeUrl, url, viewerCanSubscribe, viewerSubscription, zipballUrl);
        }

    }
}
