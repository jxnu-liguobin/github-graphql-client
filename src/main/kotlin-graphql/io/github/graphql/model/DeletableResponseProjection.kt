package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Deletable
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class DeletableResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeletableResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeletableResponseProjection {
        this.viewerCanDelete()
        this.typename()
        return this
    }

    fun viewerCanDelete(): DeletableResponseProjection = viewerCanDelete(null)

    fun viewerCanDelete(alias: String?): DeletableResponseProjection {
        fields.add(GraphQLResponseField("viewerCanDelete").alias(alias))
        return this
    }

    fun onPullRequestReviewComment(subProjection: PullRequestReviewCommentResponseProjection): DeletableResponseProjection = onPullRequestReviewComment(null, subProjection)

    fun onPullRequestReviewComment(alias: String?, subProjection: PullRequestReviewCommentResponseProjection): DeletableResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestReview(subProjection: PullRequestReviewResponseProjection): DeletableResponseProjection = onPullRequestReview(null, subProjection)

    fun onPullRequestReview(alias: String?, subProjection: PullRequestReviewResponseProjection): DeletableResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun onCommitComment(subProjection: CommitCommentResponseProjection): DeletableResponseProjection = onCommitComment(null, subProjection)

    fun onCommitComment(alias: String?, subProjection: CommitCommentResponseProjection): DeletableResponseProjection {
        fields.add(GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection))
        return this
    }

    fun onIssueComment(subProjection: IssueCommentResponseProjection): DeletableResponseProjection = onIssueComment(null, subProjection)

    fun onIssueComment(alias: String?, subProjection: IssueCommentResponseProjection): DeletableResponseProjection {
        fields.add(GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        return this
    }

    fun onGistComment(subProjection: GistCommentResponseProjection): DeletableResponseProjection = onGistComment(null, subProjection)

    fun onGistComment(alias: String?, subProjection: GistCommentResponseProjection): DeletableResponseProjection {
        fields.add(GraphQLResponseField("...on GistComment").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): DeletableResponseProjection = typename(null)

    fun typename(alias: String?): DeletableResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
