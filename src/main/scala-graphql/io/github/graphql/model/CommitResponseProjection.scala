package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Commit
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CommitResponseProjection extends GraphQLResponseProjection {

    override def all$(): CommitResponseProjection = all$(3)

    override def all$(maxDepth: Int): CommitResponseProjection = {
        this.abbreviatedOid()
        this.additions()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", projectionDepthOnFields.getOrDefault("CommitResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0) + 1)
            this.associatedPullRequests(new PullRequestConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.PullRequestConnectionResponseProjection.associatedPullRequests", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.GitActorResponseProjection.author", projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.author", 0) + 1)
            this.author(new GitActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.author", 0)))
        }
        this.authoredByCommitter()
        this.authoredDate()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.BlameResponseProjection.blame", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.BlameResponseProjection.blame", projectionDepthOnFields.getOrDefault("CommitResponseProjection.BlameResponseProjection.blame", 0) + 1)
            this.blame(new BlameResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.BlameResponseProjection.blame", 0)))
        }
        this.changedFiles()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.CommitCommentConnectionResponseProjection.comments", projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitCommentConnectionResponseProjection.comments", 0) + 1)
            this.comments(new CommitCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitCommentConnectionResponseProjection.comments", 0)))
        }
        this.commitResourcePath()
        this.commitUrl()
        this.committedDate()
        this.committedViaWeb()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.committer", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.GitActorResponseProjection.committer", projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.committer", 0) + 1)
            this.committer(new GitActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitActorResponseProjection.committer", 0)))
        }
        this.deletions()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.DeploymentConnectionResponseProjection.deployments", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.DeploymentConnectionResponseProjection.deployments", projectionDepthOnFields.getOrDefault("CommitResponseProjection.DeploymentConnectionResponseProjection.deployments", 0) + 1)
            this.deployments(new DeploymentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.DeploymentConnectionResponseProjection.deployments", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitHistoryConnectionResponseProjection.history", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.CommitHistoryConnectionResponseProjection.history", projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitHistoryConnectionResponseProjection.history", 0) + 1)
            this.history(new CommitHistoryConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitHistoryConnectionResponseProjection.history", 0)))
        }
        this.id()
        this.message()
        this.messageBody()
        this.messageBodyHTML()
        this.messageHeadline()
        this.messageHeadlineHTML()
        this.oid()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitConnectionResponseProjection.parents", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.CommitConnectionResponseProjection.parents", projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitConnectionResponseProjection.parents", 0) + 1)
            this.parents(new CommitConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.CommitConnectionResponseProjection.parents", 0)))
        }
        this.pushedDate()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("CommitResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitSignatureResponseProjection.signature", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.GitSignatureResponseProjection.signature", projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitSignatureResponseProjection.signature", 0) + 1)
            this.signature(new GitSignatureResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.GitSignatureResponseProjection.signature", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.StatusResponseProjection.status", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.StatusResponseProjection.status", projectionDepthOnFields.getOrDefault("CommitResponseProjection.StatusResponseProjection.status", 0) + 1)
            this.status(new StatusResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.StatusResponseProjection.status", 0)))
        }
        this.tarballUrl()
        if (projectionDepthOnFields.getOrDefault("CommitResponseProjection.TreeResponseProjection.tree", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitResponseProjection.TreeResponseProjection.tree", projectionDepthOnFields.getOrDefault("CommitResponseProjection.TreeResponseProjection.tree", 0) + 1)
            this.tree(new TreeResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitResponseProjection.TreeResponseProjection.tree", 0)))
        }
        this.treeResourcePath()
        this.treeUrl()
        this.url()
        this.viewerCanSubscribe()
        this.viewerSubscription()
        this.zipballUrl()
        this.typename()
        this
    }

    def abbreviatedOid(): CommitResponseProjection = {
        abbreviatedOid(null.asInstanceOf[String])
    }

    def abbreviatedOid(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("abbreviatedOid").alias(alias))
        this
    }

    def additions(): CommitResponseProjection = {
        additions(null.asInstanceOf[String])
    }

    def additions(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("additions").alias(alias))
        this
    }

    def associatedPullRequests(subProjection: PullRequestConnectionResponseProjection): CommitResponseProjection = {
        associatedPullRequests(null.asInstanceOf[String], subProjection)
    }

    def associatedPullRequests(alias: String, subProjection: PullRequestConnectionResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("associatedPullRequests").alias(alias).projection(subProjection))
        this
    }

    def associatedPullRequests(input: CommitAssociatedPullRequestsParametrizedInput,subProjection: PullRequestConnectionResponseProjection): CommitResponseProjection = {
        associatedPullRequests(null.asInstanceOf[String], input, subProjection)
    }

    def associatedPullRequests(alias: String, input: CommitAssociatedPullRequestsParametrizedInput , subProjection: PullRequestConnectionResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("associatedPullRequests").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def author(subProjection: GitActorResponseProjection): CommitResponseProjection = {
        author(null.asInstanceOf[String], subProjection)
    }

    def author(alias: String, subProjection: GitActorResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection))
        this
    }

    def authoredByCommitter(): CommitResponseProjection = {
        authoredByCommitter(null.asInstanceOf[String])
    }

    def authoredByCommitter(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("authoredByCommitter").alias(alias))
        this
    }

    def authoredDate(): CommitResponseProjection = {
        authoredDate(null.asInstanceOf[String])
    }

    def authoredDate(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("authoredDate").alias(alias))
        this
    }

    def blame(subProjection: BlameResponseProjection): CommitResponseProjection = {
        blame(null.asInstanceOf[String], subProjection)
    }

    def blame(alias: String, subProjection: BlameResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("blame").alias(alias).projection(subProjection))
        this
    }

    def blame(input: CommitBlameParametrizedInput,subProjection: BlameResponseProjection): CommitResponseProjection = {
        blame(null.asInstanceOf[String], input, subProjection)
    }

    def blame(alias: String, input: CommitBlameParametrizedInput , subProjection: BlameResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("blame").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def changedFiles(): CommitResponseProjection = {
        changedFiles(null.asInstanceOf[String])
    }

    def changedFiles(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("changedFiles").alias(alias))
        this
    }

    def comments(subProjection: CommitCommentConnectionResponseProjection): CommitResponseProjection = {
        comments(null.asInstanceOf[String], subProjection)
    }

    def comments(alias: String, subProjection: CommitCommentConnectionResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection))
        this
    }

    def comments(input: CommitCommentsParametrizedInput,subProjection: CommitCommentConnectionResponseProjection): CommitResponseProjection = {
        comments(null.asInstanceOf[String], input, subProjection)
    }

    def comments(alias: String, input: CommitCommentsParametrizedInput , subProjection: CommitCommentConnectionResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def commitResourcePath(): CommitResponseProjection = {
        commitResourcePath(null.asInstanceOf[String])
    }

    def commitResourcePath(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("commitResourcePath").alias(alias))
        this
    }

    def commitUrl(): CommitResponseProjection = {
        commitUrl(null.asInstanceOf[String])
    }

    def commitUrl(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("commitUrl").alias(alias))
        this
    }

    def committedDate(): CommitResponseProjection = {
        committedDate(null.asInstanceOf[String])
    }

    def committedDate(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("committedDate").alias(alias))
        this
    }

    def committedViaWeb(): CommitResponseProjection = {
        committedViaWeb(null.asInstanceOf[String])
    }

    def committedViaWeb(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("committedViaWeb").alias(alias))
        this
    }

    def committer(subProjection: GitActorResponseProjection): CommitResponseProjection = {
        committer(null.asInstanceOf[String], subProjection)
    }

    def committer(alias: String, subProjection: GitActorResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("committer").alias(alias).projection(subProjection))
        this
    }

    def deletions(): CommitResponseProjection = {
        deletions(null.asInstanceOf[String])
    }

    def deletions(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("deletions").alias(alias))
        this
    }

    def deployments(subProjection: DeploymentConnectionResponseProjection): CommitResponseProjection = {
        deployments(null.asInstanceOf[String], subProjection)
    }

    def deployments(alias: String, subProjection: DeploymentConnectionResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("deployments").alias(alias).projection(subProjection))
        this
    }

    def deployments(input: CommitDeploymentsParametrizedInput,subProjection: DeploymentConnectionResponseProjection): CommitResponseProjection = {
        deployments(null.asInstanceOf[String], input, subProjection)
    }

    def deployments(alias: String, input: CommitDeploymentsParametrizedInput , subProjection: DeploymentConnectionResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("deployments").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def history(subProjection: CommitHistoryConnectionResponseProjection): CommitResponseProjection = {
        history(null.asInstanceOf[String], subProjection)
    }

    def history(alias: String, subProjection: CommitHistoryConnectionResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("history").alias(alias).projection(subProjection))
        this
    }

    def history(input: CommitHistoryParametrizedInput,subProjection: CommitHistoryConnectionResponseProjection): CommitResponseProjection = {
        history(null.asInstanceOf[String], input, subProjection)
    }

    def history(alias: String, input: CommitHistoryParametrizedInput , subProjection: CommitHistoryConnectionResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("history").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def id(): CommitResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def message(): CommitResponseProjection = {
        message(null.asInstanceOf[String])
    }

    def message(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("message").alias(alias))
        this
    }

    def messageBody(): CommitResponseProjection = {
        messageBody(null.asInstanceOf[String])
    }

    def messageBody(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("messageBody").alias(alias))
        this
    }

    def messageBodyHTML(): CommitResponseProjection = {
        messageBodyHTML(null.asInstanceOf[String])
    }

    def messageBodyHTML(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("messageBodyHTML").alias(alias))
        this
    }

    def messageHeadline(): CommitResponseProjection = {
        messageHeadline(null.asInstanceOf[String])
    }

    def messageHeadline(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("messageHeadline").alias(alias))
        this
    }

    def messageHeadlineHTML(): CommitResponseProjection = {
        messageHeadlineHTML(null.asInstanceOf[String])
    }

    def messageHeadlineHTML(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("messageHeadlineHTML").alias(alias))
        this
    }

    def oid(): CommitResponseProjection = {
        oid(null.asInstanceOf[String])
    }

    def oid(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("oid").alias(alias))
        this
    }

    def parents(subProjection: CommitConnectionResponseProjection): CommitResponseProjection = {
        parents(null.asInstanceOf[String], subProjection)
    }

    def parents(alias: String, subProjection: CommitConnectionResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("parents").alias(alias).projection(subProjection))
        this
    }

    def parents(input: CommitParentsParametrizedInput,subProjection: CommitConnectionResponseProjection): CommitResponseProjection = {
        parents(null.asInstanceOf[String], input, subProjection)
    }

    def parents(alias: String, input: CommitParentsParametrizedInput , subProjection: CommitConnectionResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("parents").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def pushedDate(): CommitResponseProjection = {
        pushedDate(null.asInstanceOf[String])
    }

    def pushedDate(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("pushedDate").alias(alias))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): CommitResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def resourcePath(): CommitResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def signature(subProjection: GitSignatureResponseProjection): CommitResponseProjection = {
        signature(null.asInstanceOf[String], subProjection)
    }

    def signature(alias: String, subProjection: GitSignatureResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("signature").alias(alias).projection(subProjection))
        this
    }

    def status(subProjection: StatusResponseProjection): CommitResponseProjection = {
        status(null.asInstanceOf[String], subProjection)
    }

    def status(alias: String, subProjection: StatusResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("status").alias(alias).projection(subProjection))
        this
    }

    def tarballUrl(): CommitResponseProjection = {
        tarballUrl(null.asInstanceOf[String])
    }

    def tarballUrl(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("tarballUrl").alias(alias))
        this
    }

    def tree(subProjection: TreeResponseProjection): CommitResponseProjection = {
        tree(null.asInstanceOf[String], subProjection)
    }

    def tree(alias: String, subProjection: TreeResponseProjection): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("tree").alias(alias).projection(subProjection))
        this
    }

    def treeResourcePath(): CommitResponseProjection = {
        treeResourcePath(null.asInstanceOf[String])
    }

    def treeResourcePath(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("treeResourcePath").alias(alias))
        this
    }

    def treeUrl(): CommitResponseProjection = {
        treeUrl(null.asInstanceOf[String])
    }

    def treeUrl(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("treeUrl").alias(alias))
        this
    }

    def url(): CommitResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def viewerCanSubscribe(): CommitResponseProjection = {
        viewerCanSubscribe(null.asInstanceOf[String])
    }

    def viewerCanSubscribe(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanSubscribe").alias(alias))
        this
    }

    def viewerSubscription(): CommitResponseProjection = {
        viewerSubscription(null.asInstanceOf[String])
    }

    def viewerSubscription(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("viewerSubscription").alias(alias))
        this
    }

    def zipballUrl(): CommitResponseProjection = {
        zipballUrl(null.asInstanceOf[String])
    }

    def zipballUrl(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("zipballUrl").alias(alias))
        this
    }

    def typename(): CommitResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CommitResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
