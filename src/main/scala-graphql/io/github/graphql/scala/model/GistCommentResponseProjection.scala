package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for GistComment
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class GistCommentResponseProjection extends GraphQLResponseProjection {

    override def all$(): GistCommentResponseProjection = all$(3)

    override def all$(maxDepth: Int): GistCommentResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistCommentResponseProjection.ActorResponseProjection.author", projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.author", 0) + 1)
            this.author(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.author", 0)))
        }
        this.authorAssociation()
        this.body()
        this.bodyHTML()
        this.bodyText()
        this.createdAt()
        this.createdViaEmail()
        this.databaseId()
        if (projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistCommentResponseProjection.ActorResponseProjection.editor", projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.editor", 0) + 1)
            this.editor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.ActorResponseProjection.editor", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.GistResponseProjection.gist", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistCommentResponseProjection.GistResponseProjection.gist", projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.GistResponseProjection.gist", 0) + 1)
            this.gist(new GistResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.GistResponseProjection.gist", 0)))
        }
        this.id()
        this.includesCreatedEdit()
        this.isMinimized()
        this.lastEditedAt()
        this.minimizedReason()
        this.publishedAt()
        this.updatedAt()
        if (projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields.put("GistCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1)
            this.userContentEdits(new UserContentEditConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GistCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)))
        }
        this.viewerCanDelete()
        this.viewerCanMinimize()
        this.viewerCanUpdate()
        this.viewerCannotUpdateReasons()
        this.viewerDidAuthor()
        this.typename()
        this
    }

    def author(subProjection: ActorResponseProjection): GistCommentResponseProjection = {
        author(null.asInstanceOf[String], subProjection)
    }

    def author(alias: String, subProjection: ActorResponseProjection): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection))
        this
    }

    def authorAssociation(): GistCommentResponseProjection = {
        authorAssociation(null.asInstanceOf[String])
    }

    def authorAssociation(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("authorAssociation").alias(alias))
        this
    }

    def body(): GistCommentResponseProjection = {
        body(null.asInstanceOf[String])
    }

    def body(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("body").alias(alias))
        this
    }

    def bodyHTML(): GistCommentResponseProjection = {
        bodyHTML(null.asInstanceOf[String])
    }

    def bodyHTML(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias))
        this
    }

    def bodyText(): GistCommentResponseProjection = {
        bodyText(null.asInstanceOf[String])
    }

    def bodyText(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("bodyText").alias(alias))
        this
    }

    def createdAt(): GistCommentResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def createdViaEmail(): GistCommentResponseProjection = {
        createdViaEmail(null.asInstanceOf[String])
    }

    def createdViaEmail(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("createdViaEmail").alias(alias))
        this
    }

    def databaseId(): GistCommentResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def editor(subProjection: ActorResponseProjection): GistCommentResponseProjection = {
        editor(null.asInstanceOf[String], subProjection)
    }

    def editor(alias: String, subProjection: ActorResponseProjection): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("editor").alias(alias).projection(subProjection))
        this
    }

    def gist(subProjection: GistResponseProjection): GistCommentResponseProjection = {
        gist(null.asInstanceOf[String], subProjection)
    }

    def gist(alias: String, subProjection: GistResponseProjection): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("gist").alias(alias).projection(subProjection))
        this
    }

    def id(): GistCommentResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def includesCreatedEdit(): GistCommentResponseProjection = {
        includesCreatedEdit(null.asInstanceOf[String])
    }

    def includesCreatedEdit(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("includesCreatedEdit").alias(alias))
        this
    }

    def isMinimized(): GistCommentResponseProjection = {
        isMinimized(null.asInstanceOf[String])
    }

    def isMinimized(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("isMinimized").alias(alias))
        this
    }

    def lastEditedAt(): GistCommentResponseProjection = {
        lastEditedAt(null.asInstanceOf[String])
    }

    def lastEditedAt(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("lastEditedAt").alias(alias))
        this
    }

    def minimizedReason(): GistCommentResponseProjection = {
        minimizedReason(null.asInstanceOf[String])
    }

    def minimizedReason(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("minimizedReason").alias(alias))
        this
    }

    def publishedAt(): GistCommentResponseProjection = {
        publishedAt(null.asInstanceOf[String])
    }

    def publishedAt(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias))
        this
    }

    def updatedAt(): GistCommentResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def userContentEdits(subProjection: UserContentEditConnectionResponseProjection): GistCommentResponseProjection = {
        userContentEdits(null.asInstanceOf[String], subProjection)
    }

    def userContentEdits(alias: String, subProjection: UserContentEditConnectionResponseProjection): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection))
        this
    }

    def userContentEdits(input: GistCommentUserContentEditsParametrizedInput,subProjection: UserContentEditConnectionResponseProjection): GistCommentResponseProjection = {
        userContentEdits(null.asInstanceOf[String], input, subProjection)
    }

    def userContentEdits(alias: String, input: GistCommentUserContentEditsParametrizedInput , subProjection: UserContentEditConnectionResponseProjection): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def viewerCanDelete(): GistCommentResponseProjection = {
        viewerCanDelete(null.asInstanceOf[String])
    }

    def viewerCanDelete(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanDelete").alias(alias))
        this
    }

    def viewerCanMinimize(): GistCommentResponseProjection = {
        viewerCanMinimize(null.asInstanceOf[String])
    }

    def viewerCanMinimize(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanMinimize").alias(alias))
        this
    }

    def viewerCanUpdate(): GistCommentResponseProjection = {
        viewerCanUpdate(null.asInstanceOf[String])
    }

    def viewerCanUpdate(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanUpdate").alias(alias))
        this
    }

    def viewerCannotUpdateReasons(): GistCommentResponseProjection = {
        viewerCannotUpdateReasons(null.asInstanceOf[String])
    }

    def viewerCannotUpdateReasons(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCannotUpdateReasons").alias(alias))
        this
    }

    def viewerDidAuthor(): GistCommentResponseProjection = {
        viewerDidAuthor(null.asInstanceOf[String])
    }

    def viewerDidAuthor(alias: String): GistCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerDidAuthor").alias(alias))
        this
    }

    def typename(): GistCommentResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): GistCommentResponseProjection = {
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
        val that = obj.asInstanceOf[GistCommentResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
