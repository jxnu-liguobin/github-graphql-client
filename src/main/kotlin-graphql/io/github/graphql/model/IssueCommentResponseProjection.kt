package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for IssueComment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class IssueCommentResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): IssueCommentResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): IssueCommentResponseProjection {
        if (projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields["IssueCommentResponseProjection.ActorResponseProjection.author"] = projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ActorResponseProjection.author", 0) + 1
            this.author(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ActorResponseProjection.author", 0)))
        }
        this.authorAssociation()
        this.body()
        this.bodyHTML()
        this.bodyText()
        this.createdAt()
        this.createdViaEmail()
        this.databaseId()
        if (projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields["IssueCommentResponseProjection.ActorResponseProjection.editor"] = projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ActorResponseProjection.editor", 0) + 1
            this.editor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ActorResponseProjection.editor", 0)))
        }
        this.id()
        this.includesCreatedEdit()
        this.isMinimized()
        if (projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.IssueResponseProjection.issue", 0) <= maxDepth) {
            projectionDepthOnFields["IssueCommentResponseProjection.IssueResponseProjection.issue"] = projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.IssueResponseProjection.issue", 0) + 1
            this.issue(IssueResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.IssueResponseProjection.issue", 0)))
        }
        this.lastEditedAt()
        this.minimizedReason()
        this.publishedAt()
        if (projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["IssueCommentResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields["IssueCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups"] = projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1
            this.reactionGroups(ReactionGroupResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields["IssueCommentResponseProjection.ReactionConnectionResponseProjection.reactions"] = projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1
            this.reactions(ReactionConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["IssueCommentResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.updatedAt()
        this.url()
        if (projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields["IssueCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits"] = projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1
            this.userContentEdits(UserContentEditConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("IssueCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)))
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

    fun author(subProjection: ActorResponseProjection): IssueCommentResponseProjection = author(null, subProjection)

    fun author(alias: String?, subProjection: ActorResponseProjection): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("author").alias(alias).projection(subProjection))
        return this
    }

    fun authorAssociation(): IssueCommentResponseProjection = authorAssociation(null)

    fun authorAssociation(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("authorAssociation").alias(alias))
        return this
    }

    fun body(): IssueCommentResponseProjection = body(null)

    fun body(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("body").alias(alias))
        return this
    }

    fun bodyHTML(): IssueCommentResponseProjection = bodyHTML(null)

    fun bodyHTML(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("bodyHTML").alias(alias))
        return this
    }

    fun bodyText(): IssueCommentResponseProjection = bodyText(null)

    fun bodyText(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("bodyText").alias(alias))
        return this
    }

    fun createdAt(): IssueCommentResponseProjection = createdAt(null)

    fun createdAt(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun createdViaEmail(): IssueCommentResponseProjection = createdViaEmail(null)

    fun createdViaEmail(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("createdViaEmail").alias(alias))
        return this
    }

    fun databaseId(): IssueCommentResponseProjection = databaseId(null)

    fun databaseId(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun editor(subProjection: ActorResponseProjection): IssueCommentResponseProjection = editor(null, subProjection)

    fun editor(alias: String?, subProjection: ActorResponseProjection): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("editor").alias(alias).projection(subProjection))
        return this
    }

    fun id(): IssueCommentResponseProjection = id(null)

    fun id(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun includesCreatedEdit(): IssueCommentResponseProjection = includesCreatedEdit(null)

    fun includesCreatedEdit(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("includesCreatedEdit").alias(alias))
        return this
    }

    fun isMinimized(): IssueCommentResponseProjection = isMinimized(null)

    fun isMinimized(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("isMinimized").alias(alias))
        return this
    }

    fun issue(subProjection: IssueResponseProjection): IssueCommentResponseProjection = issue(null, subProjection)

    fun issue(alias: String?, subProjection: IssueResponseProjection): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("issue").alias(alias).projection(subProjection))
        return this
    }

    fun lastEditedAt(): IssueCommentResponseProjection = lastEditedAt(null)

    fun lastEditedAt(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("lastEditedAt").alias(alias))
        return this
    }

    fun minimizedReason(): IssueCommentResponseProjection = minimizedReason(null)

    fun minimizedReason(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("minimizedReason").alias(alias))
        return this
    }

    fun publishedAt(): IssueCommentResponseProjection = publishedAt(null)

    fun publishedAt(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("publishedAt").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): IssueCommentResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun reactionGroups(subProjection: ReactionGroupResponseProjection): IssueCommentResponseProjection = reactionGroups(null, subProjection)

    fun reactionGroups(alias: String?, subProjection: ReactionGroupResponseProjection): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection))
        return this
    }

    fun reactions(subProjection: ReactionConnectionResponseProjection): IssueCommentResponseProjection = reactions(null, subProjection)

    fun reactions(alias: String?, subProjection: ReactionConnectionResponseProjection): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("reactions").alias(alias).projection(subProjection))
        return this
    }

    fun reactions(input: IssueCommentReactionsParametrizedInput, subProjection: ReactionConnectionResponseProjection): IssueCommentResponseProjection = reactions(null, input, subProjection)

    fun reactions(alias: String?, input: IssueCommentReactionsParametrizedInput, subProjection: ReactionConnectionResponseProjection): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): IssueCommentResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): IssueCommentResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun updatedAt(): IssueCommentResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): IssueCommentResponseProjection = url(null)

    fun url(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun userContentEdits(subProjection: UserContentEditConnectionResponseProjection): IssueCommentResponseProjection = userContentEdits(null, subProjection)

    fun userContentEdits(alias: String?, subProjection: UserContentEditConnectionResponseProjection): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection))
        return this
    }

    fun userContentEdits(input: IssueCommentUserContentEditsParametrizedInput, subProjection: UserContentEditConnectionResponseProjection): IssueCommentResponseProjection = userContentEdits(null, input, subProjection)

    fun userContentEdits(alias: String?, input: IssueCommentUserContentEditsParametrizedInput, subProjection: UserContentEditConnectionResponseProjection): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun viewerCanDelete(): IssueCommentResponseProjection = viewerCanDelete(null)

    fun viewerCanDelete(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCanDelete").alias(alias))
        return this
    }

    fun viewerCanMinimize(): IssueCommentResponseProjection = viewerCanMinimize(null)

    fun viewerCanMinimize(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCanMinimize").alias(alias))
        return this
    }

    fun viewerCanReact(): IssueCommentResponseProjection = viewerCanReact(null)

    fun viewerCanReact(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCanReact").alias(alias))
        return this
    }

    fun viewerCanUpdate(): IssueCommentResponseProjection = viewerCanUpdate(null)

    fun viewerCanUpdate(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCanUpdate").alias(alias))
        return this
    }

    fun viewerCannotUpdateReasons(): IssueCommentResponseProjection = viewerCannotUpdateReasons(null)

    fun viewerCannotUpdateReasons(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCannotUpdateReasons").alias(alias))
        return this
    }

    fun viewerDidAuthor(): IssueCommentResponseProjection = viewerDidAuthor(null)

    fun viewerDidAuthor(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerDidAuthor").alias(alias))
        return this
    }

    fun typename(): IssueCommentResponseProjection = typename(null)

    fun typename(alias: String?): IssueCommentResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
