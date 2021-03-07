package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RepositoryNode
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class RepositoryNodeResponseProjection extends GraphQLResponseProjection {

    override def all$(): RepositoryNodeResponseProjection = all$(3)

    override def all$(maxDepth: Int): RepositoryNodeResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("RepositoryNodeResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("RepositoryNodeResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("RepositoryNodeResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryNodeResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        this
    }

    def repository(subProjection: RepositoryResponseProjection): RepositoryNodeResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): RepositoryNodeResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestReviewComment(subProjection: PullRequestReviewCommentResponseProjection): RepositoryNodeResponseProjection = {
        onPullRequestReviewComment(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReviewComment(alias: String, subProjection: PullRequestReviewCommentResponseProjection): RepositoryNodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection))
        this
    }

    def onIssue(subProjection: IssueResponseProjection): RepositoryNodeResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): RepositoryNodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestReview(subProjection: PullRequestReviewResponseProjection): RepositoryNodeResponseProjection = {
        onPullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReview(alias: String, subProjection: PullRequestReviewResponseProjection): RepositoryNodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def onCommitCommentThread(subProjection: CommitCommentThreadResponseProjection): RepositoryNodeResponseProjection = {
        onCommitCommentThread(null.asInstanceOf[String], subProjection)
    }

    def onCommitCommentThread(alias: String, subProjection: CommitCommentThreadResponseProjection): RepositoryNodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on CommitCommentThread").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): RepositoryNodeResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): RepositoryNodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def onCommitComment(subProjection: CommitCommentResponseProjection): RepositoryNodeResponseProjection = {
        onCommitComment(null.asInstanceOf[String], subProjection)
    }

    def onCommitComment(alias: String, subProjection: CommitCommentResponseProjection): RepositoryNodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection))
        this
    }

    def onIssueComment(subProjection: IssueCommentResponseProjection): RepositoryNodeResponseProjection = {
        onIssueComment(null.asInstanceOf[String], subProjection)
    }

    def onIssueComment(alias: String, subProjection: IssueCommentResponseProjection): RepositoryNodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestCommitCommentThread(subProjection: PullRequestCommitCommentThreadResponseProjection): RepositoryNodeResponseProjection = {
        onPullRequestCommitCommentThread(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestCommitCommentThread(alias: String, subProjection: PullRequestCommitCommentThreadResponseProjection): RepositoryNodeResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestCommitCommentThread").alias(alias).projection(subProjection))
        this
    }

    def typename(): RepositoryNodeResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): RepositoryNodeResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
