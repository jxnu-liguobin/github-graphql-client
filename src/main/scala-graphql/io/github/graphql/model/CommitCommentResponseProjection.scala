package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for CommitComment
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CommitCommentResponseProjection extends GraphQLResponseProjection {

    override def all$(): CommitCommentResponseProjection = all$(3)

    override def all$(maxDepth: Int): CommitCommentResponseProjection = {
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentResponseProjection.ActorResponseProjection.author", projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.author", 0) + 1)
            this.author(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.author", 0)))
        }
        this.authorAssociation()
        this.body()
        this.bodyHTML()
        this.bodyText()
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentResponseProjection.CommitResponseProjection.commit", projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.CommitResponseProjection.commit", 0) + 1)
            this.commit(new CommitResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.createdAt()
        this.createdViaEmail()
        this.databaseId()
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentResponseProjection.ActorResponseProjection.editor", projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.editor", 0) + 1)
            this.editor(new ActorResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ActorResponseProjection.editor", 0)))
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
            projectionDepthOnFields.put("CommitCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1)
            this.reactionGroups(new ReactionGroupResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentResponseProjection.ReactionConnectionResponseProjection.reactions", projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1)
            this.reactions(new ReactionConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.ReactionConnectionResponseProjection.reactions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentResponseProjection.RepositoryResponseProjection.repository", projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.RepositoryResponseProjection.repository", 0) + 1)
            this.repository(new RepositoryResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.updatedAt()
        this.url()
        if (projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields.put("CommitCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1)
            this.userContentEdits(new UserContentEditConnectionResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("CommitCommentResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)))
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

    def author(subProjection: ActorResponseProjection): CommitCommentResponseProjection = {
        author(null.asInstanceOf[String], subProjection)
    }

    def author(alias: String, subProjection: ActorResponseProjection): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("author").alias(alias).projection(subProjection))
        this
    }

    def authorAssociation(): CommitCommentResponseProjection = {
        authorAssociation(null.asInstanceOf[String])
    }

    def authorAssociation(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("authorAssociation").alias(alias))
        this
    }

    def body(): CommitCommentResponseProjection = {
        body(null.asInstanceOf[String])
    }

    def body(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("body").alias(alias))
        this
    }

    def bodyHTML(): CommitCommentResponseProjection = {
        bodyHTML(null.asInstanceOf[String])
    }

    def bodyHTML(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("bodyHTML").alias(alias))
        this
    }

    def bodyText(): CommitCommentResponseProjection = {
        bodyText(null.asInstanceOf[String])
    }

    def bodyText(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("bodyText").alias(alias))
        this
    }

    def commit(subProjection: CommitResponseProjection): CommitCommentResponseProjection = {
        commit(null.asInstanceOf[String], subProjection)
    }

    def commit(alias: String, subProjection: CommitResponseProjection): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("commit").alias(alias).projection(subProjection))
        this
    }

    def createdAt(): CommitCommentResponseProjection = {
        createdAt(null.asInstanceOf[String])
    }

    def createdAt(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("createdAt").alias(alias))
        this
    }

    def createdViaEmail(): CommitCommentResponseProjection = {
        createdViaEmail(null.asInstanceOf[String])
    }

    def createdViaEmail(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("createdViaEmail").alias(alias))
        this
    }

    def databaseId(): CommitCommentResponseProjection = {
        databaseId(null.asInstanceOf[String])
    }

    def databaseId(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("databaseId").alias(alias))
        this
    }

    def editor(subProjection: ActorResponseProjection): CommitCommentResponseProjection = {
        editor(null.asInstanceOf[String], subProjection)
    }

    def editor(alias: String, subProjection: ActorResponseProjection): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("editor").alias(alias).projection(subProjection))
        this
    }

    def id(): CommitCommentResponseProjection = {
        id(null.asInstanceOf[String])
    }

    def id(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("id").alias(alias))
        this
    }

    def includesCreatedEdit(): CommitCommentResponseProjection = {
        includesCreatedEdit(null.asInstanceOf[String])
    }

    def includesCreatedEdit(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("includesCreatedEdit").alias(alias))
        this
    }

    def isMinimized(): CommitCommentResponseProjection = {
        isMinimized(null.asInstanceOf[String])
    }

    def isMinimized(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("isMinimized").alias(alias))
        this
    }

    def lastEditedAt(): CommitCommentResponseProjection = {
        lastEditedAt(null.asInstanceOf[String])
    }

    def lastEditedAt(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("lastEditedAt").alias(alias))
        this
    }

    def minimizedReason(): CommitCommentResponseProjection = {
        minimizedReason(null.asInstanceOf[String])
    }

    def minimizedReason(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("minimizedReason").alias(alias))
        this
    }

    def path(): CommitCommentResponseProjection = {
        path(null.asInstanceOf[String])
    }

    def path(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("path").alias(alias))
        this
    }

    def position(): CommitCommentResponseProjection = {
        position(null.asInstanceOf[String])
    }

    def position(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("position").alias(alias))
        this
    }

    def publishedAt(): CommitCommentResponseProjection = {
        publishedAt(null.asInstanceOf[String])
    }

    def publishedAt(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("publishedAt").alias(alias))
        this
    }

    def reactionGroups(subProjection: ReactionGroupResponseProjection): CommitCommentResponseProjection = {
        reactionGroups(null.asInstanceOf[String], subProjection)
    }

    def reactionGroups(alias: String, subProjection: ReactionGroupResponseProjection): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection))
        this
    }

    def reactions(subProjection: ReactionConnectionResponseProjection): CommitCommentResponseProjection = {
        reactions(null.asInstanceOf[String], subProjection)
    }

    def reactions(alias: String, subProjection: ReactionConnectionResponseProjection): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("reactions").alias(alias).projection(subProjection))
        this
    }

    def reactions(input: CommitCommentReactionsParametrizedInput,subProjection: ReactionConnectionResponseProjection): CommitCommentResponseProjection = {
        reactions(null.asInstanceOf[String], input, subProjection)
    }

    def reactions(alias: String, input: CommitCommentReactionsParametrizedInput , subProjection: ReactionConnectionResponseProjection): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def repository(subProjection: RepositoryResponseProjection): CommitCommentResponseProjection = {
        repository(null.asInstanceOf[String], subProjection)
    }

    def repository(alias: String, subProjection: RepositoryResponseProjection): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("repository").alias(alias).projection(subProjection))
        this
    }

    def resourcePath(): CommitCommentResponseProjection = {
        resourcePath(null.asInstanceOf[String])
    }

    def resourcePath(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("resourcePath").alias(alias))
        this
    }

    def updatedAt(): CommitCommentResponseProjection = {
        updatedAt(null.asInstanceOf[String])
    }

    def updatedAt(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("updatedAt").alias(alias))
        this
    }

    def url(): CommitCommentResponseProjection = {
        url(null.asInstanceOf[String])
    }

    def url(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("url").alias(alias))
        this
    }

    def userContentEdits(subProjection: UserContentEditConnectionResponseProjection): CommitCommentResponseProjection = {
        userContentEdits(null.asInstanceOf[String], subProjection)
    }

    def userContentEdits(alias: String, subProjection: UserContentEditConnectionResponseProjection): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection))
        this
    }

    def userContentEdits(input: CommitCommentUserContentEditsParametrizedInput,subProjection: UserContentEditConnectionResponseProjection): CommitCommentResponseProjection = {
        userContentEdits(null.asInstanceOf[String], input, subProjection)
    }

    def userContentEdits(alias: String, input: CommitCommentUserContentEditsParametrizedInput , subProjection: UserContentEditConnectionResponseProjection): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection))
        this
    }

    def viewerCanDelete(): CommitCommentResponseProjection = {
        viewerCanDelete(null.asInstanceOf[String])
    }

    def viewerCanDelete(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanDelete").alias(alias))
        this
    }

    def viewerCanMinimize(): CommitCommentResponseProjection = {
        viewerCanMinimize(null.asInstanceOf[String])
    }

    def viewerCanMinimize(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanMinimize").alias(alias))
        this
    }

    def viewerCanReact(): CommitCommentResponseProjection = {
        viewerCanReact(null.asInstanceOf[String])
    }

    def viewerCanReact(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanReact").alias(alias))
        this
    }

    def viewerCanUpdate(): CommitCommentResponseProjection = {
        viewerCanUpdate(null.asInstanceOf[String])
    }

    def viewerCanUpdate(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCanUpdate").alias(alias))
        this
    }

    def viewerCannotUpdateReasons(): CommitCommentResponseProjection = {
        viewerCannotUpdateReasons(null.asInstanceOf[String])
    }

    def viewerCannotUpdateReasons(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerCannotUpdateReasons").alias(alias))
        this
    }

    def viewerDidAuthor(): CommitCommentResponseProjection = {
        viewerDidAuthor(null.asInstanceOf[String])
    }

    def viewerDidAuthor(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("viewerDidAuthor").alias(alias))
        this
    }

    def typename(): CommitCommentResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CommitCommentResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
