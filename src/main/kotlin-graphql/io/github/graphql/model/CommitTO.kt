package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CommitTO(
    override
    val abbreviatedOid: String,
    val additions: Int,
    val author: GitActorTO?,
    val authoredByCommitter: Boolean,
    val authoredDate: String,
    val changedFiles: Int,
    override
    val commitResourcePath: String,
    override
    val commitUrl: String,
    val committedDate: String,
    val committedViaWeb: Boolean,
    val committer: GitActorTO?,
    val deletions: Int,
    override
    val id: String,
    val message: String,
    val messageBody: String,
    val messageBodyHTML: String,
    val messageHeadline: String,
    val messageHeadlineHTML: String,
    override
    val oid: String,
    val pushedDate: String?,
    override
    val repository: RepositoryTO,
    override
    val resourcePath: String,
    val signature: GitSignatureTO?,
    val status: StatusTO?,
    val tarballUrl: String,
    val tree: TreeTO,
    val treeResourcePath: String,
    val treeUrl: String,
    override
    val url: String,
    override
    val viewerCanSubscribe: Boolean,
    override
    val viewerSubscription: SubscriptionStateTO?,
    val zipballUrl: String
) : CloserTO, IssueTimelineItemTO, PullRequestTimelineItemTO, GitObjectTO, SubscribableTO, UniformResourceLocatableTO, NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("abbreviatedOid: " + GraphQLRequestSerializer.getEntry(abbreviatedOid))
        joiner.add("additions: " + GraphQLRequestSerializer.getEntry(additions))
        if (author != null) {
            joiner.add("author: " + GraphQLRequestSerializer.getEntry(author))
        }
        joiner.add("authoredByCommitter: " + GraphQLRequestSerializer.getEntry(authoredByCommitter))
        joiner.add("authoredDate: " + GraphQLRequestSerializer.getEntry(authoredDate))
        joiner.add("changedFiles: " + GraphQLRequestSerializer.getEntry(changedFiles))
        joiner.add("commitResourcePath: " + GraphQLRequestSerializer.getEntry(commitResourcePath))
        joiner.add("commitUrl: " + GraphQLRequestSerializer.getEntry(commitUrl))
        joiner.add("committedDate: " + GraphQLRequestSerializer.getEntry(committedDate))
        joiner.add("committedViaWeb: " + GraphQLRequestSerializer.getEntry(committedViaWeb))
        if (committer != null) {
            joiner.add("committer: " + GraphQLRequestSerializer.getEntry(committer))
        }
        joiner.add("deletions: " + GraphQLRequestSerializer.getEntry(deletions))
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("message: " + GraphQLRequestSerializer.getEntry(message))
        joiner.add("messageBody: " + GraphQLRequestSerializer.getEntry(messageBody))
        joiner.add("messageBodyHTML: " + GraphQLRequestSerializer.getEntry(messageBodyHTML))
        joiner.add("messageHeadline: " + GraphQLRequestSerializer.getEntry(messageHeadline))
        joiner.add("messageHeadlineHTML: " + GraphQLRequestSerializer.getEntry(messageHeadlineHTML))
        joiner.add("oid: " + GraphQLRequestSerializer.getEntry(oid))
        if (pushedDate != null) {
            joiner.add("pushedDate: " + GraphQLRequestSerializer.getEntry(pushedDate))
        }
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        if (signature != null) {
            joiner.add("signature: " + GraphQLRequestSerializer.getEntry(signature))
        }
        if (status != null) {
            joiner.add("status: " + GraphQLRequestSerializer.getEntry(status))
        }
        joiner.add("tarballUrl: " + GraphQLRequestSerializer.getEntry(tarballUrl))
        joiner.add("tree: " + GraphQLRequestSerializer.getEntry(tree))
        joiner.add("treeResourcePath: " + GraphQLRequestSerializer.getEntry(treeResourcePath))
        joiner.add("treeUrl: " + GraphQLRequestSerializer.getEntry(treeUrl))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        joiner.add("viewerCanSubscribe: " + GraphQLRequestSerializer.getEntry(viewerCanSubscribe))
        if (viewerSubscription != null) {
            joiner.add("viewerSubscription: " + GraphQLRequestSerializer.getEntry(viewerSubscription))
        }
        joiner.add("zipballUrl: " + GraphQLRequestSerializer.getEntry(zipballUrl))
        return joiner.toString()
    }

    class Builder {

        private lateinit var abbreviatedOid: String
        private var additions: Int = 0
        private var author: GitActorTO? = null
        private var authoredByCommitter: Boolean = false
        private lateinit var authoredDate: String
        private var changedFiles: Int = 0
        private lateinit var commitResourcePath: String
        private lateinit var commitUrl: String
        private lateinit var committedDate: String
        private var committedViaWeb: Boolean = false
        private var committer: GitActorTO? = null
        private var deletions: Int = 0
        private lateinit var id: String
        private lateinit var message: String
        private lateinit var messageBody: String
        private lateinit var messageBodyHTML: String
        private lateinit var messageHeadline: String
        private lateinit var messageHeadlineHTML: String
        private lateinit var oid: String
        private var pushedDate: String? = null
        private lateinit var repository: RepositoryTO
        private lateinit var resourcePath: String
        private var signature: GitSignatureTO? = null
        private var status: StatusTO? = null
        private lateinit var tarballUrl: String
        private lateinit var tree: TreeTO
        private lateinit var treeResourcePath: String
        private lateinit var treeUrl: String
        private lateinit var url: String
        private var viewerCanSubscribe: Boolean = false
        private var viewerSubscription: SubscriptionStateTO? = null
        private lateinit var zipballUrl: String

        fun setAbbreviatedOid(abbreviatedOid: String): Builder {
            this.abbreviatedOid = abbreviatedOid
            return this
        }

        fun setAdditions(additions: Int): Builder {
            this.additions = additions
            return this
        }

        fun setAuthor(author: GitActorTO?): Builder {
            this.author = author
            return this
        }

        fun setAuthoredByCommitter(authoredByCommitter: Boolean): Builder {
            this.authoredByCommitter = authoredByCommitter
            return this
        }

        fun setAuthoredDate(authoredDate: String): Builder {
            this.authoredDate = authoredDate
            return this
        }

        fun setChangedFiles(changedFiles: Int): Builder {
            this.changedFiles = changedFiles
            return this
        }

        fun setCommitResourcePath(commitResourcePath: String): Builder {
            this.commitResourcePath = commitResourcePath
            return this
        }

        fun setCommitUrl(commitUrl: String): Builder {
            this.commitUrl = commitUrl
            return this
        }

        fun setCommittedDate(committedDate: String): Builder {
            this.committedDate = committedDate
            return this
        }

        fun setCommittedViaWeb(committedViaWeb: Boolean): Builder {
            this.committedViaWeb = committedViaWeb
            return this
        }

        fun setCommitter(committer: GitActorTO?): Builder {
            this.committer = committer
            return this
        }

        fun setDeletions(deletions: Int): Builder {
            this.deletions = deletions
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setMessage(message: String): Builder {
            this.message = message
            return this
        }

        fun setMessageBody(messageBody: String): Builder {
            this.messageBody = messageBody
            return this
        }

        fun setMessageBodyHTML(messageBodyHTML: String): Builder {
            this.messageBodyHTML = messageBodyHTML
            return this
        }

        fun setMessageHeadline(messageHeadline: String): Builder {
            this.messageHeadline = messageHeadline
            return this
        }

        fun setMessageHeadlineHTML(messageHeadlineHTML: String): Builder {
            this.messageHeadlineHTML = messageHeadlineHTML
            return this
        }

        fun setOid(oid: String): Builder {
            this.oid = oid
            return this
        }

        fun setPushedDate(pushedDate: String?): Builder {
            this.pushedDate = pushedDate
            return this
        }

        fun setRepository(repository: RepositoryTO): Builder {
            this.repository = repository
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setSignature(signature: GitSignatureTO?): Builder {
            this.signature = signature
            return this
        }

        fun setStatus(status: StatusTO?): Builder {
            this.status = status
            return this
        }

        fun setTarballUrl(tarballUrl: String): Builder {
            this.tarballUrl = tarballUrl
            return this
        }

        fun setTree(tree: TreeTO): Builder {
            this.tree = tree
            return this
        }

        fun setTreeResourcePath(treeResourcePath: String): Builder {
            this.treeResourcePath = treeResourcePath
            return this
        }

        fun setTreeUrl(treeUrl: String): Builder {
            this.treeUrl = treeUrl
            return this
        }

        fun setUrl(url: String): Builder {
            this.url = url
            return this
        }

        fun setViewerCanSubscribe(viewerCanSubscribe: Boolean): Builder {
            this.viewerCanSubscribe = viewerCanSubscribe
            return this
        }

        fun setViewerSubscription(viewerSubscription: SubscriptionStateTO?): Builder {
            this.viewerSubscription = viewerSubscription
            return this
        }

        fun setZipballUrl(zipballUrl: String): Builder {
            this.zipballUrl = zipballUrl
            return this
        }

        fun build(): CommitTO {
            return CommitTO(abbreviatedOid, additions, author, authoredByCommitter, authoredDate, changedFiles, commitResourcePath, commitUrl, committedDate, committedViaWeb, committer, deletions, id, message, messageBody, messageBodyHTML, messageHeadline, messageHeadlineHTML, oid, pushedDate, repository, resourcePath, signature, status, tarballUrl, tree, treeResourcePath, treeUrl, url, viewerCanSubscribe, viewerSubscription, zipballUrl)
        }
    }
}
