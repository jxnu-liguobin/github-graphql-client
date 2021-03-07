package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdatableComment
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class UpdatableCommentResponseProjection extends GraphQLResponseProjection {

    override def all$(): UpdatableCommentResponseProjection = all$(3)

    override def all$(maxDepth: Int): UpdatableCommentResponseProjection = {
        this.viewerCannotUpdateReasons()
        this.typename()
        this
    }

    def viewerCannotUpdateReasons(): UpdatableCommentResponseProjection = {
        viewerCannotUpdateReasons(null.asInstanceOf[String])
    }

    def viewerCannotUpdateReasons(alias: String): UpdatableCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCannotUpdateReasons").alias(alias))
        this
    }

    def onPullRequestReviewComment(subProjection: PullRequestReviewCommentResponseProjection): UpdatableCommentResponseProjection = {
        onPullRequestReviewComment(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReviewComment(alias: String, subProjection: PullRequestReviewCommentResponseProjection): UpdatableCommentResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection))
        this
    }

    def onIssue(subProjection: IssueResponseProjection): UpdatableCommentResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): UpdatableCommentResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestReview(subProjection: PullRequestReviewResponseProjection): UpdatableCommentResponseProjection = {
        onPullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReview(alias: String, subProjection: PullRequestReviewResponseProjection): UpdatableCommentResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): UpdatableCommentResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): UpdatableCommentResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def onCommitComment(subProjection: CommitCommentResponseProjection): UpdatableCommentResponseProjection = {
        onCommitComment(null.asInstanceOf[String], subProjection)
    }

    def onCommitComment(alias: String, subProjection: CommitCommentResponseProjection): UpdatableCommentResponseProjection = {
        fields.add(new GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection))
        this
    }

    def onIssueComment(subProjection: IssueCommentResponseProjection): UpdatableCommentResponseProjection = {
        onIssueComment(null.asInstanceOf[String], subProjection)
    }

    def onIssueComment(alias: String, subProjection: IssueCommentResponseProjection): UpdatableCommentResponseProjection = {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        this
    }

    def onGistComment(subProjection: GistCommentResponseProjection): UpdatableCommentResponseProjection = {
        onGistComment(null.asInstanceOf[String], subProjection)
    }

    def onGistComment(alias: String, subProjection: GistCommentResponseProjection): UpdatableCommentResponseProjection = {
        fields.add(new GraphQLResponseField("...on GistComment").alias(alias).projection(subProjection))
        this
    }

    def typename(): UpdatableCommentResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): UpdatableCommentResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
