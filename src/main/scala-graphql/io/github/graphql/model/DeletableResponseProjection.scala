package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Deletable
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class DeletableResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeletableResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeletableResponseProjection = {
        this.viewerCanDelete()
        this.typename()
        this
    }

    def viewerCanDelete(): DeletableResponseProjection = {
        viewerCanDelete(null.asInstanceOf[String])
    }

    def viewerCanDelete(alias: String): DeletableResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanDelete").alias(alias))
        this
    }

    def onPullRequestReviewComment(subProjection: PullRequestReviewCommentResponseProjection): DeletableResponseProjection = {
        onPullRequestReviewComment(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReviewComment(alias: String, subProjection: PullRequestReviewCommentResponseProjection): DeletableResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestReview(subProjection: PullRequestReviewResponseProjection): DeletableResponseProjection = {
        onPullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReview(alias: String, subProjection: PullRequestReviewResponseProjection): DeletableResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def onCommitComment(subProjection: CommitCommentResponseProjection): DeletableResponseProjection = {
        onCommitComment(null.asInstanceOf[String], subProjection)
    }

    def onCommitComment(alias: String, subProjection: CommitCommentResponseProjection): DeletableResponseProjection = {
        fields.add(new GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection))
        this
    }

    def onIssueComment(subProjection: IssueCommentResponseProjection): DeletableResponseProjection = {
        onIssueComment(null.asInstanceOf[String], subProjection)
    }

    def onIssueComment(alias: String, subProjection: IssueCommentResponseProjection): DeletableResponseProjection = {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        this
    }

    def onGistComment(subProjection: GistCommentResponseProjection): DeletableResponseProjection = {
        onGistComment(null.asInstanceOf[String], subProjection)
    }

    def onGistComment(alias: String, subProjection: GistCommentResponseProjection): DeletableResponseProjection = {
        fields.add(new GraphQLResponseField("...on GistComment").alias(alias).projection(subProjection))
        this
    }

    def typename(): DeletableResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeletableResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
