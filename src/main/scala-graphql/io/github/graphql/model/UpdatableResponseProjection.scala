package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Updatable
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UpdatableResponseProjection extends GraphQLResponseProjection {

    override def all$(): UpdatableResponseProjection = all$(3)

    override def all$(maxDepth: Int): UpdatableResponseProjection = {
        this.viewerCanUpdate()
        this.typename()
        this
    }

    def viewerCanUpdate(): UpdatableResponseProjection = {
        viewerCanUpdate(null.asInstanceOf[String])
    }

    def viewerCanUpdate(alias: String): UpdatableResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanUpdate").alias(alias))
        this
    }

    def onProject(subProjection: ProjectResponseProjection): UpdatableResponseProjection = {
        onProject(null.asInstanceOf[String], subProjection)
    }

    def onProject(alias: String, subProjection: ProjectResponseProjection): UpdatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Project").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestReviewComment(subProjection: PullRequestReviewCommentResponseProjection): UpdatableResponseProjection = {
        onPullRequestReviewComment(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReviewComment(alias: String, subProjection: PullRequestReviewCommentResponseProjection): UpdatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection))
        this
    }

    def onIssue(subProjection: IssueResponseProjection): UpdatableResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): UpdatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestReview(subProjection: PullRequestReviewResponseProjection): UpdatableResponseProjection = {
        onPullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReview(alias: String, subProjection: PullRequestReviewResponseProjection): UpdatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): UpdatableResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): UpdatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def onCommitComment(subProjection: CommitCommentResponseProjection): UpdatableResponseProjection = {
        onCommitComment(null.asInstanceOf[String], subProjection)
    }

    def onCommitComment(alias: String, subProjection: CommitCommentResponseProjection): UpdatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection))
        this
    }

    def onIssueComment(subProjection: IssueCommentResponseProjection): UpdatableResponseProjection = {
        onIssueComment(null.asInstanceOf[String], subProjection)
    }

    def onIssueComment(alias: String, subProjection: IssueCommentResponseProjection): UpdatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        this
    }

    def onGistComment(subProjection: GistCommentResponseProjection): UpdatableResponseProjection = {
        onGistComment(null.asInstanceOf[String], subProjection)
    }

    def onGistComment(alias: String, subProjection: GistCommentResponseProjection): UpdatableResponseProjection = {
        fields.add(new GraphQLResponseField("...on GistComment").alias(alias).projection(subProjection))
        this
    }

    def typename(): UpdatableResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UpdatableResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
