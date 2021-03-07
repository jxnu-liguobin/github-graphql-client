package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Commit
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class CommitResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CommitResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CommitResponseProjection {
        this.abbreviatedOid()
        this.additions()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0) <= maxDepth) {
            projectionDepthOnFields["CommitResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests"] = projectionDepthOnFields.getOrDefault("CommitResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0) + 1
            this.associatedPullRequests(PullRequestConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields["CommitResponseProjection.GitActorResponseProjection.author"] = projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.author", 0) + 1
            this.author(GitActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.author", 0)))
        }
        this.authoredByCommitter()
        this.authoredDate()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.BlameResponseProjection.blame", 0) <= maxDepth) {
            projectionDepthOnFields["CommitResponseProjection.BlameResponseProjection.blame"] = projectionDepthOnFields.getOrDefault("CommitResponseProjection.BlameResponseProjection.blame", 0) + 1
            this.blame(BlameResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.BlameResponseProjection.blame", 0)))
        }
        this.changedFiles()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields["CommitResponseProjection.CommitCommentConnectionResponseProjection.comments"] = projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) + 1
            this.comments(CommitCommentConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitCommentConnectionResponseProjection.comments", 0)))
        }
        this.commitResourcePath()
        this.commitUrl()
        this.committedDate()
        this.committedViaWeb()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.committer", 0) <= maxDepth) {
            projectionDepthOnFields["CommitResponseProjection.GitActorResponseProjection.committer"] = projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.committer", 0) + 1
            this.committer(GitActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.committer", 0)))
        }
        this.deletions()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.DeploymentConnectionResponseProjection.deployments", 0) <= maxDepth) {
            projectionDepthOnFields["CommitResponseProjection.DeploymentConnectionResponseProjection.deployments"] = projectionDepthOnFields.getOrDefault("CommitResponseProjection.DeploymentConnectionResponseProjection.deployments", 0) + 1
            this.deployments(DeploymentConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.DeploymentConnectionResponseProjection.deployments", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitHistoryConnectionResponseProjection.history", 0) <= maxDepth) {
            projectionDepthOnFields["CommitResponseProjection.CommitHistoryConnectionResponseProjection.history"] = projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitHistoryConnectionResponseProjection.history", 0) + 1
            this.history(CommitHistoryConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitHistoryConnectionResponseProjection.history", 0)))
        }
        this.id()
        this.message()
        this.messageBody()
        this.messageBodyHTML()
        this.messageHeadline()
        this.messageHeadlineHTML()
        this.oid()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitConnectionResponseProjection.parents", 0) <= maxDepth) {
            projectionDepthOnFields["CommitResponseProjection.CommitConnectionResponseProjection.parents"] = projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitConnectionResponseProjection.parents", 0) + 1
            this.parents(CommitConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitConnectionResponseProjection.parents", 0)))
        }
        this.pushedDate()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["CommitResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("CommitResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitSignatureResponseProjection.signature", 0) <= maxDepth) {
            projectionDepthOnFields["CommitResponseProjection.GitSignatureResponseProjection.signature"] = projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitSignatureResponseProjection.signature", 0) + 1
            this.signature(GitSignatureResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitSignatureResponseProjection.signature", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.StatusResponseProjection.status", 0) <= maxDepth) {
            projectionDepthOnFields["CommitResponseProjection.StatusResponseProjection.status"] = projectionDepthOnFields.getOrDefault("CommitResponseProjection.StatusResponseProjection.status", 0) + 1
            this.status(StatusResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.StatusResponseProjection.status", 0)))
        }
        this.tarballUrl()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.TreeResponseProjection.tree", 0) <= maxDepth) {
            projectionDepthOnFields["CommitResponseProjection.TreeResponseProjection.tree"] = projectionDepthOnFields.getOrDefault("CommitResponseProjection.TreeResponseProjection.tree", 0) + 1
            this.tree(TreeResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.TreeResponseProjection.tree", 0)))
        }
        this.treeResourcePath()
        this.treeUrl()
        this.url()
        this.viewerCanSubscribe()
        this.viewerSubscription()
        this.zipballUrl()
        this.typename()
        return this
    }

    fun abbreviatedOid(): CommitResponseProjection = abbreviatedOid(null)

    fun abbreviatedOid(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("abbreviatedOid").alias(alias))
        return this
    }

    fun additions(): CommitResponseProjection = additions(null)

    fun additions(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("additions").alias(alias))
        return this
    }

    fun associatedPullRequests(subProjection: PullRequestConnectionResponseProjection): CommitResponseProjection = associatedPullRequests(null, subProjection)

    fun associatedPullRequests(alias: String?, subProjection: PullRequestConnectionResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("associatedPullRequests").alias(alias).projection(subProjection))
        return this
    }

    fun associatedPullRequests(input: CommitAssociatedPullRequestsParametrizedInput, subProjection: PullRequestConnectionResponseProjection): CommitResponseProjection = associatedPullRequests(null, input, subProjection)

    fun associatedPullRequests(alias: String?, input: CommitAssociatedPullRequestsParametrizedInput, subProjection: PullRequestConnectionResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("associatedPullRequests").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun author(subProjection: GitActorResponseProjection): CommitResponseProjection = author(null, subProjection)

    fun author(alias: String?, subProjection: GitActorResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("author").alias(alias).projection(subProjection))
        return this
    }

    fun authoredByCommitter(): CommitResponseProjection = authoredByCommitter(null)

    fun authoredByCommitter(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("authoredByCommitter").alias(alias))
        return this
    }

    fun authoredDate(): CommitResponseProjection = authoredDate(null)

    fun authoredDate(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("authoredDate").alias(alias))
        return this
    }

    fun blame(subProjection: BlameResponseProjection): CommitResponseProjection = blame(null, subProjection)

    fun blame(alias: String?, subProjection: BlameResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("blame").alias(alias).projection(subProjection))
        return this
    }

    fun blame(input: CommitBlameParametrizedInput, subProjection: BlameResponseProjection): CommitResponseProjection = blame(null, input, subProjection)

    fun blame(alias: String?, input: CommitBlameParametrizedInput, subProjection: BlameResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("blame").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun changedFiles(): CommitResponseProjection = changedFiles(null)

    fun changedFiles(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("changedFiles").alias(alias))
        return this
    }

    fun comments(subProjection: CommitCommentConnectionResponseProjection): CommitResponseProjection = comments(null, subProjection)

    fun comments(alias: String?, subProjection: CommitCommentConnectionResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("comments").alias(alias).projection(subProjection))
        return this
    }

    fun comments(input: CommitCommentsParametrizedInput, subProjection: CommitCommentConnectionResponseProjection): CommitResponseProjection = comments(null, input, subProjection)

    fun comments(alias: String?, input: CommitCommentsParametrizedInput, subProjection: CommitCommentConnectionResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun commitResourcePath(): CommitResponseProjection = commitResourcePath(null)

    fun commitResourcePath(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("commitResourcePath").alias(alias))
        return this
    }

    fun commitUrl(): CommitResponseProjection = commitUrl(null)

    fun commitUrl(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("commitUrl").alias(alias))
        return this
    }

    fun committedDate(): CommitResponseProjection = committedDate(null)

    fun committedDate(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("committedDate").alias(alias))
        return this
    }

    fun committedViaWeb(): CommitResponseProjection = committedViaWeb(null)

    fun committedViaWeb(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("committedViaWeb").alias(alias))
        return this
    }

    fun committer(subProjection: GitActorResponseProjection): CommitResponseProjection = committer(null, subProjection)

    fun committer(alias: String?, subProjection: GitActorResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("committer").alias(alias).projection(subProjection))
        return this
    }

    fun deletions(): CommitResponseProjection = deletions(null)

    fun deletions(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("deletions").alias(alias))
        return this
    }

    fun deployments(subProjection: DeploymentConnectionResponseProjection): CommitResponseProjection = deployments(null, subProjection)

    fun deployments(alias: String?, subProjection: DeploymentConnectionResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("deployments").alias(alias).projection(subProjection))
        return this
    }

    fun deployments(input: CommitDeploymentsParametrizedInput, subProjection: DeploymentConnectionResponseProjection): CommitResponseProjection = deployments(null, input, subProjection)

    fun deployments(alias: String?, input: CommitDeploymentsParametrizedInput, subProjection: DeploymentConnectionResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("deployments").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun history(subProjection: CommitHistoryConnectionResponseProjection): CommitResponseProjection = history(null, subProjection)

    fun history(alias: String?, subProjection: CommitHistoryConnectionResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("history").alias(alias).projection(subProjection))
        return this
    }

    fun history(input: CommitHistoryParametrizedInput, subProjection: CommitHistoryConnectionResponseProjection): CommitResponseProjection = history(null, input, subProjection)

    fun history(alias: String?, input: CommitHistoryParametrizedInput, subProjection: CommitHistoryConnectionResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("history").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun id(): CommitResponseProjection = id(null)

    fun id(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun message(): CommitResponseProjection = message(null)

    fun message(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("message").alias(alias))
        return this
    }

    fun messageBody(): CommitResponseProjection = messageBody(null)

    fun messageBody(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("messageBody").alias(alias))
        return this
    }

    fun messageBodyHTML(): CommitResponseProjection = messageBodyHTML(null)

    fun messageBodyHTML(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("messageBodyHTML").alias(alias))
        return this
    }

    fun messageHeadline(): CommitResponseProjection = messageHeadline(null)

    fun messageHeadline(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("messageHeadline").alias(alias))
        return this
    }

    fun messageHeadlineHTML(): CommitResponseProjection = messageHeadlineHTML(null)

    fun messageHeadlineHTML(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("messageHeadlineHTML").alias(alias))
        return this
    }

    fun oid(): CommitResponseProjection = oid(null)

    fun oid(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("oid").alias(alias))
        return this
    }

    fun parents(subProjection: CommitConnectionResponseProjection): CommitResponseProjection = parents(null, subProjection)

    fun parents(alias: String?, subProjection: CommitConnectionResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("parents").alias(alias).projection(subProjection))
        return this
    }

    fun parents(input: CommitParentsParametrizedInput, subProjection: CommitConnectionResponseProjection): CommitResponseProjection = parents(null, input, subProjection)

    fun parents(alias: String?, input: CommitParentsParametrizedInput, subProjection: CommitConnectionResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("parents").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun pushedDate(): CommitResponseProjection = pushedDate(null)

    fun pushedDate(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("pushedDate").alias(alias))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): CommitResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): CommitResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun signature(subProjection: GitSignatureResponseProjection): CommitResponseProjection = signature(null, subProjection)

    fun signature(alias: String?, subProjection: GitSignatureResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("signature").alias(alias).projection(subProjection))
        return this
    }

    fun status(subProjection: StatusResponseProjection): CommitResponseProjection = status(null, subProjection)

    fun status(alias: String?, subProjection: StatusResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("status").alias(alias).projection(subProjection))
        return this
    }

    fun tarballUrl(): CommitResponseProjection = tarballUrl(null)

    fun tarballUrl(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("tarballUrl").alias(alias))
        return this
    }

    fun tree(subProjection: TreeResponseProjection): CommitResponseProjection = tree(null, subProjection)

    fun tree(alias: String?, subProjection: TreeResponseProjection): CommitResponseProjection {
        fields.add(GraphQLResponseField("tree").alias(alias).projection(subProjection))
        return this
    }

    fun treeResourcePath(): CommitResponseProjection = treeResourcePath(null)

    fun treeResourcePath(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("treeResourcePath").alias(alias))
        return this
    }

    fun treeUrl(): CommitResponseProjection = treeUrl(null)

    fun treeUrl(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("treeUrl").alias(alias))
        return this
    }

    fun url(): CommitResponseProjection = url(null)

    fun url(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun viewerCanSubscribe(): CommitResponseProjection = viewerCanSubscribe(null)

    fun viewerCanSubscribe(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("viewerCanSubscribe").alias(alias))
        return this
    }

    fun viewerSubscription(): CommitResponseProjection = viewerSubscription(null)

    fun viewerSubscription(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("viewerSubscription").alias(alias))
        return this
    }

    fun zipballUrl(): CommitResponseProjection = zipballUrl(null)

    fun zipballUrl(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("zipballUrl").alias(alias))
        return this
    }

    fun typename(): CommitResponseProjection = typename(null)

    fun typename(alias: String?): CommitResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as CommitResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
