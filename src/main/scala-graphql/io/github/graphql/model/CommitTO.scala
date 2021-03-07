package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import SubscriptionStateTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CommitTO(
    @javax.validation.constraints.NotNull
    override val abbreviatedOid: String,
    additions: Int,
    author: GitActorTO,
    authoredByCommitter: Boolean,
    @javax.validation.constraints.NotNull
    authoredDate: String,
    changedFiles: Int,
    @javax.validation.constraints.NotNull
    override val commitResourcePath: String,
    @javax.validation.constraints.NotNull
    override val commitUrl: String,
    @javax.validation.constraints.NotNull
    committedDate: String,
    committedViaWeb: Boolean,
    committer: GitActorTO,
    deletions: Int,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    message: String,
    @javax.validation.constraints.NotNull
    messageBody: String,
    @javax.validation.constraints.NotNull
    messageBodyHTML: String,
    @javax.validation.constraints.NotNull
    messageHeadline: String,
    @javax.validation.constraints.NotNull
    messageHeadlineHTML: String,
    @javax.validation.constraints.NotNull
    override val oid: String,
    pushedDate: String,
    @javax.validation.constraints.NotNull
    override val repository: RepositoryTO,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    signature: GitSignatureTO,
    status: StatusTO,
    @javax.validation.constraints.NotNull
    tarballUrl: String,
    @javax.validation.constraints.NotNull
    tree: TreeTO,
    @javax.validation.constraints.NotNull
    treeResourcePath: String,
    @javax.validation.constraints.NotNull
    treeUrl: String,
    @javax.validation.constraints.NotNull
    override val url: String,
    override val viewerCanSubscribe: Boolean,
    override val viewerSubscription: SubscriptionStateTO,
    @javax.validation.constraints.NotNull
    zipballUrl: String
) extends CloserTO with IssueTimelineItemTO with PullRequestTimelineItemTO with GitObjectTO with SubscribableTO with UniformResourceLocatableTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (abbreviatedOid != null) "abbreviatedOid: " + GraphQLRequestSerializer.getEntry(abbreviatedOid) else "",
            "additions: " + GraphQLRequestSerializer.getEntry(additions),
            if (author != null) "author: " + GraphQLRequestSerializer.getEntry(author) else "",
            "authoredByCommitter: " + GraphQLRequestSerializer.getEntry(authoredByCommitter),
            if (authoredDate != null) "authoredDate: " + GraphQLRequestSerializer.getEntry(authoredDate) else "",
            "changedFiles: " + GraphQLRequestSerializer.getEntry(changedFiles),
            if (commitResourcePath != null) "commitResourcePath: " + GraphQLRequestSerializer.getEntry(commitResourcePath) else "",
            if (commitUrl != null) "commitUrl: " + GraphQLRequestSerializer.getEntry(commitUrl) else "",
            if (committedDate != null) "committedDate: " + GraphQLRequestSerializer.getEntry(committedDate) else "",
            "committedViaWeb: " + GraphQLRequestSerializer.getEntry(committedViaWeb),
            if (committer != null) "committer: " + GraphQLRequestSerializer.getEntry(committer) else "",
            "deletions: " + GraphQLRequestSerializer.getEntry(deletions),
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (message != null) "message: " + GraphQLRequestSerializer.getEntry(message) else "",
            if (messageBody != null) "messageBody: " + GraphQLRequestSerializer.getEntry(messageBody) else "",
            if (messageBodyHTML != null) "messageBodyHTML: " + GraphQLRequestSerializer.getEntry(messageBodyHTML) else "",
            if (messageHeadline != null) "messageHeadline: " + GraphQLRequestSerializer.getEntry(messageHeadline) else "",
            if (messageHeadlineHTML != null) "messageHeadlineHTML: " + GraphQLRequestSerializer.getEntry(messageHeadlineHTML) else "",
            if (oid != null) "oid: " + GraphQLRequestSerializer.getEntry(oid) else "",
            if (pushedDate != null) "pushedDate: " + GraphQLRequestSerializer.getEntry(pushedDate) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (signature != null) "signature: " + GraphQLRequestSerializer.getEntry(signature) else "",
            if (status != null) "status: " + GraphQLRequestSerializer.getEntry(status) else "",
            if (tarballUrl != null) "tarballUrl: " + GraphQLRequestSerializer.getEntry(tarballUrl) else "",
            if (tree != null) "tree: " + GraphQLRequestSerializer.getEntry(tree) else "",
            if (treeResourcePath != null) "treeResourcePath: " + GraphQLRequestSerializer.getEntry(treeResourcePath) else "",
            if (treeUrl != null) "treeUrl: " + GraphQLRequestSerializer.getEntry(treeUrl) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else "",
            "viewerCanSubscribe: " + GraphQLRequestSerializer.getEntry(viewerCanSubscribe),
            if (viewerSubscription != null) "viewerSubscription: " + GraphQLRequestSerializer.getEntry(viewerSubscription) else "",
            if (zipballUrl != null) "zipballUrl: " + GraphQLRequestSerializer.getEntry(zipballUrl) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object CommitTO {

    def builder(): CommitTO.Builder = new Builder()

    class Builder {

        private var abbreviatedOid: String = _
        private var additions: Int = _
        private var author: GitActorTO = _
        private var authoredByCommitter: Boolean = _
        private var authoredDate: String = _
        private var changedFiles: Int = _
        private var commitResourcePath: String = _
        private var commitUrl: String = _
        private var committedDate: String = _
        private var committedViaWeb: Boolean = _
        private var committer: GitActorTO = _
        private var deletions: Int = _
        private var id: String = _
        private var message: String = _
        private var messageBody: String = _
        private var messageBodyHTML: String = _
        private var messageHeadline: String = _
        private var messageHeadlineHTML: String = _
        private var oid: String = _
        private var pushedDate: String = _
        private var repository: RepositoryTO = _
        private var resourcePath: String = _
        private var signature: GitSignatureTO = _
        private var status: StatusTO = _
        private var tarballUrl: String = _
        private var tree: TreeTO = _
        private var treeResourcePath: String = _
        private var treeUrl: String = _
        private var url: String = _
        private var viewerCanSubscribe: Boolean = _
        private var viewerSubscription: SubscriptionStateTO = _
        private var zipballUrl: String = _

        def setAbbreviatedOid(abbreviatedOid: String): Builder = {
            this.abbreviatedOid = abbreviatedOid
            this
        }

        def setAdditions(additions: Int): Builder = {
            this.additions = additions
            this
        }

        def setAuthor(author: GitActorTO): Builder = {
            this.author = author
            this
        }

        def setAuthoredByCommitter(authoredByCommitter: Boolean): Builder = {
            this.authoredByCommitter = authoredByCommitter
            this
        }

        def setAuthoredDate(authoredDate: String): Builder = {
            this.authoredDate = authoredDate
            this
        }

        def setChangedFiles(changedFiles: Int): Builder = {
            this.changedFiles = changedFiles
            this
        }

        def setCommitResourcePath(commitResourcePath: String): Builder = {
            this.commitResourcePath = commitResourcePath
            this
        }

        def setCommitUrl(commitUrl: String): Builder = {
            this.commitUrl = commitUrl
            this
        }

        def setCommittedDate(committedDate: String): Builder = {
            this.committedDate = committedDate
            this
        }

        def setCommittedViaWeb(committedViaWeb: Boolean): Builder = {
            this.committedViaWeb = committedViaWeb
            this
        }

        def setCommitter(committer: GitActorTO): Builder = {
            this.committer = committer
            this
        }

        def setDeletions(deletions: Int): Builder = {
            this.deletions = deletions
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setMessage(message: String): Builder = {
            this.message = message
            this
        }

        def setMessageBody(messageBody: String): Builder = {
            this.messageBody = messageBody
            this
        }

        def setMessageBodyHTML(messageBodyHTML: String): Builder = {
            this.messageBodyHTML = messageBodyHTML
            this
        }

        def setMessageHeadline(messageHeadline: String): Builder = {
            this.messageHeadline = messageHeadline
            this
        }

        def setMessageHeadlineHTML(messageHeadlineHTML: String): Builder = {
            this.messageHeadlineHTML = messageHeadlineHTML
            this
        }

        def setOid(oid: String): Builder = {
            this.oid = oid
            this
        }

        def setPushedDate(pushedDate: String): Builder = {
            this.pushedDate = pushedDate
            this
        }

        def setRepository(repository: RepositoryTO): Builder = {
            this.repository = repository
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setSignature(signature: GitSignatureTO): Builder = {
            this.signature = signature
            this
        }

        def setStatus(status: StatusTO): Builder = {
            this.status = status
            this
        }

        def setTarballUrl(tarballUrl: String): Builder = {
            this.tarballUrl = tarballUrl
            this
        }

        def setTree(tree: TreeTO): Builder = {
            this.tree = tree
            this
        }

        def setTreeResourcePath(treeResourcePath: String): Builder = {
            this.treeResourcePath = treeResourcePath
            this
        }

        def setTreeUrl(treeUrl: String): Builder = {
            this.treeUrl = treeUrl
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def setViewerCanSubscribe(viewerCanSubscribe: Boolean): Builder = {
            this.viewerCanSubscribe = viewerCanSubscribe
            this
        }

        def setViewerSubscription(viewerSubscription: SubscriptionStateTO): Builder = {
            this.viewerSubscription = viewerSubscription
            this
        }

        def setZipballUrl(zipballUrl: String): Builder = {
            this.zipballUrl = zipballUrl
            this
        }

        def build(): CommitTO = new CommitTO(abbreviatedOid, additions, author, authoredByCommitter, authoredDate, changedFiles, commitResourcePath, commitUrl, committedDate, committedViaWeb, committer, deletions, id, message, messageBody, messageBodyHTML, messageHeadline, messageHeadlineHTML, oid, pushedDate, repository, resourcePath, signature, status, tarballUrl, tree, treeResourcePath, treeUrl, url, viewerCanSubscribe, viewerSubscription, zipballUrl)

    }
}
