package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for GistComment
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class GistCommentResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): GistCommentResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): GistCommentResponseProjection {
        if (projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields["GistCommentResponseProjection.ActorResponseProjection.author"] = projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.author", 0) + 1
            this.author(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.author", 0)))
        }
        this.authorAssociation()
        this.body()
        this.bodyHTML()
        this.bodyText()
        this.createdAt()
        this.createdViaEmail()
        this.databaseId()
        if (projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields["GistCommentResponseProjection.ActorResponseProjection.editor"] = projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.editor", 0) + 1
            this.editor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.editor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.GistResponseProjection.gist", 0) <= maxDepth) {
            projectionDepthOnFields["GistCommentResponseProjection.GistResponseProjection.gist"] = projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.GistResponseProjection.gist", 0) + 1
            this.gist(GistResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.GistResponseProjection.gist", 0)))
        }
        this.id()
        this.includesCreatedEdit()
        this.isMinimized()
        this.lastEditedAt()
        this.minimizedReason()
        this.publishedAt()
        this.updatedAt()
        if (projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields["GistCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits"] = projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1
            this.userContentEdits(UserContentEditConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)))
        }
        this.viewerCanDelete()
        this.viewerCanMinimize()
        this.viewerCanUpdate()
        this.viewerCannotUpdateReasons()
        this.viewerDidAuthor()
        this.typename()
        return this
    }

    fun author(subProjection: ActorResponseProjection): GistCommentResponseProjection = author(null, subProjection)

    fun author(alias: String?, subProjection: ActorResponseProjection): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("author").alias(alias).projection(subProjection))
        return this
    }

    fun authorAssociation(): GistCommentResponseProjection = authorAssociation(null)

    fun authorAssociation(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("authorAssociation").alias(alias))
        return this
    }

    fun body(): GistCommentResponseProjection = body(null)

    fun body(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("body").alias(alias))
        return this
    }

    fun bodyHTML(): GistCommentResponseProjection = bodyHTML(null)

    fun bodyHTML(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("bodyHTML").alias(alias))
        return this
    }

    fun bodyText(): GistCommentResponseProjection = bodyText(null)

    fun bodyText(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("bodyText").alias(alias))
        return this
    }

    fun createdAt(): GistCommentResponseProjection = createdAt(null)

    fun createdAt(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun createdViaEmail(): GistCommentResponseProjection = createdViaEmail(null)

    fun createdViaEmail(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("createdViaEmail").alias(alias))
        return this
    }

    fun databaseId(): GistCommentResponseProjection = databaseId(null)

    fun databaseId(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun editor(subProjection: ActorResponseProjection): GistCommentResponseProjection = editor(null, subProjection)

    fun editor(alias: String?, subProjection: ActorResponseProjection): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("editor").alias(alias).projection(subProjection))
        return this
    }

    fun gist(subProjection: GistResponseProjection): GistCommentResponseProjection = gist(null, subProjection)

    fun gist(alias: String?, subProjection: GistResponseProjection): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("gist").alias(alias).projection(subProjection))
        return this
    }

    fun id(): GistCommentResponseProjection = id(null)

    fun id(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun includesCreatedEdit(): GistCommentResponseProjection = includesCreatedEdit(null)

    fun includesCreatedEdit(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("includesCreatedEdit").alias(alias))
        return this
    }

    fun isMinimized(): GistCommentResponseProjection = isMinimized(null)

    fun isMinimized(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("isMinimized").alias(alias))
        return this
    }

    fun lastEditedAt(): GistCommentResponseProjection = lastEditedAt(null)

    fun lastEditedAt(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("lastEditedAt").alias(alias))
        return this
    }

    fun minimizedReason(): GistCommentResponseProjection = minimizedReason(null)

    fun minimizedReason(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("minimizedReason").alias(alias))
        return this
    }

    fun publishedAt(): GistCommentResponseProjection = publishedAt(null)

    fun publishedAt(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("publishedAt").alias(alias))
        return this
    }

    fun updatedAt(): GistCommentResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun userContentEdits(subProjection: UserContentEditConnectionResponseProjection): GistCommentResponseProjection = userContentEdits(null, subProjection)

    fun userContentEdits(alias: String?, subProjection: UserContentEditConnectionResponseProjection): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection))
        return this
    }

    fun userContentEdits(input: GistCommentUserContentEditsParametrizedInput, subProjection: UserContentEditConnectionResponseProjection): GistCommentResponseProjection = userContentEdits(null, input, subProjection)

    fun userContentEdits(alias: String?, input: GistCommentUserContentEditsParametrizedInput, subProjection: UserContentEditConnectionResponseProjection): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun viewerCanDelete(): GistCommentResponseProjection = viewerCanDelete(null)

    fun viewerCanDelete(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCanDelete").alias(alias))
        return this
    }

    fun viewerCanMinimize(): GistCommentResponseProjection = viewerCanMinimize(null)

    fun viewerCanMinimize(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCanMinimize").alias(alias))
        return this
    }

    fun viewerCanUpdate(): GistCommentResponseProjection = viewerCanUpdate(null)

    fun viewerCanUpdate(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCanUpdate").alias(alias))
        return this
    }

    fun viewerCannotUpdateReasons(): GistCommentResponseProjection = viewerCannotUpdateReasons(null)

    fun viewerCannotUpdateReasons(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerCannotUpdateReasons").alias(alias))
        return this
    }

    fun viewerDidAuthor(): GistCommentResponseProjection = viewerDidAuthor(null)

    fun viewerDidAuthor(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("viewerDidAuthor").alias(alias))
        return this
    }

    fun typename(): GistCommentResponseProjection = typename(null)

    fun typename(alias: String?): GistCommentResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
