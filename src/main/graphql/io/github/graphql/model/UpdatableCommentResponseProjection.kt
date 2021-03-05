package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for UpdatableComment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class UpdatableCommentResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UpdatableCommentResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UpdatableCommentResponseProjection {
        this.viewerCannotUpdateReasons()
        this.typename()
        return this
    }

    fun viewerCannotUpdateReasons(): UpdatableCommentResponseProjection = viewerCannotUpdateReasons(null)

    fun viewerCannotUpdateReasons(alias: String?): UpdatableCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCannotUpdateReasons").alias(alias))
        return this
    }

    fun onPullRequestReviewComment(subProjection: PullRequestReviewCommentResponseProjection): UpdatableCommentResponseProjection = onPullRequestReviewComment(null, subProjection)

    fun onPullRequestReviewComment(alias: String?, subProjection: PullRequestReviewCommentResponseProjection): UpdatableCommentResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection))
        return this
    }

    fun onIssue(subProjection: IssueResponseProjection): UpdatableCommentResponseProjection = onIssue(null, subProjection)

    fun onIssue(alias: String?, subProjection: IssueResponseProjection): UpdatableCommentResponseProjection {
        fields.add(GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestReview(subProjection: PullRequestReviewResponseProjection): UpdatableCommentResponseProjection = onPullRequestReview(null, subProjection)

    fun onPullRequestReview(alias: String?, subProjection: PullRequestReviewResponseProjection): UpdatableCommentResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): UpdatableCommentResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): UpdatableCommentResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun onCommitComment(subProjection: CommitCommentResponseProjection): UpdatableCommentResponseProjection = onCommitComment(null, subProjection)

    fun onCommitComment(alias: String?, subProjection: CommitCommentResponseProjection): UpdatableCommentResponseProjection {
        fields.add(GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection))
        return this
    }

    fun onIssueComment(subProjection: IssueCommentResponseProjection): UpdatableCommentResponseProjection = onIssueComment(null, subProjection)

    fun onIssueComment(alias: String?, subProjection: IssueCommentResponseProjection): UpdatableCommentResponseProjection {
        fields.add(GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        return this
    }

    fun onGistComment(subProjection: GistCommentResponseProjection): UpdatableCommentResponseProjection = onGistComment(null, subProjection)

    fun onGistComment(alias: String?, subProjection: GistCommentResponseProjection): UpdatableCommentResponseProjection {
        fields.add(GraphQLResponseField("...on GistComment").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UpdatableCommentResponseProjection = typename(null)

    fun typename(alias: String?): UpdatableCommentResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
