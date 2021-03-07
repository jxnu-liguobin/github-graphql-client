package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestReview
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PullRequestReviewResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestReviewResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestReviewResponseProjection {
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.author", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewResponseProjection.ActorResponseProjection.author"] = projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.author", 0) + 1
            this.author(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.author", 0)))
        }
        this.authorAssociation()
        this.body()
        this.bodyHTML()
        this.bodyText()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments"] = projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0) + 1
            this.comments(PullRequestReviewCommentConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestReviewCommentConnectionResponseProjection.comments", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.CommitResponseProjection.commit", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewResponseProjection.CommitResponseProjection.commit"] = projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.CommitResponseProjection.commit", 0) + 1
            this.commit(CommitResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.CommitResponseProjection.commit", 0)))
        }
        this.createdAt()
        this.createdViaEmail()
        this.databaseId()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.editor", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewResponseProjection.ActorResponseProjection.editor"] = projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.editor", 0) + 1
            this.editor(ActorResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ActorResponseProjection.editor", 0)))
        }
        this.id()
        this.includesCreatedEdit()
        this.lastEditedAt()
        this.publishedAt()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestResponseProjection.pullRequest", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewResponseProjection.PullRequestResponseProjection.pullRequest"] = projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestResponseProjection.pullRequest", 0) + 1
            this.pullRequest(PullRequestResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.PullRequestResponseProjection.pullRequest", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewResponseProjection.ReactionGroupResponseProjection.reactionGroups"] = projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0) + 1
            this.reactionGroups(ReactionGroupResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionGroupResponseProjection.reactionGroups", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionConnectionResponseProjection.reactions", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewResponseProjection.ReactionConnectionResponseProjection.reactions"] = projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionConnectionResponseProjection.reactions", 0) + 1
            this.reactions(ReactionConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.ReactionConnectionResponseProjection.reactions", 0)))
        }
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.RepositoryResponseProjection.repository", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewResponseProjection.RepositoryResponseProjection.repository"] = projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.RepositoryResponseProjection.repository", 0) + 1
            this.repository(RepositoryResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.RepositoryResponseProjection.repository", 0)))
        }
        this.resourcePath()
        this.state()
        this.submittedAt()
        this.updatedAt()
        this.url()
        if (projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) <= maxDepth) {
            projectionDepthOnFields["PullRequestReviewResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits"] = projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0) + 1
            this.userContentEdits(UserContentEditConnectionResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("PullRequestReviewResponseProjection.UserContentEditConnectionResponseProjection.userContentEdits", 0)))
        }
        this.viewerCanDelete()
        this.viewerCanReact()
        this.viewerCanUpdate()
        this.viewerCannotUpdateReasons()
        this.viewerDidAuthor()
        this.typename()
        return this
    }

    fun author(subProjection: ActorResponseProjection): PullRequestReviewResponseProjection = author(null, subProjection)

    fun author(alias: String?, subProjection: ActorResponseProjection): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("author").alias(alias).projection(subProjection))
        return this
    }

    fun authorAssociation(): PullRequestReviewResponseProjection = authorAssociation(null)

    fun authorAssociation(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("authorAssociation").alias(alias))
        return this
    }

    fun body(): PullRequestReviewResponseProjection = body(null)

    fun body(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("body").alias(alias))
        return this
    }

    fun bodyHTML(): PullRequestReviewResponseProjection = bodyHTML(null)

    fun bodyHTML(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("bodyHTML").alias(alias))
        return this
    }

    fun bodyText(): PullRequestReviewResponseProjection = bodyText(null)

    fun bodyText(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("bodyText").alias(alias))
        return this
    }

    fun comments(subProjection: PullRequestReviewCommentConnectionResponseProjection): PullRequestReviewResponseProjection = comments(null, subProjection)

    fun comments(alias: String?, subProjection: PullRequestReviewCommentConnectionResponseProjection): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("comments").alias(alias).projection(subProjection))
        return this
    }

    fun comments(input: PullRequestReviewCommentsParametrizedInput, subProjection: PullRequestReviewCommentConnectionResponseProjection): PullRequestReviewResponseProjection = comments(null, input, subProjection)

    fun comments(alias: String?, input: PullRequestReviewCommentsParametrizedInput, subProjection: PullRequestReviewCommentConnectionResponseProjection): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("comments").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun commit(subProjection: CommitResponseProjection): PullRequestReviewResponseProjection = commit(null, subProjection)

    fun commit(alias: String?, subProjection: CommitResponseProjection): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("commit").alias(alias).projection(subProjection))
        return this
    }

    fun createdAt(): PullRequestReviewResponseProjection = createdAt(null)

    fun createdAt(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("createdAt").alias(alias))
        return this
    }

    fun createdViaEmail(): PullRequestReviewResponseProjection = createdViaEmail(null)

    fun createdViaEmail(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("createdViaEmail").alias(alias))
        return this
    }

    fun databaseId(): PullRequestReviewResponseProjection = databaseId(null)

    fun databaseId(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("databaseId").alias(alias))
        return this
    }

    fun editor(subProjection: ActorResponseProjection): PullRequestReviewResponseProjection = editor(null, subProjection)

    fun editor(alias: String?, subProjection: ActorResponseProjection): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("editor").alias(alias).projection(subProjection))
        return this
    }

    fun id(): PullRequestReviewResponseProjection = id(null)

    fun id(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("id").alias(alias))
        return this
    }

    fun includesCreatedEdit(): PullRequestReviewResponseProjection = includesCreatedEdit(null)

    fun includesCreatedEdit(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("includesCreatedEdit").alias(alias))
        return this
    }

    fun lastEditedAt(): PullRequestReviewResponseProjection = lastEditedAt(null)

    fun lastEditedAt(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("lastEditedAt").alias(alias))
        return this
    }

    fun onBehalfOf(subProjection: TeamConnectionResponseProjection): PullRequestReviewResponseProjection = onBehalfOf(null, subProjection)

    fun onBehalfOf(alias: String?, subProjection: TeamConnectionResponseProjection): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("onBehalfOf").alias(alias).projection(subProjection))
        return this
    }

    fun onBehalfOf(input: PullRequestReviewOnBehalfOfParametrizedInput, subProjection: TeamConnectionResponseProjection): PullRequestReviewResponseProjection = onBehalfOf(null, input, subProjection)

    fun onBehalfOf(alias: String?, input: PullRequestReviewOnBehalfOfParametrizedInput, subProjection: TeamConnectionResponseProjection): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("onBehalfOf").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun publishedAt(): PullRequestReviewResponseProjection = publishedAt(null)

    fun publishedAt(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("publishedAt").alias(alias))
        return this
    }

    fun pullRequest(subProjection: PullRequestResponseProjection): PullRequestReviewResponseProjection = pullRequest(null, subProjection)

    fun pullRequest(alias: String?, subProjection: PullRequestResponseProjection): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("pullRequest").alias(alias).projection(subProjection))
        return this
    }

    fun reactionGroups(subProjection: ReactionGroupResponseProjection): PullRequestReviewResponseProjection = reactionGroups(null, subProjection)

    fun reactionGroups(alias: String?, subProjection: ReactionGroupResponseProjection): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("reactionGroups").alias(alias).projection(subProjection))
        return this
    }

    fun reactions(subProjection: ReactionConnectionResponseProjection): PullRequestReviewResponseProjection = reactions(null, subProjection)

    fun reactions(alias: String?, subProjection: ReactionConnectionResponseProjection): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("reactions").alias(alias).projection(subProjection))
        return this
    }

    fun reactions(input: PullRequestReviewReactionsParametrizedInput, subProjection: ReactionConnectionResponseProjection): PullRequestReviewResponseProjection = reactions(null, input, subProjection)

    fun reactions(alias: String?, input: PullRequestReviewReactionsParametrizedInput, subProjection: ReactionConnectionResponseProjection): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("reactions").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun repository(subProjection: RepositoryResponseProjection): PullRequestReviewResponseProjection = repository(null, subProjection)

    fun repository(alias: String?, subProjection: RepositoryResponseProjection): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("repository").alias(alias).projection(subProjection))
        return this
    }

    fun resourcePath(): PullRequestReviewResponseProjection = resourcePath(null)

    fun resourcePath(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("resourcePath").alias(alias))
        return this
    }

    fun state(): PullRequestReviewResponseProjection = state(null)

    fun state(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("state").alias(alias))
        return this
    }

    fun submittedAt(): PullRequestReviewResponseProjection = submittedAt(null)

    fun submittedAt(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("submittedAt").alias(alias))
        return this
    }

    fun updatedAt(): PullRequestReviewResponseProjection = updatedAt(null)

    fun updatedAt(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("updatedAt").alias(alias))
        return this
    }

    fun url(): PullRequestReviewResponseProjection = url(null)

    fun url(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("url").alias(alias))
        return this
    }

    fun userContentEdits(subProjection: UserContentEditConnectionResponseProjection): PullRequestReviewResponseProjection = userContentEdits(null, subProjection)

    fun userContentEdits(alias: String?, subProjection: UserContentEditConnectionResponseProjection): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("userContentEdits").alias(alias).projection(subProjection))
        return this
    }

    fun userContentEdits(input: PullRequestReviewUserContentEditsParametrizedInput, subProjection: UserContentEditConnectionResponseProjection): PullRequestReviewResponseProjection = userContentEdits(null, input, subProjection)

    fun userContentEdits(alias: String?, input: PullRequestReviewUserContentEditsParametrizedInput, subProjection: UserContentEditConnectionResponseProjection): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("userContentEdits").alias(alias).parameters(input).projection(subProjection))
        return this
    }

    fun viewerCanDelete(): PullRequestReviewResponseProjection = viewerCanDelete(null)

    fun viewerCanDelete(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("viewerCanDelete").alias(alias))
        return this
    }

    fun viewerCanReact(): PullRequestReviewResponseProjection = viewerCanReact(null)

    fun viewerCanReact(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("viewerCanReact").alias(alias))
        return this
    }

    fun viewerCanUpdate(): PullRequestReviewResponseProjection = viewerCanUpdate(null)

    fun viewerCanUpdate(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("viewerCanUpdate").alias(alias))
        return this
    }

    fun viewerCannotUpdateReasons(): PullRequestReviewResponseProjection = viewerCannotUpdateReasons(null)

    fun viewerCannotUpdateReasons(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("viewerCannotUpdateReasons").alias(alias))
        return this
    }

    fun viewerDidAuthor(): PullRequestReviewResponseProjection = viewerDidAuthor(null)

    fun viewerDidAuthor(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("viewerDidAuthor").alias(alias))
        return this
    }

    fun typename(): PullRequestReviewResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestReviewResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as PullRequestReviewResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
