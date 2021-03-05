package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CommitComment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class CommitCommentResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): CommitCommentResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): CommitCommentResponseProjection {
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields["CommitCommentResponseProjection.ActorResponseProjection.author"] = projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.author", 0) + 1
            this.author(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.author", 0)))
        }
        this.authorAssociation()
        this.body()
        this.bodyHTML()
        this.bodyText()
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields["CommitCommentResponseProjection.CommitResponseProjection.commit"] = projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.CommitResponseProjection.commit", 0) + 1
            this.commit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.createdAt()
        this.createdViaEmail()
        this.databaseId()
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields["CommitCommentResponseProjection.ActorResponseProjection.editor"] = projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.editor", 0) + 1
            this.editor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.editor", 0)))
        }
        this.id()
        this.includesCreatedEdit()
        this.isMinimized()
        this.lastEditedAt()
        this.minimizedReason()
        this.path()
        this.position()
        this.publishedAt()
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields["CommitCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups"] = projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1
            this.reactionGroups(ReactionGroupResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields["CommitCommentResponseProjection.ReactionConnectionResponseProjection.reactions"] = projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1
            this.reactions(ReactionConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["CommitCommentResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.updatedAt()
        this.url()
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields["CommitCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits"] = projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1
            this.userContentEdits(UserContentEditConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)))
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

    fun author(subProjection: ActorResponseProjection): CommitCommentResponseProjection = author(null, subProjection)

    fun author(alias: String?, subProjection: ActorResponseProjection): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("author").alias(alias).projection(subProjection))
        return this
    }

    fun authorAssociation(): CommitCommentResponseProjection = authorAssociation(null)

    fun authorAssociation(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("authorAssociation").alias(alias))
        return this
    }

    fun body(): CommitCommentResponseProjection = body(null)

    fun body(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("body").alias(alias))
        return this
    }

    fun bodyHTML(): CommitCommentResponseProjection = bodyHTML(null)

    fun bodyHTML(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("bodyHTML").alias(alias))
        return this
    }

    fun bodyText(): CommitCommentResponseProjection = bodyText(null)

    fun bodyText(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("bodyText").alias(alias))
        return this
    }

    fun commit(subProjection: CommitResponseProjection): CommitCommentResponseProjection = commit(null, subProjection)

    fun commit(alias: String?, subProjection: CommitResponseProjection): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("commit").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): CommitCommentResponseProjection = createdAt(null)

    fun createdAt(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun createdViaEmail(): CommitCommentResponseProjection = createdViaEmail(null)

    fun createdViaEmail(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("createdViaEmail").alias(alias))
        return this
    }

    fun databaseId(): CommitCommentResponseProjection = databaseId(null)

    fun databaseId(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun editor(subProjection: ActorResponseProjection): CommitCommentResponseProjection = editor(null, subProjection)

    fun editor(alias: String?, subProjection: ActorResponseProjection): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("editor").alias(alias).projection(subProjection))
        return this
    }

    fun id(): CommitCommentResponseProjection = id(null)

    fun id(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun includesCreatedEdit(): CommitCommentResponseProjection = includesCreatedEdit(null)

    fun includesCreatedEdit(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("includesCreatedEdit").alias(alias))
        return this
    }

    fun isMinimized(): CommitCommentResponseProjection = isMinimized(null)

    fun isMinimized(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("isMinimized").alias(alias))
        return this
    }

    fun lastEditedAt(): CommitCommentResponseProjection = lastEditedAt(null)

    fun lastEditedAt(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("lastEditedAt").alias(alias))
        return this
    }

    fun minimizedReason(): CommitCommentResponseProjection = minimizedReason(null)

    fun minimizedReason(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("minimizedReason").alias(alias))
        return this
    }

    fun path(): CommitCommentResponseProjection = path(null)

    fun path(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("path").alias(alias))
        return this
    }

    fun position(): CommitCommentResponseProjection = position(null)

    fun position(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("position").alias(alias))
        return this
    }

    fun publishedAt(): CommitCommentResponseProjection = publishedAt(null)

    fun publishedAt(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("publishedAt").alias(alias))
        return this
    }

    fun reactionGroups(subProjection: ReactionGroupResponseProjection): CommitCommentResponseProjection = reactionGroups(null, subProjection)

    fun reactionGroups(alias: String?, subProjection: ReactionGroupResponseProjection): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection))
        return this
    }

    fun reactions(subProjection: ReactionConnectionResponseProjection): CommitCommentResponseProjection = reactions(null, subProjection)

    fun reactions(alias: String?, subProjection: ReactionConnectionResponseProjection): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("reactions").alias(alias).projection(subProjection))
        return this
    }

    fun reactions(input: CommitCommentReactionsParametrizedInput, subProjection: ReactionConnectionResponseProjection): CommitCommentResponseProjection = reactions(null, input, subProjection)

    fun reactions(alias: String?, input: CommitCommentReactionsParametrizedInput, subProjection: ReactionConnectionResponseProjection): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): CommitCommentResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): CommitCommentResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun updatedAt(): CommitCommentResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): CommitCommentResponseProjection = url(null)

    fun url(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun userContentEdits(subProjection: UserContentEditConnectionResponseProjection): CommitCommentResponseProjection = userContentEdits(null, subProjection)

    fun userContentEdits(alias: String?, subProjection: UserContentEditConnectionResponseProjection): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection))
        return this
    }

    fun userContentEdits(input: CommitCommentUserContentEditsParametrizedInput, subProjection: UserContentEditConnectionResponseProjection): CommitCommentResponseProjection = userContentEdits(null, input, subProjection)

    fun userContentEdits(alias: String?, input: CommitCommentUserContentEditsParametrizedInput, subProjection: UserContentEditConnectionResponseProjection): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun viewerCanDelete(): CommitCommentResponseProjection = viewerCanDelete(null)

    fun viewerCanDelete(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCanDelete").alias(alias))
        return this
    }

    fun viewerCanMinimize(): CommitCommentResponseProjection = viewerCanMinimize(null)

    fun viewerCanMinimize(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCanMinimize").alias(alias))
        return this
    }

    fun viewerCanReact(): CommitCommentResponseProjection = viewerCanReact(null)

    fun viewerCanReact(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCanReact").alias(alias))
        return this
    }

    fun viewerCanUpdate(): CommitCommentResponseProjection = viewerCanUpdate(null)

    fun viewerCanUpdate(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCanUpdate").alias(alias))
        return this
    }

    fun viewerCannotUpdateReasons(): CommitCommentResponseProjection = viewerCannotUpdateReasons(null)

    fun viewerCannotUpdateReasons(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCannotUpdateReasons").alias(alias))
        return this
    }

    fun viewerDidAuthor(): CommitCommentResponseProjection = viewerDidAuthor(null)

    fun viewerDidAuthor(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerDidAuthor").alias(alias))
        return this
    }

    fun typename(): CommitCommentResponseProjection = typename(null)

    fun typename(alias: String?): CommitCommentResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
