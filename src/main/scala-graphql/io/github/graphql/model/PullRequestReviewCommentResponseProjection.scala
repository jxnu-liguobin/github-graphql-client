package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestReviewComment
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class PullRequestReviewCommentResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestReviewCommentResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestReviewCommentResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.ActorResponseProjection.author", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.author", 0) + 1)
            this.author(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.author", 0)))
        }
        this.authorAssociation()
        this.body()
        this.bodyHTML()
        this.bodyText()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.commit", 0) + 1)
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.createdAt()
        this.createdViaEmail()
        this.databaseId()
        this.diffHunk()
        this.draftedAt()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.ActorResponseProjection.editor", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.editor", 0) + 1)
            this.editor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.editor", 0)))
        }
        this.id()
        this.includesCreatedEdit()
        this.isMinimized()
        this.lastEditedAt()
        this.minimizedReason()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.originalCommit", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.CommitResponseProjection.originalCommit", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.originalCommit", 0) + 1)
            this.originalCommit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.originalCommit", 0)))
        }
        this.originalPosition()
        this.outdated()
        this.path()
        this.position()
        this.publishedAt()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.PullRequestResponseProjection.pullRequest", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1)
            this.pullRequest(new PullRequestResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1)
            this.pullRequestReview(new PullRequestReviewResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1)
            this.reactionGroups(new ReactionGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.ReactionConnectionResponseProjection.reactions", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1)
            this.reactions(new ReactionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewCommentResponseProjection.replyTo", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.PullRequestReviewCommentResponseProjection.replyTo", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewCommentResponseProjection.replyTo", 0) + 1)
            this.replyTo(new PullRequestReviewCommentResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewCommentResponseProjection.replyTo", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.state()
        this.updatedAt()
        this.url()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields.put("PullRequestReviewCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1)
            this.userContentEdits(new UserContentEditConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)))
        }
        this.viewerCanDelete()
        this.viewerCanMinimize()
        this.viewerCanReact()
        this.viewerCanUpdate()
        this.viewerCannotUpdateReasons()
        this.viewerDidAuthor()
        this.typename()
        this
    }

    def author(subProjection: ActorResponseProjection): PullRequestReviewCommentResponseProjection = {
        author(null.asInstanceOf[String], subProjection)
    }

    def author(alias: String, subProjection: ActorResponseProjection): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection))
        this
    }

    def authorAssociation(): PullRequestReviewCommentResponseProjection = {
        authorAssociation(null.asInstanceOf[String])
    }

    def authorAssociation(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("authorAssociation").alias(alias))
        this
    }

    def body(): PullRequestReviewCommentResponseProjection = {
        body(null.asInstanceOf[String])
    }

    def body(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("body").alias(alias))
        this
    }

    def bodyHTML(): PullRequestReviewCommentResponseProjection = {
        bodyHTML(null.asInstanceOf[String])
    }

    def bodyHTML(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias))
        this
    }

    def bodyText(): PullRequestReviewCommentResponseProjection = {
        bodyText(null.asInstanceOf[String])
    }

    def bodyText(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("bodyText").alias(alias))
        this
    }

    def commit(subProjection: CommitResponseProjection): PullRequestReviewCommentResponseProjection = {
        commit(null.asInstanceOf[String], subProjection)
    }

    def commit(alias: String, subProjection: CommitResponseProjection): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): PullRequestReviewCommentResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def createdViaEmail(): PullRequestReviewCommentResponseProjection = {
        createdViaEmail(null.asInstanceOf[String])
    }

    def createdViaEmail(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("createdViaEmail").alias(alias))
        this
    }

    def databaseId(): PullRequestReviewCommentResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def diffHunk(): PullRequestReviewCommentResponseProjection = {
        diffHunk(null.asInstanceOf[String])
    }

    def diffHunk(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("diffHunk").alias(alias))
        this
    }

    def draftedAt(): PullRequestReviewCommentResponseProjection = {
        draftedAt(null.asInstanceOf[String])
    }

    def draftedAt(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("draftedAt").alias(alias))
        this
    }

    def editor(subProjection: ActorResponseProjection): PullRequestReviewCommentResponseProjection = {
        editor(null.asInstanceOf[String], subProjection)
    }

    def editor(alias: String, subProjection: ActorResponseProjection): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("editor").alias(alias).projection(subProjection))
        this
    }

    def id(): PullRequestReviewCommentResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def includesCreatedEdit(): PullRequestReviewCommentResponseProjection = {
        includesCreatedEdit(null.asInstanceOf[String])
    }

    def includesCreatedEdit(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("includesCreatedEdit").alias(alias))
        this
    }

    def isMinimized(): PullRequestReviewCommentResponseProjection = {
        isMinimized(null.asInstanceOf[String])
    }

    def isMinimized(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("isMinimized").alias(alias))
        this
    }

    def lastEditedAt(): PullRequestReviewCommentResponseProjection = {
        lastEditedAt(null.asInstanceOf[String])
    }

    def lastEditedAt(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("lastEditedAt").alias(alias))
        this
    }

    def minimizedReason(): PullRequestReviewCommentResponseProjection = {
        minimizedReason(null.asInstanceOf[String])
    }

    def minimizedReason(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("minimizedReason").alias(alias))
        this
    }

    def originalCommit(subProjection: CommitResponseProjection): PullRequestReviewCommentResponseProjection = {
        originalCommit(null.asInstanceOf[String], subProjection)
    }

    def originalCommit(alias: String, subProjection: CommitResponseProjection): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("originalCommit").alias(alias).projection(subProjection))
        this
    }

    def originalPosition(): PullRequestReviewCommentResponseProjection = {
        originalPosition(null.asInstanceOf[String])
    }

    def originalPosition(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("originalPosition").alias(alias))
        this
    }

    def outdated(): PullRequestReviewCommentResponseProjection = {
        outdated(null.asInstanceOf[String])
    }

    def outdated(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("outdated").alias(alias))
        this
    }

    def path(): PullRequestReviewCommentResponseProjection = {
        path(null.asInstanceOf[String])
    }

    def path(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("path").alias(alias))
        this
    }

    def position(): PullRequestReviewCommentResponseProjection = {
        position(null.asInstanceOf[String])
    }

    def position(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("position").alias(alias))
        this
    }

    def publishedAt(): PullRequestReviewCommentResponseProjection = {
        publishedAt(null.asInstanceOf[String])
    }

    def publishedAt(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias))
        this
    }

    def pullRequest(subProjection: PullRequestResponseProjection): PullRequestReviewCommentResponseProjection = {
        pullRequest(null.asInstanceOf[String], subProjection)
    }

    def pullRequest(alias: String, subProjection: PullRequestResponseProjection): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        this
    }

    def pullRequestReview(subProjection: PullRequestReviewResponseProjection): PullRequestReviewCommentResponseProjection = {
        pullRequestReview(null.asInstanceOf[String], subProjection)
    }

    def pullRequestReview(alias: String, subProjection: PullRequestReviewResponseProjection): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection))
        this
    }

    def reactionGroups(subProjection: ReactionGroupResponseProjection): PullRequestReviewCommentResponseProjection = {
        reactionGroups(null.asInstanceOf[String], subProjection)
    }

    def reactionGroups(alias: String, subProjection: ReactionGroupResponseProjection): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection))
        this
    }

    def reactions(subProjection: ReactionConnectionResponseProjection): PullRequestReviewCommentResponseProjection = {
        reactions(null.asInstanceOf[String], subProjection)
    }

    def reactions(alias: String, subProjection: ReactionConnectionResponseProjection): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("reactions").alias(alias).projection(subProjection))
        this
    }

    def reactions(input: PullRequestReviewCommentReactionsParametrizedInput,subProjection: ReactionConnectionResponseProjection): PullRequestReviewCommentResponseProjection = {
        reactions(null.asInstanceOf[String], input, subProjection)
    }

    def reactions(alias: String, input: PullRequestReviewCommentReactionsParametrizedInput , subProjection: ReactionConnectionResponseProjection): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def replyTo(subProjection: PullRequestReviewCommentResponseProjection): PullRequestReviewCommentResponseProjection = {
        replyTo(null.asInstanceOf[String], subProjection)
    }

    def replyTo(alias: String, subProjection: PullRequestReviewCommentResponseProjection): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("replyTo").alias(alias).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): PullRequestReviewCommentResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def resourcePath(): PullRequestReviewCommentResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def state(): PullRequestReviewCommentResponseProjection = {
        state(null.asInstanceOf[String])
    }

    def state(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("state").alias(alias))
        this
    }

    def updatedAt(): PullRequestReviewCommentResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): PullRequestReviewCommentResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def userContentEdits(subProjection: UserContentEditConnectionResponseProjection): PullRequestReviewCommentResponseProjection = {
        userContentEdits(null.asInstanceOf[String], subProjection)
    }

    def userContentEdits(alias: String, subProjection: UserContentEditConnectionResponseProjection): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection))
        this
    }

    def userContentEdits(input: PullRequestReviewCommentUserContentEditsParametrizedInput,subProjection: UserContentEditConnectionResponseProjection): PullRequestReviewCommentResponseProjection = {
        userContentEdits(null.asInstanceOf[String], input, subProjection)
    }

    def userContentEdits(alias: String, input: PullRequestReviewCommentUserContentEditsParametrizedInput , subProjection: UserContentEditConnectionResponseProjection): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def viewerCanDelete(): PullRequestReviewCommentResponseProjection = {
        viewerCanDelete(null.asInstanceOf[String])
    }

    def viewerCanDelete(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanDelete").alias(alias))
        this
    }

    def viewerCanMinimize(): PullRequestReviewCommentResponseProjection = {
        viewerCanMinimize(null.asInstanceOf[String])
    }

    def viewerCanMinimize(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanMinimize").alias(alias))
        this
    }

    def viewerCanReact(): PullRequestReviewCommentResponseProjection = {
        viewerCanReact(null.asInstanceOf[String])
    }

    def viewerCanReact(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanReact").alias(alias))
        this
    }

    def viewerCanUpdate(): PullRequestReviewCommentResponseProjection = {
        viewerCanUpdate(null.asInstanceOf[String])
    }

    def viewerCanUpdate(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanUpdate").alias(alias))
        this
    }

    def viewerCannotUpdateReasons(): PullRequestReviewCommentResponseProjection = {
        viewerCannotUpdateReasons(null.asInstanceOf[String])
    }

    def viewerCannotUpdateReasons(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCannotUpdateReasons").alias(alias))
        this
    }

    def viewerDidAuthor(): PullRequestReviewCommentResponseProjection = {
        viewerDidAuthor(null.asInstanceOf[String])
    }

    def viewerDidAuthor(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerDidAuthor").alias(alias))
        this
    }

    def typename(): PullRequestReviewCommentResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestReviewCommentResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
