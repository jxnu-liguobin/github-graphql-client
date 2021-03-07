package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestReview
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PullRequestReviewResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestReviewResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestReviewResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.ActorResponseProjection.author", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.author", 0) + 1)
            this.author(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.author", 0)))
        }
        this.authorAssociation()
        this.body()
        this.bodyHTML()
        this.bodyText()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0) + 1)
            this.comments(new PullRequestReviewCommentConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.CommitResponseProjection.commit", 0) + 1)
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.createdAt()
        this.createdViaEmail()
        this.databaseId()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.ActorResponseProjection.editor", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.editor", 0) + 1)
            this.editor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.editor", 0)))
        }
        this.id()
        this.includesCreatedEdit()
        this.lastEditedAt()
        this.publishedAt()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.ReactionGroupResponseProjection.reactionGroups", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1)
            this.reactionGroups(new ReactionGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.ReactionConnectionResponseProjection.reactions", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1)
            this.reactions(new ReactionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionConnectionResponseProjection.reactions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.state()
        this.submittedAt()
        this.updatedAt()
        this.url()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1)
            this.userContentEdits(new UserContentEditConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)))
        }
        this.viewerCanDelete()
        this.viewerCanReact()
        this.viewerCanUpdate()
        this.viewerCannotUpdateReasons()
        this.viewerDidAuthor()
        this.typename()
        this
    }

    def author(subProjection: ActorResponseProjection): PullRequestReviewResponseProjection = {
        author(null.asInstanceOf[String], subProjection)
    }

    def author(alias: String, subProjection: ActorResponseProjection): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection))
        this
    }

    def authorAssociation(): PullRequestReviewResponseProjection = {
        authorAssociation(null.asInstanceOf[String])
    }

    def authorAssociation(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("authorAssociation").alias(alias))
        this
    }

    def body(): PullRequestReviewResponseProjection = {
        body(null.asInstanceOf[String])
    }

    def body(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("body").alias(alias))
        this
    }

    def bodyHTML(): PullRequestReviewResponseProjection = {
        bodyHTML(null.asInstanceOf[String])
    }

    def bodyHTML(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias))
        this
    }

    def bodyText(): PullRequestReviewResponseProjection = {
        bodyText(null.asInstanceOf[String])
    }

    def bodyText(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("bodyText").alias(alias))
        this
    }

    def comments(subProjection: PullRequestReviewCommentConnectionResponseProjection): PullRequestReviewResponseProjection = {
        comments(null.asInstanceOf[String], subProjection)
    }

    def comments(alias: String, subProjection: PullRequestReviewCommentConnectionResponseProjection): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("comments").alias(alias).projection(subProjection))
        this
    }

    def comments(input: PullRequestReviewCommentsParametrizedInput,subProjection: PullRequestReviewCommentConnectionResponseProjection): PullRequestReviewResponseProjection = {
        comments(null.asInstanceOf[String], input, subProjection)
    }

    def comments(alias: String, input: PullRequestReviewCommentsParametrizedInput , subProjection: PullRequestReviewCommentConnectionResponseProjection): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def commit(subProjection: CommitResponseProjection): PullRequestReviewResponseProjection = {
        commit(null.asInstanceOf[String], subProjection)
    }

    def commit(alias: String, subProjection: CommitResponseProjection): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): PullRequestReviewResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def createdViaEmail(): PullRequestReviewResponseProjection = {
        createdViaEmail(null.asInstanceOf[String])
    }

    def createdViaEmail(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("createdViaEmail").alias(alias))
        this
    }

    def databaseId(): PullRequestReviewResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def editor(subProjection: ActorResponseProjection): PullRequestReviewResponseProjection = {
        editor(null.asInstanceOf[String], subProjection)
    }

    def editor(alias: String, subProjection: ActorResponseProjection): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("editor").alias(alias).projection(subProjection))
        this
    }

    def id(): PullRequestReviewResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def includesCreatedEdit(): PullRequestReviewResponseProjection = {
        includesCreatedEdit(null.asInstanceOf[String])
    }

    def includesCreatedEdit(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("includesCreatedEdit").alias(alias))
        this
    }

    def lastEditedAt(): PullRequestReviewResponseProjection = {
        lastEditedAt(null.asInstanceOf[String])
    }

    def lastEditedAt(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("lastEditedAt").alias(alias))
        this
    }

    def onBehalfOf(subProjection: TeamConnectionResponseProjection): PullRequestReviewResponseProjection = {
        onBehalfOf(null.asInstanceOf[String], subProjection)
    }

    def onBehalfOf(alias: String, subProjection: TeamConnectionResponseProjection): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("onBehalfOf").alias(alias).projection(subProjection))
        this
    }

    def onBehalfOf(input: PullRequestReviewOnBehalfOfParametrizedInput,subProjection: TeamConnectionResponseProjection): PullRequestReviewResponseProjection = {
        onBehalfOf(null.asInstanceOf[String], input, subProjection)
    }

    def onBehalfOf(alias: String, input: PullRequestReviewOnBehalfOfParametrizedInput , subProjection: TeamConnectionResponseProjection): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("onBehalfOf").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def publishedAt(): PullRequestReviewResponseProjection = {
        publishedAt(null.asInstanceOf[String])
    }

    def publishedAt(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): PullRequestReviewResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def reactionGroups(subProjection: ReactionGroupResponseProjection): PullRequestReviewResponseProjection = {
        reactionGroups(null.asInstanceOf[String], subProjection)
    }

    def reactionGroups(alias: String, subProjection: ReactionGroupResponseProjection): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection))
        this
    }

    def reactions(subProjection: ReactionConnectionResponseProjection): PullRequestReviewResponseProjection = {
        reactions(null.asInstanceOf[String], subProjection)
    }

    def reactions(alias: String, subProjection: ReactionConnectionResponseProjection): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("reactions").alias(alias).projection(subProjection))
        this
    }

    def reactions(input: PullRequestReviewReactionsParametrizedInput,subProjection: ReactionConnectionResponseProjection): PullRequestReviewResponseProjection = {
        reactions(null.asInstanceOf[String], input, subProjection)
    }

    def reactions(alias: String, input: PullRequestReviewReactionsParametrizedInput , subProjection: ReactionConnectionResponseProjection): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): PullRequestReviewResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def resourcePath(): PullRequestReviewResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def state(): PullRequestReviewResponseProjection = {
        state(null.asInstanceOf[String])
    }

    def state(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("state").alias(alias))
        this
    }

    def submittedAt(): PullRequestReviewResponseProjection = {
        submittedAt(null.asInstanceOf[String])
    }

    def submittedAt(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("submittedAt").alias(alias))
        this
    }

    def updatedAt(): PullRequestReviewResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): PullRequestReviewResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def userContentEdits(subProjection: UserContentEditConnectionResponseProjection): PullRequestReviewResponseProjection = {
        userContentEdits(null.asInstanceOf[String], subProjection)
    }

    def userContentEdits(alias: String, subProjection: UserContentEditConnectionResponseProjection): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection))
        this
    }

    def userContentEdits(input: PullRequestReviewUserContentEditsParametrizedInput,subProjection: UserContentEditConnectionResponseProjection): PullRequestReviewResponseProjection = {
        userContentEdits(null.asInstanceOf[String], input, subProjection)
    }

    def userContentEdits(alias: String, input: PullRequestReviewUserContentEditsParametrizedInput , subProjection: UserContentEditConnectionResponseProjection): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def viewerCanDelete(): PullRequestReviewResponseProjection = {
        viewerCanDelete(null.asInstanceOf[String])
    }

    def viewerCanDelete(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanDelete").alias(alias))
        this
    }

    def viewerCanReact(): PullRequestReviewResponseProjection = {
        viewerCanReact(null.asInstanceOf[String])
    }

    def viewerCanReact(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanReact").alias(alias))
        this
    }

    def viewerCanUpdate(): PullRequestReviewResponseProjection = {
        viewerCanUpdate(null.asInstanceOf[String])
    }

    def viewerCanUpdate(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanUpdate").alias(alias))
        this
    }

    def viewerCannotUpdateReasons(): PullRequestReviewResponseProjection = {
        viewerCannotUpdateReasons(null.asInstanceOf[String])
    }

    def viewerCannotUpdateReasons(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCannotUpdateReasons").alias(alias))
        this
    }

    def viewerDidAuthor(): PullRequestReviewResponseProjection = {
        viewerDidAuthor(null.asInstanceOf[String])
    }

    def viewerDidAuthor(alias: String): PullRequestReviewResponseProjection = {
        fields.add(new GraphQLResponseField("viewerDidAuthor").alias(alias))
        this
    }

    def typename(): PullRequestReviewResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestReviewResponseProjection = {
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
        val that = obj.asInstanceOf[PullRequestReviewResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
