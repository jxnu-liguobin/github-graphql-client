package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for PullRequestReviewComment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PullRequestReviewCommentResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestReviewCommentResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestReviewCommentResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewCommentResponseProjection.ActorResponseProjection.author"] = projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.author", 0) + 1
            this.author(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.author", 0)))
        }
        this.authorAssociation()
        this.body()
        this.bodyHTML()
        this.bodyText()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewCommentResponseProjection.CommitResponseProjection.commit"] = projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.commit", 0) + 1
            this.commit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.createdAt()
        this.createdViaEmail()
        this.databaseId()
        this.diffHunk()
        this.draftedAt()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewCommentResponseProjection.ActorResponseProjection.editor"] = projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.editor", 0) + 1
            this.editor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ActorResponseProjection.editor", 0)))
        }
        this.id()
        this.includesCreatedEdit()
        this.isMinimized()
        this.lastEditedAt()
        this.minimizedReason()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.originalCommit", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewCommentResponseProjection.CommitResponseProjection.originalCommit"] = projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.originalCommit", 0) + 1
            this.originalCommit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.CommitResponseProjection.originalCommit", 0)))
        }
        this.originalPosition()
        this.outdated()
        this.path()
        this.position()
        this.publishedAt()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewCommentResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewCommentResponseProjection.PullRequestReviewResponseProjection.pullRequestReview"] = projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0) + 1
            this.pullRequestReview(PullRequestReviewResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewResponseProjection.pullRequestReview", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups"] = projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1
            this.reactionGroups(ReactionGroupResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewCommentResponseProjection.ReactionConnectionResponseProjection.reactions"] = projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1
            this.reactions(ReactionConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewCommentResponseProjection.replyTo", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewCommentResponseProjection.PullRequestReviewCommentResponseProjection.replyTo"] = projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewCommentResponseProjection.replyTo", 0) + 1
            this.replyTo(PullRequestReviewCommentResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.PullRequestReviewCommentResponseProjection.replyTo", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewCommentResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.state()
        this.updatedAt()
        this.url()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits"] = projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1
            this.userContentEdits(UserContentEditConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)))
        }
        this.viewerCanDelete()
        this.viewerCanMinimize()
        this.viewerCanReact()
        this.viewerCanUpdate()
        this.viewerCannotUpdateReasons()
        this.viewerDidAuthor()
        this.typename()
        return this
    }

    fun author(subProjection: ActorResponseProjection): PullRequestReviewCommentResponseProjection = author(null, subProjection)

    fun author(alias: String?, subProjection: ActorResponseProjection): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("author").alias(alias).projection(subProjection))
        return this
    }

    fun authorAssociation(): PullRequestReviewCommentResponseProjection = authorAssociation(null)

    fun authorAssociation(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("authorAssociation").alias(alias))
        return this
    }

    fun body(): PullRequestReviewCommentResponseProjection = body(null)

    fun body(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("body").alias(alias))
        return this
    }

    fun bodyHTML(): PullRequestReviewCommentResponseProjection = bodyHTML(null)

    fun bodyHTML(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("bodyHTML").alias(alias))
        return this
    }

    fun bodyText(): PullRequestReviewCommentResponseProjection = bodyText(null)

    fun bodyText(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("bodyText").alias(alias))
        return this
    }

    fun commit(subProjection: CommitResponseProjection): PullRequestReviewCommentResponseProjection = commit(null, subProjection)

    fun commit(alias: String?, subProjection: CommitResponseProjection): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("commit").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): PullRequestReviewCommentResponseProjection = createdAt(null)

    fun createdAt(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun createdViaEmail(): PullRequestReviewCommentResponseProjection = createdViaEmail(null)

    fun createdViaEmail(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("createdViaEmail").alias(alias))
        return this
    }

    fun databaseId(): PullRequestReviewCommentResponseProjection = databaseId(null)

    fun databaseId(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun diffHunk(): PullRequestReviewCommentResponseProjection = diffHunk(null)

    fun diffHunk(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("diffHunk").alias(alias))
        return this
    }

    fun draftedAt(): PullRequestReviewCommentResponseProjection = draftedAt(null)

    fun draftedAt(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("draftedAt").alias(alias))
        return this
    }

    fun editor(subProjection: ActorResponseProjection): PullRequestReviewCommentResponseProjection = editor(null, subProjection)

    fun editor(alias: String?, subProjection: ActorResponseProjection): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("editor").alias(alias).projection(subProjection))
        return this
    }

    fun id(): PullRequestReviewCommentResponseProjection = id(null)

    fun id(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun includesCreatedEdit(): PullRequestReviewCommentResponseProjection = includesCreatedEdit(null)

    fun includesCreatedEdit(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("includesCreatedEdit").alias(alias))
        return this
    }

    fun isMinimized(): PullRequestReviewCommentResponseProjection = isMinimized(null)

    fun isMinimized(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("isMinimized").alias(alias))
        return this
    }

    fun lastEditedAt(): PullRequestReviewCommentResponseProjection = lastEditedAt(null)

    fun lastEditedAt(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("lastEditedAt").alias(alias))
        return this
    }

    fun minimizedReason(): PullRequestReviewCommentResponseProjection = minimizedReason(null)

    fun minimizedReason(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("minimizedReason").alias(alias))
        return this
    }

    fun originalCommit(subProjection: CommitResponseProjection): PullRequestReviewCommentResponseProjection = originalCommit(null, subProjection)

    fun originalCommit(alias: String?, subProjection: CommitResponseProjection): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("originalCommit").alias(alias).projection(subProjection))
        return this
    }

    fun originalPosition(): PullRequestReviewCommentResponseProjection = originalPosition(null)

    fun originalPosition(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("originalPosition").alias(alias))
        return this
    }

    fun outdated(): PullRequestReviewCommentResponseProjection = outdated(null)

    fun outdated(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("outdated").alias(alias))
        return this
    }

    fun path(): PullRequestReviewCommentResponseProjection = path(null)

    fun path(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("path").alias(alias))
        return this
    }

    fun position(): PullRequestReviewCommentResponseProjection = position(null)

    fun position(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("position").alias(alias))
        return this
    }

    fun publishedAt(): PullRequestReviewCommentResponseProjection = publishedAt(null)

    fun publishedAt(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("publishedAt").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): PullRequestReviewCommentResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun pullRequestReview(subProjection: PullRequestReviewResponseProjection): PullRequestReviewCommentResponseProjection = pullRequestReview(null, subProjection)

    fun pullRequestReview(alias: String?, subProjection: PullRequestReviewResponseProjection): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("pullRequestReview").alias(alias).projection(subProjection))
        return this
    }

    fun reactionGroups(subProjection: ReactionGroupResponseProjection): PullRequestReviewCommentResponseProjection = reactionGroups(null, subProjection)

    fun reactionGroups(alias: String?, subProjection: ReactionGroupResponseProjection): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection))
        return this
    }

    fun reactions(subProjection: ReactionConnectionResponseProjection): PullRequestReviewCommentResponseProjection = reactions(null, subProjection)

    fun reactions(alias: String?, subProjection: ReactionConnectionResponseProjection): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("reactions").alias(alias).projection(subProjection))
        return this
    }

    fun reactions(input: PullRequestReviewCommentReactionsParametrizedInput, subProjection: ReactionConnectionResponseProjection): PullRequestReviewCommentResponseProjection = reactions(null, input, subProjection)

    fun reactions(alias: String?, input: PullRequestReviewCommentReactionsParametrizedInput, subProjection: ReactionConnectionResponseProjection): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun replyTo(subProjection: PullRequestReviewCommentResponseProjection): PullRequestReviewCommentResponseProjection = replyTo(null, subProjection)

    fun replyTo(alias: String?, subProjection: PullRequestReviewCommentResponseProjection): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("replyTo").alias(alias).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): PullRequestReviewCommentResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): PullRequestReviewCommentResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun state(): PullRequestReviewCommentResponseProjection = state(null)

    fun state(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("state").alias(alias))
        return this
    }

    fun updatedAt(): PullRequestReviewCommentResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): PullRequestReviewCommentResponseProjection = url(null)

    fun url(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun userContentEdits(subProjection: UserContentEditConnectionResponseProjection): PullRequestReviewCommentResponseProjection = userContentEdits(null, subProjection)

    fun userContentEdits(alias: String?, subProjection: UserContentEditConnectionResponseProjection): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection))
        return this
    }

    fun userContentEdits(input: PullRequestReviewCommentUserContentEditsParametrizedInput, subProjection: UserContentEditConnectionResponseProjection): PullRequestReviewCommentResponseProjection = userContentEdits(null, input, subProjection)

    fun userContentEdits(alias: String?, input: PullRequestReviewCommentUserContentEditsParametrizedInput, subProjection: UserContentEditConnectionResponseProjection): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun viewerCanDelete(): PullRequestReviewCommentResponseProjection = viewerCanDelete(null)

    fun viewerCanDelete(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCanDelete").alias(alias))
        return this
    }

    fun viewerCanMinimize(): PullRequestReviewCommentResponseProjection = viewerCanMinimize(null)

    fun viewerCanMinimize(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCanMinimize").alias(alias))
        return this
    }

    fun viewerCanReact(): PullRequestReviewCommentResponseProjection = viewerCanReact(null)

    fun viewerCanReact(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCanReact").alias(alias))
        return this
    }

    fun viewerCanUpdate(): PullRequestReviewCommentResponseProjection = viewerCanUpdate(null)

    fun viewerCanUpdate(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCanUpdate").alias(alias))
        return this
    }

    fun viewerCannotUpdateReasons(): PullRequestReviewCommentResponseProjection = viewerCannotUpdateReasons(null)

    fun viewerCannotUpdateReasons(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCannotUpdateReasons").alias(alias))
        return this
    }

    fun viewerDidAuthor(): PullRequestReviewCommentResponseProjection = viewerDidAuthor(null)

    fun viewerDidAuthor(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerDidAuthor").alias(alias))
        return this
    }

    fun typename(): PullRequestReviewCommentResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestReviewCommentResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
