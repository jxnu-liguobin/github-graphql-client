package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
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
}
