package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for RepositoryNode
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RepositoryNodeResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): RepositoryNodeResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): RepositoryNodeResponseProjection {
        if (projectionDepthOnFields.getOrDefault("RepositoryNodeResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["RepositoryNodeResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("RepositoryNodeResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("RepositoryNodeResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.typename()
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): RepositoryNodeResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): RepositoryNodeResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestReviewComment(subProjection: PullRequestReviewCommentResponseProjection): RepositoryNodeResponseProjection = onPullRequestReviewComment(null, subProjection)

    fun onPullRequestReviewComment(alias: String?, subProjection: PullRequestReviewCommentResponseProjection): RepositoryNodeResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection))
        return this
    }

    fun onIssue(subProjection: IssueResponseProjection): RepositoryNodeResponseProjection = onIssue(null, subProjection)

    fun onIssue(alias: String?, subProjection: IssueResponseProjection): RepositoryNodeResponseProjection {
        fields.add(GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestReview(subProjection: PullRequestReviewResponseProjection): RepositoryNodeResponseProjection = onPullRequestReview(null, subProjection)

    fun onPullRequestReview(alias: String?, subProjection: PullRequestReviewResponseProjection): RepositoryNodeResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun onCommitCommentThread(subProjection: CommitCommentThreadResponseProjection): RepositoryNodeResponseProjection = onCommitCommentThread(null, subProjection)

    fun onCommitCommentThread(alias: String?, subProjection: CommitCommentThreadResponseProjection): RepositoryNodeResponseProjection {
        fields.add(GraphQLResponseField("...on CommitCommentThread").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): RepositoryNodeResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): RepositoryNodeResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun onCommitComment(subProjection: CommitCommentResponseProjection): RepositoryNodeResponseProjection = onCommitComment(null, subProjection)

    fun onCommitComment(alias: String?, subProjection: CommitCommentResponseProjection): RepositoryNodeResponseProjection {
        fields.add(GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection))
        return this
    }

    fun onIssueComment(subProjection: IssueCommentResponseProjection): RepositoryNodeResponseProjection = onIssueComment(null, subProjection)

    fun onIssueComment(alias: String?, subProjection: IssueCommentResponseProjection): RepositoryNodeResponseProjection {
        fields.add(GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestCommitCommentThread(subProjection: PullRequestCommitCommentThreadResponseProjection): RepositoryNodeResponseProjection = onPullRequestCommitCommentThread(null, subProjection)

    fun onPullRequestCommitCommentThread(alias: String?, subProjection: PullRequestCommitCommentThreadResponseProjection): RepositoryNodeResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestCommitCommentThread").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): RepositoryNodeResponseProjection = typename(null)

    fun typename(alias: String?): RepositoryNodeResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
