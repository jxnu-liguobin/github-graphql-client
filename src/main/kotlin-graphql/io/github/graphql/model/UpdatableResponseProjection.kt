package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Updatable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class UpdatableResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): UpdatableResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): UpdatableResponseProjection {
        this.viewerCanUpdate()
        this.typename()
        return this
    }

    fun viewerCanUpdate(): UpdatableResponseProjection = viewerCanUpdate(null)

    fun viewerCanUpdate(alias: String?): UpdatableResponseProjection {
        fields.add(GraphQLResponseField("viewerCanUpdate").alias(alias))
        return this
    }

    fun onProject(subProjection: ProjectResponseProjection): UpdatableResponseProjection = onProject(null, subProjection)

    fun onProject(alias: String?, subProjection: ProjectResponseProjection): UpdatableResponseProjection {
        fields.add(GraphQLResponseField("...on Project").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestReviewComment(subProjection: PullRequestReviewCommentResponseProjection): UpdatableResponseProjection = onPullRequestReviewComment(null, subProjection)

    fun onPullRequestReviewComment(alias: String?, subProjection: PullRequestReviewCommentResponseProjection): UpdatableResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection))
        return this
    }

    fun onIssue(subProjection: IssueResponseProjection): UpdatableResponseProjection = onIssue(null, subProjection)

    fun onIssue(alias: String?, subProjection: IssueResponseProjection): UpdatableResponseProjection {
        fields.add(GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestReview(subProjection: PullRequestReviewResponseProjection): UpdatableResponseProjection = onPullRequestReview(null, subProjection)

    fun onPullRequestReview(alias: String?, subProjection: PullRequestReviewResponseProjection): UpdatableResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): UpdatableResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): UpdatableResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun onCommitComment(subProjection: CommitCommentResponseProjection): UpdatableResponseProjection = onCommitComment(null, subProjection)

    fun onCommitComment(alias: String?, subProjection: CommitCommentResponseProjection): UpdatableResponseProjection {
        fields.add(GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection))
        return this
    }

    fun onIssueComment(subProjection: IssueCommentResponseProjection): UpdatableResponseProjection = onIssueComment(null, subProjection)

    fun onIssueComment(alias: String?, subProjection: IssueCommentResponseProjection): UpdatableResponseProjection {
        fields.add(GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        return this
    }

    fun onGistComment(subProjection: GistCommentResponseProjection): UpdatableResponseProjection = onGistComment(null, subProjection)

    fun onGistComment(alias: String?, subProjection: GistCommentResponseProjection): UpdatableResponseProjection {
        fields.add(GraphQLResponseField("...on GistComment").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): UpdatableResponseProjection = typename(null)

    fun typename(alias: String?): UpdatableResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
