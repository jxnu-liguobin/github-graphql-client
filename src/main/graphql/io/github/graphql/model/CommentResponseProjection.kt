package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for Comment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:08:59+0800"
)
open class CommentResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CommentResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CommentResponseProjection {
        if (projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields["CommentResponseProjection.ActorResponseProjection.author"] = projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.author", 0) + 1
            this.author(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.author", 0)))
        }
        this.authorAssociation()
        this.body()
        this.bodyHTML()
        this.bodyText()
        this.createdAt()
        this.createdViaEmail()
        if (projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields["CommentResponseProjection.ActorResponseProjection.editor"] = projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.editor", 0) + 1
            this.editor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.editor", 0)))
        }
        this.id()
        this.includesCreatedEdit()
        this.lastEditedAt()
        this.publishedAt()
        this.updatedAt()
        if (projectionDepthOnFields.getOrDefault("CommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields["CommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits"] = projectionDepthOnFields.getOrDefault("CommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1
            this.userContentEdits(UserContentEditConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)))
        }
        this.viewerDidAuthor()
        this.typename()
        return this
    }

    fun author(subProjection: ActorResponseProjection): CommentResponseProjection = author(null, subProjection)

    fun author(alias: String?, subProjection: ActorResponseProjection): CommentResponseProjection {
        fields.add(GraphQLResponseField("author").alias(alias).projection(subProjection))
        return this
    }

    fun authorAssociation(): CommentResponseProjection = authorAssociation(null)

    fun authorAssociation(alias: String?): CommentResponseProjection {
        fields.add(GraphQLResponseField("authorAssociation").alias(alias))
        return this
    }

    fun body(): CommentResponseProjection = body(null)

    fun body(alias: String?): CommentResponseProjection {
        fields.add(GraphQLResponseField("body").alias(alias))
        return this
    }

    fun bodyHTML(): CommentResponseProjection = bodyHTML(null)

    fun bodyHTML(alias: String?): CommentResponseProjection {
        fields.add(GraphQLResponseField("bodyHTML").alias(alias))
        return this
    }

    fun bodyText(): CommentResponseProjection = bodyText(null)

    fun bodyText(alias: String?): CommentResponseProjection {
        fields.add(GraphQLResponseField("bodyText").alias(alias))
        return this
    }

    fun createdAt(): CommentResponseProjection = createdAt(null)

    fun createdAt(alias: String?): CommentResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun createdViaEmail(): CommentResponseProjection = createdViaEmail(null)

    fun createdViaEmail(alias: String?): CommentResponseProjection {
        fields.add(GraphQLResponseField("createdViaEmail").alias(alias))
        return this
    }

    fun editor(subProjection: ActorResponseProjection): CommentResponseProjection = editor(null, subProjection)

    fun editor(alias: String?, subProjection: ActorResponseProjection): CommentResponseProjection {
        fields.add(GraphQLResponseField("editor").alias(alias).projection(subProjection))
        return this
    }

    fun id(): CommentResponseProjection = id(null)

    fun id(alias: String?): CommentResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun includesCreatedEdit(): CommentResponseProjection = includesCreatedEdit(null)

    fun includesCreatedEdit(alias: String?): CommentResponseProjection {
        fields.add(GraphQLResponseField("includesCreatedEdit").alias(alias))
        return this
    }

    fun lastEditedAt(): CommentResponseProjection = lastEditedAt(null)

    fun lastEditedAt(alias: String?): CommentResponseProjection {
        fields.add(GraphQLResponseField("lastEditedAt").alias(alias))
        return this
    }

    fun publishedAt(): CommentResponseProjection = publishedAt(null)

    fun publishedAt(alias: String?): CommentResponseProjection {
        fields.add(GraphQLResponseField("publishedAt").alias(alias))
        return this
    }

    fun updatedAt(): CommentResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): CommentResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun userContentEdits(subProjection: UserContentEditConnectionResponseProjection): CommentResponseProjection = userContentEdits(null, subProjection)

    fun userContentEdits(alias: String?, subProjection: UserContentEditConnectionResponseProjection): CommentResponseProjection {
        fields.add(GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection))
        return this
    }

    fun userContentEdits(input: CommentUserContentEditsParametrizedInput, subProjection: UserContentEditConnectionResponseProjection): CommentResponseProjection = userContentEdits(null, input, subProjection)

    fun userContentEdits(alias: String?, input: CommentUserContentEditsParametrizedInput, subProjection: UserContentEditConnectionResponseProjection): CommentResponseProjection {
        fields.add(GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun viewerDidAuthor(): CommentResponseProjection = viewerDidAuthor(null)

    fun viewerDidAuthor(alias: String?): CommentResponseProjection {
        fields.add(GraphQLResponseField("viewerDidAuthor").alias(alias))
        return this
    }

    fun onPullRequestReviewComment(subProjection: PullRequestReviewCommentResponseProjection): CommentResponseProjection = onPullRequestReviewComment(null, subProjection)

    fun onPullRequestReviewComment(alias: String?, subProjection: PullRequestReviewCommentResponseProjection): CommentResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection))
        return this
    }

    fun onIssue(subProjection: IssueResponseProjection): CommentResponseProjection = onIssue(null, subProjection)

    fun onIssue(alias: String?, subProjection: IssueResponseProjection): CommentResponseProjection {
        fields.add(GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequestReview(subProjection: PullRequestReviewResponseProjection): CommentResponseProjection = onPullRequestReview(null, subProjection)

    fun onPullRequestReview(alias: String?, subProjection: PullRequestReviewResponseProjection): CommentResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun onPullRequest(subProjection: PullRequestResponseProjection): CommentResponseProjection = onPullRequest(null, subProjection)

    fun onPullRequest(alias: String?, subProjection: PullRequestResponseProjection): CommentResponseProjection {
        fields.add(GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun onCommitComment(subProjection: CommitCommentResponseProjection): CommentResponseProjection = onCommitComment(null, subProjection)

    fun onCommitComment(alias: String?, subProjection: CommitCommentResponseProjection): CommentResponseProjection {
        fields.add(GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection))
        return this
    }

    fun onIssueComment(subProjection: IssueCommentResponseProjection): CommentResponseProjection = onIssueComment(null, subProjection)

    fun onIssueComment(alias: String?, subProjection: IssueCommentResponseProjection): CommentResponseProjection {
        fields.add(GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        return this
    }

    fun onGistComment(subProjection: GistCommentResponseProjection): CommentResponseProjection = onGistComment(null, subProjection)

    fun onGistComment(alias: String?, subProjection: GistCommentResponseProjection): CommentResponseProjection {
        fields.add(GraphQLResponseField("...on GistComment").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): CommentResponseProjection = typename(null)

    fun typename(alias: String?): CommentResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
