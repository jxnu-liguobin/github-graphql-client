package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for Comment
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class CommentResponseProjection extends GraphQLResponseProjection {

    override def all$(): CommentResponseProjection = all$(3)

    override def all$(maxDepth: Int): CommentResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommentResponseProjection.ActorResponseProjection.author", projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.author", 0) + 1)
            this.author(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.author", 0)))
        }
        this.authorAssociation()
        this.body()
        this.bodyHTML()
        this.bodyText()
        this.createdAt()
        this.createdViaEmail()
        if (projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommentResponseProjection.ActorResponseProjection.editor", projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.editor", 0) + 1)
            this.editor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommentResponseProjection.ActorResponseProjection.editor", 0)))
        }
        this.id()
        this.includesCreatedEdit()
        this.lastEditedAt()
        this.publishedAt()
        this.updatedAt()
        if (projectionDepthOnFields.getOrDefault("CommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", projectionDepthOnFields.getOrDefault("CommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1)
            this.userContentEdits(new UserContentEditConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)))
        }
        this.viewerDidAuthor()
        this.typename()
        this
    }

    def author(subProjection: ActorResponseProjection): CommentResponseProjection = {
        author(null.asInstanceOf[String], subProjection)
    }

    def author(alias: String, subProjection: ActorResponseProjection): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection))
        this
    }

    def authorAssociation(): CommentResponseProjection = {
        authorAssociation(null.asInstanceOf[String])
    }

    def authorAssociation(alias: String): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("authorAssociation").alias(alias))
        this
    }

    def body(): CommentResponseProjection = {
        body(null.asInstanceOf[String])
    }

    def body(alias: String): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("body").alias(alias))
        this
    }

    def bodyHTML(): CommentResponseProjection = {
        bodyHTML(null.asInstanceOf[String])
    }

    def bodyHTML(alias: String): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias))
        this
    }

    def bodyText(): CommentResponseProjection = {
        bodyText(null.asInstanceOf[String])
    }

    def bodyText(alias: String): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("bodyText").alias(alias))
        this
    }

    def createdAt(): CommentResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def createdViaEmail(): CommentResponseProjection = {
        createdViaEmail(null.asInstanceOf[String])
    }

    def createdViaEmail(alias: String): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("createdViaEmail").alias(alias))
        this
    }

    def editor(subProjection: ActorResponseProjection): CommentResponseProjection = {
        editor(null.asInstanceOf[String], subProjection)
    }

    def editor(alias: String, subProjection: ActorResponseProjection): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("editor").alias(alias).projection(subProjection))
        this
    }

    def id(): CommentResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def includesCreatedEdit(): CommentResponseProjection = {
        includesCreatedEdit(null.asInstanceOf[String])
    }

    def includesCreatedEdit(alias: String): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("includesCreatedEdit").alias(alias))
        this
    }

    def lastEditedAt(): CommentResponseProjection = {
        lastEditedAt(null.asInstanceOf[String])
    }

    def lastEditedAt(alias: String): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("lastEditedAt").alias(alias))
        this
    }

    def publishedAt(): CommentResponseProjection = {
        publishedAt(null.asInstanceOf[String])
    }

    def publishedAt(alias: String): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias))
        this
    }

    def updatedAt(): CommentResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def userContentEdits(subProjection: UserContentEditConnectionResponseProjection): CommentResponseProjection = {
        userContentEdits(null.asInstanceOf[String], subProjection)
    }

    def userContentEdits(alias: String, subProjection: UserContentEditConnectionResponseProjection): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection))
        this
    }

    def userContentEdits(input: CommentUserContentEditsParametrizedInput,subProjection: UserContentEditConnectionResponseProjection): CommentResponseProjection = {
        userContentEdits(null.asInstanceOf[String], input, subProjection)
    }

    def userContentEdits(alias: String, input: CommentUserContentEditsParametrizedInput , subProjection: UserContentEditConnectionResponseProjection): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def viewerDidAuthor(): CommentResponseProjection = {
        viewerDidAuthor(null.asInstanceOf[String])
    }

    def viewerDidAuthor(alias: String): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerDidAuthor").alias(alias))
        this
    }

    def onPullRequestReviewComment(subProjection: PullRequestReviewCommentResponseProjection): CommentResponseProjection = {
        onPullRequestReviewComment(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReviewComment(alias: String, subProjection: PullRequestReviewCommentResponseProjection): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReviewComment").alias(alias).projection(subProjection))
        this
    }

    def onIssue(subProjection: IssueResponseProjection): CommentResponseProjection = {
        onIssue(null.asInstanceOf[String], subProjection)
    }

    def onIssue(alias: String, subProjection: IssueResponseProjection): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("...on Issue").alias(alias).projection(subProjection))
        this
    }

    def onPullRequestReview(subProjection: PullRequestReviewResponseProjection): CommentResponseProjection = {
        onPullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def onPullRequestReview(alias: String, subProjection: PullRequestReviewResponseProjection): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def onPullRequest(subProjection: PullRequestResponseProjection): CommentResponseProjection = {
        onPullRequest(null.asInstanceOf[String], subProjection)
    }

    def onPullRequest(alias: String, subProjection: PullRequestResponseProjection): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("...on PullRequest").alias(alias).projection(subProjection))
        this
    }

    def onCommitComment(subProjection: CommitCommentResponseProjection): CommentResponseProjection = {
        onCommitComment(null.asInstanceOf[String], subProjection)
    }

    def onCommitComment(alias: String, subProjection: CommitCommentResponseProjection): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("...on CommitComment").alias(alias).projection(subProjection))
        this
    }

    def onIssueComment(subProjection: IssueCommentResponseProjection): CommentResponseProjection = {
        onIssueComment(null.asInstanceOf[String], subProjection)
    }

    def onIssueComment(alias: String, subProjection: IssueCommentResponseProjection): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("...on IssueComment").alias(alias).projection(subProjection))
        this
    }

    def onGistComment(subProjection: GistCommentResponseProjection): CommentResponseProjection = {
        onGistComment(null.asInstanceOf[String], subProjection)
    }

    def onGistComment(alias: String, subProjection: GistCommentResponseProjection): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("...on GistComment").alias(alias).projection(subProjection))
        this
    }

    def typename(): CommentResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CommentResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[CommentResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
